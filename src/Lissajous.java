import Interfaces.Components;
import Interfaces.Globals;

import javax.swing.*;
import java.awt.*;

/**
 * The Main Class
 * @version 2022-11-28
 */
public class Lissajous extends JFrame implements Components, Globals {

    public Lissajous(){
        super("Lissajous Figure");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(900,900);
        setResizable(false);
        add(controlPanel, java.awt.BorderLayout.NORTH);    //controlPanel from Components
        add(animation, java.awt.BorderLayout.CENTER);  //animation from Components
        setVisible(true);

    }

    public static void main(String[] args) {
        new Lissajous();
    }
}