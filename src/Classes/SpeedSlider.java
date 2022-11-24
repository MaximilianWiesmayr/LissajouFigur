package Classes;

import Interfaces.Components;
import Interfaces.Globals;

import javax.swing.event.ChangeEvent;

public class SpeedSlider extends Slider implements Globals {
    public SpeedSlider(int range) {
        super(range);
    }

    @Override
    public void stateChanged(ChangeEvent e) {

    }

    public int getValue(){

        return 0;
    }
}
