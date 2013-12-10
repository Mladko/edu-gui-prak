/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.ws1314.a06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author agribu
 */
public class DataSetManager {

    public HashMap<String, ArrayList<String>> parseFile(String file) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        ArrayList<String> entries = new ArrayList<>();
        String categorie = "";
        String currentToken = "";
        String entry = "";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            currentToken = reader.readLine();

            while (currentToken != null) {
                if (!currentToken.equals("") && !currentToken.contains("-")) {
                    if (!categorie.equals("")) {
                        Collections.sort(entries);
                        hm.put(categorie, entries);
                    }
                    categorie = currentToken;
                } else {
                    StringTokenizer st = new StringTokenizer(currentToken, "-");
                    entry = (st.hasMoreTokens()) ? st.nextToken() : "";
                    entries.add(entry);
                }
                currentToken = reader.readLine();
            }

        } catch (IOException ex) {
            Logger.getLogger(DataSetManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return hm;

    }

}
