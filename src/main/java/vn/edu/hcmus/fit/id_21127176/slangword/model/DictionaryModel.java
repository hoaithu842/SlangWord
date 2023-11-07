package vn.edu.hcmus.fit.id_21127176.slangword.model;

import java.io.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class DictionaryModel {
    private HashMap<String, HashSet<String>> definition;
    private HashMap<String, HashSet<String>> prediction;
    private HashSet<String> history;

    /*
     *   first-time accessing app
     * */
    private void loadDictionary() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("slang.bin"));
            DictionaryModel temp = (DictionaryModel) ois.readObject();
            this.definition = temp.getDefinition();
            this.prediction = temp.getPrediction();
            this.history = temp.getHistory();
        } catch (ClassNotFoundException | IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    /*
     *   prepare data for the first time get access to app
     * */
    private void importDictionary() {
        try (Scanner input = new Scanner(new File("slang.txt"))) {
            while(input.hasNextLine()) {
                String data = input.nextLine();
                if (!data.isEmpty()){
                    String[] elements = data.split("`");
                    String[] keys = elements[1].split("\\|");

                    HashSet<String> setDef = new HashSet<>();
                    Collections.addAll(setDef, keys);

//                    for (String element : keys) {
//                        prediction.
//                        prediction.
//                        prediction.put(element, elements[0]);
//                    }

                    definition.put(elements[0], setDef);
                }

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public DictionaryModel() {
        definition = new HashMap<>();
        prediction = new HashMap<>();
        history = new HashSet<>();

        File f = new File("slang.bin");

        if (f.exists()){
            loadDictionary();
        } else {
            importDictionary();
        }
    }

    public HashMap<String, HashSet<String>> getDefinition() {
        return definition;
    }

    public void setDefinition(HashMap<String, HashSet<String>> definition) {
        this.definition = definition;
    }

    public HashMap<String, HashSet<String>> getPrediction() {
        return prediction;
    }

    public void setPrediction(HashMap<String, HashSet<String>> prediction) {
        this.prediction = prediction;
    }

    public HashSet<String> getHistory() {
        return history;
    }

    public void setHistory(HashSet<String> history) {
        this.history = history;
    }
}
