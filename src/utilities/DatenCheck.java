/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import gui.ws1314.a08.Fenster;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

/**
 *
 * @author agribu
 */
public class DatenCheck {

    private HashMap<String, Integer> identifier;
    private HashMap<Integer, String> kundenFormat;
    private HashMap<Integer, String> weinFormat;
    private HashMap hmRebsorten;
    private HashMap hmLocations;
    private ArrayList<String> alCountries;
    private ArrayList<ArrayList<String>> alRegions;
    private String[] alkoholGehalt;
    private String[] flaschenGr;
    private final Fenster parentFenster;
    private final int preFormat;

    public DatenCheck(Fenster f) {
        this.parentFenster = f;
        this.preFormat = Integer.parseInt(new SimpleDateFormat("yyyyMM").format(Calendar.getInstance().getTime()));
        this.setDefaults();
        this.setIdentifier();
        this.setKundenFormat();
        this.setWeinFormat();
    }

    private void setDefaults() {
        this.hmRebsorten = this.parentFenster.pWeinAufnehmen.parseDataSet("src/utilities/datasets/reb.txt");
        this.hmLocations = this.parentFenster.pWeinAufnehmen.parseDataSet("src/utilities/datasets/loc.txt");
        this.alCountries = new ArrayList<>(this.hmLocations.keySet());
        this.alRegions = new ArrayList<>(this.hmLocations.values());
        this.alkoholGehalt = new String[]{"0%", "7%", "7.5%", "8%", "8.5%", "9%", "9.5%", "10%", "10.5%", "11%", "11.5%", "12%", "12.5%", "13%"};
        this.flaschenGr = new String[]{"0,187 l", "0,25 l", "0,375 l", "0,5 l", "0,62 l", "0,7 l", "0,75 l", "0,8 l", "1 l", "1,5 l"};
    }

    private void setIdentifier() {
        this.identifier = new HashMap<>();
        this.identifier.put("Wein", 15);
        this.identifier.put("Kunde", 14);
    }

    private void setKundenFormat() {
        this.kundenFormat = new HashMap<>();
        this.kundenFormat.put(1, "Kunde");                      // Identifier
        this.kundenFormat.put(2, this.preFormat + "[0-9]{4}K"); // Kundennummer
        this.kundenFormat.put(3, "Herr|Frau");                  // Anrede
        this.kundenFormat.put(4, "(?U)[\\p{Alpha}-'.\\s]+");    // Vorname
        this.kundenFormat.put(5, "(?U)[\\p{Alpha}-'.\\s]+");    // Nachname
        this.kundenFormat.put(6, "(?U)[\\p{Alpha}-'.\\s]+");    // Strasse
        this.kundenFormat.put(7, "([1-9])\\d{0,2}([a-z]?)");    // Hausnummer
        this.kundenFormat.put(8, "\\d{5}");                     // Postleitzahl
        this.kundenFormat.put(9, "(?U)[\\p{Alpha}-'.\\s]+");    // Ort
        this.kundenFormat.put(10, "\\d{11,15}");                // Telefonnummer
        this.kundenFormat.put(11, "(?U)[\\p{Alpha}-'.\\s]+");   // Kontoinhaber
        this.kundenFormat.put(12, "\\d{9,10}");                 // Kontonummer
        this.kundenFormat.put(13, "\\d{8}");                    // Bankleitzahl
        this.kundenFormat.put(14, "(?U)[\\p{Alpha}-'.\\s]+");   // Kreditinstitut
    }

    private void setWeinFormat() {
        this.weinFormat = new HashMap<>();
        this.weinFormat.put(1, "Wein"); // Identifier
        this.weinFormat.put(2, this.preFormat + "[0-9]{4}W");   // Bestellnummer
        this.weinFormat.put(3, "((1989)|(199\\d{1}))|((200\\d{1})|(201[0-4]))"); // Jahrgang
        this.weinFormat.put(4, "(?U)[\\p{Alpha}-'.\\s]+");      // Name
        this.weinFormat.put(5, "Rot|Rose|Weiß");                // Farbe
        // 6 - Rebsorte
        // 7 - Rebsorte
        // 8 - Rebsorte
        // 9 - Anbaugebiet - Land
        // 10 - Anbaugebiet - Region
        // 11 - Alkoholgehalt
        this.weinFormat.put(12, "(201[4-9])|(202\\d{1})|(203[0-9])"); // Lagerfähigkeit
        // 13 - Flaschengröße
        this.weinFormat.put(14, "^\\d+(,)?\\d{0,2}$"); // Flaschenpreis
        this.weinFormat.put(15, "^\\d+(,)?\\d{0,2}$"); // Literpreis
    }

    public boolean checkNumOfTokens(String s, int num) {
        return (this.identifier.containsKey(s) && this.identifier.get(s) == num);
    }

    public int checkFormat(int pos, String key, String token) {
        int errCode = -1;

        if (key.equals("Wein")) {
            // Siehe setWeinFormat() für die logischen Zusammenhänge zu den jeweiligen Prüfungen.
            if (this.weinFormat.get(pos) != null && !token.matches(this.weinFormat.get(pos))) {
                // REGEX
                errCode = pos;
            } else if (pos == 6 || pos == 7 || pos == 8) {
                // REBSORTEN
                if (!(((ArrayList<String>) this.hmRebsorten.get("Rot")).contains(token.trim())
                        || ((ArrayList<String>) this.hmRebsorten.get("Weiß")).contains(token.trim())
                        || ((ArrayList<String>) this.hmRebsorten.get("Rose")).contains(token.trim())
                        || token.equals(" "))) {
                    errCode = pos;
                }
            } else if (pos == 9 && !this.alCountries.contains(token)) {
                // LÄNDER
                errCode = pos;
            } else if (pos == 10) {
                // REGIONEN
                for (int i = 0; i < this.alRegions.size(); i++) {
                    ArrayList<String> al = this.alRegions.get(i);
                    if (al.contains(token)) {
                        return -1;
                    }
                    errCode = pos;
                }
            } else if (pos == 11) {
                // ALKOHOLGEHALT
                Boolean included = false;
                for (String alk : this.alkoholGehalt) {
                    included = alk.equals(token);
                    if (included) {
                        break;
                    }
                }
                errCode = (included) ? -1 : pos;
            } else if (pos == 13) {
                // FLASCHENGRÖßE
                Boolean included = false;
                for (String alk : this.flaschenGr) {
                    included = alk.equals(token);
                    if (included) {
                        break;
                    }
                }
                errCode = (included) ? -1 : pos;
            }
        } else if (key.equals("Kunde")) {
            // REGEX
            if (!token.matches(this.kundenFormat.get(pos))) {
                errCode = pos;
            }
        }
        return errCode;
    }
}
