package H11;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/**
 * Created by iris5 on 3-3-2017.
 */
public class H1110Praktijkopdracht extends Applet {
    TextField cijferInvoer;
    Button uitvoeren;

    int cijfer;
    int nummer;
    int[] uitkomsten = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public void init() {
        setSize(400,500);
        cijfer = 1;
        nummer = 0;

        cijferInvoer = new TextField("", 10);
        uitvoeren = new Button("Toon de tafel");

        cijferInvoer.addActionListener( new BerekenListener() );
        uitvoeren.addActionListener( new BerekenListener() );

        add(cijferInvoer);
        add(uitvoeren);
    }

    public void paint(Graphics g) {
        g.drawString("De tafel van " + cijfer + ":", 110, 50);
        for(int j = 0; j < 10; j++) {
            if((j + 1) < 10) {
                g.drawString("  " + (j + 1) + " * " + cijfer + " = " + uitkomsten[j], 110, 75 + j * 20);
            }
            else {
                g.drawString((j + 1) + " * " + cijfer + " = " + uitkomsten[j], 110, 75 + j * 20);
            }
        }
    }

    class BerekenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            cijfer = Integer.parseInt(cijferInvoer.getText());
            for(int i = 1; i < 11; i++) {
                nummer = i - 1;
                uitkomsten[nummer] = i * cijfer;
            }
            repaint();
        }
    }
}