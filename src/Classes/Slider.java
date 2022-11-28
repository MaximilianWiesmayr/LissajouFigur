package Classes;

import Interfaces.Components;
import Interfaces.Globals;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * Is the Parent class for FSlider and SpeedSlider
 * @version 2022-11-28
 */
public class Slider extends JSlider implements Components, Globals, ChangeListener {
    int min;
    int max;

    /**
     * Constructor of Slider
     * @param min The smallest Number of the Slider
     * @param max The biggest Number of the Slider
     */
    public Slider(int min, int max){
        super(min, max);
        this.min = min;
        this.max = max;
        addChangeListener(this);
        createSlider();
    }

    /**
     * Includes all Settings for the Sliders
     */
    private void createSlider() {
        this.setPaintTicks(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
    }


}
