package WineCalc;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author agribu
 */
public class Trinkreife extends JPanel {

    private int year;           // Jahrgang
    private int durOfStorage;   // Lagerdauer
    private int curYear;        // aktuelles Jahr
    private int[] values;       // Werte der Reifephasen
    private String[] names;     // Bezeichnungen der Reifephasen
    private Color[] colors;     // Einfärbungen

    /**
     *
     * @param v
     * @param n
     */
    public Trinkreife(int[] v, String[] n, Color[] c) {
        this.values = v;
        this.names = n;
        this.colors = c;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // Erzeuge neuen Frame
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        double lagerdauer = 15.0;
        double optimal = Math.round(lagerdauer / 2.0);
        double unreif = Math.round(lagerdauer / 8.0);
        double steigernd = optimal - unreif - 1;
        double ueberlagert = lagerdauer - unreif - steigernd - optimal + 1; 
        
        // Setze Bezeichnungen und Werte
        int[] values = {(int) unreif, (int) steigernd, (int) optimal, (int) ueberlagert};
//        for (int i = 0; i < values.length; i++) {
//            System.out.printf("%d\t", values[i]);
//        }
        String[] names = {"a", "b", "c", "d"};
        Color[] colors = {Color.gray, Color.blue, Color.green, Color.yellow};


        f.getContentPane().add(new Trinkreife(values, names, colors));
        f.setVisible(true);
    }

    /**
     *
     * @param g
     */
    @Override
    public void paintComponent(Graphics g) {
        // Setze minWert und maxWert
        int minVal = 0;
        int maxVal = 0;

        // Setze Clientgrößen
        Dimension d = getSize();
        int cltWidth = d.width;
        int cltHeight = d.height;

        // Setze Diagramm Eigenschaften
        int diaX = cltWidth * 10 / 100;
        int diaY = cltHeight * 10 / 100;
        int diaW = cltWidth * 80 / 100;
        int diaH = cltHeight * 25 / 100;

        // Bestimme min-/maxWert
        for (int i = 0; i < values.length; i++) {
            if (minVal > values[i]) {
                minVal = values[i];
            }
            if (maxVal < values[i]) {
                maxVal = values[i];
            }
        }

        // Erzeuge x-Positionsmarker
        int posX = diaX;

        // Zeichne Reifephasen
        for (int i = 0; i < values.length; i++) {
            // Setze Balkeneigenschaften
            int valW = diaW / 16 * values[i];
            int valH = diaH;
            int valX = posX;
            int valY = diaY;

            g.setColor(Color.black);
            g.drawRect(valX, valY, valW, valH);
            g.setColor(colors[i]);
            g.fillRect(valX, valY, valW, valH);

            // Setze x-Positionsmarker
            posX = posX + valW;
        }

    }
}