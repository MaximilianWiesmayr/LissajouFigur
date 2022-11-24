package Classes;

import Interfaces.Components;
import Interfaces.Globals;

import javax.swing.event.ChangeEvent;

public class FSlider extends Slider implements Globals {
    public FSlider(int range) {
        super(range);
    }

    @Override
    public void stateChanged(ChangeEvent e) {

    }

    public int getValue(){

        return 0;
    }
}
