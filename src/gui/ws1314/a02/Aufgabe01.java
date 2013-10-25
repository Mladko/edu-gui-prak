package gui.ws1314.a02;

import java.io.IOException;

/**
 * Aufrufende Klasse, zum Testen der für Aufgabe 1 benoetigten Klassen.
 *
 * @author Benjamin Schuermann <agribu>
 * @since 2013/10/21
 * @version 1.0
 */
public class Aufgabe01 {

    /**
     * Testet die Klassen des Pakets.
     * 
     * @param args Parameter der Anwendung
     * @throws IOException Behandlung der Ausnahmen zur Eingabeverarbeitung
     */
    public static void main(String[] args) throws IOException {
        Fenster f = new Fenster("GUI-Aufgabe01", 20, 20, 600, 400);
        f.setVisible(true);
        f.zeichneInhalt(new Inhalt());
    }

}