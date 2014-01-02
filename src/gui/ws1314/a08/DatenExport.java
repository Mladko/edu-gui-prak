/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template outputFile, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.ws1314.a08;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author agribu
 */
public class DatenExport {

    private HashMap<String, ArrayList<ArrayList<String>>> dataSet;
    private File outputFile;
    private Fenster parentWindow;

    public DatenExport(HashMap<String, ArrayList<ArrayList<String>>> hm, File of, Fenster f) {
        this.dataSet = hm;
        this.outputFile = of;
        this.parentWindow = f;
    }

    private ArrayList<String> formattedText(HashMap<String, ArrayList<ArrayList<String>>> hm) {
        ArrayList<String> formattedData = new ArrayList<>();
        ArrayList<ArrayList<String>> alWeine = hm.get("Weine");
        ArrayList<ArrayList<String>> alKunden = hm.get("Kunden");

        for (ArrayList<String> kunde : alKunden) {
            StringBuilder data = new StringBuilder();
            data.append("Kunde;");
            for (int i = 0; i <= 12; i++) {
                data.append(kunde.get(i)).append(";");
            }
            data.append("\n");
            formattedData.add(data.toString());
        }

        for (ArrayList<String> wein : alWeine) {
            StringBuilder data = new StringBuilder();
            data.append("Wein;");
            for (int i = 0; i <= 13; i++) {
                data.append(wein.get(i)).append(";");
            }
            data.append("\n");
            formattedData.add(data.toString());
        }

        return formattedData;
    }

    public void saveToFile() {
        String outputFilePath = outputFile.getAbsolutePath();
        String outputFileName = outputFile.getName();
        System.out.println("Die Daten werden in " + outputFilePath + " gespeichert.\nDie Datei hat den Namen " + outputFileName);

        try {
            //Datei anlegen
            FileWriter writer = new FileWriter(outputFile);
            //Daten schreiben
            ArrayList<String> alFormData = this.formattedText(dataSet);
            for (String s : alFormData) {
                writer.write(s);
            }
            writer.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(
                    this.parentWindow,
                    "Fehler beim Lesen der Datei:\n"
                    + ex.getMessage(),
                    "Fehler beim Schreiben der Datei",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void testInput() {
        this.dataSet = new HashMap<>();

        ArrayList<String> wein = new ArrayList<>();
        wein.add("123456789");
        wein.add("2014");
        wein.add("Jean Luc Wein");
        wein.add("Rot");
        wein.add("Albenbas ");
        wein.add("Blub");
        wein.add("");
        wein.add("Frankreich");
        wein.add("Bordeaux");
        wein.add("10,5%");
        wein.add("2039");
        wein.add("0,75 l");
        wein.add("3,75");
        wein.add("5,00");

        ArrayList<String> kunde = new ArrayList<>();
        kunde.add("1234567890");
        kunde.add("Herr");
        kunde.add("Frank");
        kunde.add("Luec");
        kunde.add("Sommerstr");
        kunde.add("3");
        kunde.add("12345");
        kunde.add("Buxdehude");
        kunde.add("12345678909876");
        kunde.add("Frank Luec");
        kunde.add("12345");
        kunde.add("9876");
        kunde.add("Postbank");

        this.dataSet.put("Weine", new ArrayList<ArrayList<String>>());
        this.dataSet.get("Weine").add(wein);
        this.dataSet.get("Weine").add(wein);

        this.dataSet.put("Kunden", new ArrayList<ArrayList<String>>());
        this.dataSet.get("Kunden").add(kunde);
        this.dataSet.get("Kunden").add(kunde);

        this.verboseOutput(this.dataSet);
        System.out.println(this.formattedText(this.dataSet));
    }

    private void printWeine(HashMap<String, ArrayList<ArrayList<String>>> hm) {
        System.out.println("#########");
        System.out.println("# Weine #");
        System.out.println("#########" + "\n");

        ArrayList<ArrayList<String>> alWeine = hm.get("Weine");

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

    private void printKunden(HashMap<String, ArrayList<ArrayList<String>>> hm) {
        System.out.println("##########");
        System.out.println("# Kunden #");
        System.out.println("##########" + "\n");

        ArrayList<ArrayList<String>> alKunden = hm.get("Kunden");

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

    private void verboseOutput(HashMap<String, ArrayList<ArrayList<String>>> hm) {
        this.printKunden(hm);
        this.printWeine(hm);
    }
}
