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
    public Animation() {
        cardLayout = new CardLayout();
        this.setLayout(new CardLayout());

        figur = new Figure(0, 4, 3);
        this.add(figur);

        Timer timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(phi);
                if (phi >= 360 * 3 * 4) {
                    phi = 0;
                }
                figur.setPhi(phi++);
                figur.repaint();
            }});

        timer.start();
    }
}
