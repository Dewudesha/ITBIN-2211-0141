/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.text.View;



/**
 *
 * @author user
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        orders = new javax.swing.JButton();
        itemStore = new javax.swing.JButton();
        View1 = new javax.swing.JButton();
        Suppliers = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        orders.setBackground(new java.awt.Color(153, 51, 0));
        orders.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        orders.setForeground(new java.awt.Color(255, 255, 255));
        orders.setText("View");
        orders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordersActionPerformed(evt);
            }
        });
        getContentPane().add(orders, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 300, 90));

        itemStore.setBackground(new java.awt.Color(153, 51, 0));
        itemStore.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        itemStore.setForeground(new java.awt.Color(255, 255, 255));
        itemStore.setText("Item Store");
        itemStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemStoreActionPerformed(evt);
            }
        });
        getContentPane().add(itemStore, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 300, 90));

        View1.setBackground(new java.awt.Color(153, 51, 0));
        View1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        View1.setForeground(new java.awt.Color(255, 255, 255));
        View1.setText("Suppliers");
        View1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View1ActionPerformed(evt);
            }
        });
        getContentPane().add(View1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 300, 90));

        Suppliers.setBackground(new java.awt.Color(153, 51, 0));
        Suppliers.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Suppliers.setForeground(new java.awt.Color(255, 255, 255));
        Suppliers.setText("Orders");
        Suppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuppliersActionPerformed(evt);
            }
        });
        getContentPane().add(Suppliers, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 300, 90));

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("HOME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel2)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 80));

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Log Out");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, 110, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/choco home.png"))); // NOI18N
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        this.setVisible(false);
        this.hide();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void itemStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemStoreActionPerformed
       
        ItemStore is = new ItemStore();
        is.setVisible(true);
       
        
    }//GEN-LAST:event_itemStoreActionPerformed

    private void ordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordersActionPerformed
        
        ViewItem vi = new ViewItem();
        vi.setVisible(true);
        
        
    }//GEN-LAST:event_ordersActionPerformed

    private void View1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View1ActionPerformed
        // TODO add your handling code here:
       Suppliers s =new Suppliers();
       s.setVisible(true);
        
    }//GEN-LAST:event_View1ActionPerformed

    private void SuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuppliersActionPerformed
       
        Orders o = new Orders();
        o.setVisible(true);
    }//GEN-LAST:event_SuppliersActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Suppliers;
    private javax.swing.JButton View1;
    private javax.swing.JButton itemStore;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton orders;
    // End of variables declaration//GEN-END:variables
}
