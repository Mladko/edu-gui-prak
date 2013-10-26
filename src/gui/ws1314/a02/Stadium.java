package gui.ws1314.a02;

/**
 * Erzeugt ein Stadium der Trinkreife.
 * 
 * @author Benjamin Schuermann <agribu>
 * @since 2013/10/26 
 * @version 0.5
 */
public class Stadium extends ReifeDiagramm {

    /**
     * Name.
     */
    public String name;

    /**
     * Beginn.
     */
    public int beginn;

    /**
     * Gesamtdauer.
     */
    public double dauer;

    /**
     * Farbe.
     */
    public Object farbe;

    /**
     * Position auf der x-Achse.
     */
    public double xPos,

    /**
     * Position auf der y-Achse.
     */
    yPos,

    /**
     * Breite.
     */
    breite,

    /**
     * Hoehe.
     */
    hoehe;
    
    /**
     * Erzeugt und initialisiert ein neues Stadium Objekt.
     * 
     * @param name Name
     * @param dauer Dauer
     * @param farbe Farbe
     * @param breite Breite
     * @param hoehe Hoehe
     * @param yPos y-Position
     */
    public Stadium(String name, Double dauer, Object farbe, 
            double breite, double hoehe, double yPos) {
        this.name = name;
        this.dauer = dauer;
        this.farbe = farbe;
        this.breite = breite;
        this.hoehe = hoehe;
        this.yPos = yPos;
    }
  
    /**
     * Setzt den Beginn.
     * 
     * @param beginn Beginn
     */
    public void setzeBeginn(int beginn) {
        this.beginn = beginn;
    }
    
    /**
     * Setzt die x-Position.
     * 
     * @param x x-Position
     */
    public void setzeX(double x) {
        this.xPos = x;
    }
    
    /**
     * Setzt / aktualisiert die Farbe.
     * 
     * @param farbe Farbe
     */
    public void setzeFarbe(Object farbe) {
        this.farbe = farbe;
    }
    
    /**
     * Liefert die x-Position.
     * 
     * @return x-Position
     */
    public double lieferX() {
        return this.xPos;
    }
    
    /**
     * Liefert die y-Position.
     * 
     * @return y-Position
     */
    public double lieferY() {
        return this.yPos;
    }
    
    /**
     * Liefert das Objekt als lesbare Zeichenkette.
     * 
     * @return Objekt als lebare Zeichenkette
     */
    @Override
    public String toString() {
        String s = "\n"
                + "Typ: \t\t" + this.getClass() + "\n"
                + "Name: \t\t" + this.name + "\n"
                + "Beginn: \t" + this.beginn + "\n"
                + "Dauer: \t\t" + this.dauer + "\n"
                + "Farbe: \t\t" + this.farbe.toString() + "\n"
                + "x-Position: \t" + this.xPos + "\n"
                + "y-Position: \t" + this.yPos + "\n"
                + "Breite: \t" + this.breite + "\n"
                + "Höhe: \t\t" + this.hoehe + "\n";
        return s;
    }

}