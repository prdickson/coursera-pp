public class MaximumSquareSubmatrix {

    // Returns the size of the largest contiguous square submatrix
    // of a[][] containing only 1s.
    public static int size(int[][] a) {

        int lastMax = 0;
        int currentMax = 0;

        for (int target = 1; target <= a.length; target++) {
            for (int j = 0; j < a.length - 1; j++) {
                for (int k = 0; k < a.length - 1; k++) {

                    if (currentMax == 0 && (a[j][k] == target || a[j][k + 1] >= target || a[j + 1][k] >= target || a[j + 1][k + 1] >= target))
                        currentMax = target;

                    if (a[j][k] >= target && a[j][k + 1] >= target && a[j + 1][k] >= target && a[j + 1][k + 1] >= target) {
                        a[j][k] = target + 1;
                        currentMax = target + 1;
                    }
                }
            }

            if (lastMax == currentMax)
                return currentMax;

            lastMax = currentMax;
        }

        return currentMax;
    }

    // Reads an n-by-n matrix of 0s and 1s from standard input
    // and prints the size of the largest contiguous square submatrix
    // containing only 1s.
    public static void main(String[] args) {
        int n = StdIn.readInt();
        StdIn.readLine();

        int[][] m = new int[n][n];
        int i = 0;
        while (StdIn.hasNextLine()) {
            String line = StdIn.readLine();
            String[] row = line.split(" {2}");

            for (int j = 0; j < row.length; j++) {
                m[i][j] = Integer.parseInt(row[j]);
            }
            i++;
        }

        StdOut.println(size(m));
    }
}
