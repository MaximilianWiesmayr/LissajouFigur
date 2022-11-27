package Classes;

import Interfaces.Components;
import Interfaces.Globals;

import javax.swing.*;
import java.awt.*;

public class ControlPanel extends JPanel implements Components, Globals {
    Slider fxSlider;
    Slider fySlider;
    Slider speedSlider;


    public ControlPanel(){
        fxSlider = new FSlider(RANGE_FXSLIDER, 'x');
        fySlider = new FSlider(RANGE_FYSLIDER, 'y');
        speedSlider = new SpeedSlider(RANGE_SPEED);

        this.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 50));
        this.setLayout(new GridLayout(1, 3));
        this.add(fxSlider);
        this.add(fySlider);
        this.add(speedSlider);
    }

}
