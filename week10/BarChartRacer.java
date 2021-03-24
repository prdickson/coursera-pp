import java.util.Arrays;
import java.util.Collections;

public class BarChartRacer {
    public static void main(String[] args) {
        int barsToShow = Integer.parseInt(args[0]);

        String title = StdIn.readLine();
        String xAxisLabel = StdIn.readLine();
        String dataSource = StdIn.readLine();

        StdDraw.setCanvasSize(1000, 700);
        StdDraw.enableDoubleBuffering();


        BarChart bc = new BarChart(title, xAxisLabel, dataSource);

        int barCount = StdIn.readInt();
        String date = "";
        Bar[] bars = new Bar[barCount];
        StdIn.readLine();
        for (int i = 0; i < barCount; i++) {
            String[] cols = StdIn.readLine().split(",");
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
    }

}
