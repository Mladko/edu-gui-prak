/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template outputFile, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import gui.ws1314.a08.Fenster;
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
        System.out.println("Die Daten wurden in " + outputFilePath + " gespeichert.\n");

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
}
