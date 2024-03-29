package gui.ws1314.a02;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.util.Calendar;

/**
 * Erzeugt ein Balkendiagramm zur Darstellung der Trinkreife eines Weines.
 *
 * @author Benjamin Schuermann <agribu>
 * @since 2013/10/21
 * @version 1.0
 */
public class ReifeDiagramm {
    /**
     * Stadien der Trinkreife
     */ 
    public Stadium[] stadien;
    
    // Grafikobjekt
    private Graphics2D g;
    // Schriftgroesse
    private int schriftgroesse;
    // Position und Groessen des Diagramms
    private double x, y, b, h;
    // Groessen des Fensters
    private double fensterBreite, fensterHoehe;
    // Startjahr des aktuellen Stadiums
    private int stadiumBeginn;
    // Aktuelle Jahr
    private int aktJahr;
    // Tastatureingaben zu den Eigenschaften eines Weines
    private double lagerdauer, jahrgang;
    // Farbsetzung
    public Object[] farben = {Color.gray,
            new GradientPaint(0, 0, Color.gray, 0, 0, Color.green),
            Color.green, Color.yellow};

    /**
     * Erzeugt ein neues Legendeobjekt.
     */
    public ReifeDiagramm() {
    }

    /**
     * Stellt ein neues Digramm grafisch dar.
     */
    public void erstelleDiagramm() {
        // Ausserer Rahmen des Diagramms
        this.g.draw(new Rectangle.Double(this.x, this.y, this.b, this.h));
        // Stadien der Trinkreife
        zeichneStadien();
        // Aktuelles Jahr
        zeichneAktuellesJahr();
    }

    /**
     * Setzt allgemeine Eigenschaften.
     *
     * @param d Dimension des Fensters
     * @param g Grafikobjekt
     */
    public void setzeEigenschaften(Dimension d, Graphics2D g) {
        // Setze Fenstergroesse
        this.fensterBreite = (double) d.width;
        this.fensterHoehe = (double) d.height;

        // Setze Grafikobjekt
        this.g = g;

        // Setzt die aktuelle Schritgroesse
        FontMetrics metrics = g.getFontMetrics();
        this.schriftgroesse = metrics.getHeight();

        // Setzt das aktuelle Jahr
        this.aktJahr = Calendar.getInstance().get(Calendar.YEAR);

        // Aktualisierung der Groessen des Diagramms
        this.setzeDiagramm();
        
        // Setzt die Stadien der Trinkreife
        this.setzeStadien();
    }

    /**
     * Setzt den Jahrgang und die Lagerdauer.
     *
     * @param jahrgang Jahrgang
     * @param lagerdauer Lagerdauer
     */
    public void setzeEingabe(int jahrgang, int lagerdauer) {
        this.jahrgang = jahrgang;
        this.lagerdauer = lagerdauer;
    }
    
    /**
     * Zeichnet das aktuelle Stadium.
     * 
     * @param s Stadium
     * @param position Position
     */
    public void zeichneAktStadium(Stadium s, double position) {
        // Setze Fuellfarbe
        if (s.farbe instanceof GradientPaint) {
            s.setzeFarbe(new GradientPaint((int) position, 
                    (int) this.y, ((GradientPaint) s.farbe).getColor1(), 
                    (int) (position + s.breite), 
                    (int) this.y, ((GradientPaint) s.farbe).getColor2()));
        }
        this.g.setPaint((Paint) s.farbe);
        this.g.fill(new Rectangle.Double(
                position, this.y, s.breite, this.h));
        // Zuruecksetzen der Farbe
        this.g.setPaint(Color.black);
        // Zeichne Rahmen des aktuellen Stadiums und setze die Beschriftung
        this.g.draw(new Rectangle.Double(
                position, this.y, s.breite, this.h));
        if (stadiumBeginn != this.aktJahr) {
            this.g.drawString(
                    Integer.toString(stadiumBeginn),
                    (int) position,
                    (int) (this.y + this.h + this.schriftgroesse));
        }
    }

