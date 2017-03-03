package H04;

/**
 * Created by iris5 on 7-2-2017.
 */

import java.awt.*;
import java.applet.*;

public class Vlag extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(new Color(124,255,246));

        //Stok
        g.setColor(Color.white);
        g.fillRect(380,100,20,400);
        g.setColor(Color.black);
        g.drawRect(380,100,20,400);

        //Vlag
        g.setColor(Color.red);
        g.fillRect(150,100,230,50);
        g.setColor(Color.white);
        g.fillRect(150,150,230,50);
        g.setColor(Color.blue);
        g.fillRect(150,200,230,50);
        g.setColor(Color.black);
        g.drawRect(150,100,230,150);

        //Bolletje
        g.setColor(Color.red);
        g.fillOval(365,50,50,50);
        g.setColor(Color.black);
        g.drawOval(365,50,50,50);

        //Minivlag
        g.setColor(new Color(247,203,81));
        int xVars_1[] = {400, 475, 500};
        int yVars_1[] = {100, 100, 75};
        int nHoeken_1 = 3;
        g.fillPolygon(xVars_1, yVars_1, nHoeken_1);

        int yVars_2[] = {100, 100, 125};
        g.fillPolygon(xVars_1, yVars_2, nHoeken_1);
    }
}