package H06;

import java.applet.*;
import java.awt.*;

/**
 * Created by iris5 on 14-2-2017.
 */

public class H62Seconden extends Applet {
    int secondenInEenMinuut;
    int minutenInEenUur;
    int urenInEenDag;
    int dagenInEenJaar;
    int dagenInEenSchrikkeljaar;

    long secondenInEenUur;
    long secondenInEenDag;
    long secondenInEenJaar;
    long secondenInEenSchrikkeljaar;

    public void init() {
        secondenInEenMinuut = 60;
        minutenInEenUur = 60;
        urenInEenDag = 24;
        dagenInEenJaar = 365;
        dagenInEenSchrikkeljaar = 366;

        secondenInEenUur = secondenInEenMinuut * minutenInEenUur;
        secondenInEenDag = urenInEenDag * secondenInEenUur;
        secondenInEenJaar = dagenInEenJaar * secondenInEenDag;
        secondenInEenSchrikkeljaar = dagenInEenSchrikkeljaar * secondenInEenDag;
    }

    public void paint(Graphics g) {
        g.drawString("Seconden in een uur: " + secondenInEenUur,25,25);
        g.drawString("Seconden in een dag: " + secondenInEenDag, 25,50);
        g.drawString("Seconden in een jaar: " + secondenInEenJaar,25,75);
        g.drawString("Seconden in een schrikkeljaar: " + secondenInEenSchrikkeljaar,25,100);
    }
}
