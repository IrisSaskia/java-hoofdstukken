package H13;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/**
 * Created by iris5 on 11-5-2017.
 */
public class H133MeerStenen extends Applet {
    private int breedteSteen = 60;
    private int hoogteSteen = 30;
    private int aantalRijen = 10;
    private int aantalStenenPerEvenRij = 10;
    private int aantalStenenPerOnevenRij = 9;
    private int beginEvenRij = -50;
    private int beginOnevenRij = -20;

    private int breedteBlok = 80;
    private int hoogteBlok = 40;
    private int beginOnevenRijBlok = -10;

    private Button baksteenButton;
    private Button betonblokButton;
    private Button reset;

    private int watVoorSteen = 0;

    public void init() {
        setSize(breedteSteen * aantalStenenPerEvenRij,aantalRijen * hoogteSteen);
        baksteenButton = new Button("Bakstenen");
        betonblokButton = new Button("Betonblokken");
        reset = new Button("Reset");
        baksteenButton.addActionListener(new BaksteenMaakListener());
        betonblokButton.addActionListener(new BetonblokMaakListener());
        reset.addActionListener(new ResetListener());
        add(baksteenButton).setBackground(Color.red);
        add(betonblokButton).setBackground(Color.gray);
        add(reset).setBackground(Color.pink);
    }

    public void paint(Graphics g) {
        if(watVoorSteen == 0) {
            setBackground(Color.white);
        }
        else if(watVoorSteen == 1) {
            setBackground(Color.gray);
            g.setColor(Color.red);
            for (int i = 0; i < aantalRijen; i++) {
                if ((i % 2) == 0) {
                    //even
                    bakstenenRij(g, beginEvenRij, -10 + i * (hoogteSteen + 10), breedteSteen, hoogteSteen, aantalStenenPerEvenRij);
                } else {
                    //odd
                    bakstenenRij(g, beginOnevenRij, -10 + i * (hoogteSteen + 10), breedteSteen, hoogteSteen, aantalStenenPerOnevenRij);
                }
            }
        }
        else if(watVoorSteen == 2) {
            setBackground(Color.gray);
            g.setColor(Color.black);
            for (int i = 0; i < aantalRijen; i++) {
                if ((i % 2) == 0) {
                    //even
                    betonblokRij(g, beginEvenRij, -10 + i * hoogteBlok, breedteBlok, hoogteBlok, aantalStenenPerEvenRij);
                } else {
                    //odd
                    betonblokRij(g, beginOnevenRijBlok, -10 + i * hoogteBlok, breedteBlok, hoogteBlok, aantalStenenPerOnevenRij);
                }
            }
        }
    }

    private void bakstenenRij(Graphics g, int beginX, int beginY, int steenWidth, int steenHeight, int aantalStenen) {
        for(int j = 0; j < aantalStenen; j++) {
            g.fill3DRect(beginX + (steenWidth * j) + (10 * j), beginY, steenWidth, steenHeight, true);
        }
    }

    private void betonblokRij(Graphics g, int beginX, int beginY, int steenWidth, int steenHeight, int aantalStenen) {
        for(int k = 0; k < aantalStenen; k++) {
            g.drawRect(beginX + (steenWidth * k), beginY, steenWidth, steenHeight);
        }
    }

    class ResetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            watVoorSteen = 0;
            repaint();
        }
    }

    class BaksteenMaakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            watVoorSteen = 1;
            repaint();
        }
    }

    class BetonblokMaakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            watVoorSteen = 2;
            repaint();
        }
    }
}
