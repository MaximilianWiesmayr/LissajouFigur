package Classes;

import Interfaces.Components;
import Interfaces.Globals;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Has all specifications for the SpeedSlider
 * @version 2022-11-28
 */
public class SpeedSlider extends Slider implements Components, Globals, ChangeListener {

    int lastValue = -5;

    /**
     * Constructor of SpeedSlider
     * @param min The smallest Number of the Slider
     * @param max The biggest Number of the Slider
     */
    public SpeedSlider(int min, int max) {
        super(min, max);
        createSlider();
    }

    /**
     * Includes all Settings for the Sliders
     */
    private void createSlider() {
        this.setMajorTickSpacing(40);
        this.setMinorTickSpacing(20);
        this.setFont(LABEL_FONT);
    }


    @Override
    public void stateChanged(ChangeEvent e) {
        if(!getValueIsAdjusting()){
            callAnimation();
        }
        controlPanel.changeSpeedLabel();
    }

    /**
     * Calls the function from Animation to change the Speed
     */
    private void callAnimation() {
        animation.setDelay(max - getValue());
    }
}
