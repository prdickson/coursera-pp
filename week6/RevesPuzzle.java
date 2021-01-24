public class RevesPuzzle {
    /*public static String hanoi(int n, boolean left)
    {
        if (n == 0) return " ";
        String move;
        if (left) move = n + "L";
        else move = n + "R";
        return hanoi(n-1, !left) + move + hanoi(n-1, !left);
    }*/

    /*public static void hanoi(int n, int k, int stack, char[] labels) {
        if (n == 0) return;
        boolean left = n % 2 != 0;
        
        hanoi(n-1, k, stack, labels);
        StdOut.printf("Move disc %s from %s to %s", n, labels[stack], labels[getHanoiDesination(stack, left, labels)]);
        StdOut.println();
        hanoi(n-1, k, getHanoiDesination(stack, !left, labels), labels);
    }*/
    
    public static void hanoi2(int n, int k, char src, char dest, char temp) {
        if (n == 0) return;
        
        hanoi2(n-1, k, src, temp, dest);
        StdOut.printf("Move disc %s from %s to %s", n, src, dest);
        StdOut.println();
        hanoi2(n-1, k, temp, dest, src);
    }

    /*private static int getHanoiDesination(int stack, boolean left, char[] labels) {
        if (stack == 0 && left) return labels.length - 1;
        if (stack == labels.length - 1 && !left) return 0; 
        return left ? stack - 1 : stack + 1;
    }*/
 

    public static void reve(int n, char src, char dest, char temp1, char temp2) {
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
        int k = (n + 1) - (int) Math.round(Math.sqrt(2 * n + 1));
        StdOut.println(k);
        char[] labels = {'A', 'B', 'C'};
        //reve(k, 'A', 'B', 'C', 'D'); 
        //hanoi(n, k, 0, labels); 
        StdOut.println(k);
        hanoi2(n, k, 'A', 'C', 'B'); 
    }
}
