package Classes;

import Interfaces.Components;
import Interfaces.Globals;

public class ControlPanel implements Components, Globals {
    Slider fxSlider;
    Slider fySlider;
    Slider speedSlider;

    public ControlPanel(){
        fxSlider = new FSlider(80);
        fySlider = new FSlider(80);
        speedSlider = new SpeedSlider(80);
    }

}
