/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utilities;

import java.util.HashMap;

/**
 *
 * @author agribu
 */
public class DatenCheck {
    private HashMap<String, Integer> identifier;
    private HashMap<Integer, String> kundenFormat;
    
    public DatenCheck() {
        this.setIdentifier();
        
    }
    
    private void setIdentifier() {
        this.identifier = new HashMap<>();
        this.identifier.put("Wein", 14);
        this.identifier.put("Kunde", 13);
    }
    
    private void setKundenFormat() {
        this.kundenFormat = new HashMap<>();
        this.kundenFormat.put(1, "Kunde"); // Identifier
        this.kundenFormat.put(2, "Herr|Frau"); // Anrede
        this.kundenFormat.put(3, "(?U)[\\p{Alpha}-'.\\s]+"); // Vorname
        this.kundenFormat.put(4, "(?U)[\\p{Alpha}-'.\\s]+"); // Nachname
        this.kundenFormat.put(5, "(?U)[\\p{Alpha}-'.\\s]+"); // Strasse
        this.kundenFormat.put(6, "([1-9])\\d{0,2}([a-z]?)"); // Hausnummer
        this.kundenFormat.put(7, "\\d{5}"); // Postleitzahl
        this.kundenFormat.put(8, "(?U)[\\p{Alpha}-'.\\s]+"); // Ort
        this.kundenFormat.put(9, "\\d{11,15}"); // Telefonnummer
        this.kundenFormat.put(10, "(?U)[\\p{Alpha}-'.\\s]+"); // Kontoinhaber
        this.kundenFormat.put(11, "\\d{9,10}"); // Kontonummer
        this.kundenFormat.put(12, "\\d{8}"); // Bankleitzahl
        this.kundenFormat.put(13, ""); // Kreditinstitut
    }
    
    public boolean checkNumOfTokens(String s, int num) {
        return (this.identifier.containsKey(s) && this.identifier.get(s) == num);
    }
    
    public int checkRegex(int pos) {
        
        return pos;
    }
}
