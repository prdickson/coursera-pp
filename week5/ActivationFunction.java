public class ActivationFunction {

    // Returns the Heaviside function of x.
    public static double heaviside(double x) {
        if (x < 0) return 0;
        if (x > 0) return 1;
        return 0.5;
    }

    // Returns the sigmoid function of x.
    public static double sigmoid(double x) {
        return 1 / (1 + Math.exp(-x));
    }

    // Returns the hyperbolic tangent of x.
    public static double tanh(double x) {
        return 0.0;
    }

    // Returns the softsign function of x.
    public static double softsign(double x) {
        return 0.0;
    }

    // Returns the square nonlinearity function of x.
    public static double sqnl(double x){
        return 0.0;
    }

    public static void main(String[] args) {
        Double m = Double.parseDouble(args[0]);
        StdOut.printf("  viside(%s) = %s", m, ActivationFunction.heaviside(m));
        StdOut.println();
        StdOut.printf(" sigmoid(%s) = %s", m, ActivationFunction.sigmoid(m));
        StdOut.println();
        StdOut.printf("    tanh(%s) = %s", m, ActivationFunction.tanh(m));
        StdOut.println();
        StdOut.printf("softsign(%s) = %s", m, ActivationFunction.softsign(m));
        StdOut.println();
        StdOut.printf("    sqnl(%s) = %s", m, ActivationFunction.softsign(m));
        StdOut.println();
    }
}

