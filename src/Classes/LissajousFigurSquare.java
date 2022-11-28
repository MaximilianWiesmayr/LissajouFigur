package Classes;

/**
 * Calculation Method for the Waveform. THis is for Square
 * @author Sebastian Zettl
 * @version 2022-11-28
 */
public class LissajousFigurSquare extends LissajousFigur {

    /**
     * Calculates the point for Square Wave
     * @param t Time
     * @param f Frequency
     * @return The Point of the Wave
     */
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
