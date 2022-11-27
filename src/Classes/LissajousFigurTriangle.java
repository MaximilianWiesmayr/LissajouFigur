package Classes;

public class LissajousFigurTriangle extends LissajousFigur {

    public double u(int t, int f) {
        double u = super.u(t,f);
        return Math.round(u);
    }
}
