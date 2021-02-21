import org.junit.Test;

import static org.junit.Assert.*;

public class RamanujanTest {
    @Test
    public void testTrueCases() {
        assertTrue(Ramanujan.isRamanujan(1729));
        assertTrue(Ramanujan.isRamanujan(4104));
        assertTrue(Ramanujan.isRamanujan(216125));
        assertTrue(Ramanujan.isRamanujan(9223278330318728221L));
    }

    @Test
    public void testFalseCases() {
        assertFalse(Ramanujan.isRamanujan(3458));
    }
}
