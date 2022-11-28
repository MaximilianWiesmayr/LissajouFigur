package Classes;

import Interfaces.Components;
import Interfaces.Globals;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Has all specifications for the ControlPanel
 * @version 2022-11-28
 */
public class ControlPanel extends JPanel implements Components, Globals {
    Slider fxSlider;
    Slider fySlider;
    Slider speedSlider;

    JPanel fxPanel;
    JPanel fyPanel;
    JPanel speedPanel;

    JComboBox jcWaveform;

    /**
     * Combines all Elements that are visible in the ControlPanel
     */
    public ControlPanel(){
        fxSlider = new FSlider(1, RANGE_FXSLIDER, 'x');
        fySlider = new FSlider(1, RANGE_FYSLIDER, 'y');
        speedSlider = new SpeedSlider(0, RANGE_SPEED);

        fxPanel = createPanel("fx: ", fxSlider);
        fyPanel = createPanel("fy: ", fySlider);
        speedPanel = createPanel("Speed: " + speedSlider.getValue(), speedSlider);

        String[] waveformStr = { "Sin", "Square", "Triangle", "Saw"};

        JLabel jlWave = new JLabel("WaveForm: ", SwingConstants.RIGHT);
        jlWave.setFont(LABEL_FONT);

        jcWaveform = new JComboBox(waveformStr);
        jcWaveform.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox cb = (JComboBox)e.getSource();
                int waveformIndex = cb.getSelectedIndex();
                animation.setWaveform(waveformIndex);


            }
        });

        //this.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 50));
        this.setLayout(new GridLayout(2, 3));
        this.add(fxPanel);
        this.add(fyPanel);
        this.add(speedPanel);
        this.add(jlWave);
        this.add(jcWaveform);

    }

    /**
     * Generates a Panel which includes the labelText and the slider
     * @param labelText The Text that sits to the left of the Sliders
     * @param slider The Slider itself
     */
    private JPanel createPanel(String labelText, Slider slider){
        JPanel panel = new JPanel();
        JLabel label = new JLabel(labelText);
        label.setFont(LABEL_FONT);
        panel.add(label);
        panel.add(slider);
        return panel;
    }

    /**
     * Updates the Speed Value in our UI
     */
    public void changeSpeedLabel(){
        JLabel speedLabel = (JLabel) speedPanel.getComponent(0);
        speedLabel.setText("Speed: " + speedSlider.getValue());
    }

}
