import Classes.Animation;
import Interfaces.Components;
import Interfaces.Globals;
import java.awt.BorderLayout;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class LissajouFigur extends JFrame implements Components, Globals {

    public LissajouFigur(){
        super("Lissa");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        add(new Animation());    //statusBar from Components
        setVisible(true);

    }
    public static void main(String[] args) {
        new LissajouFigur();
    }
}