public class RevesPuzzle {
    /*public static String hanoi(int n, boolean left)
    {
        if (n == 0) return " ";
        String move;
        if (left) move = n + "L";
        else move = n + "R";
        return hanoi(n-1, !left) + move + hanoi(n-1, !left);
    }*/

    public static void hanoi(int n, int k, char stack, boolean left) {
        if (n == 0) return;
        
        hanoi(n-1, k, stack, !left);
        StdOut.printf("Move disc %s from %s to %s", n, stack, getHanoiDesination(stack, left));
        StdOut.println();
        hanoi(n-1, k, getHanoiDesination(stack, !left), !left);
    }

    private static char getHanoiDesination(char stack, boolean left) {
        if (stack == 'A')
            return left ? 'D' : 'C';
        if (stack == 'C')
            return left? 'A' : 'D';
        return left? 'C' : 'A';
    }
 
    public static void reve(int n, int k, char from, char to) {
        if (n == 0) return;
        if (n > k) reve(n - 1, k, from, to);
        if (n == k) StdOut.printf("Move disc %s from %s to %s", n, from, to);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = (n + 1) - (int) Math.round(Math.sqrt(2 * n + 1));
        StdOut.println(k);
        hanoi(n, k, 'A', true); 
        //reve(n, k, 'A', 'B');
    }
}
