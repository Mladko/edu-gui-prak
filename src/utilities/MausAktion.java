package utilities;

import gui.ws1314.a02.Inhalt;
import gui.ws1314.a02.Stadium;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * Implementiert Mausaktionen mit Einfluss auf das Zeichnen des Inhaltes eines
 * Fensters.
 *
 * @author Benjamin Schuermann <agribu>
 * @since 2013/10/25
 * @version 0.8
 */
public class MausAktion implements MouseListener, MouseMotionListener {

    /**
     * Beeinflusst das Zeichnen der Legende der Vaterklasse Inhalt. Ist
     * Shift+Linke Maustaste gedrueckt, so soll die Legende gezeichnet werden.
     * Shift+Rechte Maustaste triggert das Ausblenden der Legende.
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
     * Beeinflusst das Zeichnen des Diagramms der Vaterklasse Inhalt. Wurde
     * die Maus ueber ein Trinkstadium positioniert, so wird die Farbe dessen
     * angepasst und farbig hervorgehoben. Zudem wird ein Text zu dem Stadium
     * ausgegeben.
     * 
     * @param me MouseEvent
     */
    @Override
    public void mouseMoved(MouseEvent me) {
        Inhalt i = (Inhalt) me.getSource();
        
        Object[] farbenArray = {Color.gray,
            new GradientPaint(0, 0, Color.gray, 0, 0, Color.green),
            Color.green, Color.yellow};

        // x-/y-Position der Maus
        int x = me.getX();
        int y = me.getY();
        
        // Ist die Maus innherhalb der x- und y-Bereiche eines Stadiums?
        boolean inStadiumX;
        boolean inStadiumY;
        
        boolean farbeGeandert = false;
        boolean textGesetzt = false;
        
        // Aktuelles Stadium
        Stadium s;
        
        for (int j = 0; j < i.diagramm.stadien.length; j++) {
            
            s = i.diagramm.stadien[j];
            
            inStadiumX = (x > s.xPos) && (x < (s.xPos + s.breite));
            inStadiumY = (y > s.yPos) && (y < (s.yPos + s.hoehe));
            
            if(inStadiumX && inStadiumY && !farbeGeandert && !textGesetzt) {
                i.diagramm.farben[j] = Color.orange;
                farbeGeandert = true;
                textGesetzt = true;
                i.repaint();
                
                System.out.printf("\n\t"
                        + "In den Jahren %d - %d ist der Wein %s.\n"
                        , s.beginn, s.beginn + (int) s.dauer, s.name);
            } else {
                i.diagramm.farben[j] = farbenArray[j];
                i.repaint();
            }
        }
    }

    /**
     * Nicht weiter implementiert.
     * 
     * @param me MouseEvent
     */
    @Override
    public void mouseDragged(MouseEvent me) {
    }
    
    /**
     * Nicht weiter implementiert.
     * 
     * @param me MouseEvent
     */
    @Override
    public void mouseClicked(MouseEvent me) {
    }

    /**
     * Nicht weiter implementiert.
     * 
     * @param me MouseEvent
     */
    @Override
    public void mouseReleased(MouseEvent me) {
    }

    /**
     * Nicht weiter implementiert.
     * 
     * @param me MouseEvent
     */
    @Override
    public void mouseEntered(MouseEvent me) {
    }

    /**
     * Nicht weiter implementiert.
     * 
     * @param me MouseEvent
     */
    @Override
    public void mouseExited(MouseEvent me) {
    }

}
