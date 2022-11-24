package Classes;

import Interfaces.Globals;

import javax.swing.*;
import java.awt.*;

public class Figure extends JPanel implements Globals {

    private int phi;
    private int fx;
    private int fy;
    public Figure(int phi, int fx, int fy) {
        this.phi = phi;
        this.fx = fx;
        this.fy = fy;
    }

    @Override
    public void paintComponent(Graphics g){

    }

    private void paintAxes(Graphics g){

    }

    public void changeFX(int newFX){
        fx = newFX;
    }

    public void changeFY(int newFY){
        fy = newFY;
    }


}
