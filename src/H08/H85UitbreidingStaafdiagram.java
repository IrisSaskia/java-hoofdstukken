package H08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/**
 * Created by iris5 on 3-3-2017.
 */
public class H85UitbreidingStaafdiagram extends Applet {
    TextField gewichtValerieInvoer;
    TextField gewichtJeroenInvoer;
    TextField gewichtHansInvoer;
    Label gewichtValerieWijz;
    Label gewichtJeroenWijz;
    Label gewichtHansWijz;
    Button waardesWijzigen;
    int gewichtValerie;
    int gewichtJeroen;
    int gewichtHans;

    public void init() {
        setSize(750,600);
        gewichtValerieInvoer = new TextField("40", 10);
        gewichtJeroenInvoer = new TextField("100", 10);
        gewichtHansInvoer = new TextField("80", 10);
        gewichtValerieWijz = new Label("Gewicht Valerie: ");
        gewichtJeroenWijz = new Label("Gewicht Jeroen: ");
        gewichtHansWijz = new Label("Gewicht Hans: ");
        waardesWijzigen = new Button("Waardes wijzigen");
        waardesWijzigen.addActionListener( new WijzigListener() );
        gewichtValerieInvoer.addActionListener( new WijzigListener() );
        gewichtJeroenInvoer.addActionListener( new WijzigListener() );
        gewichtHansInvoer.addActionListener( new WijzigListener() );
        add(gewichtValerieWijz);
        add(gewichtValerieInvoer);
        add(gewichtJeroenWijz);
        add(gewichtJeroenInvoer);
        add(gewichtHansWijz);
        add(gewichtHansInvoer);
        add(waardesWijzigen);
        gewichtValerie = 40;
        gewichtJeroen = 100;
        gewichtHans = 80;
    }

    public void paint(Graphics g) {
        int hoogteValerie = 5*gewichtValerie;
        int hoogteJeroen = 5*gewichtJeroen;
        int hoogteHans = 5*gewichtHans;
        int beginGrafiekValerie = 550 - hoogteValerie;
        int beginGrafiekJeroen = 550 - hoogteJeroen;
        int beginGrafiekHans = 550 - hoogteHans;

        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(50,50,50,550);
        g.drawLine(50,550,550,550);

        g.drawLine(40,50,50,50);
        g.drawLine(45,100,50,100);
        g.drawLine(40,150,50,150);
        g.drawLine(45,200,50,200);
        g.drawLine(40,250,50,250);
        g.drawLine(45,300,50,300);
        g.drawLine(40,350,50,350);
        g.drawLine(45,400,50,400);
        g.drawLine(40,450,50,450);
        g.drawLine(45,500,50,500);
        g.drawLine(40,550,50,550);

        g.drawString("0", 35,545);
        g.drawString("20", 35,445);
        g.drawString("40", 35,345);
        g.drawString("60",35,245);
        g.drawString("80",35,145);
        g.drawString("100",35,45);

        g.drawLine(100,550,100,560);
        g.drawLine(200,550,200,560);
        g.drawLine(250,550,250,560);
        g.drawLine(350,550,350,560);
        g.drawLine(400,550,400,560);
        g.drawLine(500,550,500,560);

        g.drawString("Gewicht (kg)",5,570);
        g.drawString("Valerie", 130,565);
        g.drawString("Jeroen", 280,565);
        g.drawString("Hans", 430,565);

        g.setColor(Color.pink);
        g.fillRect(100,beginGrafiekValerie,100,hoogteValerie);
        g.setColor(Color.yellow);
        g.fillRect(250,beginGrafiekJeroen,100,hoogteJeroen);
        g.setColor(Color.green);
        g.fillRect(400,beginGrafiekHans,100,hoogteHans);

        g.setColor(Color.black);
        g.drawRect(100,beginGrafiekValerie, 100,hoogteValerie);
        g.drawRect(250,beginGrafiekJeroen,100,hoogteJeroen);
        g.drawRect(400,beginGrafiekHans,100,hoogteHans);
    }

    class WijzigListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            gewichtValerie = (int) Double.parseDouble(gewichtValerieInvoer.getText());
            gewichtJeroen = (int) Double.parseDouble(gewichtJeroenInvoer.getText());
            gewichtHans = (int) Double.parseDouble(gewichtHansInvoer.getText());
            repaint();
        }
    }
}
