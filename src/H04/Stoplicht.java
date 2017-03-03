package H04;

/**
 * Created by iris5 on 8-2-2017.
 */

import java.awt.*;
import java.applet.*;

public class Stoplicht extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        int yCircle = 125;
        int yPaal = 300;
        Color lightFill = null;
        Color lightBorder = null;
        Color zwPaal = null;

        setBackground(new Color(026,255,255));

        g.setColor(Color.black);
        g.fillRoundRect(200,100,100,200,25,25);
        g.setColor(Color.white);
        g.drawRoundRect(205,105,90,190,25,25);

        for(int i = 0; i < 4; i++) {
            if(i == 0) {
                lightFill = Color.red;
                lightBorder = new Color(109,17,17);
                zwPaal = Color.white;
            }
            else if(i == 1) {
                lightFill = Color.orange;
                lightBorder = new Color(102,92,31);
                zwPaal = Color.black;
            }
            else if(i == 2) {
                lightFill = Color.green;
                lightBorder = new Color(111,124,27);
                zwPaal = Color.white;
            }
            else if(i == 3) {
                zwPaal = Color.black;
            }
            else {
                g.setColor(Color.blue);
                g.drawString("error...", 50, 50);
            }

            //paal tekenen
            g.setColor(zwPaal);
            g.fillRect(235, yPaal, 30, 50);

            //draw the lights
            if((i == 0) || (i == 1) || (i == 2)) {
                g.setColor(lightFill);
                g.fillOval(225, yCircle, 50, 50);
                g.setColor(lightBorder);
                g.drawOval(225, yCircle, 50, 50);
            }

            yCircle = yCircle+50;
            yPaal = yPaal+50;
        }
    }
}
