package H04;

/**
 * Created by iris5 on 8-2-2017.
 */

import java.awt.*;
import java.applet.*;

public class Tekenen extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);

        //Lijn
        g.drawLine(10,10,190,10);
        g.drawString("Lijn",90,25);

        //Rechthoek
        g.drawRect(10,30,180,90);
        g.drawString("Rechthoek",70,135);
        //Gevulde rechthoek met ovaal
        g.setColor(Color.magenta);
        g.fillRect(200,30,180,90);
        g.setColor(Color.black);
        g.drawOval(200,30,180,90);
        g.drawString("Gevulde rechthoek met ovaal",215,135);
        //Taartpunt met ovaal eromheen
        g.setColor(Color.magenta);
        g.fillArc(390, 30, 180, 90, 0, 45);
        g.setColor(Color.black);
        g.drawOval(390,30,180,90);
        g.drawString("Taartpunt met ovaal eromheen",395,135);

        //Afgeronde rechthoek
        g.drawRoundRect(10,150,180,90,30,30);
        g.drawString("Afgeronde rechthoek",45,255);
        //Gevulde ovaal
        g.setColor(Color.magenta);
        g.fillOval(200,150,180,90);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal",255,255);
        //Cirkel
        g.drawOval(440,155,80,80);
        g.drawString("Cirkel",460,255);
    }
}