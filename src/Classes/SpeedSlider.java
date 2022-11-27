package Classes;

import Interfaces.Components;
import Interfaces.Globals;

import javax.swing.event.ChangeEvent;

public class SpeedSlider extends Slider {
    public SpeedSlider(int range) {
        super(range);
        createSlider();
    }

    private void createSlider() {
        this.setPaintTicks(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        animation.setSpeed(((Slider)e.getSource()).getValue());
    }
}
