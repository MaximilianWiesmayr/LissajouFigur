package Classes;

/**
 * Calculation Method for the Waveform. THis is for Sine
 * @author Sebastian Zettl
 * @version 2022-11-28
 */
public class LissajousFigur {

    /**
     * Calculates the point for Sine Wave
     * @param t Time
     * @param f Frequency
     * @return The Point of the Wave
     */
    public double u(int t, int f) {
        return -Math.sin(t * Math.PI / (180 * f));
    }
}
