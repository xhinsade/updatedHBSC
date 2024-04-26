package house_cleaning_booking_system;

import javax.swing.JOptionPane;


public class RESET_CONFIRM extends javax.swing.JFrame {

    
    public RESET_CONFIRM() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rc_txtusername = new javax.swing.JLabel();
        rc_txtconfirmnewpassword = new javax.swing.JLabel();
        rc_txtverificationcode = new javax.swing.JLabel();
        rc_txtphonenumber = new javax.swing.JLabel();
        rc_username = new javax.swing.JTextField();
        rc_confirmnewpassword = new javax.swing.JTextField();
        rc_verificationcode = new javax.swing.JTextField();
        rc_phonenumber = new javax.swing.JTextField();
        rc_sendcodebutton = new javax.swing.JButton();
        rc_resetpasswordbutton = new javax.swing.JButton();
        rc_cancelbutton = new javax.swing.JButton();
        rc_txt = new javax.swing.JLabel();
        rc_txtnewpassword = new javax.swing.JLabel();
        rc_newpassword = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 0, 51));

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("FIND YOUR ACCOUNT");
        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "HOUSE CLEANING BOOKING SYSTEM", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Serif", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 110));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rc_txtusername.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        rc_txtusername.setText("USERNAME:");
        jPanel2.add(rc_txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 113, -1));

        rc_txtconfirmnewpassword.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        rc_txtconfirmnewpassword.setText("CONFIRM NEW PASSWORD:");
        jPanel2.add(rc_txtconfirmnewpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 230, -1));

        rc_txtverificationcode.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        rc_txtverificationcode.setText("VERIFICATION CODE:");
        jPanel2.add(rc_txtverificationcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        rc_txtphonenumber.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        rc_txtphonenumber.setText("PHONE NUMBER:");
        jPanel2.add(rc_txtphonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        rc_username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(rc_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 237, 30));

        rc_confirmnewpassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rc_confirmnewpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc_confirmnewpasswordActionPerformed(evt);
            }
        });
        jPanel2.add(rc_confirmnewpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 237, 30));

        rc_verificationcode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rc_verificationcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc_verificationcodeActionPerformed(evt);
            }
        });
        jPanel2.add(rc_verificationcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 237, 30));

        rc_phonenumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(rc_phonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 237, 30));

        rc_sendcodebutton.setBackground(new java.awt.Color(51, 51, 255));
        rc_sendcodebutton.setFont(new java.awt.Font("Verdana", 1, 8)); // NOI18N
        rc_sendcodebutton.setText("SEND CODE");
        rc_sendcodebutton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rc_sendcodebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc_sendcodebuttonActionPerformed(evt);
            }
        });
        jPanel2.add(rc_sendcodebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, -1, 20));

        rc_resetpasswordbutton.setBackground(new java.awt.Color(102, 102, 255));
        rc_resetpasswordbutton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        rc_resetpasswordbutton.setText("RESET PASSWORD");
        rc_resetpasswordbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc_resetpasswordbuttonActionPerformed(evt);
            }
        });
        jPanel2.add(rc_resetpasswordbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 190, -1));

        rc_cancelbutton.setBackground(new java.awt.Color(102, 102, 255));
        rc_cancelbutton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        rc_cancelbutton.setText("CANCEL");
        rc_cancelbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rc_cancelbuttonActionPerformed(evt);
            }
        });
        jPanel2.add(rc_cancelbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 154, -1));

        rc_txt.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        rc_txt.setText("FILL IN THE FOLLOWING:");
        jPanel2.add(rc_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        rc_txtnewpassword.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        rc_txtnewpassword.setText("NEW PASSWORD:");
        jPanel2.add(rc_txtnewpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 130, -1));

        rc_newpassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(rc_newpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 237, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 570, 360));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rc_resetpasswordbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc_resetpasswordbuttonActionPerformed
       
      String username = rc_username.getText();
      String password = rc_newpassword.getText(); // corrected field name
      String confirmpassword = rc_confirmnewpassword.getText(); // corrected field name
      String number = rc_phonenumber.getText();
      String verify = rc_verificationcode.getText();

if (number.isEmpty() || username.isEmpty() || password.isEmpty() || confirmpassword.isEmpty() || verify.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Please fill up the form properly", "Error", JOptionPane.ERROR_MESSAGE);
} else if (!confirmpassword.equals(password)) { // corrected comparison
     JOptionPane.showMessageDialog(this, "Passwords don't match ", "Error", JOptionPane.ERROR_MESSAGE);
} else if (!verify.equals("123456")) {
    JOptionPane.showMessageDialog(this, "Incorrect verification code", "Error", JOptionPane.ERROR_MESSAGE);
} else {
    int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to reset your password for this account?", "Confirmation", JOptionPane.YES_NO_OPTION);
    if (option == JOptionPane.YES_OPTION) {
        JOptionPane.showMessageDialog(null, "You've successfully reset your password for your account");
        HomePage1 home = new HomePage1();
        home.setVisible(true);
        this.dispose();
    } else if (option == JOptionPane.NO_OPTION) {
        this.dispose();
    }
}
    }//GEN-LAST:event_rc_resetpasswordbuttonActionPerformed

    private void rc_cancelbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc_cancelbuttonActionPerformed
       Login login = new Login();
       login.setVisible(true);
    }//GEN-LAST:event_rc_cancelbuttonActionPerformed

    private void rc_sendcodebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc_sendcodebuttonActionPerformed
     JOptionPane.showMessageDialog(null, "PLEASE ENTER THE VERIFICATION CODE\n123456");
    }//GEN-LAST:event_rc_sendcodebuttonActionPerformed

    private void rc_verificationcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc_verificationcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rc_verificationcodeActionPerformed

    private void rc_confirmnewpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rc_confirmnewpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rc_confirmnewpasswordActionPerformed

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
            java.util.logging.Logger.getLogger(RESET_CONFIRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RESET_CONFIRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RESET_CONFIRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RESET_CONFIRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RESET_CONFIRM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton rc_cancelbutton;
    private javax.swing.JTextField rc_confirmnewpassword;
    private javax.swing.JTextField rc_newpassword;
    private javax.swing.JTextField rc_phonenumber;
    private javax.swing.JButton rc_resetpasswordbutton;
    private javax.swing.JButton rc_sendcodebutton;
    private javax.swing.JLabel rc_txt;
    private javax.swing.JLabel rc_txtconfirmnewpassword;
    private javax.swing.JLabel rc_txtnewpassword;
    private javax.swing.JLabel rc_txtphonenumber;
    private javax.swing.JLabel rc_txtusername;
    private javax.swing.JLabel rc_txtverificationcode;
    private javax.swing.JTextField rc_username;
    private javax.swing.JTextField rc_verificationcode;
    // End of variables declaration//GEN-END:variables
}
