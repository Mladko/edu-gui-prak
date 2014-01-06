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
import javax.swing.text.JTextComponent;

/**
 *
 * @author agribu
 */
public class DatenImport {

    private HashMap<String, ArrayList<ArrayList<String>>> dataSet;
    private File file;
    private Fenster parentFenster;

    public DatenImport(File file, Fenster f) {
        this.file = file;
        this.parentFenster = f;
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
                    int numOfTokens = 0;

                    while (st.hasMoreTokens()) {

                        if (singleLine.isEmpty()) {
                            key = st.nextToken();

                            if (!dataSet.containsKey(key)) {
                                dataSet.put(key, new ArrayList<ArrayList<String>>());
                            }
                            singleLine.add(st.nextToken());
                        } else {
                            singleLine.add(st.nextToken());
                        }
                        
                        numOfTokens++;
                    }
                    if (this.pruefeDaten(key, numOfTokens, lineNo)) return;
                    dataSet.get(key).add(singleLine);
                }
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }

        this.printKunden(dataSet.get("Kunde"));
        this.printWeine(dataSet.get("Wein"));
    }
    
    private boolean pruefeDaten(String key, int numOTokens, int lineNo) {
        DatenCheck dc = new DatenCheck();
        Boolean isBroken = false;
        if(!(dc.checkNumOfTokens(key, numOTokens))) {
            JOptionPane.showMessageDialog(null, "Dateifehler: " + this.file.getAbsolutePath() + " Zeile: " + lineNo + "\n"
                    + "Ursache: Die Zeile umfasst nicht alle erwarteten Einträge!\n"
                    + "Das Einlesen der Datei wird nun abgebrochen.",
                    "Dateifehler!", JOptionPane.ERROR_MESSAGE);
            isBroken = true;
        }
        return isBroken;
    }

    private void printWeine(ArrayList<ArrayList<String>> hm) {
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
