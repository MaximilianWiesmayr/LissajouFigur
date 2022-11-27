package Classes;

public class LissajousFigur {

    public double u(int t, int f) {
        return -Math.sin(t * Math.PI / (180 * f));
        /*
        if (-Math.sin(t * Math.PI / (180 * f)) > 0) {
            return 0.9;
        }
        else {
            return -0.9;
        }*/
    }
}
