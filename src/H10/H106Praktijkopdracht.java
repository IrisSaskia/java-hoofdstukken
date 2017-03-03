package H10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/**
 * Created by iris5 on 3-3-2017.
 */
public class H106Praktijkopdracht extends Applet {
    TextField cijferInvoer;
    Button invoer;

    int cijfer;
    String antwoord;

    public void init() {
        setSize(300,200);
        cijfer = 0;
        antwoord = "nog niet ingevoerd";

        cijferInvoer = new TextField("", 10);
        invoer = new Button("Bereken");
        cijferInvoer.addActionListener( new BerekenListener() );
        invoer.addActionListener( new BerekenListener() );
        add(cijferInvoer);
        add(invoer);
    }

    public void paint(Graphics g) {
        g.drawString("Jouw cijfer is: " + antwoord + ".", 50, 50);
    }

    class BerekenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            cijfer = Integer.parseInt(cijferInvoer.getText());
            if(cijfer == 1 || cijfer == 2 || cijfer == 3) {
                antwoord = "slecht";
            }
            else if(cijfer == 4) {
                antwoord = "onvoldoende";
            }
            else if(cijfer == 5) {
                antwoord = "matig";
            }
            else if(cijfer == 6 || cijfer == 7) {
                antwoord = "voldoende";
            }
            else if(cijfer == 8 || cijfer == 9 || cijfer == 10) {
                antwoord = "goed";
            }
            else {
                antwoord = "niet correct ingevoerd";
            }
            repaint();
        }
    }
}