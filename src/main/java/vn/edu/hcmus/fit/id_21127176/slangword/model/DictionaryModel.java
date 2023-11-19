package vn.edu.hcmus.fit.id_21127176.slangword.model;

import java.io.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hoaithu842
 */
public class DictionaryModel implements java.io.Serializable{
    private HashMap<String, HashSet<String>> definition;
    private HashMap<String, HashSet<String>> prediction;
    private List<String> history;
    
    public DictionaryModel() {
        definition = new HashMap<>();
        prediction = new HashMap<>();
        history = new ArrayList<>();
        importDictionary();
    }
    // File & Store
    private void importDictionary() {
        try (Scanner input = new Scanner(new File("slang.txt"))) {
            while(input.hasNextLine()) {
                String data = input.nextLine();
                if (!data.isEmpty() && data.contains("`")){
                    String[] elements = data.split("`");
                    String[] definitions = elements[1].split("\\| ");
                    
                    HashSet<String> defSet = new HashSet<>();
                    Collections.addAll(defSet, definitions);

                    for (String value : definitions) {
                        for (String word : value.split(" ")) {
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

    public void saveDictionary() {
        try {
            try (FileOutputStream fos = new FileOutputStream("slang.dat"); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(this);
            }
        } catch (IOException e) {
        }
    }
    
    public void storeHistory(String key) {
        if (history.contains(key)) {
            history.remove(key);
        }
        history.add(0, key);
    }
    
    public boolean restoreDictionary() {
        File data_file = new File("slang.dat");
        return data_file.delete();
    }

    //  Getters & Setters
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

    public List<String> getHistory() {
        return history;
    }

    public void setHistory(List<String> history) {
        this.history = history;
    }
    
    //Check Existence
    public boolean wordExists(String key) {
        return prediction.containsKey(key);
    }
    
    public boolean slangExists(String key) {
        return definition.containsKey(key);
    }
    
    // Search Features
    public HashMap<String, HashSet<String>> getSearchBySlangResult(String key) {
        HashMap<String, HashSet<String>> res = new HashMap<>();
        if (slangExists(key.trim())){
            res.put(key.trim(), definition.get(key.trim()));
        }
        return res;
    }
    
    public HashMap<String, HashSet<String>> getSearchByDefResult(String sentence) {
        String[] wordArr = sentence.trim().split(" ");
        Arrays.parallelSetAll(wordArr, (i) -> wordArr[i].trim());

        HashMap<String, HashSet<String>> res = new HashMap<>();
        HashSet<String> slangSet;
        HashSet<String> rootSlangSet;
        HashSet<String> tempSet;
        
        if (!wordExists(wordArr[0])) {
            return res;
        }
        
        rootSlangSet = prediction.get(wordArr[0]);
        for (String word : wordArr) {
            if (!word.trim().equals(wordArr[0]) && !word.equals("")) {
                if (!wordExists(word)) {
                    return res;
                }
                
                slangSet = prediction.get(word);
                tempSet = (HashSet)rootSlangSet.clone();
                for (String slang : tempSet) {
                    if (!slangSet.contains(slang)) {
                        rootSlangSet.remove(slang);
                    }
                }
            }
        }
        
        
        for (String key : rootSlangSet) {
            res.put(key, definition.get(key));

            if (definition.get(key).size()>1) {
                HashSet<String> replaceSet = definition.get(key);
                tempSet = definition.get(key);

                for (String def : tempSet) {
                    for (String word : wordArr) {
                        if (!def.contains(word) && !word.equals("")) {
                            replaceSet.remove(def);
                            break;
                        }
                    }
                }

                res.remove(key);
                res.put(key, replaceSet);
            }
        }
       
        return res;
    }
    
    // Insert, Delete, Edit Features
    public void addNewSlangDefinition(String key, String value) {
        definition.remove(key);
        HashSet<String> newSetDef = new HashSet<>();
        newSetDef.add(value);
        definition.put(key, newSetDef);
    }
    
    public void duplicateSlangDefinition(String key, String value) {
        HashSet<String> newSetDef = new HashSet<>();
        if (definition.containsKey(key)) {
            newSetDef = definition.get(key);
        }
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
    
    public boolean editSlangDefinition(String sourceKey, String destKey, String sourceValue, String destValue) {
        if (!deleteSlangDefinition(sourceKey, sourceValue)) {
            return false;
        }
        duplicateSlangDefinition(destKey, destValue);
        return true;
    }
    
    // Feature
    public List getTodaySlang() {
        if (definition.isEmpty()) {
            List<String> tmpList;
            tmpList = new ArrayList<>();
            tmpList.add("null");
            tmpList.add("null");
            return tmpList;
        }
        
        LocalDate startDate = LocalDate.parse("2023-11-15");
        LocalDate curDate = LocalDate.now();
        
        int period = Period.between(startDate, curDate).getDays();
        if (period > definition.size()) {
            period -= definition.size()*(period/definition.size());
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
