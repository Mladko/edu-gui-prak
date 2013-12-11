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
        FileReader fr = null;
        String category = "";
        String entry = "";
        String token;
        ArrayList<String> entries = new ArrayList<>();
        HashMap<String, ArrayList<String>> countries = new HashMap<>();
        try {
            fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            token = reader.readLine();
            while (token != null) {
                if (!token.equals("")) {
                    if (!token.contains("-")) {
                        if (!category.equals("")) {
                            Collections.sort(entries);
                            countries.put(category, entries);
                            entries = new ArrayList<>();
                        }

                        category = token;
                    } else {
                        StringTokenizer st = new StringTokenizer(token, "-");
                        entry = (st.hasMoreTokens()) ? st.nextToken() : "";
                        entries.add(entry);
                    }
                }
                token = reader.readLine();
            }
            Collections.sort(entries);
            countries.put(category, entries);
        } catch (IOException ex) {
            Logger.getLogger(DataSetManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return countries;
    }

}
