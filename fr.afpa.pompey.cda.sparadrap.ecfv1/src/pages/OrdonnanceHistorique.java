package pages;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bulen
 */
public final class OrdonnanceHistorique extends javax.swing.JFrame {

    /**
     *
     */
    public OrdonnanceHistorique() {
        initComponents();
        addRowToTable();
    }

    /**
     * instancier une class Arraylist et ajouter creer les objet user retourner
     * la liste "list" object avec ses informations
     *
     * @return
     */
    public ArrayList listOfOrdonnances() {

        ArrayList<Ordonnance> list = new ArrayList<>();
        Ordonnance u1 = new Ordonnance("bul", 123456789, "bul@bul.fr", "21/12/2023");
        Ordonnance u2 = new Ordonnance("bul", 123456789, "bul@bul.fr", "21/12/2023");
        Ordonnance u3 = new Ordonnance("bul", 123456789, "bul@bul.fr", "21/12/2023");
        Ordonnance u4 = new Ordonnance("bul", 123456789, "bul@bul.fr", "21/12/2023");
        Ordonnance u5 = new Ordonnance("bul", 123456789, "bul@bul.fr", "21/12/2023");
        Ordonnance u6 = new Ordonnance("bul", 123456789, "bul@bul.fr", "21/12/2023");
        Ordonnance u7 = new Ordonnance("bul", 123456789, "bul@bul.fr", "21/12/2023");
        Ordonnance u8 = new Ordonnance("bul", 123456789, "bul@bul.fr", "21/12/2023");
        Ordonnance u9 = new Ordonnance("bul", 123456789, "bul@bul.fr", "21/12/2023");
        Ordonnance u10 = new Ordonnance("bul", 123456789, "bul@bul.fr", "21/12/2023");
        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        list.add(u5);
        list.add(u6);
        list.add(u7);
        list.add(u8);
        list.add(u9);
        list.add(u10);
        return list;
    }

    /**
     * mettre les contenus de l'objet dans son conteneur ici jtable et dans ces
     * colonnes définis
     */
    public void addRowToTable() {
        try {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            ArrayList<Ordonnance> list = listOfOrdonnances();
            Object rowData[] = new Object[10];
            for (int i = 0; i < list.size(); i++) {
                rowData[0] = list.get(i).getName();
                rowData[1] = list.get(i).getTel();
                rowData[2] = list.get(i).getEmail();
                rowData[3] = list.get(i).getDateConsultation();
                model.addRow(rowData);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage() + "votre est la  ERROR :");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNAME = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldTEL = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldDATE = new javax.swing.JTextField();
        jTextFieldEMAIL = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Historique Ordonnance");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("NAME:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("TELEPHONE:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("DATE DE PRESCRIPTION");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("EMAIL:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGap(249, 249, 249))
                        .addComponent(jTextFieldTEL)
                        .addComponent(jTextFieldDATE)
                        .addComponent(jTextFieldNAME)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldTEL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "TEL", "EMAIL", "DATE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setText("Afficher ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 40));

        jButtonDelete.setText("DELETE ROW");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 120, 40));

        jButtonSave.setText("SAVE");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, 41));

        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 79, 41));

        jButton4.setBackground(new java.awt.Color(51, 51, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("RETOUR  ACCUEIL");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 150, 40));

        jButton5.setBackground(new java.awt.Color(255, 0, 51));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("QUITTER");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 120, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Historique Ordonnance ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
