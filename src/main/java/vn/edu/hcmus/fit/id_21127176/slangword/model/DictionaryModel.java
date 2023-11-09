package vn.edu.hcmus.fit.id_21127176.slangword.model;

import java.io.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

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
                if (!data.isEmpty() && data.indexOf("`")!=-1){
                    String[] elements = data.split("`");
                    String[] definitions = elements[1].split("\\| ");
                    
                    HashSet<String> defSet = new HashSet<>();
                    Collections.addAll(defSet, definitions);

                    for (String definition : definitions) {
                        for (String word : definition.split(" ")) {
                            HashSet<String> predSet = prediction.get(word);
                            if (predSet==null) {
                                predSet = new HashSet<>();
                            }
                            predSet.add(elements[0]);
                            prediction.remove(word);
                            prediction.put(word.trim(), predSet);
                        }
                    }
                

                    definition.put(elements[0].trim(), defSet);
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
    
    public HashMap<String, HashSet<String>> getSearchBySlangResult(String key) {
        HashMap<String, HashSet<String>> res = new HashMap<>();
        res.put(key.trim(), definition.get(key));
        return res;
    }
    
    public HashMap<String, HashSet<String>> getSearchByDefResult(String sentence) {
        String[] wordArr = sentence.split(" ");

        HashSet<String> keySet = new HashSet<>();
        HashSet<String> slangSet = new HashSet<>();//(definition.keySet());
        HashSet<String> tempSet = new HashSet<>();
                       
        slangSet = prediction.get(wordArr[0]);
        for (String word : wordArr) {
            if (!word.equals(wordArr[0])) {
                keySet = prediction.get(word);

                tempSet = (HashSet)slangSet.clone();
                for (String slang : tempSet) {
                    if (!keySet.contains(slang)) {
                        slangSet.remove(slang);
                    }
                }
            }
        }
        
        HashMap<String, HashSet<String>> res = new HashMap<>();
        for (String key : slangSet) {
            res.put(key.trim(), definition.get(key));

            if (definition.get(key).size()>1) {
                HashSet<String> replaceSet = definition.get(key);
                tempSet = definition.get(key);

                for (String def : tempSet) {
                    for (String word : wordArr) {
                        if (!def.contains(word)) {
                            replaceSet.remove(def);
                            break;
                        }
                    }
                }

                res.remove(key);
                res.put(key.trim(), replaceSet);
            }
        }
       
        return res;
    }

    public boolean slangExisted(String key) {
        if (!definition.containsKey(key)) {
            return false;
        }
        return true;
    }
    
    public void addNewSlangDefinition(String key, String value) {
        definition.remove(key);
        HashSet<String> newSetDef = new HashSet<>();
        newSetDef.add(value);
        definition.put(key, newSetDef);
    }
    
    public void duplicateSlangDefinition(String key, String value) {
        HashSet<String> newSetDef = definition.get(key);
        definition.remove(key);
        newSetDef.add(value);
        definition.put(key, newSetDef);
    }
    
    public boolean deleteSlangDefinition(String key, String value) {
        if (!definition.containsKey(key)) {
            return false;
        }
        
        HashSet<String> newSetDef = definition.get(key);
         if (!newSetDef.contains(value)){
             return false;
         }
        
        definition.remove(key);
        newSetDef.remove(value);
        if (!newSetDef.isEmpty()) {
            definition.put(key, newSetDef);
        }
        return true;
    }
    
    public boolean editSlangDefinition(String srcKey, String dstKey, String srcValue, String destValue) {
        if (!deleteSlangDefinition(srcKey, srcValue)) {
            return false;
        }
        addNewSlangDefinition(dstKey, destValue);
        return true;
    }
    
    public List getTodaySlang() {
        LocalDate startDate = LocalDate.parse("2023-11-01");
        LocalDate curDate = LocalDate.now();
        
        int period = Period.between(startDate, curDate).getDays();
        if (period > definition.size()) {
            period = 0;
            startDate = curDate;
        }
        
        List<String> keyList = new ArrayList<>(definition.keySet());
        String slang = keyList.get(period);
        
        List<String> defList = new ArrayList<>(definition.get(slang));
        String def = defList.get(0);
        
        List<String> todaySlang = new ArrayList();
        todaySlang.add(slang);
        todaySlang.add(def);
        return todaySlang;
    }
}
