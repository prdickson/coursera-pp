public class RecursiveSquares {

    // Draws a square centered on (x, y) of the given side length
    // with a light gray background and a black border.
    public static void drawSquare(double x, double y, double length) {
        double halfLength = length / 2;
        StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
        StdDraw.filledSquare(x, y, halfLength);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.line(x - halfLength, y + halfLength, x + halfLength, y + halfLength);
        StdDraw.line(x - halfLength, y - halfLength, x + halfLength, y - halfLength);
        StdDraw.line(x - halfLength, y - halfLength, x - halfLength, y + halfLength);
        StdDraw.line(x + halfLength, y - halfLength, x + halfLength, y + halfLength);
    }

    // Draws a recursive square pattern of order n, centered on (x, y)
    // of the given side length.
    public static void draw(int n, double x, double y, double length) {
        if (n == 0) return;
        double halfLength = length / 2;
        draw(n - 1, x - halfLength, y + halfLength, halfLength);
        draw(n - 1, x + halfLength, y + halfLength, halfLength);
        drawSquare(x, y, length);
        draw(n - 1, x - halfLength, y - halfLength, halfLength);
        draw(n - 1, x + halfLength, y - halfLength, halfLength);
    }

    // Takes an integer command-line argument n and draws a recursive
    // square pattern of order n, centered on (0.5, 0.5) with side length 0.5.
    public static void main(String[] args) {
        StdDraw.enableDoubleBuffering();
        int n = Integer.parseInt(args[0]);
        StdDraw.setScale(0, 1);
        draw(n, 0.5, 0.5, 0.5);
        StdDraw.show();
    }
}