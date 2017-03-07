package Toets;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/**
 * Created by iris5 on 7-3-2017.
 */

public class Wereldtijden extends Applet {
    TextField uurInvoerNL;
    Button toonTijden;

    int tijdInput;
    String message;
    String[] namenSteden;

    int[] urenVerschil;
    int[] tijdenNU;

    int xAfstandOutput;
    int yAfstandOutput;
    int yRegelAfstand;

    public void init() {
        setSize(300, 250);

        tijdInput = 0;
        message = "Voer een tijd in";
        xAfstandOutput = 60;
        yRegelAfstand = 25;
        yAfstandOutput = 100;

        namenSteden = new String[4];
        namenSteden[0] = "London";
        namenSteden[1] = "Tokyo";
        namenSteden[2] = "New York";
        namenSteden[3] = "Sydney";

        urenVerschil = new int[4];
        urenVerschil[0] = -1; //het tijdsverschil met London
        urenVerschil[1] = 8; //het tijdsverschil met Tokyo
        urenVerschil[2] = -6; //het tijdsverschil met New York
        urenVerschil[3] = 10; //het tijdverschil met Sydney

        tijdenNU = new int[4];
        tijdenNU[0] = 0; //de huidige tijd in London
        tijdenNU[1] = 0; //de huidige tijd in Tokyo
        tijdenNU[2] = 0; //de huidige tijd in New York
        tijdenNU[3] = 0; //de huidige tijd in Sydney

        uurInvoerNL = new TextField("", 10);
        uurInvoerNL.addActionListener(new ToonTijdenListener());
        add(uurInvoerNL);

        toonTijden = new Button("Toon tijden");
        toonTijden.addActionListener(new ToonTijdenListener());
        add(toonTijden);
    }

    public void paint(Graphics g) {
        g.drawString("" + message, xAfstandOutput, yRegelAfstand + 50);
        for (int j = 0; j < urenVerschil.length; j++) {
            g.drawString("Tijd in " + namenSteden[j] + ": " + tijdenNU[j] + ":00 uur", xAfstandOutput, yAfstandOutput + yRegelAfstand * j);
        }
    }

    class ToonTijdenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                tijdInput = Integer.parseInt(uurInvoerNL.getText());
                if (tijdInput < 25 && tijdInput > -1) {
                    message = "Dit is een geldige tijdinvoer :)";
                    for (int i = 0; i < urenVerschil.length; i++) {
                        tijdenNU[i] = tijdInput + urenVerschil[i];
                        if ((i == 1 || i == 3) && tijdenNU[i] > 23) {
                            tijdenNU[i] = tijdenNU[i] - 24;
                        } else if ((i == 0 || i == 2) && tijdenNU[i] < 0) {
                            tijdenNU[i] = tijdenNU[i] + 24;
                        }
                    }
                }
                else {
                    message = "Dit is geen geldige tijdinvoer!";
                    for (int i = 0; i < urenVerschil.length; i++) {
                        tijdenNU[i] = 0;
                    }
                }
            }catch(NumberFormatException e1) {
                message = "Dit is geen geldige tijdinvoer!";
                for (int i = 0; i < urenVerschil.length; i++) {
                    tijdenNU[i] = 0;
                }
            }

            repaint();
        }
    }
}