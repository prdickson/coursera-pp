public class CMYKtoRGB {
    public static void main(String[] args) {
        double c = Double.parseDouble(args[0]);
        double m = Double.parseDouble(args[1]);
        double y = Double.parseDouble(args[2]);
        double k = Double.parseDouble(args[3]);
        double w = 1.0 - k;

        System.out.printf("red   = %s%n", Math.round(255 * w * (1 - c)));
        System.out.printf("green = %s%n", Math.round(255 * w * (1 - m)));
        System.out.printf("blue  = %s%n", Math.round(255 * w * (1 - y)));
    }
}
