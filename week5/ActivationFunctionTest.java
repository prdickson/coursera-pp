import org.junit.Test;

import static org.junit.Assert.*;

public class ActivationFunctionTest {
    private static double delta = 0.0000001;

    @Test
    public void testHeaviside() {
        assertEquals(ActivationFunction.heaviside(0), 0.5, delta);
        assertEquals(ActivationFunction.heaviside(1), 1.0, delta);
        assertEquals(ActivationFunction.heaviside(-1), 0.0, delta);
    }

    @Test
    public void testSimoid() {
        assertEquals(ActivationFunction.sigmoid(1), 0.7310585786300049, delta);
    }

    @Test
    public void testTanh() {
        assertEquals(ActivationFunction.tanh(1), 0.7615941559557649, delta);
        assertEquals(ActivationFunction.tanh(Double.POSITIVE_INFINITY), 1.0, delta);
        assertEquals(ActivationFunction.tanh(Double.NEGATIVE_INFINITY), -1.0, delta);
    }

    @Test
    public void testSoftsign() {
        assertEquals(ActivationFunction.softsign(-0.5), -0.333333333333333, delta);
    }

    @Test
    public void testSqnl() {
        assertEquals(ActivationFunction.sqnl(-2), -1.0, delta);
        assertEquals(ActivationFunction.sqnl(-0.5), -0.4375, delta);
        assertEquals(ActivationFunction.sqnl(1.0), 0.75, delta);
        assertEquals(ActivationFunction.sqnl(2), 1.0, delta);
    }
}
