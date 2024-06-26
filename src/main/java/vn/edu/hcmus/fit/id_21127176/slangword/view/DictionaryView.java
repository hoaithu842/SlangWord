package vn.edu.hcmus.fit.id_21127176.slangword.view;

/**
 *
 * @author hoaithu842
 */
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
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
    private ListSelectionListener listener;
    public DictionaryView() {
        initComponents();
        
        DefaultTableModel defaultTableModel = new DefaultTableModel();
        searchResultTable.setModel(defaultTableModel);
        
        defaultTableModel.addColumn("Slang");
        defaultTableModel.addColumn("Definition");
        
        listener = new RowTableListener();
        addRowTableListener(listener);
    }
    
    class RowTableListener implements ListSelectionListener {
        @Override
        public void valueChanged(ListSelectionEvent event) {
                    rowTableOnClick();
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lookUpButtonGroup = new javax.swing.ButtonGroup();
        slangOptionButtonGroup = new javax.swing.ButtonGroup();
        defOptionButtonGroup = new javax.swing.ButtonGroup();
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
        restoreButton = new javax.swing.JButton();
        slangQuizPanel = new javax.swing.JPanel();
        slangQuizLabel = new javax.swing.JLabel();
        slangOptionPanel = new javax.swing.JPanel();
        slangOptionRadioButton1 = new javax.swing.JRadioButton();
        slangOptionRadioButton2 = new javax.swing.JRadioButton();
        slangOptionRadioButton3 = new javax.swing.JRadioButton();
        slangOptionRadioButton4 = new javax.swing.JRadioButton();
        slangQuizSubmitButton = new javax.swing.JButton();
        defQuizPanel = new javax.swing.JPanel();
        defQuizSubmitButton = new javax.swing.JButton();
        defQuizLabel = new javax.swing.JLabel();
        defOptionPanel = new javax.swing.JPanel();
        defOptionRadioButton1 = new javax.swing.JRadioButton();
        defOptionRadioButton2 = new javax.swing.JRadioButton();
        defOptionRadioButton3 = new javax.swing.JRadioButton();
        defOptionRadioButton4 = new javax.swing.JRadioButton();
        searchHistoryPanel = new javax.swing.JPanel();
        searchHistoryLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        historyTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Slang Word - 21127176 - 21KTPM1");
        setResizable(false);

        tasksTabbedPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        searchResultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        searchResultTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        searchResultTable.setName(""); // NOI18N
        searchResultTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
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

        restoreButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clock.png"))); // NOI18N
        restoreButton.setToolTipText("Restore Dictionary");

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(restoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(lookUpPanelLayout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(lookUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(defDisplayLabel)
                            .addGroup(lookUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, lookUpPanelLayout.createSequentialGroup()
                                    .addComponent(slangDisplayLabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(slangDisplayTextField))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, lookUpPanelLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(lookUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(todaySlangPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1)
                                        .addGroup(lookUpPanelLayout.createSequentialGroup()
                                            .addComponent(insertButton)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(editButton)
                                            .addGap(18, 18, 18)
                                            .addComponent(deleteButton))))))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        lookUpPanelLayout.setVerticalGroup(
            lookUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lookUpPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dictionaryTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(lookUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(restoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(28, Short.MAX_VALUE))
        );

        tasksTabbedPane.addTab("Look Up", new javax.swing.ImageIcon(getClass().getResource("/searchIcon.png")), lookUpPanel); // NOI18N

        slangQuizPanel.setLayout(new java.awt.BorderLayout());

        slangQuizLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        slangQuizLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        slangQuizPanel.add(slangQuizLabel, java.awt.BorderLayout.PAGE_START);

        slangOptionPanel.setLayout(new java.awt.GridLayout(2, 2));

        slangOptionButtonGroup.add(slangOptionRadioButton1);
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
        slangQuizSubmitButton.setPreferredSize(new java.awt.Dimension(50, 25));
        slangQuizPanel.add(slangQuizSubmitButton, java.awt.BorderLayout.PAGE_END);

        tasksTabbedPane.addTab("Slang Guessing Quiz", slangQuizPanel);

        defQuizPanel.setLayout(new java.awt.BorderLayout());

        defQuizSubmitButton.setText("Submit");
        defQuizPanel.add(defQuizSubmitButton, java.awt.BorderLayout.PAGE_END);

        defQuizLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        defQuizLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        defQuizPanel.add(defQuizLabel, java.awt.BorderLayout.PAGE_START);

        defOptionPanel.setLayout(new java.awt.GridLayout(2, 2));

        defOptionButtonGroup.add(defOptionRadioButton1);
        defOptionRadioButton1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        defOptionRadioButton1.setMargin(new java.awt.Insets(50, 50, 50, 50));
        defOptionPanel.add(defOptionRadioButton1);

        defOptionButtonGroup.add(defOptionRadioButton2);
        defOptionRadioButton2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        defOptionRadioButton2.setMargin(new java.awt.Insets(50, 50, 50, 50));
        defOptionPanel.add(defOptionRadioButton2);

        defOptionButtonGroup.add(defOptionRadioButton3);
        defOptionRadioButton3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        defOptionRadioButton3.setMargin(new java.awt.Insets(50, 50, 50, 50));
        defOptionPanel.add(defOptionRadioButton3);

        defOptionButtonGroup.add(defOptionRadioButton4);
        defOptionRadioButton4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        defOptionRadioButton4.setMargin(new java.awt.Insets(50, 50, 50, 50));
        defOptionPanel.add(defOptionRadioButton4);

        defQuizPanel.add(defOptionPanel, java.awt.BorderLayout.CENTER);

        tasksTabbedPane.addTab("Definition Guessing Quiz", defQuizPanel);

        searchHistoryLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        searchHistoryLabel.setText("Search History");

        historyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        historyTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(historyTable);

        javax.swing.GroupLayout searchHistoryPanelLayout = new javax.swing.GroupLayout(searchHistoryPanel);
        searchHistoryPanel.setLayout(searchHistoryPanelLayout);
        searchHistoryPanelLayout.setHorizontalGroup(
            searchHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchHistoryPanelLayout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(searchHistoryLabel)
                .addGap(329, 329, 329))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchHistoryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );
        searchHistoryPanelLayout.setVerticalGroup(
            searchHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchHistoryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchHistoryLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tasksTabbedPane.addTab("Search History", new javax.swing.ImageIcon(getClass().getResource("/clock.png")), searchHistoryPanel); // NOI18N

        getContentPane().add(tasksTabbedPane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
        Getters
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
    
    public String getSlangDisplayText() {
        return slangDisplayTextField.getText();
    }
    
    public String getDefDisplayText() {
        return defDisplayTextArea.getText();
    }
    
    public javax.swing.JTable getSearchResultTable() {
        return searchResultTable;
    }
    
    public int getSlangOptionSelected() {
        if (slangOptionRadioButton1.isSelected()){
            return 0;
        }
        if (slangOptionRadioButton2.isSelected()){
            return 1;
        }
        if (slangOptionRadioButton3.isSelected()){
            return 2;
        }
        if (slangOptionRadioButton4.isSelected()){
            return 3;
        }
        return -1;
    }
    
    public int getDefOptionSelected() {
        if (defOptionRadioButton1.isSelected()){
            return 0;
        }
        if (defOptionRadioButton2.isSelected()){
            return 1;
        }
        if (defOptionRadioButton3.isSelected()){
            return 2;
        }
        if (defOptionRadioButton4.isSelected()){
            return 3;
        }
        return -1;
    }

    public String getSlangSelectedText() {
        int row = searchResultTable.getSelectedRow();
        return String.valueOf( searchResultTable.getValueAt(row, 0));
    }
    
    public String getDefSelectedText() {
        int row = searchResultTable.getSelectedRow();
        return String.valueOf(searchResultTable.getValueAt(row, 1));
    }
    
    public String getHistorySlangSelectedText() {
        int row = historyTable.getSelectedRow();
        return String.valueOf(historyTable.getValueAt(row, 0));
    }
    /*
        Event
    */
    public void addSearchButtonListener(ActionListener listenForClick) {
        searchButton.addActionListener(listenForClick);
    }
    
    public void addRestoreButtonListener(ActionListener listenForClick) {
        restoreButton.addActionListener(listenForClick);
    }
    
    public void addInsertButtonListener(ActionListener listenForClick) {
        insertButton.addActionListener(listenForClick);
    }
    
    public void addDeleteButtonListener(ActionListener listenForClick) {
        deleteButton.addActionListener(listenForClick);
    }
    
    public void addUpdateButtonListener(ActionListener listenForClick) {
        editButton.addActionListener(listenForClick);
    }
    
    public void addRowTableListener(ListSelectionListener listenForClick) {
        ListSelectionModel listSelectionModel = searchResultTable.getSelectionModel();
        listSelectionModel.addListSelectionListener(listenForClick);
    }
    
    public void addHistoryRowListener(ListSelectionListener listenForClick) {
        ListSelectionModel listSelectionModel = historyTable.getSelectionModel();
        listSelectionModel.addListSelectionListener(listenForClick);
    }
        
        public void addSlangQuizSubmitButtonListener(ActionListener listenForClick) {
            slangQuizSubmitButton.addActionListener(listenForClick);
        }
        
        public void addDefQuizSubmitButtonListener(ActionListener listenForClick) {
            defQuizSubmitButton.addActionListener(listenForClick);
        }
        
        public void addSlangDictWindowListener(WindowListener listenForCloseAction) {
            this.addWindowListener(listenForCloseAction);
        }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel defDisplayLabel;
    private javax.swing.JTextArea defDisplayTextArea;
    private javax.swing.ButtonGroup defOptionButtonGroup;
    private javax.swing.JPanel defOptionPanel;
    private javax.swing.JRadioButton defOptionRadioButton1;
    private javax.swing.JRadioButton defOptionRadioButton2;
    private javax.swing.JRadioButton defOptionRadioButton3;
    private javax.swing.JRadioButton defOptionRadioButton4;
    private javax.swing.JLabel defQuizLabel;
    private javax.swing.JPanel defQuizPanel;
    private javax.swing.JButton defQuizSubmitButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel dictionaryTitleLabel;
    private javax.swing.JButton editButton;
    private javax.swing.JTable historyTable;
    private javax.swing.JButton insertButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.ButtonGroup lookUpButtonGroup;
    private javax.swing.JRadioButton lookUpDefRadioButton;
    private javax.swing.JPanel lookUpPanel;
    private javax.swing.JRadioButton lookUpSlangRadioButton;
    private javax.swing.JButton restoreButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel searchHistoryLabel;
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
    
    public void setSlangQuiz(String question, List option) {
        slangQuizLabel.setText(question);
        slangOptionButtonGroup.clearSelection();
        slangOptionRadioButton1.setText((String)option.get(0));
        slangOptionRadioButton2.setText((String)option.get(1));
        slangOptionRadioButton3.setText((String)option.get(2));
        slangOptionRadioButton4.setText((String)option.get(3));
    }
    
    public void setDefQuiz(String question, List option) {
        defQuizLabel.setText(question);
        defOptionButtonGroup.clearSelection();
        defOptionRadioButton1.setText((String)option.get(0));
        defOptionRadioButton2.setText((String)option.get(1));
        defOptionRadioButton3.setText((String)option.get(2));
        defOptionRadioButton4.setText((String)option.get(3));
    }
    
    public void reloadDictionary(HashMap<String, HashSet<String>> data) {
        slangDisplayTextField.setText("");
        defDisplayTextArea.setText("");
        searchTextField.setText("");
        
        DefaultTableModel defaultTableModel = (DefaultTableModel)searchResultTable.getModel();

        searchResultTable.getSelectionModel().removeListSelectionListener(listener);
        defaultTableModel. setRowCount(0);
        defaultTableModel.fireTableDataChanged();
        searchResultTable.getSelectionModel().addListSelectionListener(listener);

        for(String key: data.keySet()) {
            for (String def: data.get(key)) {
                defaultTableModel.addRow(new Object[] {key, def});
            }
          }
    }
    
    public void reloadHistory(List<String> data) {
        DefaultTableModel defaultTableModel = new DefaultTableModel();
        historyTable.setModel(defaultTableModel);
        
        defaultTableModel.addColumn("Slang");
        for (String key : data) {
            defaultTableModel.addRow(new Object[] {key});
        }
    }
    
    public int confirmDecision(String message) {
        return javax.swing.JOptionPane.showConfirmDialog(this, message);
    }
    
    public void displayMessage(String message) {
        javax.swing.JOptionPane.showMessageDialog(this, message);
    }
    
    public int getInsertDecision() {
        Object stringArray[] = { "Overwrite", "Duplicate" };
        return javax.swing.JOptionPane.showOptionDialog(this, "Slang definition exists!", "Select an Option",
        javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE, null, stringArray, stringArray[0]);
    }
    
    public void rowTableOnClick() {
        slangDisplayTextField.setText(getSlangSelectedText());
        defDisplayTextArea.setText(getDefSelectedText());
    }
}
