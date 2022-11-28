package Classes;

import Interfaces.Globals;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Animation extends JPanel implements Globals {

    int fx = 4;
    int fy = 4;
    CardLayout cardLayout;
    JPanel cardPanel;

    Timer timer;

    public Animation() {
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        this.setLayout(new BorderLayout());
        this.add(cardPanel);

        for ( int phi = 0;phi < 360; phi++) {
            cardPanel.add(new Figure(phi));
        }

        timer = new Timer(Globals.RANGE_SPEED/2, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(cardPanel);
            }});
        timer.start();
    }

    public void setFX(int fx){
        this.fx = fx;
    }
    public void setFY(int fy){
        this.fy = fy;
    }

    public void setDelay(int delay){
        timer.setDelay(delay);
        if (delay == Globals.RANGE_SPEED) {
            timer.stop();
        } else {
            timer.restart();
        }
    }
}
