public class TrinomialDP {

    // Returns the trinomial coefficient T(n, k).
    public static long trinomial(int n, int k) {
        if (n == 0 && k == 0) return 1;
        if (k < -n || k > n) return 0;

        long[][] results = new long[n + 1][n + 1];
        results[0][0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    results[i][j] = results[i - 1][j] + results[i - 1][j + 1] * 2;
                } else if (j == i) {
                    results[i][j] = results[i - 1][j] + results[i - 1][j - 1];
                } else {
                    results[i][j] = results[i - 1][j] + results[i - 1][j - 1] + results[i - 1][j + 1];
                }
            }
        }

        return results[n][Math.abs(k)];
    }

    // Takes two integer command-line arguments n and k and prints T(n, k).
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        StdOut.println(trinomial(n, k));
    }
}