/**
     *
     * @param evt
     */
    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        /* TODO add your handling code here:
         *
         */

        try {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.addRow(new Object[]{
                jTextFieldNAME.getText().toUpperCase().trim(),
                jTextFieldTEL.getText().toUpperCase().trim(),
                jTextFieldEMAIL.getText().toUpperCase().trim(),
                jTextFieldDATE.getText().toUpperCase().trim()
            });

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage() + "votre est la  ERROR :");
        }

    }//GEN-LAST:event_jButtonSaveActionPerformed

    /**
     *
     * @param evt
     */

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // THIS IS THE CODE TO LOAD THE DATA TO THE JTEXTFIELDS
//        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//        int setSelectedRow = jTable1.getSelectedRow();
//        jTextFieldID.setText(model.getValueAt(setSelectedRow, 0).toString());
//        jTextFieldIDName.setText(model.getValueAt(setSelectedRow, 1).toString());
//        jTextFieldIDGender.setText(model.getValueAt(setSelectedRow, 2).toString());
//        jTextFieldIDGender.setEditable(false);
//        jTextFieldIDGender.setBackground(Color.BLUE);
//       


    }//GEN-LAST:event_jTable1MouseClicked
    /**
     *
     * @param evt
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //YOUR SHOULD HAVE CODE FROM THE EVENT OF THE JTABLE
        //I WILL SHOW YOU FIRST
        //BECAUSE WE WILL LOAD THE DATA TO THE TEXT FIELD
        //HERE ONCE WE CLICK THE UPDATE BUTTON
        int i = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int setSelectedRow = jTable1.getSelectedRow();

        jTextFieldNAME.setText(model.getValueAt(setSelectedRow, 0).toString());
        jTextFieldTEL.setText(model.getValueAt(setSelectedRow, 1).toString());
        jTextFieldEMAIL.setText(model.getValueAt(setSelectedRow, 2).toString());
        jTextFieldDATE.setText(model.getValueAt(setSelectedRow, 3).toString());

        jTextFieldNAME.setBackground(Color.CYAN);
        jTextFieldTEL.setBackground(Color.CYAN);
        jTextFieldEMAIL.setBackground(Color.CYAN);
        jTextFieldDATE.setBackground(Color.CYAN);

        jTextFieldNAME.setEditable(true);
        jTextFieldTEL.setEditable(true);
        jTextFieldEMAIL.setEditable(true);
        jTextFieldDATE.setEditable(true);
        if (i >= 0) {
            model.setValueAt(jTextFieldNAME.getText().trim(), i, 0);
            model.setValueAt(jTextFieldTEL.getText().trim(), i, 1);
            model.setValueAt(jTextFieldEMAIL.getText().trim(), i, 2);
            model.setValueAt(jTextFieldDATE.getText().trim(), i, 2);
        } else {
            JOptionPane.showMessageDialog(rootPane, "ERROR");
        }

    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     *
     * @param evt
     */
    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            int selectedRowIndex = jTable1.getSelectedRow();

            model.removeRow(selectedRowIndex);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "ERROR" + e.getMessage());
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int setSelectedRow = jTable1.getSelectedRow();

        jTextFieldNAME.setText(model.getValueAt(setSelectedRow, 0).toString());
        jTextFieldTEL.setText(model.getValueAt(setSelectedRow, 1).toString());
        jTextFieldEMAIL.setText(model.getValueAt(setSelectedRow, 2).toString());
        jTextFieldDATE.setText(model.getValueAt(setSelectedRow, 2).toString());

        jTextFieldNAME.setEditable(false);
        jTextFieldTEL.setEditable(false);
        jTextFieldEMAIL.setEditable(false);
        jTextFieldDATE.setEditable(false);

        jTextFieldNAME.setBackground(Color.lightGray);
        jTextFieldTEL.setBackground(Color.lightGray);
        jTextFieldEMAIL.setBackground(Color.lightGray);
        jTextFieldDATE.setBackground(Color.lightGray);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        Accueil menu = new Accueil();
        menu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrdonnanceHistorique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new OrdonnanceHistorique().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldDATE;
    private javax.swing.JTextField jTextFieldEMAIL;
    private javax.swing.JTextField jTextFieldNAME;
    private javax.swing.JTextField jTextFieldTEL;
    // End of variables declaration//GEN-END:variables

}
