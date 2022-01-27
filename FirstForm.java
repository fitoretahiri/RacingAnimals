package com.mycompany.mavenkafshetgaruese;
import java.util.Vector;
import javax.swing.JOptionPane;


public class FirstForm extends javax.swing.JFrame {
    
    public FirstForm() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        teksti1 = new javax.swing.JTextField();
        teksti2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        teksti3 = new javax.swing.JTextField();
        teksti4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        teksti1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teksti1ActionPerformed(evt);
            }
        });
        getContentPane().add(teksti1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 440, 30));

        teksti2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teksti2ActionPerformed(evt);
            }
        });
        getContentPane().add(teksti2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 440, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Shkruani emrin e kafshes se pare:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 231, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Shkruani emrin e kafshes se dyte:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 231, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Vazhdo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 110, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Shkruani emrin e kafshes se trete:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 231, -1));

        teksti3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teksti3ActionPerformed(evt);
            }
        });
        getContentPane().add(teksti3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 440, 30));

        teksti4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teksti4ActionPerformed(evt);
            }
        });
        getContentPane().add(teksti4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 440, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Shkruani emrin e kafshes se katert:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 231, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\fitor\\OneDrive\\Documents\\NetBeansProjects\\mavenKafshetGaruese\\src\\main\\java\\com\\mycompany\\mavenkafshetgaruese\\an.jpg")); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void teksti1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teksti1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teksti1ActionPerformed

    private void teksti2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teksti2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teksti2ActionPerformed

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MainForm mf=new MainForm();
            FirstForm h=null;
            String emri1=teksti1.getText();
            String emri2=teksti2.getText();
            String emri3=teksti3.getText();
            String emri4=teksti4.getText();
          while(!teksti1.getText().isEmpty() && !teksti2.getText().isEmpty() && !teksti3.getText().isEmpty() && !teksti4.getText().isEmpty()){
           
            mf.show();//Hapja e dritares MainFrame
            mf.jLabel1.setText(emri1);
            mf.jLabel2.setText(emri2);
            mf.jLabel3.setText(emri3);
            mf.jLabel4.setText(emri4);            
            dispose();//Mbyllja e dritares se pare pasi te hapet dritarja MainFrame
            break;
       }
        if(emri1.isEmpty() || emri2.isEmpty() || emri3.isEmpty() || emri4.isEmpty()){
            JOptionPane.showMessageDialog(null,"Nuk eshte shkruar emri i ndonjeres kafshe!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void teksti3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teksti3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teksti3ActionPerformed

    private void teksti4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teksti4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teksti4ActionPerformed

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
            java.util.logging.Logger.getLogger(FirstForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirstForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField teksti1;
    private javax.swing.JTextField teksti2;
    private javax.swing.JTextField teksti3;
    private javax.swing.JTextField teksti4;
    // End of variables declaration//GEN-END:variables
}
