package Classes;

import Interfaces.Components;
import Interfaces.Globals;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.util.Timer;
import java.util.TimerTask;

public class SpeedSlider extends Slider implements Components, Globals, ChangeListener {

    long startTime = System.currentTimeMillis();
    Timer timer = new Timer();
    int lastValue = 50;
    public SpeedSlider(int min, int max) {
        super(min, max);
        createSlider();
    }

    private void createSlider() {
        this.setMajorTickSpacing(40);
        this.setMinorTickSpacing(20);
        this.setFont(LABEL_FONT);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        timer.schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        if(lastValue != getValue()){
                            callAnimation();
                        }
                        lastValue = getValue();
                    }
                },
                1000
        );

        controlPanel.changeSpeedLabel();
    }

    private void callAnimation() {
        animation.setDelay(max - getValue());
        startTime = System.currentTimeMillis();
    }
}
