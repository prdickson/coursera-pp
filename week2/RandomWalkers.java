public class RandomWalkers {
    public static void main(String[] args) {
        int d = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        int steps = 0;

        for (int i = 0; i < trials; i++) {
            int x = 0;
            int y = 0;

            while (Math.abs(x) + Math.abs(y) < d) {
                int dir = (int) (Math.random() * 4);
                if (dir == 0)
                    x += 1;
                else if (dir == 1)
                    x -= 1;
                else if (dir == 2)
                    y += 1;
                else if (dir == 3)
                    y -= 1;

                steps += 1;
            }
        }

        System.out.printf("average number of steps = %s%n", steps / (double) trials);
    }
}
