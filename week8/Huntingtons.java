public class Huntingtons {

    // Returns the maximum number of consecutive repeats of CAG in the DNA string.
    public static int maxRepeats(String dna) {
        int i = 0;
        int repeats = 0;
        int maxRepeats = 0;
        while (i < dna.length() - 2) {

            if (dna.startsWith("CAG", i)) {
                repeats += 1;
                i += 3;
            } else {
                i++;
                repeats = 0;
            }

            maxRepeats = Math.max(repeats, maxRepeats);
        }

        return maxRepeats;
    }

    // Returns a copy of s, with all whitespace (spaces, tabs, and newlines) removed.
    public static String removeWhitespace(String s) {
        return s.replace(" ", "").replace("\t", "").replace("\n", "");
    }

    // Returns one of these diagnoses corresponding to the maximum number of repeats:
    // "not human", "normal", "high risk", or "Huntington's".
    public static String diagnose(int maxRepeats) {
        if (maxRepeats >= 181) return "not human";
        if (maxRepeats >= 40) return "Huntington’s";
        if (maxRepeats >= 36) return "high risk";
        if (maxRepeats >= 10) return "normal";
        return "not human";
    }

    public static void main(String[] args) {
        String fileName = args[0];
        String[] input = new In(fileName).readAllStrings();
        String dna = removeWhitespace(String.join("", input));

        int repeats = maxRepeats(dna);

        StdOut.printf("max repeats = %s", repeats);
        StdOut.println();
        StdOut.println(diagnose(repeats));
    }

}