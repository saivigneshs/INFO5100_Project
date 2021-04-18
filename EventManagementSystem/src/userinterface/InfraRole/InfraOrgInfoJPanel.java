/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InfraRole;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Saivignesh Sridhar
 */
public class InfraOrgInfoJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewUpdateRestJPanel
     */
    private final JPanel container;
    private final EcoSystem system;
    private String currentPhoneNo;
    private String currentMailID;
    public InfraOrgInfoJPanel(JPanel container, UserAccount account, EcoSystem system) {
        initComponents();
         this.container = container;
         this.system = system;
         txtRestNo.setEnabled(false);
        disableEdit();
        
    }
private void disableEdit(){
    txtMgrName1.setEditable(false);
    txtRestAddr1.setEditable(false);
    txtRestName1.setEditable(false);
    txtRestContact1.setEditable(false);
    txtRestZip1.setEditable(false);
    txtRestEmail1.setEditable(false);
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        txtRestEmail1 = new javax.swing.JTextField();
        lblRestEmail1 = new javax.swing.JLabel();
        txtRestName1 = new javax.swing.JTextField();
        lblRestContact1 = new javax.swing.JLabel();
        txtRestZip1 = new javax.swing.JTextField();
        lblRestZip1 = new javax.swing.JLabel();
        lblRestName1 = new javax.swing.JLabel();
        txtRestAddr1 = new javax.swing.JTextField();
        lblAddRest1 = new javax.swing.JLabel();
        lblRestAddr1 = new javax.swing.JLabel();
        txtRestContact1 = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        txtMgrName1 = new javax.swing.JTextField();
        lblMgrName1 = new javax.swing.JLabel();
        txtRestNo = new javax.swing.JTextField();
        lblRestNo = new javax.swing.JLabel();
        btnEnableUpdate = new javax.swing.JButton();
        btnSaveChanges = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setForeground(new java.awt.Color(0, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtRestEmail1.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        txtRestEmail1.setForeground(new java.awt.Color(0, 51, 51));
        add(txtRestEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 227, 127, -1));

        lblRestEmail1.setBackground(new java.awt.Color(204, 255, 255));
        lblRestEmail1.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        lblRestEmail1.setForeground(new java.awt.Color(0, 51, 51));
        lblRestEmail1.setText(" Email ID :");
        add(lblRestEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 230, -1, -1));

        txtRestName1.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        txtRestName1.setForeground(new java.awt.Color(0, 51, 51));
        add(txtRestName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 121, 127, -1));

        lblRestContact1.setBackground(new java.awt.Color(204, 255, 255));
        lblRestContact1.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        lblRestContact1.setForeground(new java.awt.Color(0, 51, 51));
        lblRestContact1.setText("Contact No :");
        add(lblRestContact1, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 201, -1, -1));

        txtRestZip1.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        txtRestZip1.setForeground(new java.awt.Color(0, 51, 51));
        add(txtRestZip1, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 285, 127, -1));

        lblRestZip1.setBackground(new java.awt.Color(204, 255, 255));
        lblRestZip1.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        lblRestZip1.setForeground(new java.awt.Color(0, 51, 51));
        lblRestZip1.setText("Zip Code :");
        add(lblRestZip1, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 288, -1, -1));

        lblRestName1.setBackground(new java.awt.Color(204, 255, 255));
        lblRestName1.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        lblRestName1.setForeground(new java.awt.Color(0, 51, 51));
        lblRestName1.setText("Organization Name :");
        add(lblRestName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 124, -1, -1));

        txtRestAddr1.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        txtRestAddr1.setForeground(new java.awt.Color(0, 51, 51));
        add(txtRestAddr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 256, 127, -1));

        lblAddRest1.setBackground(new java.awt.Color(204, 255, 255));
        lblAddRest1.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        lblAddRest1.setForeground(new java.awt.Color(0, 51, 51));
        lblAddRest1.setText("Organization Details");
        add(lblAddRest1, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 33, -1, -1));

        lblRestAddr1.setBackground(new java.awt.Color(204, 255, 255));
        lblRestAddr1.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        lblRestAddr1.setForeground(new java.awt.Color(0, 51, 51));
        lblRestAddr1.setText("Street Address :");
        add(lblRestAddr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 259, -1, -1));

        txtRestContact1.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        txtRestContact1.setForeground(new java.awt.Color(0, 51, 51));
        add(txtRestContact1, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 198, 127, -1));

        btnBack.setBackground(new java.awt.Color(204, 255, 255));
        btnBack.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 51, 51));
        btnBack.setText("Back");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 372, 48, -1));

        txtMgrName1.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        txtMgrName1.setForeground(new java.awt.Color(0, 51, 51));
        add(txtMgrName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 314, 127, -1));

        lblMgrName1.setBackground(new java.awt.Color(204, 255, 255));
        lblMgrName1.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        lblMgrName1.setForeground(new java.awt.Color(0, 51, 51));
        lblMgrName1.setText("Manager's Name :");
        add(lblMgrName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 314, -1, -1));

        txtRestNo.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        txtRestNo.setForeground(new java.awt.Color(0, 51, 51));
        add(txtRestNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 92, 127, -1));

        lblRestNo.setBackground(new java.awt.Color(204, 255, 255));
        lblRestNo.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        lblRestNo.setForeground(new java.awt.Color(0, 51, 51));
        lblRestNo.setText("Organization No :");
        add(lblRestNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 95, -1, -1));

        btnEnableUpdate.setBackground(new java.awt.Color(204, 255, 255));
        btnEnableUpdate.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        btnEnableUpdate.setForeground(new java.awt.Color(0, 51, 51));
        btnEnableUpdate.setText("Enable Update");
        btnEnableUpdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEnableUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnableUpdateActionPerformed(evt);
            }
        });
        add(btnEnableUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 354, 106, -1));

        btnSaveChanges.setBackground(new java.awt.Color(204, 255, 255));
        btnSaveChanges.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        btnSaveChanges.setForeground(new java.awt.Color(0, 51, 51));
        btnSaveChanges.setText("Save Changes");
        btnSaveChanges.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSaveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveChangesActionPerformed(evt);
            }
        });
        add(btnSaveChanges, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 383, 106, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
       container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnEnableUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnableUpdateActionPerformed
        // TODO add your handling code here:
        txtMgrName1.setEditable(true);
        txtRestAddr1.setEditable(true);
        txtRestContact1.setEditable(true);
        txtRestEmail1.setEditable(true);
        txtRestZip1.setEditable(true);
        txtRestName1.setEditable(true);
        
        btnEnableUpdate.setEnabled(false);
    }//GEN-LAST:event_btnEnableUpdateActionPerformed

    private void btnSaveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChangesActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnSaveChangesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEnableUpdate;
    private javax.swing.JButton btnSaveChanges;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAddRest1;
    private javax.swing.JLabel lblMgrName1;
    private javax.swing.JLabel lblRestAddr1;
    private javax.swing.JLabel lblRestContact1;
    private javax.swing.JLabel lblRestEmail1;
    private javax.swing.JLabel lblRestName1;
    private javax.swing.JLabel lblRestNo;
    private javax.swing.JLabel lblRestZip1;
    private javax.swing.JTextField txtMgrName1;
    private javax.swing.JTextField txtRestAddr1;
    private javax.swing.JTextField txtRestContact1;
    private javax.swing.JTextField txtRestEmail1;
    private javax.swing.JTextField txtRestName1;
    private javax.swing.JTextField txtRestNo;
    private javax.swing.JTextField txtRestZip1;
    // End of variables declaration//GEN-END:variables
}
