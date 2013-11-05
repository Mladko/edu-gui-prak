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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Calendar;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JSpinner;

/**
 * Erzeugt ein Balkendiagramm zur Darstellung der Trinkreife eines Weines.
 *
 * @author Benjamin Schuermann <agribu>
 * @since 2013/10/21
 * @version 1.0
 */
public class ReifeDiagramm extends JPanel {

    /**
     * Stadien der Trinkreife.
     */
    public Stadium[] stadien;
    /**
     * Tastatureingaben zu den Eigenschaften eines Weines
     */
    public double lagerdauer = 1.0;
    /**
     * Farbsetzung
     */
    public Object[] farben = {Color.gray,
        new GradientPaint(0, 0, Color.gray, 0, 0, Color.green),
        Color.green, Color.yellow};
    /**
     * Jahrgang des Weines
     */
    public double jahrgang;

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
    // JSpinner des Fensters
    private JSpinner jSpinner;

    /**
     * Erzeugt ein neues Legendeobjekt.
     */
    public ReifeDiagramm() {
        // Setze weisse Hintergrundfarbe
        this.setBackground(Color.white);
        // Diagramm soll fokussierbar sein
        this.setFocusable(true);

        // Fuege MausAktionen hinzu
        Object ma = new MausAktionDiagramm();
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

        KeyAdapter ka = new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyChar() == '+'
                        && ReifeDiagramm.this.lagerdauer < 25) {
                    ReifeDiagramm.this.lagerdauer += 1;
                    ReifeDiagramm.this.jSpinner.setValue((int) ReifeDiagramm.this.lagerdauer);
                    ReifeDiagramm.this.repaint();
                } else if (ke.getKeyChar() == '-'
                        && ReifeDiagramm.this.lagerdauer > 0) {
                    ReifeDiagramm.this.lagerdauer -= 1;
                    ReifeDiagramm.this.jSpinner.setValue((int) ReifeDiagramm.this.lagerdauer);
                    ReifeDiagramm.this.repaint();
                }
            }
        };

        this.addMouseListener((MouseListener) ma);
        this.addMouseMotionListener((MouseMotionListener) ma);
        this.addFocusListener(fl);
        this.addKeyListener(ka);
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
     * Setzt den aktuellen JSpinner
     *
     * @param jSpinner JSpinner des Fenster
     */
    public void setzeJSpinner(JSpinner jSpinner) {
        this.jSpinner = jSpinner;
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

        // Zeichne Diagramm
        this.erstelleDiagramm();
    }

    /**
     * Setzt die Groesse und Position der Legende.
     */
    private void setzeDiagramm() {
        this.x = (this.fensterBreite * 10) / 100;   // x-Position
        this.y = (this.fensterHoehe * 10) / 100;    // y-Position
        this.b = (this.fensterBreite * 80) / 100;   // Breite
        this.h = (this.fensterHoehe * 80) / 100;    // Hoehe

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
        Stadium unreif
                = new Stadium("unreif", dauerUnreif, this.farben[0],
                        breite * dauerUnreif, this.h, this.y, 0);
        Stadium steigernd
                = new Stadium("reifend", dauerSteigernd, this.farben[1],
                        breite * dauerSteigernd, this.h, this.y, 1);
        Stadium optimal
                = new Stadium("optimal", dauerOptimal, this.farben[2],
                        breite * dauerOptimal, this.h, this.y, 2);
        Stadium ueberlagert
                = new Stadium("überlagert", dauerUeberlagert, this.farben[3],
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
