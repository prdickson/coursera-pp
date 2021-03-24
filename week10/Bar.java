public class Bar implements Comparable<Bar> {

    private final String name;
    private final int value;
    private final String category;

    // Creates a new bar.
    public Bar(String name, int value, String category) {
        if (name == null) throw new IllegalArgumentException("name");
        if (value < 0) throw new IllegalArgumentException("value");
        if (category == null) throw new IllegalArgumentException("category");

        this.name = name;
        this.value = value;
        this.category = category;
    }

    // Returns the name of this bar.
    public String getName() {
        return name;
    }

    // Returns the value of this bar.
    public int getValue() {
        return this.value;
    }

    // Returns the category of this bar.
    public String getCategory() {
        return this.category;
    }

    // Compare two bars by value.
    public int compareTo(Bar that) {
        if (that == null) throw new IllegalArgumentException("that");
        if (value < that.value) return -1;
        if (value > that.value) return 1;
        return 0;
    }

    // Sample client (see below).
    public static void main(String[] args) {

    }

}
