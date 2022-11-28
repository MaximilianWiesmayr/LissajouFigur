package Classes;

import Interfaces.Components;
import Interfaces.Globals;

import javax.swing.*;
import java.awt.*;

public class ControlPanel extends JPanel implements Components, Globals {
    Slider fxSlider;
    Slider fySlider;
    Slider speedSlider;

    JPanel fxPanel;
    JPanel fyPanel;
    JPanel speedPanel;


    public ControlPanel(){
        fxSlider = new FSlider(1, RANGE_FXSLIDER, 'x');
        fySlider = new FSlider(1, RANGE_FYSLIDER, 'y');
        speedSlider = new SpeedSlider(0, RANGE_SPEED);

        fxPanel = createPanel("fx: ", fxSlider);
        fyPanel = createPanel("fy: ", fySlider);
        speedPanel = createPanel("Speed: " + speedSlider.getValue(), speedSlider);

        //this.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 50));
        this.setLayout(new GridLayout(1, 3));
        this.add(fxPanel);
        this.add(fyPanel);
        this.add(speedPanel);

    }

    private JPanel createPanel(String labelText, Slider slider){
        JPanel panel = new JPanel();
        JLabel label = new JLabel(labelText);
        label.setFont(LABEL_FONT);
        panel.add(label);
        panel.add(slider);
        return panel;
    }

    public void changeSpeedLabel(){
        JLabel speedLabel = (JLabel) speedPanel.getComponent(0);
        speedLabel.setText("Speed: " + speedSlider.getValue());
    }

}
