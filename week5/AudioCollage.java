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

        System.arraycopy(a, 0, r, 0, a.length);
        System.arraycopy(b, 0, r, a.length, b.length);

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
        double l = (int) (a.length / alpha);
        double[] r = new double[(int) l];
        for (int i = 0; i < r.length; i++)
            r[i] = a[(int) (i * alpha)];
        return r;
    }

    // Creates an audio collage and plays it on standard audio.
    // See below for the requirements.
    public static void main(String[] args) {
        double[] piano = StdAudio.read("piano.wav");
        double[] beatbox = StdAudio.read("beatbox.wav");
        double[] cow = StdAudio.read("cow.wav");
        double[] singer = StdAudio.read("singer.wav");
        double[] chimes = StdAudio.read("chimes.wav");

        piano = AudioCollage.amplify(piano, 0.75);
        piano = AudioCollage.changeSpeed(piano, 0.9);
        beatbox = AudioCollage.reverse(beatbox);
        beatbox = AudioCollage.changeSpeed(beatbox, 0.25);
        singer = AudioCollage.amplify(singer, 0.5);
        singer = AudioCollage.changeSpeed(singer, 1.2);
        cow = AudioCollage.changeSpeed(cow, 3.5);
        double[] main = AudioCollage.mix(piano, chimes);
        main = AudioCollage.merge(main, AudioCollage.mix(beatbox, singer));
        main = AudioCollage.merge(main, cow);
        StdAudio.play(main);
    }
}
