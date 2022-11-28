package Classes;

import Interfaces.Components;
import Interfaces.Globals;

import javax.swing.event.ChangeEvent;
import java.util.Timer;

public class FSlider extends Slider {

    char coordinate;
    long startTime = System.currentTimeMillis();
    Timer timer = new Timer();
    int lastValue = 50;
    public FSlider(int min, int max, char coordinate) {
        super(min, max);
        this.coordinate = coordinate;
        createSlider();
    }

    private void createSlider() {
        this.setPaintLabels(true);
        this.setMajorTickSpacing(1);
        this.setSnapToTicks(true);
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
    }

    private void callAnimation(){
        if (coordinate == 'x') {
            animation.setFX(getValue());
            animation.redrawFigure();
        } else if (coordinate == 'y') {
            animation.setFY(getValue());
            animation.redrawFigure();
        }
        System.out.println(getValue());
        startTime = System.currentTimeMillis();
    }
}
