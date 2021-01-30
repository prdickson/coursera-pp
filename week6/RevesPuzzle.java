public class RevesPuzzle {
   private static void hanoi(int n, int k, char src, char dest, char temp) {
        if (n == 0) return;
        
        hanoi(n-1, k, src, temp, dest);
        StdOut.printf("Move disc %s from %s to %s", n + k, src, dest);
        StdOut.println();
        hanoi(n-1, k, temp, dest, src);
    }

    private static void reve(int n, char src, char dest, char temp1, char temp2) {
        if (n == 0) return;
        if (n == 1) {
            StdOut.printf("Move disc %s from %s to %s", n, src, dest);
            StdOut.println();
            return;
        }
        
        reve(n - 2, src, temp1, temp2, dest);
        StdOut.printf("Move disc %s from %s to %s", n - 1, src, temp2);
        StdOut.println();
        StdOut.printf("Move disc %s from %s to %s", n, src, dest);
        StdOut.println();
        StdOut.printf("Move disc %s from %s to %s", n - 1, temp2, dest);
        StdOut.println();
        reve(n - 2, temp1, dest, src, temp2);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = (int) Math.floor(((double)n + 1.0) - Math.sqrt(2 * n + 1));
        reve(k, 'A', 'B', 'C', 'D'); 
        hanoi(n - k, k, 'A', 'D', 'C'); 
        reve(k, 'B', 'D', 'A', 'C'); 
    }
}
