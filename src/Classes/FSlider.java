package Classes;

import Interfaces.Components;
import Interfaces.Globals;

import javax.swing.event.ChangeEvent;

public class FSlider extends Slider {

    char coordinate;
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
        if(coordinate == 'x'){
            animation.setFX(((Slider)e.getSource()).getValue());
            animation.redrawFigure();
        }else if(coordinate == 'y'){
            animation.setFY(((Slider)e.getSource()).getValue());
            animation.redrawFigure();
        }
    }
}
