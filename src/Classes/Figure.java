package Classes;

import Interfaces.Globals;

import javax.swing.*;
import java.awt.*;

public class Figure extends JPanel implements Globals {

    private int phi;
    private int fx;
    private int fy;
    private LissajousFigur waveform;

    public Figure(int fx, int fy, int phi) {
        this.phi = phi;
        this.fx = fx;
        this.fy = fy;
        waveform = new LissajousFigur();
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int cw = super.getWidth() / 2;
        int ch = super.getHeight() / 2;
        int tmax = fx * fy * 360;

        g.clearRect(0, 0, super.getWidth(), super.getHeight());
        //g.moveTo(cw + (cw - 2) * u(0, fa), ch + (ch - 2) * u(phi, fb)); // Feder zum Startpunkt
        double xbef = cw + (cw - 2) * waveform.u(0, fx);
        double ybef = ch + (ch - 2) * waveform.u(this.phi, fy);
        for (var t = 1; t <= tmax; t++) {
            double xnew = cw + (cw - 2) * waveform.u(t, fx);
            double ynew = ch + (ch - 2) * waveform.u(t + this.phi, fy);
            g.drawLine((int) xbef, (int) ybef, (int) xnew,(int)  ynew);
            xbef = xnew;
            ybef = ynew;
        }
    }

    private void paintAxes(Graphics g){

    }

    public void setPhi(int phi){
        this.phi = phi;
    }

}
