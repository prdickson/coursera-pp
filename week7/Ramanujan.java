public class Ramanujan {
    // Is n a Ramanujan number?
    public static boolean isRamanujan(long n) {
        return false;
    }

    // Takes a long integer command-line arguments n and prints true if
    // n is a Ramanujan number, and false otherwise.
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        StdOut.print(isRamanujan(n));
        StdOut.println();
    }
}
