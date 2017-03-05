package H11;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/**
 * Created by iris5 on 3-3-2017.
 */
public class H1110bPraktijkopdracht extends Applet {
    Button uitvoeren;
    Button reset;

    int cijfer;
    int nummer;
    int[] uitkomsten = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public void init() {
        setSize(250,400);
        cijfer = 1;
        nummer = 0;

        uitvoeren = new Button("Toon de volgende tafel");
        reset = new Button("Reset");
        uitvoeren.addActionListener( new BerekenListener() );
        reset.addActionListener( new ResetListener() );
        add(uitvoeren);
        add(reset);
    }

    public void paint(Graphics g) {
        g.drawString("De tafel van " + cijfer + ":", 40, 50);
        for(int j = 0; j < 10; j++) {
            if((j + 1) < 10) {
                g.drawString("  " + (j + 1) + " * " + cijfer + " = " + uitkomsten[j], 40, 75 + j * 20);
            }
            else {
                g.drawString((j + 1) + " * " + cijfer + " = " + uitkomsten[j], 40, 75 + j * 20);
            }
        }
    }

    class BerekenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (cijfer < 10) {
                cijfer++;
                for(int i = 1; i < 11; i++) {
                    nummer = i - 1;
                    uitkomsten[nummer] = i * cijfer;
                }
            }
            repaint();
        }
    }

    class ResetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            cijfer = 1;
            for(int k = 0; k < 10; k++) {
                uitkomsten[k] = k + 1 * cijfer;
            }
            repaint();
        }
    }
}