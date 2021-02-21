public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        boolean[] a = new boolean[n];
        int r = 1;
        int i = 0;

        while (r + i < n) {
            a[r + i] = !a[i];
            i += 1;

            if (i >= r) {
                i = 0;
                r *= 2;
            }
        }

        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                System.out.printf("%s  ", a[j] == a[k] ? "+" : "-");
            }
            System.out.println();
        }
    }
}
