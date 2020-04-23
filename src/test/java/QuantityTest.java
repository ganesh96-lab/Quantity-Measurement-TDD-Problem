import com.sun.org.apache.bcel.internal.generic.INEG;
import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {
    @Test
    public void given0FeetAnd0Feet_shouldReturnEqual() {
        Length feet1=new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,0.0);
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void givenNullAsObject_shouldReturnFalse() {
        Length feet = new Length(Length.Unit.FEET,0.0);
        Assert.assertNotEquals(null,feet);
    }

    @Test
    public void givenTwoDiffReferences_shouldNotSame() {
        Length feet1=new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,0.0);
        Assert.assertNotSame(feet1,feet2);
    }

    @Test
    public void givenTwoDiffDataType_shouldReturnFalse() {
        Length feet2 = new Length(Length.Unit.FEET,0.0);
        Assert.assertNotEquals("String",feet2);
    }

    @Test
    public void given0FeetAnd1Feet_shouldReturnNotEqual() {
        Length feet1=new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,1.0);
        Assert.assertNotEquals(feet1,feet2);
    }

    @Test
    public void givenSameReferance_shouldReturnEqual() {
        Length feet2 = new Length(Length.Unit.FEET,1.0);
        Assert.assertEquals(feet2,feet2);
    }

    @Test
    public void given0InchAnd0Inch_shouldReturnEqual() {
        Length inch1=new Length(Length.Unit.INCH,0.0);
        Length inch2=new Length(Length.Unit.INCH,0.0);
        Assert.assertEquals(inch1,inch2);
    }

    @Test
    public void givenNullAndObject_shouldNotEqual() {
        Length inch1=new Length(Length.Unit.INCH,0.0);
        Length inch2=null;
        Assert.assertNotEquals(inch1,inch2);
    }

    @Test
    public void givenTwoDiffReferencesOfInch_shouldReturnNotSame() {
        Length inch1=new Length(Length.Unit.INCH,0.0);
        Length inch2=new Length(Length.Unit.INCH,0.0);
        Assert.assertNotSame(inch1,inch2);
    }

    @Test
    public void givenTwoDiffDataTypeInInch_shouldReturnFalse() {
        Length inch=new Length(Length.Unit.INCH,0.0);
        String str="String";
        Assert.assertNotEquals(str,inch);
    }

    @Test
    public void given1Inchand2Inch_shouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 1.0);
        Length inch2 = new Length(Length.Unit.INCH, .0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0InchAnd0feet_shouldReturnEqual() {
        Length feet=new Length(Length.Unit.FEET,0);
        Length inch=new Length(Length.Unit.INCH,0);
        Assert.assertEquals(feet,inch);
    }

    @Test
    public void given1FeetAnd1Inch_shouldReturnNotEqual() {
        Length feet=new Length(Length.Unit.FEET,1.0);
        Length inch=new Length(Length.Unit.INCH,1.0);
        boolean compareValue=inch.compare(feet);
        Assert.assertFalse(compareValue);
    }

    @Test
    public void given1InchAnd1Feet_shouldReturnNotEqual() {
        Length feet=new Length(Length.Unit.FEET,1.0);
        Length inch=new Length(Length.Unit.INCH,1.0);
        boolean compareValue=feet.compare(inch);
        Assert.assertFalse(compareValue);        
    }

    @Test
    public void given1FeetAnd12Inch_shouldReturnEqual() {
        Length feet=new Length(Length.Unit.FEET,1);
        Length inch=new Length(Length.Unit.INCH,12);
        boolean compareValue=feet.compare(inch);
        Assert.assertTrue(compareValue);
    }
}
