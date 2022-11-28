package Classes;

import Interfaces.Components;
import Interfaces.Globals;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SpeedSlider extends Slider implements Components, Globals, ChangeListener {
    public SpeedSlider(int min, int max) {
        super(min, max);
        createSlider();
    }

    private void createSlider() {
        this.setMajorTickSpacing(40);
        this.setMinorTickSpacing(20);
        this.setFont(LABEL_FONT);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        controlPanel.changeSpeedLabel();
        if (!getValueIsAdjusting()) {
            animation.setDelay(max - getValue());

        }
    }
}
