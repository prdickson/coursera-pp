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

    @Test
    public void testGetName() {
        Bar b = new Bar("name", 0, "category");
        assertEquals("name", b.getName());
    }

    @Test
    public void testGetValue() {
        Bar b = new Bar("name", 1, "category");
        assertEquals(1, b.getValue());
    }

    @Test
    public void testGetCategory() {
        Bar b = new Bar("name", 1, "category");
        assertEquals("category", b.getCategory());
    }

    @Test
    public void testCompareToEquals() {
        Bar b = new Bar("n", 1, "c");
        assertEquals(0, b.compareTo(new Bar("n", 1, "c")));
    }

    @Test
    public void testCompareToLessThen() {
        Bar b = new Bar("n", 0, "c");
        assertEquals(-1, b.compareTo(new Bar("n", 1, "c")));
    }

    @Test
    public void testCompareToGreaterThen() {
        Bar b = new Bar("n", 1, "c");
        assertEquals(1, b.compareTo(new Bar("n", 0, "c")));
    }
}
