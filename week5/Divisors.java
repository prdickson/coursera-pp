public class Divisors {

    // Returns the greatest common divisor of a and b.
    public static int gcd(int a, int b) {
        if (a == 0 || b == 0) return 0;

        a = Math.abs(a);
        b = Math.abs(b);
        while (b > 0) {
           int temp = b;
           b = a % b;
           a = temp;
        }
        return a;
    }

    // Returns the least common multiple of a and b.
    public static int lcm(int a, int b) {
        return (Math.abs(a) / Divisors.gcd(a, b)) * Math.abs(b);
    }

    // Returns true if a and b are relatively prime; false otherwise.
    public static boolean areRelativelyPrime(int a, int b){
        return Divisors.gcd(a,b) == 1;
    }

    // Returns the number of integers between 1 and n that are
    // relatively prime with n.
    public static int totient(int n) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            count += Divisors.areRelativelyPrime(n, i) ? 1 : 0;
        }
        return count;
    }

    // Takes two integer command-line arguments a and b and prints
    // each function, evaluated in the format (and order) given below.
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        StdOut.printf("gcd(%s, %s) = %s", a, b, Divisors.gcd(a, b));
        StdOut.println();
        StdOut.printf("lcm(%s, %s) = %s", a, b, Divisors.lcm(a, b));
        StdOut.println();
        StdOut.printf("areRelativelyPrime(%s, %s) = %s", a, b, 
                Divisors.areRelativelyPrime(a, b));
        StdOut.println();
        StdOut.printf("totient(%s) = %s", a, Divisors.totient(a));
        StdOut.println();
        StdOut.printf("totient(%s) = %s", b, Divisors.totient(b));
        StdOut.println();
    }
}
