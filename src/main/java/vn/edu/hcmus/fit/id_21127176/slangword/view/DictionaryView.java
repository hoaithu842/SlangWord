package vn.edu.hcmus.fit.id_21127176.slangword.view;

/**
 *
 * @author USER
 */
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class DictionaryView extends javax.swing.JFrame {

    /**
     * Creates new form DictionaryView
     */
    public DictionaryView() {
        initComponents();
        addRowTableListener();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lookUpButtonGroup = new javax.swing.ButtonGroup();
        slangOptionButtonGroup = new javax.swing.ButtonGroup();
        tasksTabbedPane = new javax.swing.JTabbedPane();
        lookUpPanel = new javax.swing.JPanel();
        searchResultScrollPane = new javax.swing.JScrollPane();
        searchResultTable = new javax.swing.JTable();
        searchTextField = new javax.swing.JTextField();
        lookUpSlangRadioButton = new javax.swing.JRadioButton();
        lookUpDefRadioButton = new javax.swing.JRadioButton();
        searchButton = new javax.swing.JButton();
        dictionaryTitleLabel = new javax.swing.JLabel();
        slangDisplayTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        defDisplayTextArea = new javax.swing.JTextArea();
        slangDisplayLabel = new javax.swing.JLabel();
        defDisplayLabel = new javax.swing.JLabel();
        insertButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        todaySlangPanel = new javax.swing.JPanel();
        todaySlangWordLabel = new javax.swing.JLabel();
        todaySlangLabel = new javax.swing.JLabel();
        todaySlangDefTextField = new javax.swing.JTextField();
        slangQuizPanel = new javax.swing.JPanel();
        slangQuizLabel = new javax.swing.JLabel();
        slangOptionPanel = new javax.swing.JPanel();
        slangOptionRadioButton1 = new javax.swing.JRadioButton();
        slangOptionRadioButton2 = new javax.swing.JRadioButton();
        slangOptionRadioButton3 = new javax.swing.JRadioButton();
        slangOptionRadioButton4 = new javax.swing.JRadioButton();
        slangQuizSubmitButton = new javax.swing.JButton();
        defQuizPanel = new javax.swing.JPanel();
        searchHistoryPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Slang Word - 21127176 - 21KTPM1");
        setResizable(false);

        tasksTabbedPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        searchResultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Input", "Result"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        searchResultTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        searchResultTable.setName(""); // NOI18N
        searchResultTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        searchResultTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        searchResultTable.setShowGrid(true);
        searchResultTable.setVerifyInputWhenFocusTarget(false);
        searchResultScrollPane.setViewportView(searchResultTable);

        lookUpButtonGroup.add(lookUpSlangRadioButton);
        lookUpSlangRadioButton.setSelected(true);
        lookUpSlangRadioButton.setText("Look Up a Slang Word");

        lookUpButtonGroup.add(lookUpDefRadioButton);
        lookUpDefRadioButton.setText("Look Up by Definition");

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/searchIcon.png"))); // NOI18N
        searchButton.setPreferredSize(new java.awt.Dimension(29, 29));

        dictionaryTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        dictionaryTitleLabel.setText("Slang Word Dictionary");

        defDisplayTextArea.setColumns(20);
        defDisplayTextArea.setRows(5);
        jScrollPane1.setViewportView(defDisplayTextArea);

        slangDisplayLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        slangDisplayLabel.setLabelFor(slangDisplayTextField);
        slangDisplayLabel.setText("Slang");

        defDisplayLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        defDisplayLabel.setLabelFor(defDisplayTextArea);
        defDisplayLabel.setText("Definition");

        insertButton.setText("Insert");

        editButton.setText("Edit");

        deleteButton.setText("Delete");

        todaySlangPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        todaySlangPanel.setLayout(new java.awt.BorderLayout());

        todaySlangWordLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        todaySlangWordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        todaySlangPanel.add(todaySlangWordLabel, java.awt.BorderLayout.CENTER);

        todaySlangLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        todaySlangLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        todaySlangLabel.setText("Today's Slang");
        todaySlangLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        todaySlangLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        todaySlangPanel.add(todaySlangLabel, java.awt.BorderLayout.PAGE_START);

        todaySlangDefTextField.setEditable(false);
        todaySlangDefTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        todaySlangDefTextField.setBorder(null);
        todaySlangPanel.add(todaySlangDefTextField, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout lookUpPanelLayout = new javax.swing.GroupLayout(lookUpPanel);
        lookUpPanel.setLayout(lookUpPanelLayout);
        lookUpPanelLayout.setHorizontalGroup(
            lookUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lookUpPanelLayout.createSequentialGroup()
                .addGroup(lookUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(lookUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(lookUpPanelLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(lookUpSlangRadioButton)
                            .addGap(18, 18, 18)
                            .addComponent(lookUpDefRadioButton))
                        .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dictionaryTitleLabel))
                    .addGroup(lookUpPanelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(searchResultScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(lookUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lookUpPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(lookUpPanelLayout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(lookUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(defDisplayLabel)
                            .addGroup(lookUpPanelLayout.createSequentialGroup()
                                .addComponent(slangDisplayLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(slangDisplayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(lookUpPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(lookUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(todaySlangPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1)
                                    .addGroup(lookUpPanelLayout.createSequentialGroup()
                                        .addComponent(insertButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(editButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(deleteButton)))))
                        .addContainerGap(52, Short.MAX_VALUE))))
        );
        lookUpPanelLayout.setVerticalGroup(
            lookUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lookUpPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dictionaryTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(lookUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lookUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lookUpSlangRadioButton)
                    .addComponent(lookUpDefRadioButton))
                .addGap(20, 20, 20)
                .addGroup(lookUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lookUpPanelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(lookUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(slangDisplayLabel)
                            .addComponent(slangDisplayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(defDisplayLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(lookUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(insertButton)
                            .addComponent(editButton)
                            .addComponent(deleteButton))
                        .addGap(50, 50, 50)
                        .addComponent(todaySlangPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(searchResultScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tasksTabbedPane.addTab("Look Up", new javax.swing.ImageIcon(getClass().getResource("/searchIcon.png")), lookUpPanel); // NOI18N

        slangQuizPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slangQuizPanelMouseClicked(evt);
            }
        });
        slangQuizPanel.setLayout(new java.awt.BorderLayout());

        slangQuizLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        slangQuizLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        slangQuizPanel.add(slangQuizLabel, java.awt.BorderLayout.PAGE_START);

        slangOptionPanel.setLayout(new java.awt.GridLayout(2, 2));

        slangOptionButtonGroup.add(slangOptionRadioButton1);
        slangOptionRadioButton1.setSelected(true);
        slangOptionRadioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        slangOptionRadioButton1.setMargin(new java.awt.Insets(50, 50, 50, 50));
        slangOptionPanel.add(slangOptionRadioButton1);

        slangOptionButtonGroup.add(slangOptionRadioButton2);
        slangOptionRadioButton2.setMargin(new java.awt.Insets(50, 50, 50, 50));
        slangOptionPanel.add(slangOptionRadioButton2);

        slangOptionButtonGroup.add(slangOptionRadioButton3);
        slangOptionRadioButton3.setMargin(new java.awt.Insets(50, 50, 50, 50));
        slangOptionPanel.add(slangOptionRadioButton3);

        slangOptionButtonGroup.add(slangOptionRadioButton4);
        slangOptionRadioButton4.setMargin(new java.awt.Insets(50, 50, 50, 0));
        slangOptionRadioButton4.setMaximumSize(new java.awt.Dimension(197, 121));
        slangOptionRadioButton4.setMinimumSize(new java.awt.Dimension(197, 121));
        slangOptionPanel.add(slangOptionRadioButton4);

        slangQuizPanel.add(slangOptionPanel, java.awt.BorderLayout.CENTER);

        slangQuizSubmitButton.setText("Submit");
        slangQuizSubmitButton.setMaximumSize(new java.awt.Dimension(50, 25));
        slangQuizSubmitButton.setMinimumSize(new java.awt.Dimension(50, 25));
        slangQuizSubmitButton.setPreferredSize(new java.awt.Dimension(50, 25));
        slangQuizPanel.add(slangQuizSubmitButton, java.awt.BorderLayout.PAGE_END);

        tasksTabbedPane.addTab("Slang Guessing Quiz", slangQuizPanel);

        javax.swing.GroupLayout defQuizPanelLayout = new javax.swing.GroupLayout(defQuizPanel);
        defQuizPanel.setLayout(defQuizPanelLayout);
        defQuizPanelLayout.setHorizontalGroup(
            defQuizPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 805, Short.MAX_VALUE)
        );
        defQuizPanelLayout.setVerticalGroup(
            defQuizPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
        );

        tasksTabbedPane.addTab("Definition Guessing Quiz", defQuizPanel);

        javax.swing.GroupLayout searchHistoryPanelLayout = new javax.swing.GroupLayout(searchHistoryPanel);
        searchHistoryPanel.setLayout(searchHistoryPanelLayout);
        searchHistoryPanelLayout.setHorizontalGroup(
            searchHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 805, Short.MAX_VALUE)
        );
        searchHistoryPanelLayout.setVerticalGroup(
            searchHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
        );

        tasksTabbedPane.addTab("Search History", searchHistoryPanel);

        getContentPane().add(tasksTabbedPane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void slangQuizPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slangQuizPanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_slangQuizPanelMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DictionaryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DictionaryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DictionaryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DictionaryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DictionaryView().setVisible(true);
            }
        });
    }
    /*
        Getters - Setters
    */
    public javax.swing.JRadioButton getLookUpSlangRadioButton() {
        return lookUpSlangRadioButton;
    }
    
    public javax.swing.JTextField getSearchTextField() {
        return searchTextField;
    }
    
    public javax.swing.JButton getDeleteButton() {
        return deleteButton;
    }
    
    public javax.swing.JTextField getSlangDisplayTextField() {
        return slangDisplayTextField;
    }
    
    public javax.swing.JTextArea getDefDisplayTextArea() {
        return defDisplayTextArea;
    }
    
    public javax.swing.JTable getSearchResultTable() {
        return searchResultTable;
    }
    
    /*
        Event
    */
    public void addSearchButtonListener(ActionListener listenForClick) {
        searchButton.addActionListener(listenForClick);
    }
    
    public void addDeleteButtonListener(ActionListener listenForClick) {
        deleteButton.addActionListener(listenForClick);
    }

//    public void addRowTableListener(ListSelectionListener listenForClick) {
//        ListSelectionModel listSelectionModel = searchResultTable.getSelectionModel();
//        listSelectionModel.addListSelectionListener(listenForClick);
//    }
    
        public final void addRowTableListener() {
        ListSelectionModel listSelectionModel = searchResultTable.getSelectionModel();
        listSelectionModel.addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent event) {
//                int rows[] = searchResultTable.getSelectedRows();
//                int cols[] = searchResultTable.getSelectedColumns();
//                
//                String code = String.valueOf(searchResultTable.getValueAt(rows[0], 0));
//                searchTextField.setText(code);
                    rowTableOnClick();
            }
        });
//        listSelectionModel.addListSelectionListener(listenForClick);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel defDisplayLabel;
    private javax.swing.JTextArea defDisplayTextArea;
    private javax.swing.JPanel defQuizPanel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel dictionaryTitleLabel;
    private javax.swing.JButton editButton;
    private javax.swing.JButton insertButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup lookUpButtonGroup;
    private javax.swing.JRadioButton lookUpDefRadioButton;
    private javax.swing.JPanel lookUpPanel;
    private javax.swing.JRadioButton lookUpSlangRadioButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JPanel searchHistoryPanel;
    private javax.swing.JScrollPane searchResultScrollPane;
    private javax.swing.JTable searchResultTable;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JLabel slangDisplayLabel;
    private javax.swing.JTextField slangDisplayTextField;
    private javax.swing.ButtonGroup slangOptionButtonGroup;
    private javax.swing.JPanel slangOptionPanel;
    private javax.swing.JRadioButton slangOptionRadioButton1;
    private javax.swing.JRadioButton slangOptionRadioButton2;
    private javax.swing.JRadioButton slangOptionRadioButton3;
    private javax.swing.JRadioButton slangOptionRadioButton4;
    private javax.swing.JLabel slangQuizLabel;
    private javax.swing.JPanel slangQuizPanel;
    private javax.swing.JButton slangQuizSubmitButton;
    private javax.swing.JTabbedPane tasksTabbedPane;
    private javax.swing.JTextField todaySlangDefTextField;
    private javax.swing.JLabel todaySlangLabel;
    private javax.swing.JPanel todaySlangPanel;
    private javax.swing.JLabel todaySlangWordLabel;
    // End of variables declaration//GEN-END:variables
    
    public void setTodaySlang(List<String> todaySlang) {
        todaySlangWordLabel.setText(todaySlang.get(0));
        todaySlangDefTextField.setText(todaySlang.get(1));
    }
    
    public void displaySlangQuiz() {
        
    }
    
    public void displayDictionary(HashMap<String, HashSet<String>> data) {
        DefaultTableModel defaultTableModel = new DefaultTableModel();
        searchResultTable.setModel(defaultTableModel);
        
        defaultTableModel.addColumn("Slang");
        defaultTableModel.addColumn("Definition");
        
        for(String key: data.keySet()) {
            for (String def: data.get(key)) {
                defaultTableModel.addRow(new Object[] {key, def});
            }
          }
    }
    
    public int confirmDecision(String message) {
        return javax.swing.JOptionPane.showConfirmDialog(this, message);
    }
    
    public void displayMessage(String message) {
        javax.swing.JOptionPane.showMessageDialog(this, message);
    }
    
    public void rowTableOnClick() {
        int rows[] = searchResultTable.getSelectedRows();
        String slang = String.valueOf( searchResultTable.getValueAt(rows[0], 0));
        String def = String.valueOf(searchResultTable.getValueAt(rows[0], 1));
        slangDisplayTextField.setText(slang);
        defDisplayTextArea.setText(def);
    }
    
//    class RowTableListener implements ListSelectionListener {
//        @Override
//        public void valueChanged(ListSelectionEvent event) {
//             rowTableOnClick();
//        }
//    }
}
