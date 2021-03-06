import java.awt.Color;

public class KernelFilter {
    // Returns a new picture that applies the identity filter to the given picture.
    public static Picture identity(Picture picture) {
        double[][] weights = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };

        return kernel(picture, weights);
    }

    // Returns a new picture that applies a Gaussian blur filter to the given picture.
    public static Picture gaussian(Picture picture) {
        double[][] weights = {
                {1 / 16d, 2 / 16d, 1 / 16d},
                {2 / 16d, 4 / 16d, 2 / 16d},
                {1 / 16d, 2 / 16d, 1 / 16d}
        };

        return kernel(picture, weights);
    }

    // Returns a new picture that applies a sharpen filter to the given picture.
    public static Picture sharpen(Picture picture) {
        double[][] weights = {
                {0, -1, 0},
                {-1, 5, -1},
                {0, -1, 0},
        };

        return kernel(picture, weights);
    }

    // Returns a new picture that applies an Laplacian filter to the given picture.
    public static Picture laplacian(Picture picture) {
        double[][] weights = {
                {-1, -1, -1},
                {-1, 8, -1},
                {-1, -1, -1},
        };

        return kernel(picture, weights);
    }

    // Returns a new picture that applies an emboss filter to the given picture.
    public static Picture emboss(Picture picture) {
        double[][] weights = {
                {-2, -1, 0},
                {-1, 1, 1},
                {0, 1, 2},
        };

        return kernel(picture, weights);
    }

    // Returns a new picture that applies a motion blur filter to the given picture.
    public static Picture motionBlur(Picture picture) {
        double[][] weights = {
                {1 / 9d, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1 / 9d, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1 / 9d, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1 / 9d, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1 / 9d, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1 / 9d, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1 / 9d, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1 / 9d, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1 / 9d, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 1 / 9d}
        };

        return kernel(picture, weights);
    }

    private static Picture kernel(Picture picture, double[][] weights) {
        Picture result = new Picture(picture.width(), picture.height());

        int boundary = (weights.length - 1) / 2;

        for (int i = 0; i < picture.width(); i++) {
            for (int j = 0; j < picture.height(); j++) {

                double r = 0;
                double g = 0;
                double b = 0;

                for (int k = -boundary; k <= boundary; k++) {
                    int px = getOffset(i, k, 0, picture.width() - 1);
                    int bx = boundary + k;

                    for (int l = -boundary; l <= boundary; l++) {
                        int py = getOffset(j, l, 0, picture.height() - 1);
                        int by = boundary + l;

                        Color cxy = picture.get(px, py);

                        r += (weights[bx][by] * cxy.getRed());
                        g += (weights[bx][by] * cxy.getGreen());
                        b += (weights[bx][by] * cxy.getBlue());
                    }
                }

                result.set(i, j, new Color(getClamped(r), getClamped(g), getClamped(b)));
            }
        }

        return result;
    }

    private static int getOffset(int i, int n, int min, int max) {

        int offset = i + n;

        while (offset < min || offset > max) {
            if (offset > max)
                offset -= max + 1;
            if (offset < min)
                offset += max + 1;
        }

        return offset;
    }

    private static int getClamped(double v) {
        return Math.max(0, Math.min((int) Math.round(v), 255));
    }

    // Test client (ungraded).
    public static void main(String[] args) {
        Picture p = new Picture("baboon.png");
        p.show();
        gaussian(p).show();
    }
}
