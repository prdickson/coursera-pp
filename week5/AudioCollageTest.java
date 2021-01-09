import org.junit.Test;
import static org.junit.Assert.*;

public class AudioCollageTest {
    private static double delta = 0.0000001;

    @Test
    public void testAmplify() {
        assertArrayEquals(AudioCollage.amplify(new double[] { 0.2, 0.4 }, 2), 
                          new double[] { 0.4, 0.8 },
                          delta);
    }

    @Test
    public void testReverse() {
        assertArrayEquals(AudioCollage.reverse(new double[] { 0.2, 0.4 }), 
                          new double[] { 0.4, 0.2 },
                          delta);
    }

    @Test
    public void testMerge() {
        assertArrayEquals(AudioCollage.merge(new double[] { 0.2, 0.4 }, 
                                           new double[] { 0.3, 0.5 }),
                          new double[] { 0.2, 0.4, 0.3, 0.5 },
                          delta);
    }


    @Test
    public void testMixWhenSameLength() {
        assertArrayEquals(AudioCollage.mix(new double[] { 0.2, 0.4 }, 
                                           new double[] { 0.3, 0.5 }),
                          new double[] { 0.5, 0.9 },
                          delta);
    }

    @Test
    public void testMixWhenDifferentLength() {
        assertArrayEquals(AudioCollage.mix(new double[] { 0.2, 0.4, 0.6 }, 
                                           new double[] { 0.3, 0.5 }),
                          new double[] { 0.5, 0.9, 0.6 },
                          delta);

        assertArrayEquals(AudioCollage.mix(new double[] { 0.2, 0.4 }, 
                                           new double[] { 0.3, 0.5, 0.6 }),
                          new double[] { 0.5, 0.9, 0.6 },
                          delta);
    }

    @Test
    public void testChangeSpeed() {
        assertArrayEquals(AudioCollage.changeSpeed(new double[] { 0.2, 0.4 }, 2),
                          new double[] { 0.2 },
                          delta);
        assertArrayEquals(AudioCollage.changeSpeed(new double[] { 0.2, 0.4, 0.3 }, 2),
                          new double[] { 0.2, 0.3 },
                          delta);
    }


}
