/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.EnterAdminRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Saivignesh Sridhar
 */
public class GovtManageUsersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VoluntaryOperatingUnitManageUserJPanel
     */
    private final Enterprise enterprise;
    private final EcoSystem ecosystem;
    Organization organization;

    public GovtManageUsersJPanel(Enterprise enterprise, EcoSystem system, Organization organization) {

        initComponents();
        this.enterprise = enterprise;
        this.ecosystem = system;
        this.organization = organization;
        populateOrganizationComboBox();
        populateData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUserDetails = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        createUsername = new javax.swing.JTextField();
        selectRole = new javax.swing.JComboBox();
        selectEmployee = new javax.swing.JComboBox();
        selectOrganization = new javax.swing.JComboBox();
        createUserJButton = new javax.swing.JButton();
        createPassword = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(204, 204, 255));
        setMinimumSize(new java.awt.Dimension(1058, 840));
        setPreferredSize(new java.awt.Dimension(1058, 840));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(25, 56, 82));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("MANAGE GOVT AUTHORITY OFFICIALS");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 638, -1));

        jScrollPane1.setForeground(new java.awt.Color(0, 102, 255));

        tblUserDetails.setBackground(new java.awt.Color(204, 204, 255));
        tblUserDetails.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        tblUserDetails.setForeground(new java.awt.Color(25, 56, 82));
        tblUserDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUserDetails.setSelectionBackground(new java.awt.Color(56, 90, 174));
        jScrollPane1.setViewportView(tblUserDetails);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 638, 179));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(25, 56, 82));
        jLabel6.setText("Organization");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(25, 56, 82));
        jLabel3.setText("Employee");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, -1, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(25, 56, 82));
        jLabel4.setText("Role");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, -1, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(25, 56, 82));
        jLabel1.setText("User Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(25, 56, 82));
        jLabel2.setText("Password");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 520, -1, -1));

        createUsername.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        createUsername.setForeground(new java.awt.Color(25, 56, 82));
        add(createUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 470, 260, -1));

        selectRole.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        selectRole.setForeground(new java.awt.Color(25, 56, 82));
        selectRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectRoleActionPerformed(evt);
            }
        });
        add(selectRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, 260, -1));

        selectEmployee.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        selectEmployee.setForeground(new java.awt.Color(25, 56, 82));
        selectEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectEmployeeActionPerformed(evt);
            }
        });
        add(selectEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, 260, -1));

        selectOrganization.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        selectOrganization.setForeground(new java.awt.Color(25, 56, 82));
        selectOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectOrganizationActionPerformed(evt);
            }
        });
        add(selectOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, 260, -1));

        createUserJButton.setBackground(new java.awt.Color(255, 255, 255));
        createUserJButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        createUserJButton.setForeground(new java.awt.Color(25, 56, 82));
        createUserJButton.setText("Create User");
        createUserJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createUserJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserJButtonActionPerformed(evt);
            }
        });
        add(createUserJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 570, 145, -1));

        createPassword.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        createPassword.setForeground(new java.awt.Color(25, 56, 82));
        add(createPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 510, 260, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void selectRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectRoleActionPerformed

    private void selectEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectEmployeeActionPerformed

    private void selectOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectOrganizationActionPerformed
        Organization org = (Organization) selectOrganization.getSelectedItem();
        if (org != null) {
            populateEmployeeComboBox(org);
            popRoleComboBox(org);
        }
    }//GEN-LAST:event_selectOrganizationActionPerformed

    private void createUserJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserJButtonActionPerformed
        String username = createUsername.getText();
        String password = createPassword.getText();
        if ("".equals(username) || "".equals(password)|| selectOrganization.getSelectedItem() == null
                || selectEmployee.getSelectedItem() == null || selectRole.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Please enter all required fields!");
            return;
        }
        if (!ecosystem.validatePassword(password)) {
            return;
        }
        if (!ecosystem.checkIfUserIsUnique(username)) {
            return;
        }
        Organization org = (Organization) selectOrganization.getSelectedItem();
        Employee employee = (Employee) selectEmployee.getSelectedItem();
        Role role = (Role) selectRole.getSelectedItem();
        org.getUserAccountDirectory().createUserAccount(username, password, employee, role);
        populateData();
        createUsername.setText("");
        createPassword.setText("");
        JOptionPane.showMessageDialog(null, "User created successfully");
    }//GEN-LAST:event_createUserJButtonActionPerformed

    public void populateOrganizationComboBox() {
        selectOrganization.removeAllItems();
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            selectOrganization.addItem(org);
        }
    }

    public void populateData() {
        DefaultTableModel model = (DefaultTableModel) tblUserDetails.getModel();

        model.setRowCount(0);

        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[2];
                row[0] = ua.getUsername();
                row[1] = ua.getRole();
                ((DefaultTableModel) tblUserDetails.getModel()).addRow(row);
            }
        }
    }

    public void populateEmployeeComboBox(Organization organization) {
        selectEmployee.removeAllItems();

        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()) {
            selectEmployee.addItem(employee);
        }
    }

    private void popRoleComboBox(Organization organization) {
        selectRole.removeAllItems();
        for (Role role : organization.getSupportedRole()) {
            selectRole.addItem(role);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField createPassword;
    private javax.swing.JButton createUserJButton;
    private javax.swing.JTextField createUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox selectEmployee;
    private javax.swing.JComboBox selectOrganization;
    private javax.swing.JComboBox selectRole;
    private javax.swing.JTable tblUserDetails;
    // End of variables declaration//GEN-END:variables
}
