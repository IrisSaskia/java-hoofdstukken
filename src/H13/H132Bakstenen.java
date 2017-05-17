package H13;

import java.awt.*;
import java.applet.*;

/**
 * Created by iris5 on 11-5-2017.
 */
public class H132Bakstenen extends Applet {
    int breedteSteen = 60;
    int hoogteSteen = 30;
    int aantalRijen = 10;
    int aantalStenenPerEvenRij = 10;
    int aantalStenenPerOnevenRij = 9;
    int beginEvenRij = -50;
    int beginOnevenRij = -20;

    public void init() {
        setSize(breedteSteen * aantalStenenPerEvenRij,aantalRijen * hoogteSteen);
    }

    public void paint(Graphics g) {
        setBackground(Color.gray);
        g.setColor(Color.red);
        for(int i = 0; i < aantalRijen; i++) {
            if((i%2)==0){
                //even
                bakstenenRij(g, beginEvenRij, -10 + i * (hoogteSteen + 10), breedteSteen, hoogteSteen, aantalStenenPerEvenRij);
            }
            else {
                //odd
                bakstenenRij(g, beginOnevenRij, -10 + i * (hoogteSteen + 10), breedteSteen, hoogteSteen, aantalStenenPerOnevenRij);
            }
        }
    }

    void bakstenenRij(Graphics g, int beginX, int beginY, int steenWidth, int steenHeight, int aantalStenen) {
        for(int j = 0; j < aantalStenen; j++) {
            g.fill3DRect(beginX + (steenWidth * j) + (10 * j), beginY, steenWidth, steenHeight, true);
        }
    }
}
