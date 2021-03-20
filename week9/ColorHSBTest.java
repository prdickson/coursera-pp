import org.junit.Test;

import static org.junit.Assert.*;

public class ColorHSBTest {
    @Test
    public void testThrowsWhenHueIsLessThanZero() {
        new ColorHSB(0, 0, 0); //does not throw
        assertThrows(IllegalArgumentException.class, () -> new ColorHSB(-1, 0, 0));
    }

    @Test
    public void testThrowsWhenHueIsGreaterThan359() {
        new ColorHSB(359, 0, 0); //does not throw
        assertThrows(IllegalArgumentException.class, () -> new ColorHSB(360, 0, 0));
    }

    @Test
    public void testThrowsWhenSaturationIsLessThanZero() {
        new ColorHSB(0, 0, 0); //does not throw
        assertThrows(IllegalArgumentException.class, () -> new ColorHSB(0, -1, 0));
    }

    @Test
    public void testThrowsWhenSaturationIsGreaterThan100() {
        new ColorHSB(0, 100, 0); //does not throw
        assertThrows(IllegalArgumentException.class, () -> new ColorHSB(0, 101, 0));
    }

    @Test
    public void testThrowsWhenBrightnessIsLessThanZero() {
        new ColorHSB(0, 0, 0); //does not throw
        assertThrows(IllegalArgumentException.class, () -> new ColorHSB(0, 0, -1));
    }

    @Test
    public void testThrowsWhenBrightnessIsGreaterThan100() {
        new ColorHSB(0, 0, 0); //does not throw
        assertThrows(IllegalArgumentException.class, () -> new ColorHSB(0, 0, 101));
    }

    @Test
    public void testThrowsDistanceToSquareParamIsNull() {
        ColorHSB c = new ColorHSB(0, 0, 0);
        assertThrows(IllegalArgumentException.class, () -> c.distanceSquaredTo(null));
    }

    @Test
    public void testToString() {
        ColorHSB c = new ColorHSB(156, 60, 70);
        assertEquals("(156, 60, 70)", c.toString());
    }

    @Test
    public void testIsGrayscaleSaturation() {
        ColorHSB c = new ColorHSB(156, 0, 1);
        assertTrue(c.isGrayscale());
    }

    @Test
    public void testIsNotGrayscaleSaturation() {
        ColorHSB c = new ColorHSB(156, 1, 1);
        assertFalse(c.isGrayscale());
    }

    @Test
    public void testIsGrayscaleBrightness() {
        ColorHSB c = new ColorHSB(156, 1, 0);
        assertTrue(c.isGrayscale());
    }

    @Test
    public void testIsNotGrayscaleBrightness() {
        ColorHSB c = new ColorHSB(156, 1, 1);
        assertFalse(c.isGrayscale());
    }

    @Test
    public void testDistanceSmallHueDelta() {
        ColorHSB c1 = new ColorHSB(359, 100, 45);
        ColorHSB c2 = new ColorHSB(358, 97, 50);
        assertEquals(35, c1.distanceSquaredTo(c2));
    }

    @Test
    public void testDistanceLargeHueDelta() {
        ColorHSB c1 = new ColorHSB(350, 100, 45);
        ColorHSB c2 = new ColorHSB(0, 97, 50);
        assertEquals(134, c1.distanceSquaredTo(c2));
    }
}
