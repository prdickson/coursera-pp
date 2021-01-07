public class ActivationFunction {

    // Returns the Heaviside function of x.
    public static double heaviside(double x) {
        return 0.0;
    }

    // Returns the sigmoid function of x.
    public static double sigmoid(double x) {
        return 0.0;
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
        StdOut.printf("  viside(%g) = %g", m, ActivationFunction.heaviside(m));
        StdOut.println();
        StdOut.printf(" sigmoid(%g) = %g", m, ActivationFunction.sigmoid(m));
        StdOut.println();
        StdOut.printf("    tanh(%g) = %g", m, ActivationFunction.tanh(m));
        StdOut.println();
        StdOut.printf("softsign(%g) = %g", m, ActivationFunction.softsign(m));
        StdOut.println();
        StdOut.printf("    sqnl(%g) = %g", m, ActivationFunction.softsign(m));
        StdOut.println();
    }
}

