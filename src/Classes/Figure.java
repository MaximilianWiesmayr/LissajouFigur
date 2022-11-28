package Classes;

import Interfaces.Components;
import Interfaces.Globals;

import javax.swing.*;
import java.awt.*;

/**
 * Draws a Lissajous Figure on a panel with the given pi and x and y values from the sliders
 * @author Sebastian Zettl
 * @version 2022-11-28
 */
public class Figure extends JPanel implements Components, Globals {

    private int phi;
    private LissajousFigur waveform;

    /**
     * Generates a new Figure
     * @param phi the Phase difference
     */
    public Figure(int phi) {
        this.phi = phi;
        waveform = new LissajousFigur();
    }

    /**
     * Paints the Lissajous Figure
     * @param g the <code>Graphics</code> object to protect
     */
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int fx = animation.fx;
        int fy = animation.fy;

        int cw = super.getWidth() / 2;
        int ch = super.getHeight() / 2;
        int tmax = fx * fy * 360;

        double xbef = cw + (cw - 2) * waveform.u(0, fx);
        double ybef = ch + (ch - 2) * waveform.u(this.phi, fy);
        for (var t = 1; t <= tmax; t++) {
            double xnew = cw + (cw - 2) * waveform.u(t, fx);
            double ynew = ch + (ch - 2) * waveform.u(t + this.phi, fy);
            g.drawLine((int) xbef, (int) ybef, (int) xnew, (int)  ynew);
            xbef = xnew;
            ybef = ynew;
        }
        this.paintAxes(g,cw,ch);
    }

    /**
     * Paints a X and Y Axes onto the Panel
     * @param g The Graphics that are used to draw
     * @param cw The horizontal Center
     * @param ch The vertical Center
     */
    private void paintAxes(Graphics g, int cw, int ch){
        g.setColor(Globals.COLOR_AXES);
        g.drawLine(0, ch, super.getWidth(), ch);
        g.drawLine(cw,0, cw, super.getHeight());
    }

    /**
     * Sets the Waveform that is used to draw the figure
     * @param lf The specified Waveform
     */
    public void setWaveform(LissajousFigur lf) {
        waveform = lf;
    }

}
