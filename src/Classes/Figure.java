package Classes;

import Interfaces.Components;
import Interfaces.Globals;

import javax.swing.*;
import java.awt.*;

public class Figure extends JPanel implements Globals {

    private int phi;
    private LissajousFigur waveform;

    public Figure(int phi) {
        this.phi = phi;
        waveform = new LissajousFigur();
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int fx = Components.controlPanel.fxSlider.getValue();
        int fy = Components.controlPanel.fySlider.getValue();

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
        this.paintAxes(g,cw,ch);
    }

    private void paintAxes(Graphics g, int cw, int ch){
        g.setColor(Globals.COLOR_AXES);
        g.drawLine(0, ch, super.getWidth(), ch);
        g.drawLine(cw,0, cw, super.getHeight());
    }

    public void setPhi(int phi){
        this.phi = phi;
    }

}
