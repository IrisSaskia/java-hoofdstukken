package H06;

import java.awt.*;
import java.applet.*;

/**
 * Created by iris5 on 3-3-2017.
 */
public class H64Praktijkopdracht extends Applet {
    double cijfer1;
    double cijfer2;
    double cijfer3;
    double gemiddelde;
    int gemiddelde_conv;
    double gemiddelde_print;

    public void init() {
        cijfer1 = 5.9;
        cijfer2 = 6.3;
        cijfer3 = 6.9;
        gemiddelde = (cijfer1 + cijfer2 + cijfer3) / 3 * 10;
        gemiddelde_conv = (int) gemiddelde;
        gemiddelde_print = gemiddelde_conv;
    }

    public void paint(Graphics g) {
        g.drawString("Het gemiddelde is: " + gemiddelde_print / 10, 50,50);

    }
}