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
        this.theView.setTodaySlang(theModel.getTodaySlang());
        
        this.theView.addSearchButtonListener(new SearchButtonListener());
        this.theView.addDeleteButtonListener(new DeleteButtonListener());
    }
    
    class SearchButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
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
    
    class DeleteButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            String key = theView.getSlangDisplayTextField().getText();
            String value = theView.getDefDisplayTextArea().getText();
            
            int confirm = theView.confirmDecision("This definition will be deleted.");
            
            if (confirm == 0) {
                boolean check = theModel.deleteSlangDefinition(key, value);
                if (check==true) {
                    theView.displayMessage("Deleted Successfully!");
                    theView.displayDictionary(theModel.getDefinition());
                } else {
                    theView.displayMessage("Deleted Fail!");
                }
            }
            
            theView.getSlangDisplayTextField().setText("");
            theView.getDefDisplayTextArea().setText("");
        }
    }
    
    
}
