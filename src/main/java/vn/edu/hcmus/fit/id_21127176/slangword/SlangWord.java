package vn.edu.hcmus.fit.id_21127176.slangword;

/**
 *
 * @author USER
 */
import vn.edu.hcmus.fit.id_21127176.slangword.model.DictionaryModel;
import vn.edu.hcmus.fit.id_21127176.slangword.view.DictionaryView;
import vn.edu.hcmus.fit.id_21127176.slangword.controller.DictionaryController;

public class SlangWord {

    public static void main(String[] args) {
        DictionaryModel theModel = new DictionaryModel();
        DictionaryView theView = new DictionaryView();
        
        DictionaryController theController = new DictionaryController(theView, theModel);
        theView.setVisible(true);
    }
}
