/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SecurityERRole;

import userinterface.MusicianRole.*;
import userinterface.LocationRole.*;
import userinterface.InfraRole.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HostLocWorkRequest;
import Business.WorkQueue.HostMusicWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Saivignesh Sridhar
 */
public class SecurityERRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LocationRequestJPanel
     */
    private final JPanel userProcessContainer;
    private final UserAccount account;
    private final EcoSystem business;
    public SecurityERRequestJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.business = business;
        initComponents();
        populatemusicRequests();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void populatemusicRequests() {
        DefaultTableModel model = (DefaultTableModel) tblmusicRequests.getModel();
        model.setRowCount(0);
        for (Network n : business.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for (WorkRequest workRequest : e.getWorkQueue().getWorkRequestList()) {
                    if (workRequest instanceof HostMusicWorkRequest) {
                        if (((HostMusicWorkRequest) workRequest).getLocation().getUsername().equals(account.getUsername())) {
                            Object[] row = new Object[model.getColumnCount()];
                            row[0] = workRequest;
                            row[1] = ((HostMusicWorkRequest) workRequest).getEventName();
                            row[2] = ((HostMusicWorkRequest) workRequest).getEvenCat();
                            row[3] = ((HostMusicWorkRequest) workRequest).getAttendance();
                            row[4] = ((HostMusicWorkRequest) workRequest).getPlannedDate();
                            row[5] = ((HostMusicWorkRequest) workRequest).getHost();
                            row[6] = ((HostMusicWorkRequest) workRequest).getHost().getCity();
                            row[7] = ((HostMusicWorkRequest) workRequest).getStatus();
                            row[8] = ((HostMusicWorkRequest) workRequest).getMessage();
                            row[9] = ((HostMusicWorkRequest) workRequest).getLocNote();
                            model.addRow(row);
                        }
                    }
                }
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRestWorkList = new javax.swing.JLabel();
        scrollOrderList = new javax.swing.JScrollPane();
        tblmusicRequests = new javax.swing.JTable();
        btnReject = new javax.swing.JButton();
        btnApprove = new javax.swing.JButton();
        blAddMessage = new javax.swing.JLabel();
        txtAddMsg = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));
        setForeground(new java.awt.Color(0, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRestWorkList.setBackground(new java.awt.Color(204, 255, 255));
        lblRestWorkList.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        lblRestWorkList.setForeground(new java.awt.Color(0, 51, 51));
        lblRestWorkList.setText("Music  Requests");
        add(lblRestWorkList, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        tblmusicRequests.setBackground(new java.awt.Color(204, 204, 255));
        tblmusicRequests.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        tblmusicRequests.setForeground(new java.awt.Color(0, 51, 51));
        tblmusicRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Request Type", "Event Name", "Event Category", "Attendance", "Planned Date", "Host", "Host City", "Status", "Message from Host", "Loc Team Reply"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollOrderList.setViewportView(tblmusicRequests);

        add(scrollOrderList, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 880, 110));

        btnReject.setBackground(new java.awt.Color(204, 255, 255));
        btnReject.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        btnReject.setForeground(new java.awt.Color(0, 51, 51));
        btnReject.setText("Reject Request");
        btnReject.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        add(btnReject, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 110, 30));

        btnApprove.setBackground(new java.awt.Color(204, 255, 255));
        btnApprove.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        btnApprove.setForeground(new java.awt.Color(0, 51, 51));
        btnApprove.setText("Approve Request");
        btnApprove.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });
        add(btnApprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 110, 30));

        blAddMessage.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        blAddMessage.setForeground(new java.awt.Color(41, 50, 80));
        blAddMessage.setText("Additional Message:");
        add(blAddMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        txtAddMsg.setBackground(new java.awt.Color(204, 204, 255));
        add(txtAddMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 200, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblmusicRequests.getSelectedRow();
        if (selectedRow >= 0) {
            HostMusicWorkRequest request = (HostMusicWorkRequest) tblmusicRequests.getValueAt(selectedRow, 0);
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
                populatemusicRequests();
            } else {
                JOptionPane.showMessageDialog(null, "Event is already " + request.getStatus());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Kindly select a row.");
        }
    }//GEN-LAST:event_btnRejectActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblmusicRequests.getSelectedRow();
        if (selectedRow >= 0) {
            HostMusicWorkRequest request = (HostMusicWorkRequest) tblmusicRequests.getValueAt(selectedRow, 0);
            String message = txtAddMsg.getText();
            account.setMessage(message);
            if (message.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Kindly enter additional details to the Host.");
                return;
            }
            if (!request.getStatus().equals("Awaiting Govt Approval")) {
            if (!"Event Authorized".equals(request.getStatus())) {
                request.setStatus("Music Authorized");
                request.setMessage(message);
                JOptionPane.showMessageDialog(null, "Music is Authorized!");
                    account.setStatus("Booked");
                populatemusicRequests();
            } else {
                JOptionPane.showMessageDialog(null, "Event is already Authorized!");
            }
            } else {
                JOptionPane.showMessageDialog(null, "Select an appropriate Event!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
    }//GEN-LAST:event_btnApproveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel blAddMessage;
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel lblRestWorkList;
    private javax.swing.JScrollPane scrollOrderList;
    private javax.swing.JTable tblmusicRequests;
    private javax.swing.JTextField txtAddMsg;
    // End of variables declaration//GEN-END:variables
}
