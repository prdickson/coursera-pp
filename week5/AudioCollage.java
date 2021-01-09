class AudioCollage {

    // Returns a new array that rescales a[] by a multiplicative factor of alpha.
    public static double[] amplify(double[] a, double alpha) {
        double[] r = new double[a.length];
        for (int i = 0; i < a.length; i++)
            r[i] = a[i] * alpha;
        return r;
    }

    // Returns a new array that is the reverse of a[].
    public static double[] reverse(double[] a) {
        double[] r = new double[a.length];
        for (int i = 0; i < a.length; i++)
            r[i] = a[(a.length - 1) - i];
        return r;
    }

    // Returns a new array that is the concatenation of a[] and b[].
    public static double[] merge(double[] a, double[] b) {
        double[] r = new double[a.length + b.length];

        for (int i = 0; i < a.length; i++)
            r[i] = a[i];
        for (int i = 0; i < b.length; i++)
            r[a.length + i] = b[i];
                   
        return r;
    }

    // Returns a new array that is the sum of a[] and b[],
    // padding the shorter arrays with trailing 0s if necessary.
    public static double[] mix(double[] a, double[] b) {
        double[] r = new double[Math.max(a.length, b.length)];
        for (int i = 0; i < r.length; i++)
            r[i] = (i < a.length ? a[i] : 0.0) +
                   (i < b.length ? b[i] : 0.0);
        return r;
    }

    // Returns a new array that changes the speed by the given factor.
    public static double[] changeSpeed(double[] a, double alpha) {
        double l = Math.round(a.length / alpha);
        double[] r = new double[(int)l];
        for (int i = 0; i < r.length; i++)
            r[i] = a[(int)Math.round(i * alpha)];
        return r;
    }

    // Creates an audio collage and plays it on standard audio.
    // See below for the requirements.
    public static void main(String[] args) {
    }
}
