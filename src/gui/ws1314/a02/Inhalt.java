package gui.ws1314.a02;

import java.awt.Color;
import utilities.MausAktion;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;

/**
 * Darzustellender Inhalt eines Fensters.
 * 
 * @author Benjamin Schuermann <agribu>
 * @since 2013/10/21 
 * @version 1.0
 */
public class Inhalt extends JPanel {

    /**
     * Setzt den Status fuer das Zeichnen der Legende.
     */
    public boolean zeichneLegende;

    public final ReifeDiagramm diagramm;    // Diagramm als Inhaltskomponente.
    private final Legende legende;          // Legende als Inhaltskomponente.

    /**
     * Erzeugt einen neuen Fensterinhalt
     */
    public Inhalt() {
        // Erzeugen eines Diagramms und Legende
        this.diagramm = new ReifeDiagramm();
        this.legende = new Legende();
        
        // Legende soll gezeichnet werden
        this.zeichneLegende = true;
        
        // Fuege MausAktionen hinzu
        Object ma = new MausAktion();
        this.addMouseListener((MouseListener) ma);
        this.addMouseMotionListener((MouseMotionListener) ma);
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
        
        // Setze weisse Hintergrundfarbe
        this.setBackground(Color.white);

        // Uebergeben der Fenstergroesse und des Grafikobjekts
        this.diagramm.setzeEigenschaften(this.getSize(), g2);
        this.legende.setzeEigenschaften(this.getSize(), g2);
        
        // Textformat
        this.setzeTextFormat(g2);

        super.paintComponent(g2);

        // Zeichne Diagramm und Legende
        this.diagramm.erstelleDiagramm();
        if (zeichneLegende)
            this.legende.erstelleLegende();
    }

}
