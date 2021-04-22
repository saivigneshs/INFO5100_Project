/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.EnterAdminRole;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author VIGNESH
 */
public class CateringManageOrgJPanel extends javax.swing.JPanel {
    private final OrganizationDirectory directory;
    /**
     * Creates new form CateringManageOrgJPanel
     */
    public CateringManageOrgJPanel(OrganizationDirectory directory) {
        initComponents();
        this.directory = directory;
        volPopulate();
        populateOrganizationTypeComboBox();
    }
    
    private void populateOrganizationTypeComboBox() {
        jComboBox1.removeAllItems();
        jComboBox1.addItem(Organization.Type.Food.toString());
        jComboBox1.addItem(Organization.Type.Beverages.toString());
        jComboBox1.addItem(Organization.Type.Delivery.toString());
    }

    public void volPopulate() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.setRowCount(0);

        for (Organization organization : directory.getOrganizationList()) {
            {
                Object[] row = new Object[2];
                row[0] = organization.getType().getValue();
                row[1] = organization.getName();
                model.addRow(row);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("MANAGE CATERING ORGANIZATIONS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(260, 90, 450, 29);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Organization Type", "Organization Name"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(260, 160, 452, 182);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 102));
        jLabel2.setText("Organization Type:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(280, 390, 140, 20);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 255, 102));
        jLabel3.setText("Team Name:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(330, 440, 100, 20);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(440, 390, 178, 20);

        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(440, 440, 178, 22);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton1.setText("Add Organization");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(410, 500, 123, 27);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Haribalakrishnan\\Downloads\\rawpixel-754045-unsplash-1080x675.jpg")); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 950, 670);

        add(jPanel1);
        jPanel1.setBounds(520, 180, 950, 670);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Organization.Type type = (Organization.Type) jComboBox1.getSelectedItem();

        if ("".equals(jTextField1.getText())) {
            JOptionPane.showMessageDialog(null, "Enter organization name!");
        } else {
            Organization organization = directory.createOrganization(type, jTextField1.getText());
            JOptionPane.showMessageDialog(null, "Organization Successfully Created");
            jTextField1.setText("");
            volPopulate();
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
