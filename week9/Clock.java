public class Clock {

    private int h;
    private int m;

    // Creates a clock whose initial time is h hours and m minutes.
    public Clock(int h, int m) {
        setTime(h, m);
    }

    // Creates a clock whose initial time is specified as a string, using the format HH:MM.
    public Clock(String s) {
        String[] parts = s.split(":");

        if (parts.length != 2) throw new IllegalArgumentException("s");
        if (parts[0].length() != 2) throw new IllegalArgumentException("s");
        if (parts[1].length() != 2) throw new IllegalArgumentException("s");

        try {
            setTime(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("s");
        }
    }

    private void setTime(int h, int m) {
        if (h < 0) throw new IllegalArgumentException("h");
        if (h > 23) throw new IllegalArgumentException("h");
        if (m < 0) throw new IllegalArgumentException("m");
        if (m > 59) throw new IllegalArgumentException("m");

        this.h = h;
        this.m = m;
    }

    // Returns a string representation of this clock, using the format HH:MM.
    public String toString() {
        return String.format("%02d:%02d", h, m);
    }

    // Is the time on this clock earlier than the time on that one?
    public boolean isEarlierThan(Clock that) {
        return h < that.h || (h == that.h && m < that.m);
    }

    // Adds 1 minute to the time on this clock.
    public void tic() {

    }

    // Adds Δ minutes to the time on this clock.
    public void toc(int delta) {

    }

    // Test client (see below).
    public static void main(String[] args) {

    }
}