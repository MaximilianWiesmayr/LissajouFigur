package Classes;

import Interfaces.Components;
import Interfaces.Globals;

import javax.swing.event.ChangeEvent;

public class FSlider extends Slider {

    char coordinate;
    public FSlider(int range, char coordinate) {
        super(range);
        this.coordinate = coordinate;
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        
    }
}
