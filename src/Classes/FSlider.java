package Classes;

import Interfaces.Components;
import Interfaces.Globals;

import javax.swing.event.ChangeEvent;
import java.util.Timer;

public class FSlider extends Slider {

    char coordinate;
    public FSlider(int min, int max, char coordinate) {
        super(min, max);
        this.coordinate = coordinate;
        createSlider();
    }

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


    private void callAnimation(){
        if (coordinate == 'x') {
            animation.setFX(getValue());
        } else if (coordinate == 'y') {
            animation.setFY(getValue());
        }
    }
}
