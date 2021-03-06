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
    public void givenTwoDiffReferencesAndSameValue_shouldNotSame() {
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
    public void givenSumOf2InchAnd2InchEqualto4Inch_shouldReturnTrue() throws QuantityException {
        Quantity inch1=new Quantity(Unit.INCH,2.0);
        Quantity inch2=new Quantity(Unit.INCH,2.0);
        Quantity actualAddition=Addition.add(inch1,inch2);
        Assert.assertEquals(new Quantity(Unit.INCH,4.0),actualAddition);
    }

    @Test
    public void givenSumOf1FeetAnd2InchEqualto14Inch_shouldReturnTrue() throws QuantityException {
        Quantity feet=new Quantity(Unit.FEET,1);
        Quantity inch=new Quantity(Unit.INCH,2);
        Quantity actualAddition=Addition.add(feet,inch);
        Assert.assertEquals(new Quantity(Unit.INCH,14),actualAddition);
    }

    @Test
    public void givenSumOf1FeetAnd1FeetEqualTo24Inch_shouldReturnTrue() throws QuantityException {
        Quantity feet1=new Quantity(Unit.FEET,1);
        Quantity feet2=new Quantity(Unit.FEET,1);
        Quantity addition=Addition.add(feet1,feet2);
        Assert.assertEquals(new Quantity(Unit.INCH,24),addition);
    }

    @Test
    public void givenSumOf2InchAnd25CmEqualTo3Inch() throws QuantityException {
        Quantity inch=new Quantity(Unit.INCH,2);
        Quantity cm=new Quantity(Unit.CM,2.5);
        Quantity addition=Addition.add(inch,cm);
        Assert.assertEquals(new Quantity(Unit.INCH,3),addition);
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
    public void givenSumOf1GallonAnd3_78Liter_shouldEqualTo7_57Liters() throws QuantityException {
        Quantity gallon=new Quantity(Unit.GALLON,1.0);
        Quantity liter=new Quantity(Unit.LITER,3.78);
        Quantity actualAddition=Addition.add(gallon,liter);
        Assert.assertEquals(new Quantity(Unit.LITER,7.57),actualAddition);
    }

    @Test
    public void givenSumOf1LiterAnd1000Ml_shouldEqualTo2Liters() throws QuantityException {
        Quantity liter=new Quantity(Unit.LITER,1);
        Quantity ml=new Quantity(Unit.ML,1000);
        Quantity actualAddition=Addition.add(liter,ml);
        Assert.assertEquals(new Quantity(Unit.LITER,2),actualAddition);
    }

    @Test
    public void given1KgAnd1000Grams_shouldReturnEqual() throws QuantityException {
        Quantity kg=new Quantity(Unit.KG,1);
        Quantity grams=new Quantity(Unit.GRAMS,1000);
        boolean compareMass=Unit.compare(kg,grams);
        Assert.assertTrue(compareMass);
    }

    @Test
    public void given1TonneAnd1000Kg_shouldReturnEqual() throws QuantityException {
        Quantity tonne=new Quantity(Unit.TUNNE,1);
        Quantity kg=new Quantity(Unit.KG,1000);
        Boolean compareMass=Unit.compare(tonne,kg);
        Assert.assertTrue(compareMass);
    }


    @Test
    public void givenSumOf1TonneAnd1000Gm_shouldEqualTo1001Kg() throws QuantityException {
        Quantity tonne=new Quantity(Unit.TUNNE,1);
        Quantity grams=new Quantity(Unit.GRAMS,1000);
        Quantity actualAddition=Addition.add(tonne,grams);
        Assert.assertEquals(new Quantity(Unit.KG,1001),actualAddition);
    }

    @Test
    public void given212FahrenheitEqualTo100Celsius_shouldReturnTrue() throws QuantityException {
        Quantity fahrenheit=new Quantity(Unit.FAHRENHEIT,212);
        Quantity celsius=new Quantity(Unit.CELSIUS,100);
        Boolean compareTemp=Unit.compare(fahrenheit,celsius);
        Assert.assertTrue(compareTemp);
    }

    @Test
    public void givenQuantityValueIsNegative_shouldThrowException() throws QuantityException {
        Quantity tonne=new Quantity(Unit.TUNNE,1);
        Quantity grams=new Quantity(Unit.GRAMS,-1000);
        try {
            Quantity addition=Addition.add(tonne,grams);
            Assert.assertEquals(new Quantity(Unit.KG,1001),addition);
        }catch (QuantityException e){
            Assert.assertEquals("value can not negative",e.getMessage());
        }
    }

    @Test
    public void givenAdditionOfTemp_shouldThrowException() throws QuantityException {
        Quantity fahrenheit=new Quantity(Unit.FAHRENHEIT,212);
        Quantity celsius=new Quantity(Unit.FAHRENHEIT,100);
        try {
            Addition.add(fahrenheit,celsius);
        }catch (QuantityException e){
            e.printStackTrace();
            Assert.assertEquals(QuantityException.ExceptionType.TEMP_NOT_ADDED,e.type);
        }
    }
}
