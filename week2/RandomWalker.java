public class RandomWalker {
    public static void main(String[] args) {
        int d = Integer.parseInt(args[0]);

        int x = 0;
        int y = 0;

        int steps = 0;

        System.out.println(String.format("(%s, %s)", x, y));
        while (Math.abs(x) + Math.abs(y) < d) {
            int dir = (int)(Math.random() * 4);
            if (dir == 0)
                x += 1;
            else if (dir == 1)
                x -= 1;
            else if (dir == 2)
                y += 1;
            else if (dir == 3)
                y -= 1;

            System.out.println(String.format("(%s, %s)", x, y));
            steps += 1;
        }
        
        System.out.println(String.format("steps = %s", steps));
    }
}
