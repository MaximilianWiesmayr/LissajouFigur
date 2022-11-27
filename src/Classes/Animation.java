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

    public Animation() {
        cardLayout = new CardLayout();
        CardPanel = new JPanel(cardLayout);

        this.setLayout(new BorderLayout());
        this.add(CardPanel);



        //figur = new Figure(0, 4, 3);
        //this.add(figur);

        this.redrawFigure(4,3);
        //CardPanel.add(this.figur = new Figure(4, 3, phi));
        this.revalidate();


    }

    public void redrawFigure(int x, int y) {
        this.phi = 0;
        for ( ;phi <= 360 * 3 * 4; this.phi++) {
            CardPanel.add(new Figure(x, y, phi));
        }

        CardPanel.revalidate();
        this.revalidate();
        Timer timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("sdf");
                CardLayout cl = (CardLayout)CardPanel.getLayout();

                cl.next(CardPanel);

            }});

        timer.start();
    }
}
