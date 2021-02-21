public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));
        double r = 6371.0;

        double sx = Math.sin((x2 - x1) / 2.0);
        double sy = Math.sin((y2 - y1) / 2.0);
        double th = Math.sqrt(sx * sx + Math.cos(x1) * Math.cos(x2) * sy * sy);
        double distance = 2.0 * r * Math.asin(th);

        System.out.printf("%s kilometers%n", distance);
    }
}
