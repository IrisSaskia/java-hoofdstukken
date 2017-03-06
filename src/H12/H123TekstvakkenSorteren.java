package H12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.*;

/**
 * Created by iris5 on 6-3-2017.
 */

public class H123TekstvakkenSorteren extends Applet {
    TextField[] tekstInvoer;
    Button sort;
    //String[] input;

    String[] tekstvak0, tekstvak1, tekstvak2, tekstvak3, tekstvak4;
    String[][] arraysVakken = {tekstvak0, tekstvak1, tekstvak2, tekstvak3, tekstvak4};

    String tekstvakOutput0, tekstvakOutput1, tekstvakOutput2, tekstvakOutput3, tekstvakOutput4;
    String[] arraysOutput = { tekstvakOutput0, tekstvakOutput1, tekstvakOutput2, tekstvakOutput3, tekstvakOutput4};

    public void init() {
        setSize(1000,200);
        tekstInvoer = new TextField[5];

        for(int i = 0; i < tekstInvoer.length; i++) {
            tekstInvoer[i] = new TextField("", 22);
            add(tekstInvoer[i]);
        }

        sort = new Button("Sorteer");
        sort.addActionListener( new SortListener() );
        add(sort);
    }

    public void paint(Graphics g) {
        /*for(int k = 0; k < tekstInvoer.length; k++) {
            g.drawString("" + input[k], 100 + 100 * k, 100 + 20 * k);
        }*/
    }

    class SortListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for(int j = 0; j < tekstInvoer.length; j++) {
                //input[j] = tekstInvoer[j].getText();
                arraysVakken[j] = tekstInvoer[j].getText().split("");
                Arrays.sort(arraysVakken[j]);
                arraysOutput[j] = Arrays.toString(arraysVakken[j]);
                arraysOutput[j] = arraysOutput[j].substring(1, arraysOutput[j].length()-1);
                tekstInvoer[j].setText("" + arraysOutput[j]);
            }

            /*tekstvak0 = tekstInvoer[0].getText().split("");
            Arrays.sort(tekstvak0);
            tekstvakOutput0 = Arrays.toString(tekstvak0);
            tekstvakOutput0 = tekstvakOutput0.substring(1, tekstvakOutput0.length()-1);
            tekstInvoer[0].setText("" + tekstvakOutput0);

            tekstvak1 = tekstInvoer[1].getText().split("");
            Arrays.sort(tekstvak1);
            tekstvakOutput1 = Arrays.toString(tekstvak1);
            tekstvakOutput1 = tekstvakOutput1.substring(1, tekstvakOutput1.length()-1);
            tekstInvoer[1].setText("" + tekstvakOutput1);

            tekstvak2 = tekstInvoer[2].getText().split("");
            Arrays.sort(tekstvak2);
            tekstvakOutput2 = Arrays.toString(tekstvak2);
            tekstvakOutput2 = tekstvakOutput2.substring(1, tekstvakOutput2.length()-1);
            tekstInvoer[2].setText("" + tekstvakOutput2);

            tekstvak3 = tekstInvoer[3].getText().split("");
            Arrays.sort(tekstvak3);
            tekstvakOutput3 = Arrays.toString(tekstvak3);
            tekstvakOutput3 = tekstvakOutput3.substring(1, tekstvakOutput3.length()-1);
            tekstInvoer[3].setText("" + tekstvakOutput3);

            tekstvak4 = tekstInvoer[4].getText().split("");
            Arrays.sort(tekstvak4);
            tekstvakOutput4 = Arrays.toString(tekstvak4);
            tekstvakOutput4 = tekstvakOutput4.substring(1, tekstvakOutput4.length()-1);
            tekstInvoer[4].setText("" + tekstvakOutput4);*/

            repaint();
        }
    }
}