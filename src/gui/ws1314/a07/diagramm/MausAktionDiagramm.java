package gui.ws1314.a07.diagramm;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * Mausaktionen zum Veraendern des Fensterdes.
 * 
 * @author Benjamin Schuermann <agribu>
 * @since 2013/10/29
 * @version 1.0
 */
public class MausAktionDiagramm implements MouseListener, MouseMotionListener {

    // Elemente der Trinkreife
    private enum Elemente {
        unreif,
        steigernd,
        optimal,
        ueberlagert,
        ausserhalb
    }
    
    Elemente istInStadium;

    /**
     * Erzeugt ein Objekt zum Verarbeiten von Mausaktionen.
     */
    public MausAktionDiagramm() {
    }

    /**
     * Stellt einen Hover-Effekt dar, sobald die Maus ueber einem Stadium liegt.
     *
     * @param me MouseEvent
     */
    @Override
    public void mouseMoved(MouseEvent me) {
        ReifeDiagramm d = (ReifeDiagramm) me.getSource();

        // x-/y-Position der Maus
        int x = me.getX();
        int y = me.getY();

        Elemente altesStadium = istInStadium; 
        istInStadium = Elemente.ausserhalb;
        
        // Zuruecksetzen der Farben
        d.farben[0] = Color.gray;
        d.farben[1] = new GradientPaint(0, 0, Color.gray, 0, 0, Color.green);
        d.farben[2] = Color.green;
        d.farben[3] = Color.yellow;

        // Aktuelles Stadium
        Stadium[] stadium = d.stadien;

        // Sind noch keine Stadien gesetzt, Abbruch.
        if (d.stadien == null) {
            return;
        }

        // Innerhalb eines Stadiums
        if (stadium[0].istDrin(x, y)) {
            d.farben[0] = 
                    ((Color) d.farben[0]).darker();
            istInStadium = Elemente.unreif;
        } else if (stadium[1].istDrin(x, y)) {
            d.farben[1] = new GradientPaint(
                    0, 0, Color.gray.darker(), 0, 0, Color.green.darker());
            istInStadium = Elemente.steigernd;
        } else if (stadium[2].istDrin(x, y)) {
            d.farben[2] = 
                    ((Color) d.farben[2]).darker();
            istInStadium = Elemente.optimal;
        } else if (stadium[3].istDrin(x, y)) {
            d.farben[3] = 
                    ((Color) d.farben[3]).darker();
            istInStadium = Elemente.ueberlagert;
        }
        
        // Bei Aenderung wird neugezeichnet
        if (altesStadium != istInStadium) {
            d.repaint();
        }

    }

    /**
     * Gibt einen Text aus, der bei einem Mausklick in einem Reifestadium die
     * entsprechenden Eigenschaften liefert.
     *
     * @param me MouseEvent
     */
    @Override
    public void mouseClicked(MouseEvent me) {
        ReifeDiagramm d = (ReifeDiagramm) me.getSource();
        Stadium stadium;

        switch (istInStadium) {
            case unreif:
                stadium = d.stadien[0];
                System.out.printf("\n\tIn den Jahren %d – %d ist es für den "
                        + "Wein noch zu früh.\n", 
                        stadium.beginn, 
                        stadium.beginn + ((int) stadium.dauer) - 1);
                break;
            case steigernd:
                stadium = d.stadien[1];
                System.out.printf("\n\tIn den Jahren %d – %d steigert sich der "
                        + "Geschmack des Weins noch.\n", 
                        stadium.beginn, 
                        stadium.beginn + ((int) stadium.dauer) - 1);
                break;
            case optimal:
                stadium = d.stadien[2];
                System.out.printf("\n\tIn den Jahren %d – %d hat der Wein sein "
                        + "geschmackliches Optimum.\n", 
                        stadium.beginn, 
                        stadium.beginn + ((int) stadium.dauer) - 1);
                break;
            case ueberlagert:
                stadium = d.stadien[3];
                System.out.printf("\n\tAb dem Jahre %d ist der Wein überlagert."
                        + "\n", stadium.beginn);
                break;
        }
        
        d.requestFocusInWindow();

    }

    /**
     * Nicht implementiert.
     *
     * @param me MouseEvent
     */
    @Override
    public void mousePressed(MouseEvent me) {
    }
    
    /**
     * Nicht implementiert.
     *
     * @param me MouseEvent
     */
    @Override
    public void mouseDragged(MouseEvent me) {
    }

    /**
     * Nicht implementiert.
     *
     * @param me MouseEvent
     */
    @Override
    public void mouseReleased(MouseEvent me) {
    }

    /**
     * Nicht implementiert.
     *
     * @param me MouseEvent
     */
    @Override
    public void mouseEntered(MouseEvent me) {
    }

    /**
     * Nicht implementiert.
     *
     * @param me MouseEvent
     */
    @Override
    public void mouseExited(MouseEvent me) {
    }

}
