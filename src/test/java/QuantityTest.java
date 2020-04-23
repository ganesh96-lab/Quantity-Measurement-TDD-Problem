import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {

    @Test
    public void given0FeetAnd0Feet_shouldReturnEqual() {
        Quantity feet1=new Quantity(Unit.FEET,0.0);
        Quantity feet2 = new Quantity(Unit.FEET,0.0);
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void givenNullAsObject_shouldReturnFalse() {
        Quantity feet = new Quantity(Unit.FEET,0.0);
        Assert.assertNotEquals(null,feet);
    }

    @Test
    public void givenTwoDiffReferences_shouldNotSame() {
        Quantity feet1=new Quantity(Unit.FEET,0.0);
        Quantity feet2 = new Quantity(Unit.FEET,0.0);
        Assert.assertNotSame(feet1,feet2);
    }

    @Test
    public void givenTwoDiffDataType_shouldReturnFalse() {
        Quantity feet2 = new Quantity(Unit.FEET,0.0);
        Assert.assertNotEquals("String",feet2);
    }

    @Test
    public void given0FeetAnd1Feet_shouldReturnNotEqual() {
        Quantity feet1=new Quantity(Unit.FEET,0.0);
        Quantity feet2 = new Quantity(Unit.FEET,1.0);
        Assert.assertNotEquals(feet1,feet2);
    }

    @Test
    public void givenSameReferance_shouldReturnEqual() {
        Quantity feet2 = new Quantity(Unit.FEET,1.0);
        Assert.assertEquals(feet2,feet2);
    }

    @Test
    public void given0InchAnd0Inch_shouldReturnEqual() {
        Quantity inch1=new Quantity(Unit.INCH,0.0);
        Quantity inch2=new Quantity(Unit.INCH,0.0);
        Assert.assertEquals(inch1,inch2);
    }

    @Test
    public void givenNullAndObject_shouldNotEqual() {
        Quantity inch1=new Quantity(Unit.INCH,0.0);
        Quantity inch2=null;
        Assert.assertNotEquals(inch1,inch2);
    }

    @Test
    public void givenTwoDiffReferencesOfInch_shouldReturnNotSame() {
        Quantity inch1=new Quantity(Unit.INCH,0.0);
        Quantity inch2=new Quantity(Unit.INCH,0.0);
        Assert.assertNotSame(inch1,inch2);
    }

    @Test
    public void givenTwoDiffDataTypeInInch_shouldReturnFalse() {
        Quantity inch=new Quantity(Unit.INCH,0.0);
        String str="String";
        Assert.assertNotEquals(str,inch);
    }

    @Test
    public void given1Inchand2Inch_shouldReturnNotEqual() {
        Quantity inch1 = new Quantity(Unit.INCH, 1.0);
        Quantity inch2 = new Quantity(Unit.INCH, .0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0InchAnd0feet_shouldReturnEqual() {
        Quantity feet=new Quantity(Unit.FEET,0);
        Quantity inch=new Quantity(Unit.INCH,0);
        Assert.assertEquals(feet,inch);
    }

    @Test
    public void given1FeetAnd1Inch_shouldReturnNotEqual() throws QuantityException{
        Quantity feet=new Quantity(Unit.FEET,1.0);
        Quantity inch=new Quantity(Unit.INCH,1.0);
        boolean compareValue=Unit.compare(inch,feet);
        Assert.assertFalse(compareValue);
    }

    @Test
    public void given1InchAnd1Feet_shouldReturnNotEqual() throws QuantityException{
        Quantity feet=new Quantity(Unit.FEET,1.0);
        Quantity inch=new Quantity(Unit.INCH,1.0);
        boolean compareValue=Unit.compare(feet,inch);
        Assert.assertFalse(compareValue);        
    }

    @Test
    public void given1FeetAnd12Inch_shouldReturnEqual() throws QuantityException{
        Quantity feet=new Quantity(Unit.FEET,1);
        Quantity inch=new Quantity(Unit.INCH,12);
        boolean compareValue=Unit.compare(feet,inch);
        Assert.assertTrue(compareValue);
    }

    @Test
    public void given12InchAnd1Feet_shouldReturnEqual() throws QuantityException {
        Quantity feet=new Quantity(Unit.FEET,1);
        Quantity inch=new Quantity(Unit.INCH,12);
        boolean compareValue=Unit.compare(inch,feet);
        Assert.assertTrue(compareValue);
    }

    @Test
    public void given3FeetAnd1Yard_shouldReturnEqual() throws QuantityException {
        Quantity feet=new Quantity(Unit.FEET,3);
        Quantity yard=new Quantity(Unit.YARD,1);
        boolean compareValue=Unit.compare(feet,yard);
        Assert.assertTrue(compareValue);
    }

    @Test
    public void given1FeetAnd1Yard_shouldNotEqual() throws QuantityException{
        Quantity feet=new Quantity(Unit.FEET,1);
        Quantity yard=new Quantity(Unit.YARD,1);
        boolean comparevalue=Unit.compare(feet,yard);
        Assert.assertFalse(comparevalue);
    }

    @Test
    public void given1InchAnd1Yard_shouldNotEqual() throws QuantityException{
        Quantity inch=new Quantity(Unit.INCH,1.0);
        Quantity yard=new Quantity(Unit.YARD,1.0);
        boolean compareValue=Unit.compare(inch,yard);
        Assert.assertFalse(compareValue);
    }

    @Test
    public void given1YardAnd36Inch_shouldReturnEqual() throws QuantityException{
        Quantity yard=new Quantity(Unit.YARD,1);
        Quantity inch=new Quantity(Unit.INCH,36);
        boolean compareValue=Unit.compare(yard,inch);
        Assert.assertTrue(compareValue);
    }

    @Test
    public void given36InchAnd1Yard_shouldReturnEqual() throws QuantityException{
        Quantity inch=new Quantity(Unit.INCH,36);
        Quantity yard=new Quantity(Unit.YARD,1);
        boolean compareValue=Unit.compare(inch,yard);
        Assert.assertTrue(compareValue);
    }

    @Test
    public void given1YardAnd3Feet_shouldEqualReturnTrue() throws QuantityException{
        Quantity yard=new Quantity(Unit.YARD,1);
        Quantity feet=new Quantity(Unit.FEET,3);
        boolean compareValue=Unit.compare(yard,feet);
        Assert.assertTrue(compareValue);
    }

    @Test
    public void given2InchAnd5Cm_shouldEqualReturnTrue() throws QuantityException{
        Quantity inch=new Quantity(Unit.INCH,2.0);
        Quantity cm=new Quantity(Unit.CM,5.0);
        boolean compareValue=Unit.compare(inch,cm);
        Assert.assertTrue(compareValue);
    }

    @Test
    public void givenSumOf2InchAnd2InchEqualto4Inch_shouldReturnTrue() {
        Quantity inch1=new Quantity(Unit.INCH,2.0);
        Quantity inch2=new Quantity(Unit.INCH,2.0);
        Double addition=Addition.add(inch1,inch2);
        Assert.assertEquals(4.0,addition,0.0);
    }

    @Test
    public void givenSumOf1FeetAnd2InchEqualto14Inch_shouldReturnTrue(){
        Quantity feet=new Quantity(Unit.FEET,1);
        Quantity inch=new Quantity(Unit.INCH,2);
        Double addition=Addition.add(feet,inch);
        Assert.assertEquals(14,addition,0.0);
    }

    @Test
    public void givenSumOf1FeetAnd1FeetEqualTo24Inch_shouldReturnTrue(){
        Quantity feet1=new Quantity(Unit.FEET,1);
        Quantity feet2=new Quantity(Unit.FEET,1);
        Double addition=Addition.add(feet1,feet2);
        Assert.assertEquals(24,addition,0.0);
    }

    @Test
    public void givenSumOf2InchAnd25CmEqualTo3Inch() throws QuantityException {
        Quantity inch=new Quantity(Unit.INCH,2);
        Quantity cm=new Quantity(Unit.CM,2.5);
        Double addition=Addition.add(inch,cm);
        Assert.assertEquals(3,addition,0.0);
    }

    @Test
    public void given1GallonAnd3_78LitersEqual_shouldReturnTrue() throws QuantityException {
        Quantity gallon=new Quantity(Unit.GALLON,1);
        Quantity liter=new Quantity(Unit.LITER,3.78);
        boolean compareVolume=Unit.compare(gallon,liter);
        Assert.assertTrue(compareVolume);
    }

    @Test
    public void givenDiffQuantity_shouldThrowException() {
        Quantity gallon=new Quantity(Unit.GALLON,1);
        Quantity cm=new Quantity(Unit.CM,3.78);
        boolean compareVolume= false;
        try {
            compareVolume = Unit.compare(gallon,cm);
            Assert.assertTrue(compareVolume);
        } catch (QuantityException e) {
            Assert.assertEquals(QuantityException.ExceptionType.INVALID_QUANTITY_COMPARE,e.type);
        }
    }

    @Test
    public void given1LiterAnd1000MlEqual_shouldReturnTrue() throws QuantityException {
        Quantity liter=new Quantity(Unit.LITER,1);
        Quantity ml=new Quantity(Unit.ML,1000);
        boolean compareVolume=Unit.compare(liter,ml);
        Assert.assertTrue(compareVolume);
    }

    @Test
    public void givenSumOf1GallonAnd3_78Liter_shouldEqualTo7_57Liters() {
        Quantity gallon=new Quantity(Unit.GALLON,1.0);
        Quantity liter=new Quantity(Unit.LITER,3.78);
        Double addition=Addition.add(gallon,liter);
        Assert.assertEquals(7.57,addition,0.2);
    }

    @Test
    public void givenSumOf1LiterAnd1000Ml_shouldEqualTo2Liters() {
        Quantity liter=new Quantity(Unit.LITER,1);
        Quantity ml=new Quantity(Unit.ML,1000);
        Double addition=Addition.add(liter,ml);
        Assert.assertEquals(2,addition,0.0);
    }
}
