package H04;

/**
 * Created by iris5 on 7-2-2017.
 */

import java.awt.*;
import java.applet.*;

public class Gewichten extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(50,50,50,550);
        g.drawLine(50,550,550,550);

        g.drawLine(40,50,50,50);
        g.drawLine(45,100,50,100);
        g.drawLine(40,150,50,150);
        g.drawLine(45,200,50,200);
        g.drawLine(40,250,50,250);
        g.drawLine(45,300,50,300);
        g.drawLine(40,350,50,350);
        g.drawLine(45,400,50,400);
        g.drawLine(40,450,50,450);
        g.drawLine(45,500,50,500);
        g.drawLine(40,550,50,550);

        g.drawString("0", 35,545);
        g.drawString("20", 35,445);
        g.drawString("40", 35,345);
        g.drawString("60",35,245);
        g.drawString("80",35,145);
        g.drawString("100",35,45);

        g.drawLine(100,550,100,560);
        g.drawLine(200,550,200,560);
        g.drawLine(250,550,250,560);
        g.drawLine(350,550,350,560);
        g.drawLine(400,550,400,560);
        g.drawLine(500,550,500,560);

        g.drawString("Gewicht (kg)",5,570);
        g.drawString("Valerie", 130,565);
        g.drawString("Jeroen", 280,565);
        g.drawString("Hans", 430,565);

        g.setColor(Color.pink);
        g.fillRect(100,350, 100,200);
        g.setColor(Color.yellow);
        g.fillRect(250,50,100,500);
        g.setColor(Color.green);
        g.fillRect(400,150,100,400);

        g.setColor(Color.black);
        g.drawRect(100,350, 100,200);
        g.drawRect(250,50,100,500);
        g.drawRect(400,150,100,400);
    }
}
