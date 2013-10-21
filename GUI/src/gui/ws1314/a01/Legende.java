package gui.ws1314.a01;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;

/**
 * Erzeugt die Legende zu dem in ReifeDiagramm.java generierten Balkendiagramm.
 *
 * @author Benjamin Schuermann <agribu>
 * @since 2013/10/21
 * @version 1.0
 */
public class Legende {
    
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
    public Legende() {}

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
     * Setzt die Groesse und Position der Legende.
     */
    private void setzeLegende() {
        this.x = (this.fensterBreite * 10) / 100;   // x-Position
        this.y = (this.fensterHoehe * 45) / 100;    // y-Position
        this.b = (this.fensterBreite * 80) / 100;   // Breite
        this.h = (this.fensterHoehe * 45) / 100;    // Hoehe      
    }
    
}
