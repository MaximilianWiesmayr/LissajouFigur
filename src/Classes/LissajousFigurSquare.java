package Classes;

public class LissajousFigurSquare extends LissajousFigur {

    public double u(int t, int f) {
        double u = super.u(t,f);
        if (u > 0) {
            return 0.9;
        }
        else {
            return -0.9;
        }
    }
}
