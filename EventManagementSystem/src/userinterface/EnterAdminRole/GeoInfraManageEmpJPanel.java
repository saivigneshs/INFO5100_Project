/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.EnterAdminRole;

import Business.Employee.Employee;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Saivignesh Sridhar
 */
public class GeoInfraManageEmpJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VoluntaryOperatingUnitManageEmployeeJPanel
     */
    private final OrganizationDirectory organizationDirectory;

    public GeoInfraManageEmpJPanel(OrganizationDirectory organizationDirectory) {
        initComponents();
        this.organizationDirectory = organizationDirectory;
                populateTable();
        populateOrganizationEmployeeComboBox();
        populateTable();
    }

    public void populateOrganizationEmployeeComboBox() {
        organizationEmpJComboBox.removeAllItems();

        for (Organization organization : organizationDirectory.getOrganizationList()) {
             if(!organization.getType().equals(Organization.Type.Host)){
            organizationEmpJComboBox.addItem(organization);
             }
        }
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        model.setRowCount(0);

        for (Organization organization : organizationDirectory.getOrganizationList()) {
             if(! organization.getType().equals(Organization.Type.Host)){
            for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()) {
                Object[] row = new Object[model.getColumnCount()];
                row[0] = employee.getId();
                row[1] = employee.getName();
                model.addRow(row);
            }
             }
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

        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        organizationEmpJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        employeeName = new javax.swing.JTextField();
        addJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setMinimumSize(new java.awt.Dimension(1058, 840));
        setPreferredSize(new java.awt.Dimension(1058, 840));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(25, 56, 82));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("MANAGE GEO INFRA TEAMS");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 492, -1));

        organizationJTable.setBackground(new java.awt.Color(204, 204, 255));
        organizationJTable.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        organizationJTable.setForeground(new java.awt.Color(25, 56, 82));
        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        organizationJTable.setSelectionBackground(new java.awt.Color(56, 90, 174));
        jScrollPane1.setViewportView(organizationJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 560, 170));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(25, 56, 82));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CREATE A TEAM");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 465, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(25, 56, 82));
        jLabel3.setText("Organization");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, -1, 27));

        organizationEmpJComboBox.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        organizationEmpJComboBox.setForeground(new java.awt.Color(25, 56, 82));
        add(organizationEmpJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 163, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(25, 56, 82));
        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, -1, -1));

        employeeName.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        employeeName.setForeground(new java.awt.Color(25, 56, 82));
        employeeName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                employeeNameKeyPressed(evt);
            }
        });
        add(employeeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 500, 163, -1));

        addJButton.setBackground(new java.awt.Color(255, 255, 255));
        addJButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        addJButton.setForeground(new java.awt.Color(25, 56, 82));
        addJButton.setText("Create Team");
        addJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });
        add(addJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 560, 130, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void employeeNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_employeeNameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeNameKeyPressed

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        if (!employeeName.getText().equals("")) {
            Organization organization = (Organization) organizationEmpJComboBox.getSelectedItem();
            String name = employeeName.getText();
            organization.getEmployeeDirectory().createEmployee(name);
            JOptionPane.showMessageDialog(null, "Employee Added Successfully");
            populateTable();
            employeeName.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Please Enter Value", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_addJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JTextField employeeName;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox organizationEmpJComboBox;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables
}
