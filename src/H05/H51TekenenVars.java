package H05;

/**
 * Created by iris5 on 12-2-2017.
 */

import java.awt.*;
import java.applet.*;

public class H51TekenenVars extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        int afgerondeHoeken = 30;
        int breedte = 180;
        int hoogte = 90;
        int grootteCirkel = 80;

        int tussenRuimteX = 10;

        int beginXafstandKolom1 = tussenRuimteX;
        int eindXafstandKolom1 = tussenRuimteX + breedte;
        int beginXafstandKolom2 = tussenRuimteX*2 + breedte;
        int eindXafstandKolom2 = beginXafstandKolom2 + breedte;
        int beginXafstandKolom3 = tussenRuimteX + eindXafstandKolom2;

        int tussenRuimteY = 30;
        int beginYafstandRegel1 = tussenRuimteY;
        int eindYafstandRegel1 = beginYafstandRegel1 + hoogte;
        int beginYafstandRegel2 = tussenRuimteY + eindYafstandRegel1;
        int eindYafstandRegel2 = beginYafstandRegel2 + hoogte;

        int yAfstandTekst = 15;
        int yAfstandTekst1 = yAfstandTekst + 10;
        int yAfstandTekst2 = yAfstandTekst + eindYafstandRegel1;
        int yAfstandTekst3 = yAfstandTekst + eindYafstandRegel2;

        Color lijnKleur = Color.black;
        Color vulKleur = Color.magenta;

        g.setColor(lijnKleur);
        //Lijn
        g.drawLine(tussenRuimteX,tussenRuimteX,eindXafstandKolom1,tussenRuimteX);
        g.drawString("Lijn",90,yAfstandTekst1);

        //Rechthoek
        g.drawRect(tussenRuimteX,beginYafstandRegel1,breedte,hoogte);
        g.drawString("Rechthoek",70,yAfstandTekst2);
        //Gevulde rechthoek met ovaal
        g.setColor(vulKleur);
        g.fillRect(beginXafstandKolom2,beginYafstandRegel1,breedte,hoogte);
        g.setColor(lijnKleur);
        g.drawOval(beginXafstandKolom2,beginYafstandRegel1,breedte,hoogte);
        g.drawString("Gevulde rechthoek met ovaal",215,yAfstandTekst2);
        //Taartpunt met ovaal eromheen
        g.setColor(vulKleur);
        g.fillArc(beginXafstandKolom3, beginYafstandRegel1,breedte,hoogte,0,45);
        g.setColor(lijnKleur);
        g.drawOval(beginXafstandKolom3,beginYafstandRegel1,breedte,hoogte);
        g.drawString("Taartpunt met ovaal eromheen",395,yAfstandTekst2);

        //Afgeronde rechthoek
        g.drawRoundRect(tussenRuimteX,beginYafstandRegel2,breedte,hoogte,afgerondeHoeken,afgerondeHoeken);
        g.drawString("Afgeronde rechthoek",45,yAfstandTekst3);
        //Gevulde ovaal
        g.setColor(vulKleur);
        g.fillOval(beginXafstandKolom2,beginYafstandRegel2,breedte,hoogte);
        g.setColor(lijnKleur);
        g.drawString("Gevulde ovaal",255,yAfstandTekst3);
        //Cirkel
        g.drawOval(440,155,grootteCirkel,grootteCirkel);
        g.drawString("Cirkel",460,yAfstandTekst3);
    }
}