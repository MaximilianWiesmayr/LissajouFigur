package Classes;

public class LissajousFigur {

    public double u(int t, int f) {
        return -Math.sin(t * Math.PI / (180 * f));
    }
}
