package Classes;

import Interfaces.Components;
import Interfaces.Globals;

import javax.swing.event.ChangeEvent;
import java.util.Timer;

/**
 * Has all specifications for the FXSlider and the FYSlider
 * @version 2022-11-28
 */
public class FSlider extends Slider {

    char coordinate;
    /**
     * Constructor für FSlider
     * @param min The smallest Number of the Slider
     * @param max The biggest Number of the Slider
     * @param coordinate used to differ between FXSlider and FYSlider
     */
    public FSlider(int min, int max, char coordinate) {
        super(min, max);
        this.coordinate = coordinate;
        createSlider();
    }

    /**
     * Includes all Settings for the Sliders
     */
    private void createSlider() {
        this.setPaintLabels(true);
        this.setMajorTickSpacing(1);
        this.setSnapToTicks(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if(!getValueIsAdjusting()){
            callAnimation();
        }

    }

    /**
     * Calls the functions from Animation to change FX or FY
     */
    private void callAnimation(){
        if (coordinate == 'x') {
            animation.setFX(getValue());
        } else if (coordinate == 'y') {
            animation.setFY(getValue());
        }
    }
}
