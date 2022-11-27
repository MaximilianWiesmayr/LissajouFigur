import Classes.Animation;
import Interfaces.Components;
import Interfaces.Globals;

import javax.swing.*;

public class LissajousFigur extends JFrame implements Components, Globals {

    public LissajousFigur(){
        super("Lissa");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        add(new Animation());    //statusBar from Components
        setVisible(true);

    }
    public static void main(String[] args) {
        new LissajousFigur();
    }
}