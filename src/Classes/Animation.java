package Classes;

import Interfaces.Globals;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Animation extends JPanel implements Globals {

    int fx = 3;
    int fy = 4;
    CardLayout cardLayout;
    JPanel CardPanel;

    Timer timer;

    public Animation() {
        cardLayout = new CardLayout();
        CardPanel = new JPanel(cardLayout);

        this.setLayout(new BorderLayout());
        this.add(CardPanel);

        this.redrawFigure();

        timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(CardPanel);
            }});
        timer.start();
    }

    public void redrawFigure() {
        for ( int phi = 0;phi <= 360; phi++) {
            CardPanel.add(new Figure(this.fx, this.fy, phi));
            System.out.println(phi);
        }

    }

    public void setFX(int fx){
        this.fx = fx;
    }
    public void setFY(int fy){
        this.fy = fy;
    }

    public void setDelay(int delay){
        System.out.println("delay: " + delay);
        timer.setDelay(delay);
        timer.restart();
    }
}
