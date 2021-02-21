import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class InversionsTest {
    @Test
    public void testBuildsZeroInversions() {
        int[] expected = {0, 1, 2};
        assertArrayEquals(expected, Inversions.generate(3, 0));
    }

    @Test
    public void testBuildsOneInversion() {
        int[] expected = {0, 2, 1};
        assertArrayEquals(expected, Inversions.generate(3, 1));
    }

    @Test
    public void testBuildsTwoInversions() {
        int[] expected = {2, 0, 1};
        assertArrayEquals(expected, Inversions.generate(3, 2));
    }

    @Test
    public void testBuilds20Inversions() {
        int[] expected = {9, 8, 0, 1, 2, 3, 7, 4, 5, 6};
        assertArrayEquals(expected, Inversions.generate(10, 20));
    }

    @Test
    public void testBuildsMaximumInversions() {
        int[] expected = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        assertArrayEquals(expected, Inversions.generate(10, 45));
    }

    @Test
    public void testCountsZeroInversions() {
        int[] inversions = {0, 1, 2};
        assertEquals(0, Inversions.count(inversions));
    }

    @Test
    public void testCountsOneInversion() {
        int[] inversions = {0, 2, 1};
        assertEquals(1, Inversions.count(inversions));
    }

    @Test
    public void testCountsTwoInversions() {
        int[] inversions = {2, 0, 1};
        assertEquals(2, Inversions.count(inversions));
    }

    @Test
    public void testCountsTwentyInversions() {
        int[] inversions = {9, 8, 0, 1, 2, 3, 7, 4, 5, 6};
        assertEquals(20, Inversions.count(inversions));
    }

    @Test
    public void testCountsMaximumInversions() {
        int[] inversions = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        assertEquals(45, Inversions.count(inversions));
    }
}
