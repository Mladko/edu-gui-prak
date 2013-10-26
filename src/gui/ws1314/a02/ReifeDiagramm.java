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
     * Position und Groessen des Diagramms
     */
    public double x, y, b, h;    
    // Grafikobjekt
    private Graphics2D g;
    // Schriftgroesse
    private int schriftgroesse;
    // Groessen des Fensters
    private double fensterBreite, fensterHoehe;
    // Stadien der Trinkreife
    private double unreif, steigernd, optimal, ueberlagert;
    private double[] stadien;
    // Startjahr des aktuellen Stadiums
    private int stadiumBeginn;
    // Tastatureingaben zu den Eigenschaften eines Weines
    private double lagerdauer, jahrgang;
    // Aktuelle Jahr
    private int aktJahr;
    // Sammlung der Farben aller Stadien
    private final Object[] COLORS = {Color.gray,
        new GradientPaint(0, 0, Color.gray, 0, 0, Color.green),
        Color.green, Color.yellow};

    /**
     * Erzeugt ein neues Legendeobjekt.
     */
    public ReifeDiagramm() {
        //this.lagerdauer = 1;
        //this.jahrgang = 2011;
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
        this.unreif = Math.round(this.lagerdauer / 8);
        this.optimal = Math.round(this.lagerdauer / 2);
        this.steigernd = Math.round(this.lagerdauer
                - (this.optimal + this.unreif));
        this.ueberlagert = 1;

        this.stadien = new double[4];
        this.stadien[0] = this.unreif;
        this.stadien[1] = this.steigernd;
        this.stadien[2] = this.optimal;
        this.stadien[3] = this.ueberlagert;
    }

    /**
     * Grafische Darstellung aller Stadien.
     */
    private void zeichneStadien() {
        // Berechnung der Laengen aller Stadien
        this.setzeStadien();
        this.stadiumBeginn = (int) this.jahrgang;

        // Position des aktuellen Stadiums
        double aktPosition = this.x;

        for (int i = 0; i < this.stadien.length; i++) {
            // Berechnung der Breite
            double breite = this.b * this.stadien[i] / (this.lagerdauer + 1);

            // Setze Fuellfarbe
            if (this.COLORS[i] instanceof GradientPaint) {
                this.COLORS[i] = new GradientPaint(
                        (int) aktPosition, (int) this.y, Color.gray,
                        (int) (aktPosition + breite), (int) this.y, Color.green);
            }
            this.g.setPaint((Paint) this.COLORS[i]);
            this.g.fill(
                    new Rectangle.Double(aktPosition, this.y, breite, this.h));

            // Zuruecksetzen der Farbe
            this.g.setPaint(Color.black);

            // Zeichne Rahmen des aktuellen Stadiums und setze die Beschriftung
            this.g.draw(
                    new Rectangle.Double(aktPosition, this.y, breite, this.h));
            //System.out.println(stadiumBeginn);
            if(stadiumBeginn != this.aktJahr) {
                this.g.drawString(
                        Integer.toString(stadiumBeginn),
                        (int) aktPosition,
                        (int) (this.y + this.h + this.schriftgroesse));
            }

            // Berechnet Startjahr des naechsten Stadiums
            stadiumBeginn += this.stadien[i];

            // Berechne neue Startposition
            aktPosition += breite;
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

        if(this.aktJahr >= this.jahrgang && this.aktJahr < stadiumBeginn) {
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
