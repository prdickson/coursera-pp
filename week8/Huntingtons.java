public class Huntingtons {

    // Returns the maximum number of consecutive repeats of CAG in the DNA string.
    public static int maxRepeats(String dna) {
        return 0;
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

    }

}