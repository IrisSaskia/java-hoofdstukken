package H13;

import java.awt.*;
import java.applet.*;

/**
 * Created by iris5 on 15-5-2017.
 */
public class H134Praktijkopdracht extends Applet{
    private int beginPuntX = 25;
    private int beginPuntY = 25;
    private int breedteBoomStam = 30;
    private int hoogteBoomStam = 100;
    private int grootteCirkelBlad = 80;

    private int aantalBomen = 5;
    private int aantalRijen = 2;

    public void init() {
        setSize(750,750);
    }

    public void paint(Graphics g) {
        maakRij(g, aantalBomen, aantalRijen);
    }

    private void maakBoom(Graphics g, int beginX, int beginY, int breedteStam, int hoogteStam, int grootteCirkel) {
        g.setColor(new Color(96,66,28));
        g.fillRect(beginX + ((grootteCirkel/2) - (breedteStam/2)), beginY + grootteCirkel, breedteStam, hoogteStam);
        g.setColor(Color.green);
        g.fillOval(beginX, beginY, grootteCirkel, grootteCirkel);
    }

    private void maakRij(Graphics g, int aantalBomenInRij, int aantalRijenBomen) {
        for (int i = 0; i < aantalRijenBomen; i++){
            for (int j = 0; j < aantalBomenInRij; j++) {
                int afstand = 0;
                if (grootteCirkelBlad > breedteBoomStam) {
                    afstand = grootteCirkelBlad;
                }
                else {
                    afstand = breedteBoomStam;
                }
                maakBoom(g, beginPuntX + j * (afstand + beginPuntX), beginPuntY + i * (hoogteBoomStam + grootteCirkelBlad + beginPuntY), breedteBoomStam, hoogteBoomStam, grootteCirkelBlad);
            }
        }
    }
}