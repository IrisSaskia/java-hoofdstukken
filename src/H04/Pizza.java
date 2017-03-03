package H04;

/**
 * Created by iris5 on 8-2-2017.
 */

import java.awt.*;
import java.applet.*;

public class Pizza extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(50,50,400,400,0,360);
    }
}
