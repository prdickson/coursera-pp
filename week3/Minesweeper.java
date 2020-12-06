public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);
        boolean[] board = new boolean[m * n];
        
        for (int i = 0; i < k; i++) {
            while (true) {
                int p = (int)(Math.random() * board.length);
                if (!board[p]) {
                    board[p] = true;
                    break;
                }
            } 
        }

        for(int i = 0; i < board.length; i++) {
            if (i % n == 0 && i > 0)
                System.out.println("");

            if (board[i]) {
                System.out.print(String.format("%s  ", '*'));
            } else {
                int nearby = 0;
                
                boolean colToLeft = i % n > 0;
                boolean colToRight = (i + 1) % n > 0;
                boolean rowAbove = i - n >= 0;
                boolean rowBelow = i + n < board.length;

                if (colToLeft) 
                    nearby += board[i - 1] ? 1 : 0;
                
                if (colToRight && (i + 1) < board.length)
                    nearby += board[i + 1] ? 1 : 0;
                
                if (rowAbove)
                    nearby += board[i - n] ? 1 : 0;
  
                if (rowBelow)
                    nearby += board[i + n] ? 1 : 0;

                if (colToLeft && rowAbove)
                    nearby += board[i - n - 1] ? 1 : 0;

                if (colToRight && rowAbove)
                    nearby += board[i - n + 1] ? 1 : 0;

                if (colToLeft && rowBelow)
                    nearby += board[i + n - 1] ? 1 : 0;

                if (colToRight && rowBelow && (i + n + 1) < board.length)
                    nearby += board[i + n + 1] ? 1 : 0;

                System.out.print(String.format("%s  ", nearby));
            }
        }
    }
}
