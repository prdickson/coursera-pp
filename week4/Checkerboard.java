public class Checkerboard {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        StdDraw.setScale(0, n);

        boolean blue = true;
        for(int i = 0; i < n; i++) {
            blue = i % 2 == 0;
            for(int j = 0; j < n; j++) {
                if (blue)
                    StdDraw.setPenColor(StdDraw.BLUE);
                else
                    StdDraw.setPenColor(StdDraw.GRAY);

                StdDraw.filledSquare(i+ 0.5, j + 0.5, 0.5);
                blue = !blue;
            }
        }
    }
}
