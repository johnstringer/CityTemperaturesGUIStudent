/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teachercitytemperatures;

/**
 *
 * @author johnstringer
 */
public class CityTempGUI extends javax.swing.JFrame {

    /**
     * Creates new form CityTempGUI
     */
    
    public static City [] cityDatabase = new City[9];
    
    
    public CityTempGUI() {
        initComponents();
        resetScreen(0);
        
        jEditorPaneDisplayDatabase.setEditable(false);
        jEditorPaneDisplayDatabase.setContentType("text/html");
        jEditorPaneDisplayDatabase.setText(DataMethods.CreateHTMLString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonDisplay = new javax.swing.JButton();
        jButtonAddNewCity = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanelDisplay = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPaneDisplayDatabase = new javax.swing.JEditorPane();
        jLabelSort = new javax.swing.JLabel();
        jComboBoxSort = new javax.swing.JComboBox<>();
        jButtonSort = new javax.swing.JButton();
        jPanelAddCity = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonDisplay.setText("Display Database");
        jButtonDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDisplayActionPerformed(evt);
            }
        });

        jButtonAddNewCity.setText("Add New City");
        jButtonAddNewCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddNewCityActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jEditorPaneDisplayDatabase);

        jLabelSort.setText("Sort By:");

        jComboBoxSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "City Name", "Wind Speed", "Temperature" }));

        jButtonSort.setText("Sort");
        jButtonSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDisplayLayout = new javax.swing.GroupLayout(jPanelDisplay);
        jPanelDisplay.setLayout(jPanelDisplayLayout);
        jPanelDisplayLayout.setHorizontalGroup(
            jPanelDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDisplayLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabelSort, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSort))
                .addGap(97, 97, 97)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDisplayLayout.setVerticalGroup(
            jPanelDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDisplayLayout.createSequentialGroup()
                .addGroup(jPanelDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDisplayLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanelDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSort))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSort))
                    .addGroup(jPanelDisplayLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelAddCityLayout = new javax.swing.GroupLayout(jPanelAddCity);
        jPanelAddCity.setLayout(jPanelAddCityLayout);
        jPanelAddCityLayout.setHorizontalGroup(
            jPanelAddCityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 943, Short.MAX_VALUE)
        );
        jPanelAddCityLayout.setVerticalGroup(
            jPanelAddCityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 468, Short.MAX_VALUE)
        );

        jLayeredPane1.setLayer(jPanelDisplay, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanelAddCity, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jPanelAddCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(17, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jPanelAddCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jButtonDisplay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAddNewCity)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDisplay)
                    .addComponent(jButtonAddNewCity))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddNewCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddNewCityActionPerformed
        // TODO add your handling code here:
        resetScreen(1);
    }//GEN-LAST:event_jButtonAddNewCityActionPerformed

    private void jButtonDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDisplayActionPerformed
        // TODO add your handling code here:
        resetScreen(0);
    }//GEN-LAST:event_jButtonDisplayActionPerformed

    private void jButtonSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSortActionPerformed
        // TODO add your handling code here:
        DataMethods.SortByCity();
        jEditorPaneDisplayDatabase.setText(DataMethods.CreateHTMLString());
    }//GEN-LAST:event_jButtonSortActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void resetScreen (int reset){
        jPanelDisplay.setVisible(false);
        jPanelAddCity.setVisible(false);
        
        if (reset == 0 ){
            jPanelDisplay.setVisible(true);
        }
        
        else if (reset == 1 ){
            jPanelAddCity.setVisible(true);
        }
    
    
    }
    
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
            java.util.logging.Logger.getLogger(CityTempGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CityTempGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CityTempGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CityTempGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        LoadData.loadFile();
        System.out.println(cityDatabase[0].getCityName());
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CityTempGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddNewCity;
    private javax.swing.JButton jButtonDisplay;
    private javax.swing.JButton jButtonSort;
    private javax.swing.JComboBox<String> jComboBoxSort;
    private javax.swing.JEditorPane jEditorPaneDisplayDatabase;
    private javax.swing.JLabel jLabelSort;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanelAddCity;
    private javax.swing.JPanel jPanelDisplay;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}