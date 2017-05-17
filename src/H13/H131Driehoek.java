package H13;

import java.awt.*;
import java.applet.*;

/**
 * Created by iris5 on 11-5-2017.
 */
public class H131Driehoek extends Applet {
    public void init() {

    }

    public void paint(Graphics g) {
        int x11 = 10;
        int x22 = 10;
        int x33 = 100;
        int y11 = 10;
        int y22 = 100;
        int y33 = 10;
        g.setColor(Color.blue);
        tekenDriehoek(g, x11, y11, x22, y22, x33, y33);
    }

    void tekenDriehoek(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x1, y1, x3, y3);
        g.drawLine(x2, y2, x3, y3);
    }
}