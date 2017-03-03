package H04;

/**
 * Created by iris5 on 7-2-2017.
 */

import java.awt.*;
import java.applet.*;

public class GelijkbenigeDriehoek extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.red);
        g.drawLine(100,50,300,150);
        g.setColor(Color.orange);
        g.drawLine(300,150,200,250);
        g.setColor(Color.yellow);
        g.drawLine(100,50,200,250);
        g.setColor(Color.gray);
        g.drawLine(100,50,250,200);
        g.setColor(Color.white);
        g.drawString("A", 95, 42);
        g.drawString("B", 300, 140);
        g.drawString("C", 178, 250);
    }
}