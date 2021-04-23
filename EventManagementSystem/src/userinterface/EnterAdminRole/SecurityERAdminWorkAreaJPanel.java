package userinterface.EnterAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author gowtham
 */
public class SecurityERAdminWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem system;
    Network network;
    UserAccount account;
    Organization organization;

    /**
     * Creates new form AdminWorkAreaJPanel
     *
     * @param userProcessContainer
     * @param account
     * @param organization
     * @param enterprise
     * @param business
     * @param network
     */
    public SecurityERAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = business;
        this.network = network;
        this.enterprise = enterprise;
        this.organization = organization;
        manageOrganization();
    }

    private void manageOrganization() {
        SecurityERManageOrgJPanel SecurityManageOrgJPanel = new SecurityERManageOrgJPanel(enterprise.getOrganizationDirectory());
        workAreaPanel.add("SecurityERManageOrgJPanel", SecurityManageOrgJPanel);
        CardLayout layout = (CardLayout) workAreaPanel.getLayout();
        layout.next(workAreaPanel);
    }

    private void manageEmployee() {
        SecurityERManageEmpJPanel securityManageEmpJPanel = new SecurityERManageEmpJPanel(enterprise.getOrganizationDirectory());
        workAreaPanel.add("SecurityERManageEmpJPanel", securityManageEmpJPanel);
        CardLayout layout = (CardLayout) workAreaPanel.getLayout();
        layout.next(workAreaPanel);
    }

    private void manageUsers() {
        SecurityERManageUsersJPanel securityerManageUsersJPanel = new SecurityERManageUsersJPanel(enterprise, system, organization);
        workAreaPanel.add("SecurityERManageUsersJPanel", securityerManageUsersJPanel);
        CardLayout layout = (CardLayout) workAreaPanel.getLayout();
        layout.next(workAreaPanel);
    }

    private void manageRequests() {
        GeoInfraManageWorkReqsJPanel geoInfraManageWorkReqsJPanel = new GeoInfraManageWorkReqsJPanel(enterprise);
        workAreaPanel.add("GeoInfraManageWorkReqsJPanel", geoInfraManageWorkReqsJPanel);
        CardLayout layout = (CardLayout) workAreaPanel.getLayout();
        layout.next(workAreaPanel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        systemAdminPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        manageOrgPanel = new javax.swing.JPanel();
        manageOrganization = new javax.swing.JLabel();
        manageEmp = new javax.swing.JPanel();
        manageEmployeeLabel = new javax.swing.JLabel();
        manageUserAcc = new javax.swing.JPanel();
        manageUserAccountLabel = new javax.swing.JLabel();
        lblHeading = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        workAreaPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(241, 241, 242));
        setPreferredSize(new java.awt.Dimension(1338, 840));
        setLayout(new java.awt.BorderLayout());

        systemAdminPanel.setBackground(new java.awt.Color(241, 241, 242));
        systemAdminPanel.setMinimumSize(new java.awt.Dimension(1338, 840));
        systemAdminPanel.setPreferredSize(new java.awt.Dimension(1338, 840));

        menuPanel.setBackground(new java.awt.Color(204, 204, 255));
        menuPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuPanel.setMinimumSize(new java.awt.Dimension(280, 840));
        menuPanel.setPreferredSize(new java.awt.Dimension(280, 840));
        menuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageOrgPanel.setBackground(new java.awt.Color(204, 204, 255));
        manageOrgPanel.setToolTipText("");
        manageOrgPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageOrgPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageOrgPanelMousePressed(evt);
            }
        });

        manageOrganization.setBackground(new java.awt.Color(215, 81, 81));
        manageOrganization.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        manageOrganization.setText("Manage Organization");
        manageOrganization.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageOrganizationMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageOrgPanelLayout = new javax.swing.GroupLayout(manageOrgPanel);
        manageOrgPanel.setLayout(manageOrgPanelLayout);
        manageOrgPanelLayout.setHorizontalGroup(
            manageOrgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageOrgPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(manageOrganization)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        manageOrgPanelLayout.setVerticalGroup(
            manageOrgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageOrgPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageOrganization, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        menuPanel.add(manageOrgPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 240, 40));

        manageEmp.setBackground(new java.awt.Color(204, 204, 255));
        manageEmp.setToolTipText("");
        manageEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageEmp.setPreferredSize(new java.awt.Dimension(264, 48));
        manageEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageEmpMousePressed(evt);
            }
        });

        manageEmployeeLabel.setBackground(new java.awt.Color(215, 81, 81));
        manageEmployeeLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        manageEmployeeLabel.setText("Manage Team");
        manageEmployeeLabel.setAutoscrolls(true);
        manageEmployeeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageEmployeeLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageEmpLayout = new javax.swing.GroupLayout(manageEmp);
        manageEmp.setLayout(manageEmpLayout);
        manageEmpLayout.setHorizontalGroup(
            manageEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageEmpLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(manageEmployeeLabel)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        manageEmpLayout.setVerticalGroup(
            manageEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageEmpLayout.createSequentialGroup()
                .addComponent(manageEmployeeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        menuPanel.add(manageEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 240, 40));

        manageUserAcc.setBackground(new java.awt.Color(204, 204, 255));
        manageUserAcc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageUserAcc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageUserAccMousePressed(evt);
            }
        });

        manageUserAccountLabel.setBackground(new java.awt.Color(215, 81, 81));
        manageUserAccountLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        manageUserAccountLabel.setText("Manage Users");
        manageUserAccountLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageUserAccountLabel.setPreferredSize(new java.awt.Dimension(115, 16));

        javax.swing.GroupLayout manageUserAccLayout = new javax.swing.GroupLayout(manageUserAcc);
        manageUserAcc.setLayout(manageUserAccLayout);
        manageUserAccLayout.setHorizontalGroup(
            manageUserAccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageUserAccLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(manageUserAccountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        manageUserAccLayout.setVerticalGroup(
            manageUserAccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(manageUserAccountLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        menuPanel.add(manageUserAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 250, 40));

        lblHeading.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblHeading.setText("Security ER Enterprise");
        menuPanel.add(lblHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 220, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        menuPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 280, 10));
        menuPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 280, 10));

        workAreaPanel.setBackground(new java.awt.Color(204, 204, 255));
        workAreaPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        workAreaPanel.setPreferredSize(new java.awt.Dimension(1058, 840));
        workAreaPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout systemAdminPanelLayout = new javax.swing.GroupLayout(systemAdminPanel);
        systemAdminPanel.setLayout(systemAdminPanelLayout);
        systemAdminPanelLayout.setHorizontalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(systemAdminPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(workAreaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1052, Short.MAX_VALUE))
        );
        systemAdminPanelLayout.setVerticalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, systemAdminPanelLayout.createSequentialGroup()
                .addGroup(systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(workAreaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        add(systemAdminPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void manageOrganizationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageOrganizationMousePressed
        manageOrganization();
    }//GEN-LAST:event_manageOrganizationMousePressed

    private void manageOrgPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageOrgPanelMousePressed
        // TODO add your handling code here:
        manageOrganization();
    }//GEN-LAST:event_manageOrgPanelMousePressed

    private void manageEmployeeLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageEmployeeLabelMousePressed
        manageEmployee();
    }//GEN-LAST:event_manageEmployeeLabelMousePressed

    private void manageEmpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageEmpMousePressed
        // TODO add your handling code here:
        manageEmployee();
    }//GEN-LAST:event_manageEmpMousePressed

    private void manageUserAccMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageUserAccMousePressed
        manageUsers();
    }//GEN-LAST:event_manageUserAccMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JPanel manageEmp;
    private javax.swing.JLabel manageEmployeeLabel;
    private javax.swing.JPanel manageOrgPanel;
    private javax.swing.JLabel manageOrganization;
    private javax.swing.JPanel manageUserAcc;
    private javax.swing.JLabel manageUserAccountLabel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JPanel systemAdminPanel;
    private javax.swing.JPanel workAreaPanel;
    // End of variables declaration//GEN-END:variables

}
