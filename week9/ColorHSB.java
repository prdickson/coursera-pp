public class ColorHSB {
    private final int h;
    private final int s;
    private final int b;

    // Creates a color with hue h, saturation s, and brightness b.
    public ColorHSB(int h, int s, int b) {
        if (h < 0) throw new IllegalArgumentException("h");
        if (h > 359) throw new IllegalArgumentException("h");
        if (s < 0) throw new IllegalArgumentException("s");
        if (s > 100) throw new IllegalArgumentException("s");
        if (b < 0) throw new IllegalArgumentException("b");
        if (b > 100) throw new IllegalArgumentException("b");

        this.h = h;
        this.s = s;
        this.b = b;
    }

    // Returns a string representation of this color, using the format (h, s, b).
    public String toString() {
        return String.format("(%s, %s, %s)", h, s, b);
    }

    // Is this color a shade of gray?
    public boolean isGrayscale() {
        return false;
    }

    // Returns the squared distance between the two colors.
    public int distanceSquaredTo(ColorHSB that) {
        if (that == null) throw new IllegalArgumentException("that");

        return 0;
    }

    // Sample client (see below).
    public static void main(String[] args) {

    }
}