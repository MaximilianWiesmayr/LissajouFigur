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
        fxSlider = new FSlider(1, RANGE_FXSLIDER, 'x');
        fySlider = new FSlider(1, RANGE_FYSLIDER, 'y');
        speedSlider = new SpeedSlider(0, RANGE_SPEED);

        this.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 50));
        this.setLayout(new GridLayout(1, 3));
        this.add(createPanel("fx: ", fxSlider));
        this.add(createPanel("fy: ", fySlider));
        this.add(createPanel("Speed: " + speedSlider.getValue(), speedSlider));

    }

    private JPanel createPanel(String labelText, Slider slider){
        JPanel panel = new JPanel();
        JLabel label = new JLabel(labelText);
        panel.add(label);
        panel.add(slider);
        return panel;
    }

    public void changeSpeedLabel(){
        this.getComponent(2);
        this.remove(2);
        this.add(createPanel("Speed: " + speedSlider.getValue(), speedSlider));
    }

}
