import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class KernelFilterTest {

    @Test
    public void testIdentity() {
        Picture p = new Picture("baboon.png");
        assertEquals(p, KernelFilter.identity(p));
    }
}