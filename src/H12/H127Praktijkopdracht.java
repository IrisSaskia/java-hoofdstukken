package H12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/**
 * Created by iris5 on 3-3-2017.
 */

public class H127Praktijkopdracht extends Applet {
    int aantalKliks;

    TextField naamInvoer;
    TextField nummerInvoer;

    Button volgende;
    Button reset;

    String naam;
    String nummer;
    String[][] adresboek = new String[10][2];

    public void init() {
        setSize(500,400);

        for (int i = 0; i < 10; i++) {
            adresboek[i][0] = "naam" + i;
            adresboek[i][1] = "nummer" + i;
        }
        aantalKliks = 0;
        naam = "leeg1";
        nummer = "leeg2";


        naamInvoer = new TextField("", 30);
        nummerInvoer = new TextField("", 20);
        volgende = new Button("Voer de volgende in");
        reset = new Button("Reset");

        volgende.addActionListener( new VolgendeListener() );
        reset.addActionListener( new ResetListener() );

        add(naamInvoer);
        add(nummerInvoer);
        add(volgende);
        add(reset);
    }

    public void paint(Graphics g) {
        g.drawString("Uw adresboek:", 50, 75);
        for(int j = 0; j < 10; j++) {
            g.drawString("Naam: " + adresboek[j][0] + "  ---  " + "Telefoonnummer: " + adresboek[j][1], 50, 100 + 25 * j);
        }
    }

    class VolgendeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            adresboek[aantalKliks][0] = naamInvoer.getText();
            adresboek[aantalKliks][1] = nummerInvoer.getText();
            aantalKliks++;
            repaint();
        }
    }

    class ResetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int k = 0; k < 10; k++) {
                adresboek[k][0] = "naam" + k;
                adresboek[k][1] = "nummer" + k;
            }
            repaint();
        }
    }
}