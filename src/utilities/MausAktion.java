package utilities;

import gui.ws1314.a02.Inhalt;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Implementiert Mausaktionen mit Einfluss auf das Zeichnen des Inhaltes eines
 * Fensters.
 *
 * @author Benjamin Schuermann <agribu>
 * @since 2013/10/25
 * @version 0.8
 */
public class MausAktion implements MouseListener {

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

    @Override
    public void mouseClicked(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }

}
