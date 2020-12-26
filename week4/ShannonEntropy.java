public class ShannonEntropy {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = 0;
        int[] occ = new int[m];

        while (!StdIn.isEmpty()) {
            int x = StdIn.readInt();
            occ[x-1] += 1;
            n += 1;
        }

        double ent = 0.0;
        for(int i = 0; i < m; i++) {
            if (occ[i] > 0) {
                double p = (double)occ[i] / n;
                ent += p * (Math.log(p) / Math.log(2));
            }
        }
        StdOut.printf("%.4f", -ent);
        StdOut.println();
    }
}
