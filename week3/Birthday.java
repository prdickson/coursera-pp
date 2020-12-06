public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int t = Integer.parseInt(args[1]);

        int[] results = new int[n+1];

        for (int i = 0; i < t; i++) {
            int people = 0; 
            boolean[] current = new boolean[n];
            
            while (true) {
                people += 1;
                int bday = (int)(Math.random() * n);
                
                if (!current[bday])
                    current[bday] = true;
                else
                    break;
            }

            results[people-1] += 1;
        }

        int count = 0;
        for(int j = 0; j < results.length; j++) {
            if (count > t / 2)
                continue;
            count += results[j];
            System.out.println(String.format("%s\t %s\t %s", j+1, results[j], count / (double)t));
        }
    }
}
