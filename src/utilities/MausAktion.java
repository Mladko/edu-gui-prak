package utilities;

import gui.ws1314.a02.Inhalt;
import gui.ws1314.a02.Stadium;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author agribu
 */
public class MausAktion implements MouseListener, MouseMotionListener {

    // Originalfarben zur Trinkreife
    private final Object[] FARBEN = {Color.gray,
        new GradientPaint(0, 0, Color.gray, 0, 0, Color.green),
        Color.green, Color.yellow};

    /**
     * Erzeugt ein Objekt zum Verarbeiten von Mausaktionen.
     */
    public MausAktion() {
    }

    /**
     * Blendet die Legende ein/aus, sobald SHIFT+L/R Mouse gedrueckt wurden.
     *
     * @param me MouseEvent
     */
    @Override
    public void mousePressed(MouseEvent me) {
        Inhalt i = (Inhalt) me.getSource();

        if (me.isShiftDown() && me.getButton() == 1) {
            // Shift + Linke Maustaste
            i.zeichneLegende = true;
        } else if (me.isShiftDown() && me.getButton() == 3) {
            // Shift + Rechte Maustaste
            i.zeichneLegende = false;
        }

        i.repaint();
    }

    /**
     * Stellt einen Hover-Effekt dar, sobald die Maus ueber einem Stadium liegt.
     *
     * @param me MouseEvent
     */
    @Override
    public void mouseMoved(MouseEvent me) {
        Inhalt inhalt = (Inhalt) me.getSource();

        // x-/y-Position der Maus
        int x = me.getX();
        int y = me.getY();

        // Ist die Maus innherhalb der x- und y-Bereiche eines Stadiums?
        boolean inStadiumX;
        boolean inStadiumY;

        boolean farbeGeandert = false;

        // Aktuelles Stadium
        Stadium s;

        // Sind noch keine Stadien gesetzt, Abbruch.
        if (inhalt.diagramm.stadien == null) {
            return;
        }

        // Iteration ueber alle Stadien
        for (int i = 0; i < inhalt.diagramm.stadien.length; i++) {

            s = inhalt.diagramm.stadien[i];

            inStadiumX = (x > s.xPos) && (x < (s.xPos + s.breite));
            inStadiumY = (y > s.yPos) && (y < (s.yPos + s.hoehe));

            // Innerhalb eines Stadiums, Farbe noch unveraendert
            if (inStadiumX && inStadiumY && !farbeGeandert) {
                inhalt.diagramm.farben[i] = Color.orange;
                farbeGeandert = true;
                inhalt.repaint();
            } else { // Ausserhalb eines Stadiums, Farbe wurde geaendert
                inhalt.diagramm.farben[i] = this.FARBEN[i];
                inhalt.repaint();
            }
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
        Inhalt inhalt = (Inhalt) me.getSource();

        // x-/y-Position der Maus
        int x = me.getX();
        int y = me.getY();

        // Ist die Maus innherhalb der x- und y-Bereiche eines Stadiums?
        boolean inStadiumX;
        boolean inStadiumY;

        // Aktuelles Stadium
        Stadium s;

        // Sind noch keine Stadien gesetzt, Abbruch.
        if (inhalt.diagramm.stadien == null) {
            return;
        }

        // Iteration ueber alle Stadien
        for (Stadium stadien : inhalt.diagramm.stadien) {
            s = stadien;

            inStadiumX = (x > s.xPos) && (x < (s.xPos + s.breite));
            inStadiumY = (y > s.yPos) && (y < (s.yPos + s.hoehe));

            if (inStadiumX && inStadiumY) {
                System.out.printf("\n\t"
                        + "In den Jahren %d - %d ist der Wein %s.\n",
                        s.beginn, s.beginn + (int) s.dauer, s.name);
            }
        }
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
