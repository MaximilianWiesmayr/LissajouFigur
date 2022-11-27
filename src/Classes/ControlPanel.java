package Classes;

import Interfaces.Components;
import Interfaces.Globals;

import javax.swing.*;

public class ControlPanel extends JPanel implements Components, Globals {
    Slider fxSlider;
    Slider fySlider;
    Slider speedSlider;

    public ControlPanel(){
        fxSlider = new FSlider(RANGE_FXSLIDER);
        fySlider = new FSlider(RANGE_FYSLIDER);
        speedSlider = new SpeedSlider(RANGE_SPEED);
    }

}
