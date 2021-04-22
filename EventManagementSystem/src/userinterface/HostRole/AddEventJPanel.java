/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HostRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.AuthRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HostGovtWorkRequest;
import Business.WorkQueue.WorkQueue;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Saivignesh Sridhar
 */
public class AddEventJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddEventJPanel
     */
    private final JPanel userProcessContainer;
    private final EcoSystem system;
    private final UserAccount userAccount;
    private final Organization organization;
    private final Network network;
    private final Enterprise enterprise;
    public AddEventJPanel(JPanel userProcessContainer, UserAccount account, Enterprise ent, EcoSystem system,  Network net, Organization org) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = account;
        this.organization = org;
        this.enterprise = ent;
        this.network = net;
        
        state.setText(network.getName());
        lblIndoors.setText("Indoor Limit: "+network.getIgLimit());
        lblOutdoors.setText("Outdoor Limit: "+network.getOgLimit());
        cbEventCat.addItem("Indoor Event");
        cbEventCat.addItem("Outdoor Event");
    }
    private void disableFields(){
    txtEventName.setEnabled(false);
    dpEventDate.setEnabled(false);
    street.setEnabled(false);
    city.setEnabled(false);
    state.setEnabled(false);
    btnHost.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEventName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        street = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dpEventDate = new com.toedter.calendar.JDateChooser();
        city = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        state = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbEventCat = new javax.swing.JComboBox();
        slAttendance = new javax.swing.JSlider();
        lblAtt = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblIndoors = new javax.swing.JLabel();
        lblOutdoors = new javax.swing.JLabel();
        btnHost = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(25, 56, 82));
        jLabel1.setText("Host an Event");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Event Name");
        jLabel2.setToolTipText("");

        txtEventName.setToolTipText("");
        txtEventName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEventNameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Planned Date");
        jLabel5.setToolTipText("");

        street.setToolTipText("");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Street Address");
        jLabel11.setToolTipText("");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("City");
        jLabel12.setToolTipText("");

        dpEventDate.setToolTipText("");

        city.setToolTipText("");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("State");
        jLabel13.setToolTipText("");

        state.setEditable(false);
        state.setToolTipText("");
        state.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Event Category");
        jLabel3.setToolTipText("");

        cbEventCat.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        cbEventCat.setForeground(new java.awt.Color(25, 56, 82));
        cbEventCat.setToolTipText("");
        cbEventCat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbEventCatItemStateChanged(evt);
            }
        });
        cbEventCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEventCatActionPerformed(evt);
            }
        });
        cbEventCat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cbEventCatKeyReleased(evt);
            }
        });

        slAttendance.setBackground(new java.awt.Color(204, 204, 255));
        slAttendance.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        slAttendance.setForeground(new java.awt.Color(0, 102, 102));
        slAttendance.setMaximum(300);
        slAttendance.setMinimum(50);
        slAttendance.setPaintTicks(true);
        slAttendance.setToolTipText("");
        slAttendance.setValue(130);
        slAttendance.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slAttendanceStateChanged(evt);
            }
        });

        lblAtt.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblAtt.setForeground(new java.awt.Color(0, 102, 102));
        lblAtt.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblAtt.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Planned Attendance");
        jLabel6.setToolTipText("");

        lblIndoors.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblIndoors.setText("Indoor Limit XXX");
        lblIndoors.setToolTipText("");

        lblOutdoors.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblOutdoors.setText("Outdoor Limit XXX");
        lblOutdoors.setToolTipText("");

        btnHost.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHost.setForeground(new java.awt.Color(25, 56, 82));
        btnHost.setText("Host");
        btnHost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHostActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addComponent(jLabel13))
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(state)
                    .addComponent(city)
                    .addComponent(street)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dpEventDate, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbEventCat, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblAtt, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(slAttendance, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblIndoors)
                                    .addComponent(lblOutdoors))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtEventName))
                .addGap(292, 292, 292))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(430, 430, 430)
                        .addComponent(btnHost, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEventName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cbEventCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(slAttendance, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblAtt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIndoors)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOutdoors)
                        .addGap(21, 21, 21)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(dpEventDate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(street, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHost)
                .addContainerGap(78, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtEventNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEventNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEventNameActionPerformed

    private void stateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stateActionPerformed

    private void cbEventCatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbEventCatItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEventCatItemStateChanged

    private void cbEventCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEventCatActionPerformed

    }//GEN-LAST:event_cbEventCatActionPerformed

    private void cbEventCatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbEventCatKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEventCatKeyReleased

    private void slAttendanceStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slAttendanceStateChanged
        // TODO add your handling code here:
        lblAtt.setText(String.valueOf(slAttendance.getValue())+"");
    }//GEN-LAST:event_slAttendanceStateChanged

    private void btnHostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHostActionPerformed
               
               Date eventDate = dpEventDate.getDate();
               Date sysDate = new Date();
               long diff = (eventDate.getTime() - sysDate.getTime())/(1000 * 60 * 60 * 24);
               System.out.println((int)diff);
               
        if (dpEventDate.getDate() == null || street.getText().isEmpty()
                || txtEventName.getText().isEmpty() || city.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Kindly enter all the fields");
        }
        else if (diff < 0) {
                    JOptionPane.showMessageDialog(null, "Cannot enter a previous date");
        }
        else if (diff <=6) {
                    JOptionPane.showMessageDialog(null, "Cannot select a date within a week.");
        }
        else{
        HostGovtWorkRequest hostgovtwr = new HostGovtWorkRequest();
        hostgovtwr.setRequestID();
        hostgovtwr.setStatus("Awaiting Govt Approval");
        hostgovtwr.setSender(userAccount);
        hostgovtwr.setAttendance(slAttendance.getValue());
        hostgovtwr.setMessage("Request sent to Govt");
        hostgovtwr.setEventName(txtEventName.getText());
        hostgovtwr.setEvenCat(String.valueOf(cbEventCat.getSelectedItem()));
        hostgovtwr.setPlannedDate(eventDate); 
        hostgovtwr.setHost(userAccount);
        
        for (Network n : system.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization org : e.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                        if (ua.getRole() instanceof AuthRole) {
                            ua.getWorkQueue().getWorkRequestList().add(hostgovtwr);
                            JOptionPane.showMessageDialog(null, "Request Sent Successfully!");
                            disableFields();
                        }
                    }
                }
            }   
        }
        
        
//        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
//        for (UserAccount user : enterprise.getUserAccountDirectory().getUserAccountList()) {
//           if ( Enterprise.EnterpriseType.Government  == enterprise.getEnterpriseType()) {
//        user.getWorkQueue().getWorkRequestList().add(hostgovtwr);
//        JOptionPane.showMessageDialog(null, "Request Sent Successfully!");
//           }
//         }
//        }
        }
    }//GEN-LAST:event_btnHostActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHost;
    private javax.swing.JComboBox cbEventCat;
    private javax.swing.JTextField city;
    private com.toedter.calendar.JDateChooser dpEventDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblAtt;
    private javax.swing.JLabel lblIndoors;
    private javax.swing.JLabel lblOutdoors;
    private javax.swing.JSlider slAttendance;
    private javax.swing.JSlider slHeight;
    private javax.swing.JSlider slHeight1;
    private javax.swing.JSlider slHeight2;
    private javax.swing.JTextField state;
    private javax.swing.JTextField street;
    private javax.swing.JTextField txtEventName;
    // End of variables declaration//GEN-END:variables
}
