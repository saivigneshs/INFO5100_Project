/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HostRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.AuthRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HostGovtWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Saivignesh Sridhar
 */
public class ViewEventsJPanel extends javax.swing.JPanel {

   private final JPanel userProcessContainer;
    private final EcoSystem system;
    private final UserAccount userAccount;
    private final Organization organization;
    private final Network network;
    private final Enterprise enterprise;
    /**
     * Creates new form ViewEventsJPanel
     */
    public ViewEventsJPanel(JPanel userProcessContainer, UserAccount account, Enterprise ent, EcoSystem system,  Network net, Organization org) {
        initComponents();
      
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = account;
        this.organization = org;
        this.enterprise = ent;
        this.network = net;

        populateEventsTable();
    }
    public void populateEventsTable() {
        DefaultTableModel model = (DefaultTableModel) tblEvents.getModel();
        model.setRowCount(0);
        for (Network n : system.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization org : e.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                        if (ua.getRole() instanceof AuthRole) {
                            for(WorkRequest request : ua.getWorkQueue().getWorkRequestList()){
                             if ( request instanceof HostGovtWorkRequest) {
                Object[] row = new Object[8];
                row[0] = ((HostGovtWorkRequest) request).getEventName();
                row[1] = ((HostGovtWorkRequest) request).getEvenCat();
                row[2] = request;
                row[3] = ((HostGovtWorkRequest) request).getAttendance();
                row[4] = String.valueOf(((HostGovtWorkRequest) request).getPlannedDate() ).substring(0,10);
                row[5] = request.getStatus();

                model.addRow(row);
                                }
                            }
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

        refreshTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEvents = new javax.swing.JTable();
        lbl_StateView = new javax.swing.JLabel();
        lblView = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        refreshTestJButton.setBackground(new java.awt.Color(204, 255, 255));
        refreshTestJButton.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        refreshTestJButton.setForeground(new java.awt.Color(255, 0, 0));
        refreshTestJButton.setText("SOS");
        refreshTestJButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(0, 51, 51));
        enterpriseLabel.setText("Events Conducted");

        tblEvents.setBackground(new java.awt.Color(204, 204, 255));
        tblEvents.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        tblEvents.setForeground(new java.awt.Color(0, 51, 51));
        tblEvents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Event Name", "Event Category", "Request Type", "Attendance", "Planned Date", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEvents);

        lbl_StateView.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lbl_StateView.setForeground(new java.awt.Color(25, 56, 82));
        lbl_StateView.setText("Kindly select an Event and Click View to check the details");

        lblView.setBackground(new java.awt.Color(255, 255, 255));
        lblView.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblView.setForeground(new java.awt.Color(25, 56, 82));
        lblView.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblView.setText("View");
        lblView.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(25, 56, 82)));
        lblView.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblViewMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146)
                        .addComponent(refreshTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(lbl_StateView)
                        .addGap(37, 37, 37)
                        .addComponent(lblView, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_StateView, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblView, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(161, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateEventsTable();
        
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void lblViewMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewMousePressed
        // TODO add your handling code here:

        int selectedRow = tblEvents.getSelectedRow();
        int count = tblEvents.getSelectedRowCount();
        if (count == 1) {
            if (selectedRow >= 0) {
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                String networkCode = (String) tblEvents.getValueAt(selectedRow,0);
                Network net =  system.fetchNetwork(networkCode);

                ViewEventDetailsJPanel viewEventDetailsJPanel = new ViewEventDetailsJPanel(userProcessContainer, userAccount, enterprise, system, network, organization);
                userProcessContainer.add(viewEventDetailsJPanel);
                layout.next(userProcessContainer);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Select a Row to continue.");
        }
    }//GEN-LAST:event_lblViewMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblView;
    private javax.swing.JLabel lbl_StateView;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JTable tblEvents;
    // End of variables declaration//GEN-END:variables
}
