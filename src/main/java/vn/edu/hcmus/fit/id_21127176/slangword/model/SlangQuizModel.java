package vn.edu.hcmus.fit.id_21127176.slangword.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author USER
 */
public class SlangQuizModel {
    private DictionaryModel theModel;
    private String question;
    private int solution;
    private List option;
    
    public SlangQuizModel(DictionaryModel theModel) {
        this.theModel = theModel;
        option = new ArrayList();
        generateQuiz();
    }
    
    public String getQuestion() {
        return question;
    }

    public int getSolution() {
        return solution;
    }

    public List getOption() {
        return option;
    }
    
    public void generateQuiz() {
        List rndNum = new ArrayList();
        Random random = new Random();
        
        while (rndNum.size() < 4) {
            int num = random.nextInt(theModel.getDefinition().size());
            while (rndNum.contains(num)) {
                num = random.nextInt(theModel.getDefinition().size());
            }
            rndNum.add(num);
        }
        
        solution = random.nextInt(4);
        List<String> keyList = new ArrayList<>(theModel.getDefinition().keySet());
        question = keyList.get((int)rndNum.get(solution));
        
        option.clear();
        for (int i=0; i<4; i++) {
            option.add(theModel.getDefinition().get(keyList.get((int)rndNum.get(i))).stream().findFirst().get());
        }
    }
}
