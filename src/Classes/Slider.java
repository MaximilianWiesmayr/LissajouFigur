package Classes;

import Interfaces.Components;
import Interfaces.Globals;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Slider extends JSlider implements Components, Globals, ChangeListener {
    int range;

    public Slider(int range){
        this.range = range;
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        System.out.println("I am in");
    }


}
