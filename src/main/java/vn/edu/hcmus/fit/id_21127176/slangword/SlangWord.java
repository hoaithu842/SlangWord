package vn.edu.hcmus.fit.id_21127176.slangword;

/**
 *
 * @author hoaithu842
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import vn.edu.hcmus.fit.id_21127176.slangword.model.DictionaryModel;
import vn.edu.hcmus.fit.id_21127176.slangword.view.DictionaryView;
import vn.edu.hcmus.fit.id_21127176.slangword.controller.DictionaryController;

public class SlangWord {
    private static DictionaryModel getModel() throws FileNotFoundException, IOException, ClassNotFoundException {
        // Load saved data (not First-time Access)
        File f = new File("slang.dat");
        if (f.exists()){
            FileInputStream fis = new FileInputStream("slang.dat");
            
            try (ObjectInputStream ois = new ObjectInputStream(fis)) {
                DictionaryModel theModel = (DictionaryModel)ois.readObject();
                ois.close();
                return theModel;
            }
        } else {
            // First-time Access
            return new DictionaryModel();
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        DictionaryModel theModel = getModel();
        DictionaryView theView = new DictionaryView();
        DictionaryController theController = new DictionaryController(theView, theModel);
        theView.setVisible(true);
    }
}
