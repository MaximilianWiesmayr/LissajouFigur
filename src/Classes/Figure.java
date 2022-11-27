package Classes;

import Interfaces.Globals;

import javax.swing.*;
import java.awt.*;

public class Figure extends JPanel implements Globals {

    private int phi;
    private int fx;
    private int fy;

    public Figure(int fx, int fy, int phi) {
        this.phi = phi;
        this.fx = fx;
        this.fy = fy;
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int cw = super.getWidth() / 2;
        int ch = super.getHeight() / 2;
        int tmax = fx * fy * 360;

        g.clearRect(0, 0, super.getWidth(), super.getHeight());
        //g.moveTo(cw + (cw - 2) * u(0, fa), ch + (ch - 2) * u(phi, fb)); // Feder zum Startpunkt
        double xbef = cw + (cw - 2) * u(0, fx);
        double ybef = ch + (ch - 2) * u(this.phi, fy);
        for (var t = 1; t <= tmax; t++) {
            double xnew = cw + (cw - 2) * u(t, fx);
            double ynew = ch + (ch - 2) * u(t + this.phi, fy);
            g.drawLine((int) xbef, (int) ybef, (int) xnew,(int)  ynew);
            xbef = xnew;
            ybef = ynew;
        }
    }

    public double u(int t, int f) {
        return -Math.sin(t * Math.PI / (180 * f));
        /*
        if (-Math.sin(t * Math.PI / (180 * f)) > 0) {
            return 0.9;
        }
        else {
            return -0.9;
        }*/
    }

    private void paintAxes(Graphics g){

    }

    public void setPhi(int phi){
        this.phi = phi;
    }

}
