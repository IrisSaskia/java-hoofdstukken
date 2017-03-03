package H04;

/**
 * Created by iris5 on 8-2-2017.
 */

import java.awt.*;
import java.applet.*;

public class Dobbelsteen extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawRoundRect(50,50,400,400,80,80);
        g.fillOval(90,90,90,90);
        g.fillOval(90,320,90,90);
        g.fillOval(320,90,90,90);
        g.fillOval(320,320,90,90);
        g.drawString("Ik ben meneer Dobbel en Barbara vindt mij sexy :D",50,475);
    }
}