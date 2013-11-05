package gui.ws1314.a03;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 * Erzeugt die Legende zu dem in ReifeDiagramm.java generierten Balkendiagramm.
 *
 * @author Benjamin Schuermann <agribu>
 * @since 2013/10/21
 * @version 1.0
 */
public class Legende extends JPanel {
    
    /**
     * Setzt den Status fuer das Zeichnen der Legende.
     */
    public boolean zeichneLegende;
    
    // Grafikobjekt
    private Graphics2D g;
    // Schriftgroesse
    private int schriftgroesse;
    // Position und Groessen des Diagramms
    private double x, y, b, h;
    // Groessen des Fensters
    private double fensterBreite, fensterHoehe;
    // Sammlung der Farben aller Stadien
    private final Object[] COLORS = {Color.gray,
        new GradientPaint(0, 0, Color.gray, 0, 0, Color.green),
        Color.green, Color.yellow};

    /**
     * Erzeugt ein neues Legendeobjekt.
     */
    public Legende() {
        // Setze weisse Hintergrundfarbe
        this.setBackground(Color.white);
        // Legende soll gezeichnet werden
        this.zeichneLegende = true;
        // Legende soll fokussierbar sein
        this.setFocusable(true);
        
        // Neuer MouseListener
        class ml extends MouseAdapter {
            @Override
            public void mouseClicked(MouseEvent me) {
                ((Legende) me.getSource()).requestFocusInWindow();
            }
        }

        // Fuege neuen FocusListener hinzu
        FocusListener fl = new FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
                ((JPanel) fe.getSource()).setBorder(
                        BorderFactory.createLineBorder(
                                new Color(123, 170, 189), 2));
            }

            @Override
            public void focusLost(FocusEvent fe) {
                ((JPanel) fe.getSource()).setBorder(null);
            }
        };
        
        this.addMouseListener(new ml());
        this.addFocusListener(fl);
    }

    /**
     * Stellt eine neue Legende grafisch dar.
     */
    public void erstelleLegende() {
        // Groesse eines Legendekastens, bzw. Zwischenraums
        double size = this.h / 9;
        // Beschriftungen zur Stadien der Trinkreife
        String[] stadien = {"Zu früh", "Steigert sich noch", 
            "Optimaler Trinkzeitpunkt", "Überlagert"};

        // this.g.draw(new Rectangle.Double(this.x, this.y, this.b, this.h));
        
        // Setze Titel
        this.g.drawString(
                "Legende",
                (int) (this.x),
                (int) (this.y + schriftgroesse));
        
        for(int i = 0; i < 4; i++) {
            // Berechne Position
            this.y += size * 2;
            
            // Setze Fuellfarbe
            if (this.COLORS[i] instanceof GradientPaint) {
                this.COLORS[i] = new GradientPaint(
                        (int) this.x, (int) this.y, Color.gray,
                        (int) (this.x + size), (int) this.y, Color.green);
            }
            this.g.setPaint((Paint) this.COLORS[i]);
            this.g.fill(
                    new Rectangle.Double(this.x, this.y, size, size));

            // Zuruecksetzen der Farbe
            this.g.setPaint(Color.black);
            
            // Zeichne Aussenrahmen
            this.g.draw(new Rectangle.Double(this.x, this.y, size, size));
            
            // Setze Beschriftung
            this.g.drawString(
                    stadien[i],
                    (int) (this.x + (size * 2)),
                    (int) (this.y + size));
        }
    }

    /**
     * Setzt allgemeine Eigenschaften.
     *
     * @param d Dimension des Fensters
     * @param g Grafikobjekt
     */
    public void setzeEigenschaften(Dimension d, Graphics2D g) {
        this.fensterBreite = (int) d.width;
        this.fensterHoehe = (int) d.height;
        
        // Setze Grafikobjekt
        this.g = g;

        // Setzt die aktuelle Schritgroesse
        FontMetrics metrics = g.getFontMetrics();
        this.schriftgroesse = metrics.getHeight();
        
        // Aktualisierung der Groessen der Legende
        this.setzeLegende();
    }
    
    /**
     * Setzt das Textformat des Inhalts
     * 
     * @param g Grafikobjekt
     */
    public void setzeTextFormat(Graphics2D g) {
        // Setze Schriftgroesse und Schriftart
        int fontSize = (int) Math.round(1.5 * this.getWidth() / 72.0);
        Font font = new Font("Arial", Font.PLAIN, fontSize);
        g.setFont(font);
    }
    
    /**
     * Stellt den Inhalt grafisch dar.
     *
     * @param g Grafikobjekt.
     */
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        // Aktiviere Antialiasing (Schriftenglaettung)
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);

        // Uebergeben der Fenstergroesse und des Grafikobjekts
        this.setzeEigenschaften(this.getSize(), g2);
        
        // Textformat
        this.setzeTextFormat(g2);

        super.paintComponent(g2);

        // Zeichne Legende
        if (zeichneLegende)
            this.erstelleLegende();
    }
    
    /**
     * Setzt die Groesse und Position der Legende.
     */
    private void setzeLegende() {
        this.x = (this.fensterBreite * 10) / 100;   // x-Position
        this.y = (this.fensterHoehe * 10) / 100;    // y-Position
        this.b = (this.fensterBreite * 80) / 100;   // Breite
        this.h = (this.fensterHoehe * 80) / 100;    // Hoehe      
    }
    
}
