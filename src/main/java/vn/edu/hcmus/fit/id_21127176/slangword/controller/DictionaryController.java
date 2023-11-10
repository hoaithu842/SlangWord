package vn.edu.hcmus.fit.id_21127176.slangword.controller;

/**
 *
 * @author hoaithu842
 */
import vn.edu.hcmus.fit.id_21127176.slangword.model.DictionaryModel;
import vn.edu.hcmus.fit.id_21127176.slangword.view.DictionaryView;
import vn.edu.hcmus.fit.id_21127176.slangword.model.QuizModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;



public class DictionaryController {
    private DictionaryView theView;
    private DictionaryModel theModel;
    private QuizModel theQuizModel;
    
    public DictionaryController(DictionaryView theView, DictionaryModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
        this.theQuizModel = new QuizModel(theModel);
        
        this.theView.addSlangDictWindowListener(new SlangDictWindowListener());
        
        this.theView.reloadDictionary(theModel.getDefinition());
        this.theView.reloadHistory(theModel.getHistory());
        this.theView.setTodaySlang(theModel.getTodaySlang());
        this.theView.setSlangQuiz(theQuizModel.getSlangQuizQuestion(), theQuizModel.getSlangQuizOption());
        this.theView.setDefQuiz(theQuizModel.getDefQuizQuestion(), theQuizModel.getDefQuizOption());
        
        this.theView.addSearchButtonListener(new SearchButtonListener());
        this.theView.addRestoreButtonListener(new RestoreButtonListener());
        this.theView.addInsertButtonListener(new InsertButtonListener());
        this.theView.addDeleteButtonListener(new DeleteButtonListener());
        this.theView.addUpdateButtonListener(new UpdateButtonListener());
        this.theView.addSlangQuizSubmitButtonListener(new SlangQuizSubmitButtonListener());
        this.theView.addDefQuizSubmitButtonListener(new DefQuizSubmitButtonListener());
        this.theView.addHistoryRowListener(new HistoryRowListener());
    }
    
    class SlangDictWindowListener implements WindowListener {
        @Override
        public void windowClosing(WindowEvent e) {
            theModel.saveDictionary();
        }
        @Override
        public void windowOpened(WindowEvent e) {}
        @Override
        public void windowClosed(WindowEvent e) {}
        @Override
        public void windowIconified(WindowEvent e) {}
        @Override
        public void windowDeiconified(WindowEvent e) {}
        @Override
        public void windowActivated(WindowEvent e) {}
        @Override
        public void windowDeactivated(WindowEvent e) {}
    }
    /*
        ButtonListener
    */
    class SearchButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            String key = theView.getSearchTextField().getText().trim();
            if (key.isEmpty()) {
                theView.reloadDictionary(theModel.getDefinition());
            } else {
                if (theView.getLookUpSlangRadioButton().isSelected()) {
                    theModel.storeHistory(key);
                    theView.reloadHistory(theModel.getHistory());
                    theView.reloadDictionary(theModel.getSearchBySlangResult(key));
                } else {
                    theView.reloadDictionary(theModel.getSearchByDefResult(key));
                }
            }
        }
    }
    
    class RestoreButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            int confirm = theView.confirmDecision("Restore Dictionary will also restore Search History. Continue?");
            if (confirm == 0) {
                boolean check = theModel.restoreDictionary();
                if (check) {
                    theView.displayMessage("Restored Successfully! You need to restart your application!");
                    theView.dispose();
                } else {
                    theView.displayMessage("No data recorded!");
                }
            }
        }
    }
        
    class InsertButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            String key = theView.getSlangDisplayText().trim();
            String value = theView.getDefDisplayText().trim();
            
            if (key.isEmpty()) {
                theView.displayMessage("Can't insert an empty slang!");
            } else {
                if (theModel.slangExist(key)) {
                    int opt = theView.getInsertDecision();
                    if (opt==0) {
                        theModel.addNewSlangDefinition(key, value);
                    } else if (opt==1) {
                        theModel.duplicateSlangDefinition(key, value);
                    }
                } else {
                    theModel.addNewSlangDefinition(key, value);
                }
                theView.displayMessage("Successfully Completed!");
                theView.reloadDictionary(theModel.getDefinition());
            }
        }
    }

    class DeleteButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            String key = theView.getSlangDisplayText().trim();
            String value = theView.getDefDisplayText().trim();
            
            if (key.isEmpty()) {
                theView.displayMessage("Can't delete an empty slang!");
            } else {
                int confirm = theView.confirmDecision("Do you really want to delete this slang & definition?");

                if (confirm == 0) {
                    boolean check = theModel.deleteSlangDefinition(key, value);
                    if (check==true) {
                        theView.displayMessage("Deleted Successfully!");
                        theView.reloadDictionary(theModel.getDefinition());
                    } else {
                        theView.displayMessage("Deleted Fail!");
                    }
                 }
            }
        }
    }
    
    class UpdateButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            String srcKey = theView.getSlangSelectedText();
            String srcValue = theView.getDefSelectedText();
            String dstKey = theView.getSlangDisplayText().trim();
            String dstValue = theView.getDefDisplayText().trim();
            
            if (srcKey.isEmpty()) {
                theView.displayMessage("Can't update an empty slang!");
            } else {
                if (theModel.slangExist(srcKey)) {
                    int confirm = theView.confirmDecision("Do you really want to update this slang & definition?");
                    if (confirm == 0) {
                        boolean check = theModel.editSlangDefinition(srcKey, dstKey, srcValue, dstValue);
                        if (check) {
                            theView.displayMessage("Updated Successfully!");
                            theView.reloadDictionary(theModel.getDefinition());
                        } else {
                            theView.displayMessage("Updated Fail!");
                        }
                    }
                } else {
                    theView.displayMessage("Can't update a non-existent slang!");
                }
            }
        }
    }
    
    class SlangQuizSubmitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            int selectedOption = theView.getSlangOptionSelected();
            
            if (selectedOption == -1) {
                theView.displayMessage("You must select an option!");
            } else {
                if (theQuizModel.getSlangQuizSolution() == selectedOption) {
                    theView.displayMessage("Correct Answer!");
                } else {
                    theView.displayMessage("Incorrect! The answer is: " + theQuizModel.getSlangQuizOption().get(theQuizModel.getSlangQuizSolution()));
                }
                theQuizModel.generateSlangQuiz();
                theView.setSlangQuiz(theQuizModel.getSlangQuizQuestion(), theQuizModel.getSlangQuizOption());
            }
        }
    }
    
    class DefQuizSubmitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            int selectedOption = theView.getDefOptionSelected();
            
            if (selectedOption == -1) {
                theView.displayMessage("You must select an option!");
            } else {
                if (theQuizModel.getDefQuizSolution() == selectedOption) {
                    theView.displayMessage("Correct Answer!");
                } else {
                    theView.displayMessage("Incorrect! The answer is: " + theQuizModel.getDefQuizOption().get(theQuizModel.getDefQuizSolution()));
                }
                theQuizModel.generateDefQuiz();
                theView.setDefQuiz(theQuizModel.getDefQuizQuestion(), theQuizModel.getDefQuizOption());
            }
        }
    }
    
    
    class HistoryRowListener implements ListSelectionListener {
        @Override
        public void valueChanged(ListSelectionEvent event) {
            theView.displayMessage("Definition(s): " + theModel.getDefinition().get(theView.getHistorySlangSelectedText().trim()).toString());
        }
    }
}
