import org.junit.Test;

import static org.junit.Assert.*;


public class BarTest {
    @Test
    public void testThrowsWhenCreatedWithNullName() {
        assertThrows(IllegalArgumentException.class, () -> new Bar(null, 0, "category"));
    }

    @Test
    public void testThrowsWhenCreatedWithNegativeValue() {
        assertThrows(IllegalArgumentException.class, () -> new Bar("name", -1, "category"));
    }

    @Test
    public void testThrowsWhenCreatedWithNullCategory() {
        assertThrows(IllegalArgumentException.class, () -> new Bar("name", 0, null));
    }

    @Test
    public void testThrowsWhenComparedToNull() {
        Bar b = new Bar("name", 0, "category");
        assertThrows(IllegalArgumentException.class, () -> b.compareTo(null));
    }
}
