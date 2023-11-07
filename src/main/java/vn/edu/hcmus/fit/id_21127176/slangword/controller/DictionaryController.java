package vn.edu.hcmus.fit.id_21127176.slangword.controller;

/**
 *
 * @author USER
 */
import vn.edu.hcmus.fit.id_21127176.slangword.model.DictionaryModel;
import vn.edu.hcmus.fit.id_21127176.slangword.view.DictionaryView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DictionaryController {
    private DictionaryView theView;
    private DictionaryModel theModel;
    
    public DictionaryController(DictionaryView theView, DictionaryModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
        
        this.theView.displayDictionary(theModel.getDefinition());
        
        this.theView.addSearchButtonListener(new SearchButtonListener());
    }
    
    class SearchButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent arg0) {
            String key = theView.getSearchTextField().getText();
            if (key.isEmpty()) {
                theView.displayDictionary(theModel.getDefinition());
            } else {
                if (theView.getLookUpSlangRadioButton().isSelected()) {
                    theView.displayDictionary(theModel.getSearchBySlangResult(key));
                } else {
                    theView.displayDictionary(theModel.getSearchByDefResult(key));
                }
            } 
        }
    }
}
