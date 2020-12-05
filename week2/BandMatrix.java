public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                char c = Math.abs(i - j) > width ? '0' : '*';
                System.out.print(String.format("%s  ", c));
            }
            System.out.println("");
        }
    }
}
