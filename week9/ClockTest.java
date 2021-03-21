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

    @Test
    public void testThrowsWhenInstantiatedWithStringWithoutColon() {
        assertThrows(IllegalArgumentException.class, () -> new Clock("hey"));
    }

    @Test
    public void testThrowsWhenInstantiatedWithStringWithThreeParts() {
        assertThrows(IllegalArgumentException.class, () -> new Clock("hey:hey:hey"));
    }

    @Test
    public void testThrowsWhenInstantiatedWithStringNonNumericHours() {
        assertThrows(IllegalArgumentException.class, () -> new Clock("hey:10"));
    }

    @Test
    public void testThrowsWhenInstantiatedWithStringNonNumericMinutes() {
        assertThrows(IllegalArgumentException.class, () -> new Clock("10:hey"));
    }

    @Test
    public void testThrowsWhenInstantiatedWithInvalidTimeString() {
        assertThrows(IllegalArgumentException.class, () -> new Clock("-01:00"));
        assertThrows(IllegalArgumentException.class, () -> new Clock("24:00"));
        assertThrows(IllegalArgumentException.class, () -> new Clock("00:-01"));
        assertThrows(IllegalArgumentException.class, () -> new Clock("00:60"));
    }

    @Test
    public void testToStringWithoutPadding() {
        assertEquals("12:34", new Clock(12, 34).toString());
    }

    @Test
    public void testToStringWithPadding() {
        assertEquals("01:02", new Clock(1, 2).toString());
    }
}
