package Classes;

import Interfaces.Components;
import Interfaces.Globals;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Slider extends JSlider implements Components, Globals, ChangeListener {
    int min;
    int max;

    public Slider(int min, int max){
        super(min, max);
        this.min = min;
        this.max = max;
        addChangeListener(this);
        createSlider();
    }

    private void createSlider() {
        this.setPaintTicks(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
    }


}
