/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import gui.ws1314.a08.Fenster;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author agribu
 */
public class DatenImport {

    private final HashMap<String, ArrayList<ArrayList<String>>> dataSet;
    private final File file;
    private Fenster parentFenster;
    private final DatenCheck dc;

    public DatenImport(File file, Fenster f) {
        this.file = file;
        this.parentFenster = f;
        this.dc = new DatenCheck(this.parentFenster);
        dataSet = new HashMap<>();
        this.importData();
    }

    public void importData() {
        ArrayList<String> singleLine;
        ArrayList<ArrayList<String>> al = new ArrayList<>();

        try {
            FileInputStream fstream = new FileInputStream(this.file);

            try (DataInputStream in = new DataInputStream(fstream)) {

                BufferedReader br = new BufferedReader(new InputStreamReader(in));
                String strLine;
                String key = "";
                int lineNo = 0;

                while ((strLine = br.readLine()) != null) {
                    lineNo++;
                    singleLine = new ArrayList<>();
                    String s = strLine;
                    StringTokenizer st = new StringTokenizer(s, ";");
                    int numOfTokens = 1;
                    String currentToken = "";
                    
//                    // Entferne trailing whitespace der Rebsorten, welches für die textuelle Ausgabe beim Speichern notwendig war
//                    s = s.replaceAll(" ;", ";");
                    
                    // Prüfe auf fehlende bzw. unvollständige Einträge
                    if (s.contains(";;")) {
                        printErrMsg(lineNo, -1, "", "Die Zeile umfasst nicht alle erwarteten Einträge!");
                        return;
                    }

                    while (st.hasMoreTokens()) {
                        // Setze Identifier
                        if (singleLine.isEmpty()) {
                            key = st.nextToken();
                            currentToken = key;
                            if (!dataSet.containsKey(key)) {
                                dataSet.put(key, new ArrayList<ArrayList<String>>());
                            }
                        }
                        
                        // Prüfe den jeweilgen Eintrag (Token)
                        if (this.dc.checkFormat(numOfTokens, key, currentToken) != -1) {
                            printErrMsg(lineNo, numOfTokens, "Eintrag: \"" + currentToken + "\"", "Der oben aufgeführte Eintrag erfüllt nicht das erwartete Format");
                            return;
                        }
                        
                        currentToken = st.nextToken();
                        singleLine.add(currentToken);
                        
                        numOfTokens++;
                    }

                    dataSet.get(key).add(singleLine);
                }
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }

        this.printKunden(dataSet.get("Kunde"));
        this.printWeine(dataSet.get("Wein"));
    }
    
    private void printErrMsg(int lineNo, int tokenNo, String token, String errMsg) {
        JOptionPane.showMessageDialog(null, "Dateifehler!\n\n"
                + "Datei: " + this.file.getAbsolutePath() + "\n"
                + "Zeile: " + lineNo + "\n"
                + ((tokenNo != -1) ? "Eintrag Nr: " + tokenNo + "\n" : "") 
                +  token + "\n"
                + "Ursache: " + errMsg + "\n\n"
                + "Das Einlesen der Datei wird nun abgebrochen.",
                "Dateifehler!", JOptionPane.ERROR_MESSAGE);
    }

    private void printWeine(ArrayList<ArrayList<String>> hm) {
        if (hm == null) return;
        
        System.out.println("%%%%%%%%%");
        System.out.println("% Weine %");
        System.out.println("%%%%%%%%%" + "\n");
        
        ArrayList<ArrayList<String>> alWeine = hm;

        for (ArrayList<String> wein : alWeine) {
            System.out.println(""
                    + "Bestellnummer" + ":\t" + wein.get(0) + "\n\n"
                    + "\t" + "Jahrgang" + ":\t" + wein.get(1) + "\n"
                    + "\t" + "Name" + ":\t\t" + wein.get(2) + "\n"
                    + "\t" + "Farbe" + ":\t\t" + wein.get(3) + "\n"
                    + "\t" + "Rebsorte" + ":\t" + wein.get(4) + wein.get(5) + wein.get(6) + "\n"
                    + "\t" + "Anbaugebiet" + ":\t" + wein.get(7) + " - " + wein.get(8) + "\n"
                    + "\t" + "Alkoholgehalt" + ":\t" + wein.get(9) + "\n"
                    + "\t" + "Lagerfähigkeit" + ":\t" + wein.get(10) + "\n"
                    + "\t" + "Flaschengröße" + ":\t" + wein.get(11) + "\n"
                    + "\t" + "Flaschenpreis" + ":\t" + wein.get(12) + " €" + "\n"
                    + "\t" + "Preis pro l" + ":\t" + wein.get(13) + " €" + "\n"
                    + "\t" + "-----------------------------------" + "\n");
        }
    }

    private void printKunden(ArrayList<ArrayList<String>> hm) {
        if (hm == null) return;
        
        System.out.println("%%%%%%%%%%");
        System.out.println("% Kunden %");
        System.out.println("%%%%%%%%%%" + "\n");

        ArrayList<ArrayList<String>> alKunden = hm;

        for (ArrayList<String> kunde : alKunden) {
            System.out.println(""
                    + "Kundennummer" + ":\t" + kunde.get(0) + "\n\n"
                    + "\t" + "Anrede" + ":\t\t" + kunde.get(1) + "\n"
                    + "\t" + "Vorname" + ":\t" + kunde.get(2) + "\n"
                    + "\t" + "Nachname" + ":\t" + kunde.get(3) + "\n"
                    + "\t" + "Straße" + ":\t\t" + kunde.get(4) + "\n"
                    + "\t" + "Hausnummer" + ":\t" + kunde.get(5) + "\n"
                    + "\t" + "Postleitzahl" + ":\t" + kunde.get(6) + "\n"
                    + "\t" + "Ort" + ":\t\t" + kunde.get(7) + "\n"
                    + "\t" + "Telefonnummer" + ":\t" + kunde.get(8) + "\n"
                    + "\t" + "Kontoinhaber" + ":\t" + kunde.get(9) + "\n"
                    + "\t" + "Kontonummer" + ":\t" + kunde.get(10) + "\n"
                    + "\t" + "Bankleitzahl" + ":\t" + kunde.get(11) + "\n"
                    + "\t" + "Kreditinstitut" + ":\t" + kunde.get(12) + "\n"
                    + "\t" + "-----------------------------------" + "\n");
        }
    }
    
    public void setFenster(Fenster f) {
        this.parentFenster = f;
    }

}
