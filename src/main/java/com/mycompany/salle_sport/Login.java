
package com.mycompany.salle_sport;
import java.sql.* ;
import javax.swing.border.Border ;
import javax.swing.BorderFactory;
import java.awt.Color ;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        Border borderPanel=BorderFactory.createMatteBorder(3,3,3,3,Color.yellow);
        panelLogin.setBorder(borderPanel);
        Border borderLabel=BorderFactory.createMatteBorder(1,1,1,1,Color.BLACK);
        lblClose.setBorder(borderLabel);
        lblMnmize.setBorder(borderLabel);
        Border borderTextField =BorderFactory.createMatteBorder(1,1,1,1,Color.white);
        txtUsername.setBorder(borderTextField);
        txtPassoword.setBorder(borderTextField);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        lblMnmize = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        lblRegister = new javax.swing.JLabel();
        txtPassoword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 500));
        setMinimumSize(new java.awt.Dimension(200, 150));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLogin.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");
        jLabel1.setOpaque(true);

        lblClose.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblClose.setText("X");
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCloseMouseExited(evt);
            }
        });

        lblMnmize.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        lblMnmize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMnmize.setText("-");
        lblMnmize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMnmizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMnmizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMnmizeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addContainerGap(184, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(lblMnmize, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(18, 18, 18))
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMnmize, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(panelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 60));

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nom d'utilisateur :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 120, 30));

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Mot de passe :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 130, 30));

        txtUsername.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 93, 250, 40));

        btnLogin.setBackground(new java.awt.Color(0, 204, 0));
        btnLogin.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnLogin.setText("Connexion");
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 270, 40));

        lblRegister.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblRegister.setForeground(new java.awt.Color(255, 0, 0));
        lblRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegister.setText("Pas de compte ? Créez-en un");
        lblRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegisterMouseClicked(evt);
            }
        });
        getContentPane().add(lblRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 270, 40));

        txtPassoword.setText("jPasswordField1");
        getContentPane().add(txtPassoword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 250, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if (checkEmptyFields())//si les champs est vide afficher une fenetre qui contient
            JOptionPane.showMessageDialog(null,"Veuillez entrer votre nom d'utilisateur et votre mot de passe."," Informations manquantes",JOptionPane.ERROR_MESSAGE);
        else {//sinon en faire la connexion avec la base de donne et en comparer avec celui qui existe
            PreparedStatement ps ;
            ResultSet rs;
            String username =txtUsername.getText();
            String password =String.valueOf(txtPassoword.getPassword());
            String query ="select username from gestion_salle.users where username =? and password=?";
            try{
               ps =ConnexionDB.getConnection().prepareStatement(query);
               ps.setString(1,username);
               ps.setString(2,password);
               rs=ps.executeQuery();
               if(rs.next()){
                   menu menu =new menu();
                   menu.setVisible(true);//affiche la fentre de menu
                   menu.setLocationRelativeTo(null);
                   this.dispose();//disparu la fenetre de Login
                   
               }
               else{
                   JOptionPane.showMessageDialog(null,"Aucun utilisateur avec ce nom d'utilisateur ou ce mot de passe","Données incorrectes",JOptionPane.ERROR_MESSAGE);
                   
               }
            }
            catch(Exception ex){
                
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
        btnLogin.setBackground(new Color(1,155,102));
    }//GEN-LAST:event_btnLoginMouseEntered

    private void lblCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseEntered
        Border borderLabel=BorderFactory.createMatteBorder(1,1,1,1,Color.white);
        lblClose.setBorder(borderLabel);
        lblClose.setForeground(Color.white);
    }//GEN-LAST:event_lblCloseMouseEntered

    private void lblMnmizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMnmizeMouseEntered
        Border borderLabel=BorderFactory.createMatteBorder(1,1,1,1,Color.white);
        lblMnmize.setBorder(borderLabel); 
        lblMnmize.setForeground(Color.white);
    }//GEN-LAST:event_lblMnmizeMouseEntered

    private void lblCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseExited
        Border borderLabel=BorderFactory.createMatteBorder(1,1,1,1,Color.black);
        lblClose.setBorder(borderLabel);
        lblClose.setForeground(Color.black);
    }//GEN-LAST:event_lblCloseMouseExited

    private void lblMnmizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMnmizeMouseExited
        Border borderLabel=BorderFactory.createMatteBorder(1,1,1,1,Color.black);
        lblMnmize.setBorder(borderLabel);
        lblMnmize.setForeground(Color.black);
    }//GEN-LAST:event_lblMnmizeMouseExited

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblMnmizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMnmizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblMnmizeMouseClicked

    private void lblRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMouseClicked
        Register register =new Register();
        register.setVisible(true);
        register.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_lblRegisterMouseClicked
// fonction qui verifier est ce que les champ est vide ou non et return leur valeur 
    private boolean checkEmptyFields(){
        return (txtUsername.getText().equals("")|| txtPassoword.getText().equals(""));

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login login=new Login();
                login.setVisible(true);
                login.setLocationRelativeTo(null);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblMnmize;
    private javax.swing.JLabel lblRegister;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPasswordField txtPassoword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
