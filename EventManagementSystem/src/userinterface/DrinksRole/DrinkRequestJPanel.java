/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DrinksRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HostLocWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author VIGNESH
 */
public class DrinkRequestJPanel extends javax.swing.JPanel {

    private final JPanel userProcessContainer;
    private final UserAccount account;
    private final EcoSystem business;
    /**
     * Creates new form DrinkRequestJPanel
     */
    public DrinkRequestJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.business = business;
        populateDrinkRequests();
    }

    public void populateDrinkRequests() {
        DefaultTableModel model = (DefaultTableModel) tbldrinkRequests.getModel();
        model.setRowCount(0);
        for (Network n : business.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for (WorkRequest workRequest : e.getWorkQueue().getWorkRequestList()) {
                    if (workRequest instanceof HostLocWorkRequest) {
                        if (((HostLocWorkRequest) workRequest).getLocation().getUsername().equals(account.getUsername())) {
                            Object[] row = new Object[model.getColumnCount()];
                            row[0] = workRequest;
                            row[1] = ((HostLocWorkRequest) workRequest).getEventName();
                            row[2] = ((HostLocWorkRequest) workRequest).getEvenCat();
                            row[3] = ((HostLocWorkRequest) workRequest).getAttendance();
                            row[4] = ((HostLocWorkRequest) workRequest).getPlannedDate();
                            row[5] = ((HostLocWorkRequest) workRequest).getHost();
                            row[6] = ((HostLocWorkRequest) workRequest).getHost().getCity();
                            row[7] = ((HostLocWorkRequest) workRequest).getStatus();
                            row[8] = ((HostLocWorkRequest) workRequest).getMessage();
                            row[9] = ((HostLocWorkRequest) workRequest).getLocNote();
                            model.addRow(row);
                        }
                    }
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldrinkRequests = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtAddMsg = new javax.swing.JTextField();
        blAddMessage = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Manage Food Requests");

        tbldrinkRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Id", "Org Name", "Food Name", "Quantity", "Order Status", "Deliver to", "Location Team Message", "Order By", "Total Cost"
            }
        ));
        jScrollPane1.setViewportView(tbldrinkRequests);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("Approve Request");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setText("Reject Request");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtAddMsg.setBackground(new java.awt.Color(204, 204, 255));

        blAddMessage.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        blAddMessage.setForeground(new java.awt.Color(41, 50, 80));
        blAddMessage.setText("Additional Message:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(440, 440, 440)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(blAddMessage)
                        .addGap(18, 18, 18)
                        .addComponent(txtAddMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(54, 54, 54)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(blAddMessage)
                        .addComponent(txtAddMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2)))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbldrinkRequests.getSelectedRow();
        if (selectedRow >= 0) {
            HostLocWorkRequest request = (HostLocWorkRequest) tbldrinkRequests.getValueAt(selectedRow, 0);
            String message = txtAddMsg.getText();
            if (message.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Kindly enter additional details to the Host.");
                return;
            }
            if (!request.getStatus().equals("Awaiting Govt Approval")) {
            if (!"Event Authorized".equals(request.getStatus())) {
                request.setStatus("Location Authorized");
                request.setMessage(message);
                JOptionPane.showMessageDialog(null, "Location is Authorized!");
                    account.setStatus("Booked");
                populateDrinkRequests();
            } else {
                JOptionPane.showMessageDialog(null, "Event is already Authorized!");
            }
            } else {
                JOptionPane.showMessageDialog(null, "Select an appropriate Event!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbldrinkRequests.getSelectedRow();
        if (selectedRow >= 0) {
            HostLocWorkRequest request = (HostLocWorkRequest) tbldrinkRequests.getValueAt(selectedRow, 0);
            String message = txtAddMsg.getText();
            if (message.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Kindly enter the reason for Rejection");
                return;
            }
            if (!"Completed".equals(request.getStatus()) && !"In Progress".equals(request.getStatus())) {
                request.setStatus("Rejected");
                request.setMessage(message);
                JOptionPane.showMessageDialog(null, "Event Rejected!");
                    account.setStatus("Available");
                populateDrinkRequests();
            } else {
                JOptionPane.showMessageDialog(null, "Event is already " + request.getStatus());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Kindly select a row.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel blAddMessage;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbldrinkRequests;
    private javax.swing.JTextField txtAddMsg;
    // End of variables declaration//GEN-END:variables
}
