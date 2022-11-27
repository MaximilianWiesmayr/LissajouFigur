package Classes;

import Interfaces.Globals;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Animation extends JPanel implements Globals {

    Figure figur;
    int phi = 0;
    CardLayout cardLayout;
    JPanel CardPanel;

    Timer timer;

    public Animation() {
        cardLayout = new CardLayout();
        CardPanel = new JPanel(cardLayout);

        this.setLayout(new BorderLayout());
        this.add(CardPanel);

        this.redrawFigure(3,4);

        timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(CardPanel);
            }});
        timer.start();
    }

    public void redrawFigure(int x, int y) {
        for ( int phi = 0;phi <= 360; phi++) {
            CardPanel.add(new Figure(x, y, phi));
            System.out.println(phi);
        }

    }

    public void setSpeed(int delay){
        System.out.println("delay: " + delay);
        timer.setDelay(delay);
        timer.restart();
    }
}
