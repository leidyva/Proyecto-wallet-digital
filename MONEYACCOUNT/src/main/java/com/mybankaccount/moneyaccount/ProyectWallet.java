/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mybankaccount.moneyaccount;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author aedua
 */
public class ProyectWallet extends javax.swing.JFrame {
        DefaultTableModel model;
        
    public ProyectWallet() {
        initComponents();
       model= new DefaultTableModel();
       model.addColumn("Id");
       model.addColumn("Type");
       model.addColumn("Date");
       model.addColumn("Amount");
       this.tableMoney.setModel(model);
    }

    private static double total = 100;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        purchaseButton = new javax.swing.JButton();
        saleButton = new javax.swing.JButton();
        txtMoney = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMoney = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        purchaseButton.setText("Purchase");
        purchaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseButtonActionPerformed(evt);
            }
        });

        saleButton.setText("Sale");
        saleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saleButtonActionPerformed(evt);
            }
        });

        txtMoney.setText("Please enter a number");
        txtMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMoneyActionPerformed(evt);
            }
        });

        tableMoney.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Type", "Data", "Accounts"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableMoney.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableMoney);

        jLabel1.setText("Total:" + total);

        jLabel2.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jLabel2.setText("Program of Bank Account ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(purchaseButton)
                        .addGap(18, 18, 18)
                        .addComponent(saleButton)
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtMoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtMoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(purchaseButton)
                    .addComponent(saleButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMoneyActionPerformed
        
    }//GEN-LAST:event_txtMoneyActionPerformed

    private void purchaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseButtonActionPerformed
        try{
            Object[] info = {model.getRowCount() + 1, "P", new java.util.Date(),txtMoney.getText()};
         model.addRow(info);
         String amountText = txtMoney.getText();
         double amount = Double.parseDouble(amountText);
         total+=amount; 
         jLabel1.setText("Total:" + total);
        } catch (NumberFormatException ex){
          JOptionPane.showMessageDialog(null,"Please enter a valid number.");
        }
        
    }//GEN-LAST:event_purchaseButtonActionPerformed

    private void saleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saleButtonActionPerformed
        try{
            Object[] info = {model.getRowCount() + 1, "S", new java.util.Date(),txtMoney.getText()};
            model.addRow(info);
            String amountText = txtMoney.getText();
            double amount = Double.parseDouble(amountText);
            total-=amount; 
            jLabel1.setText("Total:" + total);
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Please enter a valid number.");
        }
    }//GEN-LAST:event_saleButtonActionPerformed
 
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
            java.util.logging.Logger.getLogger(ProyectWallet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProyectWallet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProyectWallet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProyectWallet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProyectWallet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton purchaseButton;
    private javax.swing.JButton saleButton;
    private javax.swing.JTable tableMoney;
    private javax.swing.JTextField txtMoney;
    // End of variables declaration//GEN-END:variables
}
