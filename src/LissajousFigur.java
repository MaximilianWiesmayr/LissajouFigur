import Interfaces.Components;
import Interfaces.Globals;

import javax.swing.*;
import java.awt.*;

public class LissajousFigur extends JFrame implements Components, Globals {

    public LissajousFigur(){
        super("LissajousFigur");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setResizable(false);
        add(controlPanel, java.awt.BorderLayout.NORTH);    //controlPanel from Components
        add(animation, java.awt.BorderLayout.CENTER);  //animation from Components
        setVisible(true);

    }
    public static void main(String[] args) {
        new LissajousFigur();
    }
}