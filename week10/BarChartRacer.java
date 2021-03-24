import java.util.Arrays;
import java.util.Collections;

public class BarChartRacer {
    public static void main(String[] args) {
        String file = args[0];
        int barsToShow = Integer.parseInt(args[1]);
        
        In in = new In(file);

        String title = in.readLine();
        String xAxisLabel = in.readLine();
        String dataSource = in.readLine();

        StdDraw.setCanvasSize(1000, 700);
        StdDraw.enableDoubleBuffering();

        BarChart bc = new BarChart(title, xAxisLabel, dataSource);

        while (in.hasNextLine()) {
            in.readLine();
            int barCount = Integer.parseInt(in.readLine());;
            String date = "";
            Bar[] bars = new Bar[barCount];

            for (int i = 0; i < barCount; i++) {
                String[] cols = in.readLine().split(",");
                date = cols[0];
                bars[i] = new Bar(cols[1], Integer.parseInt(cols[3]), cols[4]);
            }
            Arrays.sort(bars, Collections.reverseOrder());

            for (int i = 0; i < Math.min(barsToShow, barCount); i++)
                bc.add(bars[i].getName(), bars[i].getValue(), bars[i].getCategory());

            bc.setCaption(date);
            bc.draw();
            StdDraw.show();
            bc.reset();
            StdDraw.pause(100);
            StdDraw.clear();
        }
    }

}
