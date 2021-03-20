import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KernelFilterTest {

    Picture given = new Picture("baboon.png");

    @Test
    public void testIdentity() {
        Picture expected = new Picture("baboon.png");

        assertEquals(expected, KernelFilter.identity(given));
    }

    @Test
    public void testGaussian() {
        Picture expected = new Picture("baboon-blur3.png");

        assertEquals(expected, KernelFilter.gaussian(given));
    }

    @Test
    public void testSharpen() {
        Picture expected = new Picture("baboon-sharpen.png");

        assertEquals(expected, KernelFilter.sharpen(given));
    }

    @Test
    public void testLaplacian() {
        Picture expected = new Picture("baboon-laplacian.png");

        assertEquals(expected, KernelFilter.laplacian(given));
    }

    @Test
    public void testEmboss() {
        Picture expected = new Picture("baboon-emboss.png");

        assertEquals(expected, KernelFilter.emboss(given));
    }

    @Test
    public void testMotion() {
        Picture expected = new Picture("baboon-motion.png");

        assertEquals(expected, KernelFilter.motionBlur(given));
    }
}