package Classes;

/**
 * Calculation Method for the Waveform. THis is for Triangle
 * @author Sebastian Zettl
 * @version 2022-11-28
 */
public class LissajousFigurTriangle extends LissajousFigur {

    /**
     * Calculates the point for Trinagle Wave
     * @param t Time
     * @param f Frequency
     * @return The Point of the Wave
     */
    public double u(int t, int f) {
        double u = super.u(t,f);
        return Math.round(u);
    }
}
