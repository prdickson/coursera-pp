public class RevesPuzzle {
    /*public static String hanoi(int n, boolean left)
    {
        if (n == 0) return " ";
        String move;
        if (left) move = n + "L";
        else move = n + "R";
        return hanoi(n-1, !left) + move + hanoi(n-1, !left);
    }*/


    /*public static void hanoi(int n, int k, char stack) {
        if (n == 0) return;
        boolean left = n % 2 == 1;
        
        hanoi(n-1, k, stack);
        StdOut.printf("Move disc %s from %s to %s", n, stack, getHanoiDesination(stack, left));
        StdOut.println();
        hanoi(n-1, k, getHanoiDesination(stack, !left));
    }*/

    public static void hanoi(int n, int k, int stack, char[] labels) {
        if (n == 0) return;
        boolean left = n % 2 != 0;
        
        hanoi(n-1, k, stack, labels);
        StdOut.printf("Move disc %s from %s to %s", n, labels[stack], labels[getHanoiDesination(stack, left, labels)]);

        StdOut.println();
        hanoi(n-1, k, getHanoiDesination(stack, !left, labels), labels);
    }

    private static int getHanoiDesination(int stack, boolean left, char[] labels) {
        if (stack == 0 && left) return labels.length - 1;
        if (stack == labels.length - 1 && !left) return 0; 
        return left ? stack - 1 : stack + 1;
    }
 
    public static void reve(int n, int pole, int destination) {
        if (n == 0) return;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = (n + 1) - (int) Math.round(Math.sqrt(2 * n + 1));
        StdOut.println(k);
        char[] labels = {'A', 'B', 'C'};
        hanoi(n, k, 0, labels); 
        //reve(n, k, 'A', 'B');
    }
}
