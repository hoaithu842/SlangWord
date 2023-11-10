package vn.edu.hcmus.fit.id_21127176.slangword.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author hoaithu842
 */
public class QuizModel {
    private DictionaryModel theModel;
    private String slangQuizQuestion;
    private int slangQuizSolution;
    private List slangQuizOption;
    private String defQuizQuestion;
    private int defQuizSolution;
    private List defQuizOption;
    
    public QuizModel(DictionaryModel theModel) {
        this.theModel = theModel;
        slangQuizOption = new ArrayList();
        defQuizOption = new ArrayList();
        generateSlangQuiz();
        generateDefQuiz();
    }
    
    public String getSlangQuizQuestion() {
        return slangQuizQuestion;
    }

    public int getSlangQuizSolution() {
        return slangQuizSolution;
    }

    public List getSlangQuizOption() {
        return slangQuizOption;
    }
    
    public String getDefQuizQuestion() {
        return defQuizQuestion;
    }
    
    public int getDefQuizSolution() {
        return defQuizSolution;
    }

    public List getDefQuizOption() {
        return defQuizOption;
    }
    
    private List generateRandomIndex(Random random) {
        List rndNum = new ArrayList();
        
        
        while (rndNum.size() < 4) {
            int num = random.nextInt(theModel.getDefinition().size());
            while (rndNum.contains(num)) {
                num = random.nextInt(theModel.getDefinition().size());
            }
            rndNum.add(num);
        }
        return rndNum;
    }
    
    public void generateSlangQuiz() {
        Random random = new Random();
        List rndNum = generateRandomIndex(random);
        
        slangQuizSolution = random.nextInt(4);
        List<String> keyList = new ArrayList<>(theModel.getDefinition().keySet());
        slangQuizQuestion = keyList.get((int)rndNum.get(slangQuizSolution));
        
        slangQuizOption.clear();
        for (int i=0; i<4; i++) {
            slangQuizOption.add(theModel.getDefinition().get(keyList.get((int)rndNum.get(i))).stream().findFirst().get());
        }
    }
    
    public void generateDefQuiz() {
        Random random = new Random();
        List rndNum = generateRandomIndex(random);
        
        while (rndNum.size() < 4) {
            int num = random.nextInt(theModel.getDefinition().size());
            while (rndNum.contains(num)) {
                num = random.nextInt(theModel.getDefinition().size());
            }
            rndNum.add(num);
        }
        
        defQuizSolution = random.nextInt(4);
        List<String> keyList = new ArrayList<>(theModel.getDefinition().keySet());
        defQuizQuestion = theModel.getDefinition().get(keyList.get((int)rndNum.get(defQuizSolution))).stream().findFirst().get();
        
        defQuizOption.clear();
        for (int i=0; i<4; i++) {
            defQuizOption.add(keyList.get((int)rndNum.get(i)));
        }
    }
}
