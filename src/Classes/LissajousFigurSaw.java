package Classes;

/**
 * Calculation Method for the Waveform. THis is for Saw
 * @author Sebastian Zettl
 * @version 2022-11-28
 */
public class LissajousFigurSaw extends LissajousFigur {

    /**
     * Calculates the point for Saw Wave
     * @param t Time
     * @param f Frequency
     * @return The Point of the Wave
     */
    public double u(int t, int f) {
        double u = super.u(t,f);
        double period = (2*Math.PI)/f;
        if (u < -0.75) {
            return Math.round(u)-(period/4);
        }
        if (u >= -0.75 && u < 0) {
            return Math.round(u)+(period/4);
        }

        if (u >= 0 && u < 0.25) {
            return Math.round(u);
        }
        if (u >= 0.25) {
            return Math.round(u)+(period/4);
        }
        return Math.round(u);
    }
}
