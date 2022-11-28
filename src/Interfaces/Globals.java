package Interfaces;

import java.awt.*;

import static java.awt.Font.PLAIN;

/**
 * Has all Constants that are needed for the JFrame
 * @version 2022-11-28
 */
public interface Globals {
    Font LABEL_FONT = new Font("Arial", PLAIN, 12);

    Color COLOR_AXES = new Color(0,255,0);

    int RANGE_SPEED = 100;
    int RANGE_FXSLIDER = 7;
    int RANGE_FYSLIDER = 7;

}
