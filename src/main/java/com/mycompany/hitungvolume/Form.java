/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hitungvolume;

/**
 *
 * @author Alif Maheaven
 */
public class Form extends javax.swing.JFrame {
    double jari, tinggi, hasil, pi;
    /**
     * Creates new form Form
     */
    public Form() {
        pi = 22/7;
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

        buttonHasil = new javax.swing.JButton();
        tinggiForm = new javax.swing.JTextField();
        jariForm = new javax.swing.JTextField();
        hasilForm = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonHasil.setText("Hasil");
        buttonHasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHasilActionPerformed(evt);
            }
        });
        getContentPane().add(buttonHasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));
        getContentPane().add(tinggiForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 200, -1));

        jariForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jariFormActionPerformed(evt);
            }
        });
        getContentPane().add(jariForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 200, -1));
        getContentPane().add(hasilForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 200, -1));

        jLabel1.setText("Jari Jari");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel2.setText("Tinggi");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel3.setText("hasil akhir");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel4.setText("Meghitung Volume tabung");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonHasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHasilActionPerformed
       jari = Double.parseDouble(jariForm.getText());
       tinggi = Double.parseDouble(tinggiForm.getText());
       
       hasil = jari * jari * pi * tinggi;
       hasilForm.setText(Double.toString(hasil));
    }//GEN-LAST:event_buttonHasilActionPerformed

    private void jariFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jariFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jariFormActionPerformed

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
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonHasil;
    private javax.swing.JTextField hasilForm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jariForm;
    private javax.swing.JTextField tinggiForm;
    // End of variables declaration//GEN-END:variables
}