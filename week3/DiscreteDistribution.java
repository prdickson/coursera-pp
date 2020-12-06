public class  DiscreteDistribution {
    public static void main(String[] args) {
        int count = Integer.parseInt(args[0]);
        int[] dist = new int[args.length - 1];

        int max = 0; 
        for (int i = 0; i < dist.length; i++) {
            max += Integer.parseInt(args[i + 1]);
            dist[i] = max;
        }

        for(int i = 0; i < count; i++) {
            int v = (int)(Math.random() * max);
             
            for (int j = 0; j < dist.length; j++) {
               if (v < dist[j]) {
                   System.out.print(String.format("%s ", j + 1));
                   break;
               }
            }
        }
    }
}
