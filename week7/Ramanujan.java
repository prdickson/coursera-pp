import org.w3c.dom.xpath.XPathResult;

public class Ramanujan {
    // Is n a Ramanujan number?
    public static boolean isRamanujan(long n) {
        long hi = (long) Math.cbrt(n);
        long mid  = n / 2;
        int pairsFound = 0;

        for (long i = 1; i < hi; i++) {
            long a = i * i * i;

            if (a > mid)
                break;

            double b = Math.cbrt(n - a);

            if (b % 1 == 0)
                pairsFound++;
        }

        return pairsFound == 2;
    }

    // Takes a long integer command-line arguments n and prints true if
    // n is a Ramanujan number, and false otherwise.
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        StdOut.print(isRamanujan(n));
        StdOut.println();
    }
}
