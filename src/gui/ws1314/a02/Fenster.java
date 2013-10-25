package gui.ws1314.a02;

import java.io.IOException;
import javax.swing.JFrame;

/**
 * Erzeugt ein Fenster zur Darstellung eines Balkendiagramms für die Anzeige
 * der Trinkreife eines Weines mit passender Legende.
 *
 * @author Benjamin Schuermann <agribu>
 * @since 2013/10/21
 * @version 1.0
 */
public class Fenster extends JFrame {

    private String titel;   // Fenstertitel
    private int xPos;       // x-Position
    private int yPos;       // y-Position
    private int breite;     // Fensterbreite
    private int hoehe;      // Fensterhohe

    /**
     * Erzeugt eine neue Fensterinstanz zur Anzeige der Trinkreife eines Weines.
     *
     * @param titel Fenstertitel
     * @param xPos Position auf der x-Achse
     * @param yPos Position auf der y-Achse
     * @param breite Fensterbreite
     * @param hoehe Fensterhöhe
     */
    public Fenster(String titel, int xPos, int yPos, int breite, int hoehe) {
        super();
        this.initialisiereFenster(titel, xPos, yPos, breite, hoehe);
        this.erzeugeFenster();
    }

    /**
     * Initialisiert die Werte eines Fensters.
     *
     * @param titel Fenstertitel
     * @param xPos Position auf der x-Achse
     * @param yPos Position auf der y-Achse
     * @param breite Fensterbreite
     * @param hoehe Fensterhöhe
     */
    private void initialisiereFenster(String titel, int xPos, int yPos,
            int breite, int hoehe) {
        this.titel = titel;
        this.xPos = xPos;
        this.yPos = yPos;
        this.breite = breite;
        this.hoehe = hoehe;
    }

    /**
     * Stellt ein neues Fenster grafisch dar.
     */
    private void erzeugeFenster() {
        this.setTitle(titel);
        this.setLocation(xPos, yPos);
        this.setSize(breite, hoehe);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    /**
     * Zeichnet den Inhalt eines Fensters.
     * 
     * @param inhalt Inhalt Objekt
     * @throws IOException Verarbeitung der Eingabe zum Inhalt
     */
    public void zeichneInhalt(Inhalt inhalt) throws IOException {
        this.add(inhalt);
        
        TastaturEingabe te = new TastaturEingabe();
        // Behandlung der Benutzereingabe
        while (true) {
            te.pruefeEingabe();
            inhalt.diagramm.setzeEingabe(te.jahrgang(), te.lagerdauer());
            this.repaint();
        }
    }

}
