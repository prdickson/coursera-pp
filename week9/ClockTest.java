import org.junit.Test;

import static org.junit.Assert.*;

public class ClockTest {

    @Test
    public void testThrowsWhenInstantiatedWithInvalidHours() {
        assertThrows(IllegalArgumentException.class, () -> new Clock(-1, 0));
        assertThrows(IllegalArgumentException.class, () -> new Clock(24, 0));
    }

    @Test
    public void testThrowsWhenInstantiatedWithInvalidMinutes() {
        assertThrows(IllegalArgumentException.class, () -> new Clock(0, -1));
        assertThrows(IllegalArgumentException.class, () -> new Clock(0, 60));
    }
}
