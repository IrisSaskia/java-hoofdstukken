package H04;

/**
 * Created by iris5 on 7-2-2017.
 */

import java.awt.*;
import java.applet.*;

public class Huis extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(new Color(124,255,246));

        //Gras
        g.setColor(new Color(96,255,112));
        g.fillRoundRect(0,300,500,200, 10,10);

        //Huisje
        g.setColor(new Color(147,112,112));
        g.fillRect(150,200,200,200);
        g.setColor(new Color(63,30,14));
        g.drawRect(150,200,200,200);

        //Dak
        g.setColor(Color.getHSBColor(0.97f,0.97f,0.9f));
        int xVars[] = {250, 150, 350};
        int yVars[] = {75, 200, 200};
        int nHoeken = 3;
        g.fillPolygon(xVars, yVars, nHoeken);
        g.setColor(new Color(130,0,0));
        g.drawPolygon(xVars, yVars, nHoeken);

        //Deur
        g.setColor(new Color(63,30,14));
        g.fillRect(250,300,50,100);

        //Deur lijnen en deurknop
        g.setColor(new Color(181,74,25));
        g.drawLine(252,400,252,302);
        g.drawLine(252,302,298,302);
        g.drawLine(298,302,298,400);
        g.fillOval(288,350,7,7);

        //Raam
        g.setColor(new Color(170,246,255));
        g.fillRect(175,230,75,50);

        //Raam lijnen
        g.setColor(new Color(80,125,130));
        g.drawRect(175,230,75,50);
        g.drawLine(175,230,212,280);
        g.drawLine(212,280,250,230);
        g.drawLine(175,280,212,230);
        g.drawLine(212,230,250,280);
        g.drawLine(212,230,212,280);

        //Zon
        g.setColor(new Color(255,255,2));
        g.fillOval(-20,-20,100,100);

        //Vogel
        g.setColor(Color.black);
        g.drawLine(400,140,410,130);
        g.drawLine(410,130,420,140);
        g.drawLine(420,140,430,130);
        g.drawLine(430,130,440,140);

        g.drawLine(350,60,360,50);
        g.drawLine(360,50,370,60);
        g.drawLine(370,60,380,50);
        g.drawLine(380,50,390,60);
    }
}