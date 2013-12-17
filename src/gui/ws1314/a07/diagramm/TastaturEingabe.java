package gui.ws1314.a07.diagramm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

/**
 * Stellt Methoden zur Verarbeitung der Benutzereingabe zur Verfuegung.
 *
 * @author Benjamin Schuermann <agribu>
 * @since 2013/10/10
 * @version 1.0
 */
public class TastaturEingabe {

    private final int AKTUELLES_JAHR = Calendar.getInstance().get(Calendar.YEAR);
    private final int MIN_JAHRGANG = AKTUELLES_JAHR - 25;
    private final int MAX_JAHRGANG = AKTUELLES_JAHR;
    private final int MIN_LAGERDAUER = 1;
    private final int MAX_LAGERDAUER = 25;

    private int jahrgang;
    private int lagerdauer;

    /**
     * Erzeugt ein neues TastaturEingabe Objekt.
     */
    public TastaturEingabe() {
    }

    /**
     * Liefert den Jahrgang.
     *
     * @return Jahrgang
     */
    public int jahrgang() {
        return this.jahrgang;
    }

    /**
     * Liefert die Lagerdauer.
     *
     * @return Lagerdauer
     */
    public int lagerdauer() {
        return this.lagerdauer;
    }

    /**
     * Prueft die Benutzereingabe und gibt Fehlermeldungen aus.
     *
     * @throws IOException Fehlerbehandlung zur Benutzereingabe
     */
    public void pruefeEingabe() throws IOException {
        String sJahrgang;
        String sLagerdauer;

        this.jahrgang = 0;
        this.lagerdauer = 0;

        InputStreamReader rdr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(rdr);

        do {
            System.out.printf("Jahrgang (%d - %d): ",
                    this.MIN_JAHRGANG, this.MAX_JAHRGANG);
            sJahrgang = reader.readLine();
            try {
                this.jahrgang = Integer.parseInt(sJahrgang);

                if (this.jahrgang == 325) {
                    this.jahrgang = 0;
                    System.out.printf("\nErrungschaft freigeschaltet: \n"
                            + "Sie haben soeben den ältesten, bekannten Wein"
                            + " der Welt gefunden. \n");
                }

                if (this.jahrgang > this.MAX_JAHRGANG
                        || this.jahrgang < this.MIN_JAHRGANG) {
                    this.jahrgang = 0;
                    System.out.println("\n\tFehler: Gültigkeitsbereich nicht "
                            + "eingehalten!\n");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("\n\tFehler: Falsches Format!\n");
            }
        } while (this.jahrgang == 0);

        do {
            System.out.printf("Lagerdauer (%d - %d): ",
                    this.MIN_LAGERDAUER, this.MAX_LAGERDAUER);
            sLagerdauer = reader.readLine();
            try {
                this.lagerdauer = Integer.parseInt(sLagerdauer);
                if (this.lagerdauer == 0) {
                    System.out.println("\nDas wäre dann Traubensaft...");
                }
                if (this.lagerdauer > this.MAX_LAGERDAUER
                        || this.lagerdauer < this.MIN_LAGERDAUER) {
                    this.lagerdauer = 0;
                    System.out.println("\n\tFehler: Gültigkeitsbereich nicht "
                            + "eingehalten!\n");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("\n\tFehler: Falsches Format!\n");
            }
        } while (this.lagerdauer == 0);
    }

}
