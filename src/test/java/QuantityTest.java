import com.sun.org.apache.bcel.internal.generic.INEG;
import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {

    @Test
    public void given0FeetAnd0Feet_shouldReturnEqual() {
        Length feet1=new Length(Unit.FEET,0.0);
        Length feet2 = new Length(Unit.FEET,0.0);
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void givenNullAsObject_shouldReturnFalse() {
        Length feet = new Length(Unit.FEET,0.0);
        Assert.assertNotEquals(null,feet);
    }

    @Test
    public void givenTwoDiffReferences_shouldNotSame() {
        Length feet1=new Length(Unit.FEET,0.0);
        Length feet2 = new Length(Unit.FEET,0.0);
        Assert.assertNotSame(feet1,feet2);
    }

    @Test
    public void givenTwoDiffDataType_shouldReturnFalse() {
        Length feet2 = new Length(Unit.FEET,0.0);
        Assert.assertNotEquals("String",feet2);
    }

    @Test
    public void given0FeetAnd1Feet_shouldReturnNotEqual() {
        Length feet1=new Length(Unit.FEET,0.0);
        Length feet2 = new Length(Unit.FEET,1.0);
        Assert.assertNotEquals(feet1,feet2);
    }

    @Test
    public void givenSameReferance_shouldReturnEqual() {
        Length feet2 = new Length(Unit.FEET,1.0);
        Assert.assertEquals(feet2,feet2);
    }

    @Test
    public void given0InchAnd0Inch_shouldReturnEqual() {
        Length inch1=new Length(Unit.INCH,0.0);
        Length inch2=new Length(Unit.INCH,0.0);
        Assert.assertEquals(inch1,inch2);
    }

    @Test
    public void givenNullAndObject_shouldNotEqual() {
        Length inch1=new Length(Unit.INCH,0.0);
        Length inch2=null;
        Assert.assertNotEquals(inch1,inch2);
    }

    @Test
    public void givenTwoDiffReferencesOfInch_shouldReturnNotSame() {
        Length inch1=new Length(Unit.INCH,0.0);
        Length inch2=new Length(Unit.INCH,0.0);
        Assert.assertNotSame(inch1,inch2);
    }

    @Test
    public void givenTwoDiffDataTypeInInch_shouldReturnFalse() {
        Length inch=new Length(Unit.INCH,0.0);
        String str="String";
        Assert.assertNotEquals(str,inch);
    }

    @Test
    public void given1Inchand2Inch_shouldReturnNotEqual() {
        Length inch1 = new Length(Unit.INCH, 1.0);
        Length inch2 = new Length(Unit.INCH, .0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0InchAnd0feet_shouldReturnEqual() {
        Length feet=new Length(Unit.FEET,0);
        Length inch=new Length(Unit.INCH,0);
        Assert.assertEquals(feet,inch);
    }

    @Test
    public void given1FeetAnd1Inch_shouldReturnNotEqual() {
        Length feet=new Length(Unit.FEET,1.0);
        Length inch=new Length(Unit.INCH,1.0);
        boolean compareValue=Unit.compare(inch,feet);
        Assert.assertFalse(compareValue);
    }

    @Test
    public void given1InchAnd1Feet_shouldReturnNotEqual() {
        Length feet=new Length(Unit.FEET,1.0);
        Length inch=new Length(Unit.INCH,1.0);
        boolean compareValue=Unit.compare(feet,inch);
        Assert.assertFalse(compareValue);        
    }

    @Test
    public void given1FeetAnd12Inch_shouldReturnEqual() {
        Length feet=new Length(Unit.FEET,1);
        Length inch=new Length(Unit.INCH,12);
        boolean compareValue=Unit.compare(feet,inch);
        Assert.assertTrue(compareValue);
    }

    @Test
    public void given12InchAnd1Feet_shouldReturnEqual() {
        Length feet=new Length(Unit.FEET,1);
        Length inch=new Length(Unit.INCH,12);
        boolean compareValue=Unit.compare(inch,feet);
        Assert.assertTrue(compareValue);
    }

    @Test
    public void given3FeetAnd1Yard_shouldReturnEqual() {
        Length feet=new Length(Unit.FEET,3);
        Length yard=new Length(Unit.YARD,1);
        boolean compareValue=Unit.compare(feet,yard);
        Assert.assertTrue(compareValue);
    }

    @Test
    public void given1FeetAnd1Yard_shouldNotEqual() {
        Length feet=new Length(Unit.FEET,1);
        Length yard=new Length(Unit.YARD,1);
        boolean comparevalue=Unit.compare(feet,yard);
        Assert.assertFalse(comparevalue);
    }

    @Test
    public void given1InchAnd1Yard_shouldNotEqual() {
        Length inch=new Length(Unit.INCH,1.0);
        Length yard=new Length(Unit.YARD,1.0);
        boolean compareValue=Unit.compare(inch,yard);
        Assert.assertFalse(compareValue);
    }

    @Test
    public void given1YardAnd36Inch_shouldReturnEqual() {
        Length yard=new Length(Unit.YARD,1);
        Length inch=new Length(Unit.INCH,36);
        boolean compareValue=Unit.compare(yard,inch);
        Assert.assertTrue(compareValue);
    }

    @Test
    public void given36InchAnd1Yard_shouldReturnEqual() {
        Length inch=new Length(Unit.INCH,36);
        Length yard=new Length(Unit.YARD,1);
        boolean compareValue=Unit.compare(inch,yard);
        Assert.assertTrue(compareValue);
    }

    @Test
    public void given1YardAnd3Feet_shouldEqualReturnTrue() {
        Length yard=new Length(Unit.YARD,1);
        Length feet=new Length(Unit.FEET,3);
        boolean compareValue=Unit.compare(yard,feet);
        Assert.assertTrue(compareValue);
    }

    @Test
    public void given2InchAnd5Cm_shouldEqualReturnTrue() {
        Length inch=new Length(Unit.INCH,2.0);
        Length cm=new Length(Unit.CM,5.0);
        boolean compareValue=Unit.compare(inch,cm);
        Assert.assertTrue(compareValue);
    }

    @Test
    public void givenSumOf2InchAnd2InchEqualto4Inch_shouldReturnTrue() {
        Length inch1=new Length(Unit.INCH,2.0);
        Length inch2=new Length(Unit.INCH,2.0);
        Double addition=Addition.add(inch1,inch2);
        Assert.assertEquals(4.0,addition,0.0);
    }

    @Test
    public void givensumOf1FeetAnd2InchEqualto14Inch_shouldReturnTrue() {
        Length feet=new Length(Unit.FEET,1);
        Length inch=new Length(Unit.INCH,2);
        Double addition=Addition.add(feet,inch);
        Assert.assertEquals(14,addition,0.0);
    }

    @Test
    public void givensumOf1FeetAnd1FeetEqualTo24Inch_shouldReturnTrue() {
        Length feet1=new Length(Unit.FEET,1);
        Length feet2=new Length(Unit.FEET,1);
        Double addition=Addition.add(feet1,feet2);
        Assert.assertEquals(24,addition,0.0);
    }
}
