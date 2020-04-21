import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {
    @Test
    public void given0FeetAnd0Feet_shouldReturnEqual() {
        Feet feet1=new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void givenNullAsObject_shouldReturnFalse() {
        Feet feet2 = new Feet(0.0);
        Assert.assertNotEquals(null,feet2);
    }

    @Test
    public void givenTwoDiffReferences_shouldReturnNotSame() {
        Feet feet1=new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assert.assertNotSame(feet1,feet2);
    }

    @Test
    public void givenTwoDiffDataType_shouldReturnFalse() {
        Feet feet2 = new Feet(0.0);
        Assert.assertNotEquals("String",feet2);
    }

    @Test
    public void given0FeetAnd1Feet_shouldReturnNotEqual() {
        Feet feet1=new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assert.assertNotEquals(feet1,feet2);
    }

    @Test
    public void givenSameReferance_shouldReturnEqual() {
        Feet feet2 = new Feet(1.0);
        Assert.assertEquals(feet2,feet2);
    }
}
