/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.EcoSystem;
import Business.DB4OUtil.DB4OUtil;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import userinterface.UserRegistration.UserRegistrationJPanel;

/**
 *
 * @author Saivignesh Sridhar
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    UserAccount userAccount;
    Enterprise ent;
    Organization org;
    Network net;

    public MainJFrame() {
        this.setUndecorated(true);
        initComponents();
        system = dB4OUtil.retrieveSystem();
        EcoSystem.setInstance(system);
        loginJPanel.setVisible(true);
        container.setVisible(false);
        topPanel.setVisible(false);
        getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.cyan));
    }

    private void shiftPanel(UserAccount userAccount) {

        if (userAccount != null && userAccount.getRole() != null) {
            String greetText = "Welcome, ";

            greetText = greetText + " " + userAccount.getUsername();
            container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, org, ent, net, system));

            lbl_Greetings.setText(greetText + " !!!");
            CardLayout layout = (CardLayout) container.getLayout();
            layout.next(container);
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

        topPanel = new javax.swing.JPanel();
        btnLogoutLabel = new javax.swing.JLabel();
        lbl_Greetings = new javax.swing.JLabel();
        btnBackLabel = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        loginJPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbl_content1 = new javax.swing.JLabel();
        lbl_heading = new javax.swing.JLabel();
        lbl_content2 = new javax.swing.JLabel();
        lbl_logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbl_uName = new javax.swing.JPanel();
        un_img = new javax.swing.JLabel();
        userNameJTextField = new javax.swing.JTextField();
        lbl_pwd = new javax.swing.JPanel();
        pwd_img = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JLabel();
        cancelButton = new javax.swing.JLabel();
        btnRegister = new javax.swing.JLabel();
        lbl_logo3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 23, 1338, 900));
        setMinimumSize(new java.awt.Dimension(1338, 900));
        setSize(new java.awt.Dimension(1338, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        topPanel.setBackground(new java.awt.Color(41, 50, 80));
        topPanel.setMinimumSize(new java.awt.Dimension(1338, 60));
        topPanel.setPreferredSize(new java.awt.Dimension(1338, 60));
        topPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogoutLabel.setBackground(new java.awt.Color(204, 204, 255));
        btnLogoutLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLogoutLabel.setForeground(new java.awt.Color(204, 204, 255));
        btnLogoutLabel.setText("LOGOUT");
        btnLogoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLogoutLabelMousePressed(evt);
            }
        });
        topPanel.add(btnLogoutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 0, 70, 60));

        lbl_Greetings.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Greetings.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lbl_Greetings.setForeground(new java.awt.Color(255, 255, 255));
        topPanel.add(lbl_Greetings, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 690, 60));

        btnBackLabel.setBackground(new java.awt.Color(204, 204, 255));
        btnBackLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBackLabel.setForeground(new java.awt.Color(204, 204, 255));
        btnBackLabel.setText("CLOSE");
        btnBackLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBackLabelMousePressed(evt);
            }
        });
        topPanel.add(btnBackLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 0, 90, 60));

        getContentPane().add(topPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, -1));

        container.setBackground(new java.awt.Color(204, 204, 255));
        container.setForeground(new java.awt.Color(31, 50, 97));
        container.setPreferredSize(new java.awt.Dimension(1338, 840));
        container.setLayout(new java.awt.CardLayout());
        getContentPane().add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 61, 1390, 1050));

        loginJPanel.setBackground(new java.awt.Color(204, 204, 255));
        loginJPanel.setPreferredSize(new java.awt.Dimension(1338, 900));
        loginJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setPreferredSize(new java.awt.Dimension(554, 840));

        lbl_content1.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lbl_content1.setForeground(new java.awt.Color(204, 204, 255));
        lbl_content1.setText("Any event to be hosted?");

        lbl_heading.setFont(new java.awt.Font("Bauhaus 93", 1, 36)); // NOI18N
        lbl_heading.setForeground(new java.awt.Color(153, 153, 255));
        lbl_heading.setText("Eventura Solutions");

        lbl_content2.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lbl_content2.setForeground(new java.awt.Color(204, 204, 255));
        lbl_content2.setText("You are at the right place!");

        lbl_logo.setBackground(new java.awt.Color(0, 0, 51));
        lbl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/event.png"))); // NOI18N
        lbl_logo.setPreferredSize(new java.awt.Dimension(600, 840));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/confetti_1_349x135.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbl_heading, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_content2)
                            .addComponent(lbl_content1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_heading, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_content1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_content2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lbl_logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
        );

        loginJPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 784, 1110));

        lbl_uName.setBackground(new java.awt.Color(204, 204, 255));
        lbl_uName.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 51)));
        lbl_uName.setPreferredSize(new java.awt.Dimension(302, 34));

        un_img.setBackground(new java.awt.Color(25, 56, 82));
        un_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        un_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user blue.png"))); // NOI18N

        userNameJTextField.setBackground(new java.awt.Color(204, 204, 255));
        userNameJTextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        userNameJTextField.setForeground(new java.awt.Color(0, 0, 51));
        userNameJTextField.setToolTipText("");
        userNameJTextField.setBorder(null);
        userNameJTextField.setCaretColor(new java.awt.Color(255, 255, 255));
        userNameJTextField.setDisabledTextColor(new java.awt.Color(16, 10, 55));
        userNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameJTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lbl_uNameLayout = new javax.swing.GroupLayout(lbl_uName);
        lbl_uName.setLayout(lbl_uNameLayout);
        lbl_uNameLayout.setHorizontalGroup(
            lbl_uNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbl_uNameLayout.createSequentialGroup()
                .addComponent(un_img, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userNameJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))
        );
        lbl_uNameLayout.setVerticalGroup(
            lbl_uNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(un_img, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(userNameJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        loginJPanel.add(lbl_uName, new org.netbeans.lib.awtextra.AbsoluteConstraints(848, 131, 304, 37));

        lbl_pwd.setBackground(new java.awt.Color(204, 204, 255));
        lbl_pwd.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 51)));
        lbl_pwd.setPreferredSize(new java.awt.Dimension(302, 34));

        pwd_img.setBackground(new java.awt.Color(41, 50, 80));
        pwd_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pwd_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/images.png"))); // NOI18N

        passwordField.setBackground(new java.awt.Color(204, 204, 255));
        passwordField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        passwordField.setForeground(new java.awt.Color(0, 0, 51));
        passwordField.setBorder(null);
        passwordField.setCaretColor(new java.awt.Color(255, 255, 255));
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lbl_pwdLayout = new javax.swing.GroupLayout(lbl_pwd);
        lbl_pwd.setLayout(lbl_pwdLayout);
        lbl_pwdLayout.setHorizontalGroup(
            lbl_pwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lbl_pwdLayout.createSequentialGroup()
                .addComponent(pwd_img, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        lbl_pwdLayout.setVerticalGroup(
            lbl_pwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pwd_img, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        loginJPanel.add(lbl_pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(848, 193, 304, -1));

        loginButton.setBackground(new java.awt.Color(0, 0, 51));
        loginButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        loginButton.setForeground(new java.awt.Color(0, 0, 51));
        loginButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginButton.setText("LOGIN");
        loginButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 51)));
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginButtonMousePressed(evt);
            }
        });
        loginJPanel.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(848, 255, 304, 33));

        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cancelButtonMousePressed(evt);
            }
        });
        loginJPanel.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1282, 11, -1, -1));

        btnRegister.setBackground(new java.awt.Color(0, 0, 51));
        btnRegister.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(0, 0, 51));
        btnRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegister.setText("REGISTER HERE!");
        btnRegister.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 51)));
        btnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRegisterMousePressed(evt);
            }
        });
        loginJPanel.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(848, 316, 304, 33));

        lbl_logo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_logo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/welcome.png"))); // NOI18N
        loginJPanel.add(lbl_logo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 390, 340, 340));

        getContentPane().add(loginJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 1110));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutLabelMousePressed
        container.removeAll();
        dB4OUtil.storeSystem(system);
        loginJPanel.setVisible(true);
        container.setVisible(false);
        topPanel.setVisible(false);
    }//GEN-LAST:event_btnLogoutLabelMousePressed

    private void userNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameJTextFieldActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void loginButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMousePressed
        // TODO add your handling code here:
        String userName = userNameJTextField.getText();
        String password  = String.valueOf(passwordField.getPassword());
       
        if (userName.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter valid user credentials to login!");
        } else {
            userAccount = system.getUserAccountDirectory().authenticateUser(userName, password);
            ent = null;
            org = null;
            net = null;

            if (userAccount == null) {
                for (Network network : system.getNetworkList()) {
                    //Step 2.a: check against each enterprise
                    for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                        userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                        net = network;
                        if (userAccount == null) {
                            //Step 3:check against each organization for each enterprise
                            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                                userAccount = organization.getUserAccountDirectory().authenticateUser(userName, password);
                                if (userAccount != null) {
                                    ent = enterprise;
                                    org = organization;
                                    net = network;
                                    break;
                                }
                            }

                        } else {
                            ent = enterprise;
                            break;
                        }
                        if (org != null) {
                            break;
                        }
                    }
                    if (ent != null) {
                        break;
                    }
                }
            }
            if (userAccount == null) {
                JOptionPane.showMessageDialog(null, "Invalid user credentials, Please Try again!");
                return;
            } else {
                loginJPanel.setVisible(false);
                container.setVisible(true);
                topPanel.setVisible(true);
                btnLogoutLabel.setVisible(true);
                btnBackLabel.setVisible(false);
                userNameJTextField.setText("");
                passwordField.setText("");
                shiftPanel(userAccount);
            }
        }
    }//GEN-LAST:event_loginButtonMousePressed

    private void cancelButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMousePressed
        // TODO add your handling code here:
        dB4OUtil.storeSystem(system);
        System.exit(0);
    }//GEN-LAST:event_cancelButtonMousePressed

    private void btnRegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMousePressed
        // TODO add your handling code here:
        UserRegistrationJPanel panel = new UserRegistrationJPanel(container, system);
        lbl_Greetings.setText("Welcome to Eventura!");
        loginJPanel.setVisible(false);
        container.setVisible(true);
        topPanel.setVisible(true);
        btnLogoutLabel.setVisible(false);
        btnBackLabel.setVisible(true);
        userNameJTextField.setText("");
        passwordField.setText("");
        container.add("workArea", panel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);

    }//GEN-LAST:event_btnRegisterMousePressed

    private void btnBackLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackLabelMousePressed
        // TODO add your handling code here:
        container.removeAll();
        dB4OUtil.storeSystem(system);
        loginJPanel.setVisible(true);
        container.setVisible(false);
        topPanel.setVisible(false);
    }//GEN-LAST:event_btnBackLabelMousePressed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBackLabel;
    private javax.swing.JLabel btnLogoutLabel;
    private javax.swing.JLabel btnRegister;
    private javax.swing.JLabel cancelButton;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_Greetings;
    private javax.swing.JLabel lbl_content1;
    private javax.swing.JLabel lbl_content2;
    private javax.swing.JLabel lbl_heading;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_logo3;
    private javax.swing.JPanel lbl_pwd;
    private javax.swing.JPanel lbl_uName;
    private javax.swing.JLabel loginButton;
    private javax.swing.JPanel loginJPanel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel pwd_img;
    private javax.swing.JPanel topPanel;
    private javax.swing.JLabel un_img;
    private javax.swing.JTextField userNameJTextField;
    // End of variables declaration//GEN-END:variables

}