    /**
     * Setzt die Groesse und Position der Legende.
     */
    private void setzeDiagramm() {
        this.x = (this.fensterBreite * 10) / 100;   // x-Position
        this.y = (this.fensterHoehe * 10) / 100;    // y-Position
        this.b = (this.fensterBreite * 80) / 100;   // Breite
        this.h = (this.fensterHoehe * 25) / 100;    // Hoehe

        // Reservierter Platz fuer die Beschriftung des Diagramms
        this.h -= this.schriftgroesse;
    }

    /**
     * Berechnet und setzt die Groessen der Stadien.
     */
    private void setzeStadien() {
        // Berechnung der Dauer
        double dauerUnreif = Math.round(this.lagerdauer / 8);
        double dauerOptimal = Math.round(this.lagerdauer / 2);
        double dauerSteigernd = Math.round(this.lagerdauer
                - (dauerOptimal + dauerUnreif));
        double dauerUeberlagert = 1;
        
        // Teilberechnung der Breite
        double breite = this.b / (this.lagerdauer + 1);
        
        // Stadien der Trinkreife
        Stadium unreif = 
                new Stadium("unreif", dauerUnreif, this.farben[0],
                        breite * dauerUnreif, this.h, this.y, 0);
        Stadium steigernd = 
                new Stadium("reifend", dauerSteigernd, this.farben[1],
                        breite * dauerSteigernd, this.h, this.y, 1);
        Stadium optimal = 
                new Stadium("optimal", dauerOptimal, this.farben[2],
                        breite * dauerOptimal, this.h, this.y, 2);
        Stadium ueberlagert = 
                new Stadium("überlagert", dauerUeberlagert, this.farben[3],
                        breite * dauerUeberlagert, this.h, this.y, 3);

        // Ablegen als globales Array
        this.stadien = new Stadium[4];
        this.stadien[0] = unreif;
        this.stadien[1] = steigernd;
        this.stadien[2] = optimal;
        this.stadien[3] = ueberlagert;
    }

    /**
     * Grafische Darstellung aller Stadien.
     */
    private void zeichneStadien() {
        
        // Setzt den Beginn des ersten Stadiums
        this.stadiumBeginn = (int) this.jahrgang;

        // Position des aktuellen Stadiums
        double aktPosition = this.x;
        for (Stadium aktStadium : this.stadien) {
            // Setze x-Position und Beginn des aktuellen Stadiums
            aktStadium.setzeX(aktPosition);
            aktStadium.setzeBeginn(stadiumBeginn);
            
            this.zeichneAktStadium(aktStadium, aktPosition);

            // Berechnet Startjahr des naechsten Stadiums
            stadiumBeginn += aktStadium.dauer;
            // Berechne neue Startposition
            aktPosition += aktStadium.breite;
        }
    }
    
    /**
     * Grafische Darstellung des aktuellen Jahr.
     */
    private void zeichneAktuellesJahr() {
        // Breite des Rahmens zum aktuellen Jahr
        double aktJahrBreite = this.b / (this.lagerdauer + 1);
        // Position des Rahmens zum aktuellen Jahr
        double aktJahrPosition = (this.aktJahr - this.jahrgang) * aktJahrBreite;

        if (this.aktJahr >= this.jahrgang && this.aktJahr < stadiumBeginn) {
            // Zeichne Rahmen des aktuellen Jahrs und setze Beschriftung
            this.g.setPaint(Color.red);
            this.g.draw(new Rectangle.Double(
                    this.x + aktJahrPosition,
                    this.y - 1,
                    aktJahrBreite,
                    this.h + 2));
            this.g.drawString(
                    Integer.toString(this.aktJahr),
                    (int) (this.x + aktJahrPosition),
                    (int) (this.y + this.h + this.schriftgroesse));

            // Zuruecksetzen der Farbe
            this.g.setPaint(Color.black);
        }
    }

}
