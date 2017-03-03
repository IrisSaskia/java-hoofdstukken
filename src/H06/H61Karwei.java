package H06;

import java.applet.*;
import java.awt.*;

/**
 * Created by iris5 on 14-2-2017.
 */
public class H61Karwei extends Applet {
    int aantalPersonen;
    int bedrag;
    double bedragPP;

    public void init() {
        aantalPersonen = 4;
        bedrag = 113;
        bedragPP = bedrag/aantalPersonen;
    }

    public void paint(Graphics g) {
        g.drawString("Totaal verdiend: " + bedrag,25,25);
        g.drawString("Ali krijgt: " + bedragPP, 25,50);
        g.drawString("Iris krijgt: " + bedragPP,25,75);
        g.drawString("Jan krijgt: " + bedragPP,25,100);
        g.drawString("Jeannette krijgt: " + bedragPP,25,125);
    }
}
