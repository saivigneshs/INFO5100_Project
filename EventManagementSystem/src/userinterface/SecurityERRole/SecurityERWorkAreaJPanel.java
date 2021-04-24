package userinterface.SecurityERRole;


import Business.APIforSMS.APIforSMS;
import userinterface.GovtAuthRole.*;
import userinterface.LocationRole.*;
import userinterface.InfraRole.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HostGovtWorkRequest;
import Business.WorkQueue.HostSecurityERWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author  Saivignesh Sridhar
 */
public class SecurityERWorkAreaJPanel extends javax.swing.JPanel {
    
    private final JPanel userProcessContainer;
    private final EcoSystem system;
    private final UserAccount userAccount;
    private final Organization organization;
    private final Network network;
    private final Enterprise enterprise;
    
    /** Creates new form AdminWorkAreaJPanel */
    public SecurityERWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization org, Enterprise ent, Network net, EcoSystem system) {
        initComponents();
       
        lblRestAdmin.setText(account.getEmployee().getName()+" 's Admin Page");
          this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = account;
        this.organization = org;
        this.enterprise = ent;
        this.network = net;
        populateERRequests();
      
        //valueLabel.setText();
    }
     public void populateERRequests() {
        DefaultTableModel model = (DefaultTableModel) tblEventAuth.getModel();
        model.setRowCount(0);
        for (Network n : system.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for (WorkRequest workRequest : e.getWorkQueue().getWorkRequestList()) {
                    if (workRequest instanceof HostSecurityERWorkRequest) {
                        if(((HostSecurityERWorkRequest) workRequest).getLocation()!=null){
                        if (((HostSecurityERWorkRequest) workRequest).getLocation().getUsername().equals(userAccount.getUsername())) {
                            Object[] row = new Object[model.getColumnCount()];
                            row[0] = workRequest;
                            row[1] = ((HostSecurityERWorkRequest) workRequest).getEventName();
                            row[2] = ((HostSecurityERWorkRequest) workRequest).getEvenCat();
                            row[3] = ((HostSecurityERWorkRequest) workRequest).getStatus();
                            row[4] = ((HostSecurityERWorkRequest) workRequest).getHost();
                            row[5] = ((HostSecurityERWorkRequest) workRequest).getAttendance();
                            row[6] = ((HostSecurityERWorkRequest) workRequest).getPlannedDate();
                            row[7] = ((HostSecurityERWorkRequest) workRequest).getLocNote();
                                                     
                            model.addRow(row);
                        }
                    }
                }
                }
            }
        }
    }
    private void disableFields(){
    txtAddMsg.setText("");
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRestAdmin = new javax.swing.JLabel();
        scrollOrderList = new javax.swing.JScrollPane();
        tblEventAuth = new javax.swing.JTable();
        btnApprove = new javax.swing.JButton();
        blAddMessage = new javax.swing.JLabel();
        txtAddMsg = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));
        setForeground(new java.awt.Color(0, 51, 51));
        setToolTipText("");
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRestAdmin.setBackground(new java.awt.Color(204, 255, 255));
        lblRestAdmin.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        lblRestAdmin.setForeground(new java.awt.Color(0, 51, 51));
        lblRestAdmin.setText("Security SOS Area");
        add(lblRestAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, -1, -1));

        tblEventAuth.setBackground(new java.awt.Color(204, 204, 255));
        tblEventAuth.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        tblEventAuth.setForeground(new java.awt.Color(0, 51, 51));
        tblEventAuth.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request ID", "Event Name", "Event Category", "Status", "Host Name", "Attendance", "Planned Date", "Location"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollOrderList.setViewportView(tblEventAuth);

        add(scrollOrderList, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 780, 110));

        btnApprove.setBackground(new java.awt.Color(204, 255, 255));
        btnApprove.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        btnApprove.setForeground(new java.awt.Color(0, 51, 51));
        btnApprove.setText("Dispatch Team");
        btnApprove.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });
        add(btnApprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 130, 30));

        blAddMessage.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        blAddMessage.setForeground(new java.awt.Color(41, 50, 80));
        blAddMessage.setText("Additional Message:");
        add(blAddMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, -1, -1));

        txtAddMsg.setBackground(new java.awt.Color(204, 204, 255));
        add(txtAddMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 200, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here: 
 
        int selectedRow = tblEventAuth.getSelectedRow();
        if (selectedRow >= 0) {
            HostSecurityERWorkRequest request = (HostSecurityERWorkRequest) tblEventAuth.getValueAt(selectedRow, 0);
            String message = txtAddMsg.getText();
            if (message.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Kindly enter additional details to the Host.");
                return;
            }
            if (request.getStatus().equals("SOS Issued")) {
                
            if (!"ER Team Dispatched".equals(request.getStatus())) {
                request.setStatus("ER Team Dispatched");
                request.setMessage(message);
                JOptionPane.showMessageDialog(null, "ER Team Dispatched!");
                    userAccount.setStatus("Available");
               APIforSMS sms = new APIforSMS(request.getHost().getPhone(), "Hello "+request.getHost().getName()+", Don't Worry! Help is on the way to "+request.getLocNote()+". We will be there in 15 minutes.");
                populateERRequests();
                disableFields();
            } else {
                JOptionPane.showMessageDialog(null, "ER Team already Dispatched!");
            }
            } else {
                JOptionPane.showMessageDialog(null, "Select an appropriate row!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
    }//GEN-LAST:event_btnApproveActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel blAddMessage;
    private javax.swing.JButton btnApprove;
    private javax.swing.JLabel lblRestAdmin;
    private javax.swing.JScrollPane scrollOrderList;
    private javax.swing.JTable tblEventAuth;
    private javax.swing.JTextField txtAddMsg;
    // End of variables declaration//GEN-END:variables
    
}
