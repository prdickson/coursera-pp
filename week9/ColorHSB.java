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
        return s == 0 || b == 0;
    }

    // Returns the squared distance between the two colors.
    public int distanceSquaredTo(ColorHSB that) {
        if (that == null) throw new IllegalArgumentException("that");

        return (int) (Math.min(Math.pow(h - that.h, 2), Math.pow(360 - Math.abs(h - that.h), 2))
                + Math.pow(s - that.s, 2)
                + Math.pow(b - that.b, 2));
    }

    // Sample client (see below).
    public static void main(String[] args) {
        ColorHSB c1 = new ColorHSB(
                Integer.parseInt(args[0]),
                Integer.parseInt(args[1]),
                Integer.parseInt(args[2]));

        String closestName = null;
        ColorHSB closest = null;
        int closestDistanceSquared = Integer.MAX_VALUE;
        while (!StdIn.isEmpty()) {
            String name = StdIn.readString();
            ColorHSB c2 = new ColorHSB(StdIn.readInt(), StdIn.readInt(), StdIn.readInt());

            int distance = c1.distanceSquaredTo(c2);
            if (distance <= closestDistanceSquared) {
                closestName = name;
                closest = c2;
                closestDistanceSquared = distance;
            }
        }

        if (closest != null) {
            StdOut.printf("%s %s", closestName, closest);
            StdOut.println();
        }
    }
}
