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
}
