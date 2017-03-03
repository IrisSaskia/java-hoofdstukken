package H08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/**
 * Created by iris5 on 3-3-2017.
 */
public class H84Praktijkopdracht extends Applet {
    TextField getalInvoer1;
    TextField getalInvoer2;

    Button knopPlus;
    Button knopMin;
    Button knopDelen;
    Button knopKeer;

    String soortBerekening;
    String getalTekst1;
    String getalTekst2;

    double getal1;
    double getal2;
    double uitkomst;

    public void init() {
        soortBerekening = "+";
        getalTekst1 = "0";
        getalTekst2 = "0";
        getal1 = 0.0;
        getal2 = 0.0;
        uitkomst = 0.0;

        setSize(500,500);

        getalInvoer1 = new TextField("", 10);
        getalInvoer2 = new TextField("", 10);
        knopPlus = new Button("+");
        knopMin = new Button("-");
        knopKeer = new Button("*");
        knopDelen = new Button("/");
        knopPlus.addActionListener( new KnopPlusListener() );
        knopMin.addActionListener( new KnopMinListener() );
        knopKeer.addActionListener( new KnopKeerListener() );
        knopDelen.addActionListener( new KnopDelenListener() );
        add(getalInvoer1);
        add(getalInvoer2);
        add(knopPlus);
        add(knopMin);
        add(knopKeer);
        add(knopDelen);
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst van: " + getalTekst1 + " " + soortBerekening + " " + getalTekst2 + " is: " + uitkomst + ".", 60, 50);
    }

    class KnopPlusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getalTekst1 = getalInvoer1.getText();
            getal1 = Double.parseDouble(getalTekst1);
            getalTekst2 = getalInvoer2.getText();
            getal2 = Double.parseDouble(getalTekst2);
            soortBerekening = "+";
            uitkomst = getal1 + getal2;
            repaint();
        }
    }

    class KnopMinListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getalTekst1 = getalInvoer1.getText();
            getal1 = Double.parseDouble(getalTekst1);
            getalTekst2 = getalInvoer2.getText();
            getal2 = Double.parseDouble(getalTekst2);
            soortBerekening = "-";
            uitkomst = getal1 - getal2;
            repaint();
        }
    }

    class KnopKeerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getalTekst1 = getalInvoer1.getText();
            getal1 = Double.parseDouble(getalTekst1);
            getalTekst2 = getalInvoer2.getText();
            getal2 = Double.parseDouble(getalTekst2);
            soortBerekening = "*";
            uitkomst = getal1 * getal2;
            repaint();
        }
    }

    class KnopDelenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getalTekst1 = getalInvoer1.getText();
            getal1 = Double.parseDouble(getalTekst1);
            getalTekst2 = getalInvoer2.getText();
            getal2 = Double.parseDouble(getalTekst2);
            soortBerekening = "/";
            uitkomst = getal1 / getal2;
            repaint();
        }
    }
}