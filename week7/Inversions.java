public class Inversions {
    // Return the number of inversions in the permutation a[].
    public static long count(int[] a) {
        return 0;
    }

    // Return a permutation of length n with exactly k inversions.
    public static int[] generate(int n, long k) {
        int[] result = new int[n];
        int lo = 0;
        int high = n;
        long remaining = k;
        for (int i = 0; i < n; i++) {
            if (remaining >= (high - 1) - i) {
                result[i] = high - 1;
                remaining -= high;
                high--;
            } else {
                result[i] = lo;
                lo++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);

        int[] result = generate(n, k);
        for (int j : result) {
            StdOut.printf("%s ", j);
        }
        StdOut.println();
    }
}
