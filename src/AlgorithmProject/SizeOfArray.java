/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgorithmProject;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class SizeOfArray extends javax.swing.JFrame {

    /**
     * Creates new form SizeOfArray
     */
    public SizeOfArray() {
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

        jLabel1 = new javax.swing.JLabel();
        size = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 500));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter size of array");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(353, 115, 227, 34);

        size.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        size.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeActionPerformed(evt);
            }
        });
        size.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sizeKeyTyped(evt);
            }
        });
        getContentPane().add(size);
        size.setBounds(415, 240, 100, 40);

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(415, 377, 100, 31);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AlgorithmProject/dark-wood.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 900, 500);
    }// </editor-fold>//GEN-END:initComponents

    private void sizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sizeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        if(size.getText().equals("")){
            JOptionPane.showMessageDialog(null, "please enter size of array", "Wrong", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int n=Integer.parseInt(size.getText());
        if(n>10){
            JOptionPane.showMessageDialog(null,"Not more than 10","Wrong", JOptionPane.ERROR_MESSAGE);
        }
        else{
            
            setVisible(false);
            new ElementsOfArray(n).setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sizeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sizeKeyTyped
        // TODO add your handling code here:
        char vchar=evt.getKeyChar();
        if(!(Character.isDigit(vchar))
                ||(vchar==KeyEvent.VK_BACK_SPACE)
                ||(vchar==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_sizeKeyTyped

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
            java.util.logging.Logger.getLogger(SizeOfArray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SizeOfArray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SizeOfArray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SizeOfArray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SizeOfArray().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField size;
    // End of variables declaration//GEN-END:variables
}
