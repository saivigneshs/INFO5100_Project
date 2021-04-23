/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HostRole;

import Business.APIforSMS.APIforSMS;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.FoodRole;
import Business.Role.InfraRole;
import Business.Role.LocationRole;
import Business.Role.MusicianRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HostGovtWorkRequest;
import Business.WorkQueue.LocInfraWorkRequest;
import Business.WorkQueue.HostLocWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Saivignesh Sridhar
 */
public class ViewEventDetailsJPanel extends javax.swing.JPanel {
    private final JPanel userProcessContainer;
    private final EcoSystem system;
    private final UserAccount userAccount;
    private final Network network;
    private HostGovtWorkRequest request;
    
     HostLocWorkRequest locRequest = new HostLocWorkRequest();
     LocInfraWorkRequest infraRequest = new LocInfraWorkRequest();
  
    /**
     * Creates new form ViewEventDetailsJPanel
     */
    public ViewEventDetailsJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system,  Network net, HostGovtWorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = account;
        this.network = net;
        this.request=  request;
        
        lblEventName.setText(request.getEventName());
        lblEventDate.setText(String.valueOf((request).getPlannedDate() ).substring(0,10));
        
         populateLocationTable();
         populateFoodTable();
         populateMusicTable();
                
    }

    public void populateLocationTable() {
    DefaultTableModel model = (DefaultTableModel) tblLocation.getModel();
    model.setRowCount(0);
        
        for (Network n : system.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization org : e.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                        if (ua.getRole() instanceof LocationRole) {
                            Object[] row = new Object[8];
                            row[0] = ua.getEmployee().getId();
                            row[1] = ua;
                            row[2] = ua.getCity();
                            row[3] = ua.getState();
                            row[4] = ua.getStatus();
                            row[5] = ua.getPhone();
                            row[6] = ua.getName();
                            row[7] = org.getType();
                            model.addRow(row);
                        }
                    }
                }
            }
        }
    }
    public void populateFoodTable() {
    DefaultTableModel model = (DefaultTableModel) tblFood.getModel();
    model.setRowCount(0);
        
        for (Network n : system.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization org : e.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                        if (ua.getRole() instanceof InfraRole) {
                            Object[] row = new Object[8];
                            row[0] = ua.getEmployee().getId();
                            row[1] = ua;
                            row[2] = ua.getCity();
                            row[3] = ua.getState();
                            row[4] = ua.getStatus();
                            row[5] = ua.getPhone();
                            row[6] = ua.getName();
                            row[7] = org.getType();
                            model.addRow(row);
                        }
                    }
                }
            }
        }
    }
    public void populateMusicTable() {
    DefaultTableModel model = (DefaultTableModel) tblMusic.getModel();
    model.setRowCount(0);
        
        for (Network n : system.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization org : e.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                        if (ua.getRole() instanceof MusicianRole) {
                            Object[] row = new Object[8];
                            row[0] = ua.getEmployee().getId();
                            row[1] = ua;
                            row[2] = ua.getCity();
                            row[3] = ua.getState();
                            row[4] = ua.getStatus();
                            row[5] = ua.getPhone();
                            row[6] = ua.getName();
                            row[7] = org.getType();
                            model.addRow(row);
                        }
                    }
                }
            }
        }
    }
    private void disableInfo(){
    btnHireLoc.setEnabled(false);
   addnInfoLoc.setVisible(false);
   addnInfoLoc.setText("");
   lblAddnInfo.setVisible(false);
   locPanel.setVisible(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabPane = new javax.swing.JTabbedPane();
        locPanel = new javax.swing.JPanel();
        lblAddnInfo = new javax.swing.JLabel();
        addnInfoLoc = new javax.swing.JTextField();
        btnHireLoc = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLocation = new javax.swing.JTable();
        infraPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFood = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        addInfoInfra = new javax.swing.JTextField();
        btnHireInfra = new javax.swing.JButton();
        musicPanel = new javax.swing.JPanel();
        btnHireMusic = new javax.swing.JButton();
        addnInfoMusic = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMusic = new javax.swing.JTable();
        lblEventName = new javax.swing.JLabel();
        enterpriseLabel2 = new javax.swing.JLabel();
        lblEventDate = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setMinimumSize(new java.awt.Dimension(1040, 760));
        setPreferredSize(new java.awt.Dimension(1040, 760));

        tabPane.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 51)));
        tabPane.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        tabPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tabPane.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        tabPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabPaneMousePressed(evt);
            }
        });

        locPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblAddnInfo.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblAddnInfo.setForeground(new java.awt.Color(41, 50, 80));
        lblAddnInfo.setText("Additional Info:");

        addnInfoLoc.setForeground(new java.awt.Color(41, 50, 80));

        btnHireLoc.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnHireLoc.setForeground(new java.awt.Color(41, 50, 80));
        btnHireLoc.setText("Fix Location");
        btnHireLoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHireLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHireLocActionPerformed(evt);
            }
        });

        jScrollPane1.setForeground(new java.awt.Color(41, 50, 80));

        tblLocation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "City", "State", "Status", "Phone", "Charge", "OrganizationName"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblLocation);

        javax.swing.GroupLayout locPanelLayout = new javax.swing.GroupLayout(locPanel);
        locPanel.setLayout(locPanelLayout);
        locPanelLayout.setHorizontalGroup(
            locPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, locPanelLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(lblAddnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addnInfoLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addComponent(btnHireLoc)
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, locPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        locPanelLayout.setVerticalGroup(
            locPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(locPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(locPanelLayout.createSequentialGroup()
                        .addGroup(locPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addnInfoLoc, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAddnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61))
                    .addGroup(locPanelLayout.createSequentialGroup()
                        .addComponent(btnHireLoc)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        tabPane.addTab("Location", locPanel);

        infraPanel.setPreferredSize(new java.awt.Dimension(785, 391));

        jScrollPane2.setForeground(new java.awt.Color(41, 50, 80));

        tblFood.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "City", "State", "Status", "Phone", "Charge", "OrganizationName"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblFood);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(41, 50, 80));
        jLabel2.setText("Additional Info:");

        addInfoInfra.setForeground(new java.awt.Color(41, 50, 80));

        btnHireInfra.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnHireInfra.setForeground(new java.awt.Color(41, 50, 80));
        btnHireInfra.setText("Hire");
        btnHireInfra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHireInfra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHireInfraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout infraPanelLayout = new javax.swing.GroupLayout(infraPanel);
        infraPanel.setLayout(infraPanelLayout);
        infraPanelLayout.setHorizontalGroup(
            infraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infraPanelLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(infraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(infraPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addInfoInfra, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHireInfra)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        infraPanelLayout.setVerticalGroup(
            infraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infraPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(infraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHireInfra)
                    .addComponent(jLabel2)
                    .addComponent(addInfoInfra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
        );

        tabPane.addTab("Food", infraPanel);

        btnHireMusic.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnHireMusic.setForeground(new java.awt.Color(41, 50, 80));
        btnHireMusic.setText("Hire");
        btnHireMusic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        addnInfoMusic.setForeground(new java.awt.Color(41, 50, 80));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(41, 50, 80));
        jLabel3.setText("Additional Info:");

        jScrollPane3.setForeground(new java.awt.Color(41, 50, 80));

        tblMusic.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "City", "State", "Status", "Phone", "Charge", "OrganizationName"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblMusic);

        javax.swing.GroupLayout musicPanelLayout = new javax.swing.GroupLayout(musicPanel);
        musicPanel.setLayout(musicPanelLayout);
        musicPanelLayout.setHorizontalGroup(
            musicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(musicPanelLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(musicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(musicPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addnInfoMusic, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(249, 249, 249)
                        .addComponent(btnHireMusic)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        musicPanelLayout.setVerticalGroup(
            musicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, musicPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(musicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHireMusic)
                    .addComponent(jLabel3)
                    .addComponent(addnInfoMusic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        tabPane.addTab("Music", musicPanel);

        lblEventName.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblEventName.setForeground(new java.awt.Color(25, 56, 82));
        lblEventName.setText("Event Name");

        enterpriseLabel2.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        enterpriseLabel2.setForeground(new java.awt.Color(0, 51, 51));
        enterpriseLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterpriseLabel2.setText("Event Specifics");

        lblEventDate.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblEventDate.setForeground(new java.awt.Color(25, 56, 82));
        lblEventDate.setText("Event Date");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(lblEventName)
                        .addGap(124, 124, 124)
                        .addComponent(lblEventDate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(tabPane, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(415, 415, 415)
                        .addComponent(enterpriseLabel2)))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(enterpriseLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEventName)
                    .addComponent(lblEventDate))
                .addGap(47, 47, 47)
                .addComponent(tabPane, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnHireLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHireLocActionPerformed
       int selectedRow =tblLocation.getSelectedRow();
        int count = tblLocation.getSelectedRowCount();

        if (count == 1) {
            if (selectedRow >= 0) {
                UserAccount locTeam = (UserAccount) tblLocation.getValueAt(selectedRow, 1);
                String comment = addnInfoLoc.getText();
                
                if (!locTeam.getStatus().equals("Available")) {
                    JOptionPane.showMessageDialog(null, "Sorry! This Location is already Booked!");
                    return;
                }
                for (Network n : system.getNetworkList()) {
                    for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                        for (Organization org : e.getOrganizationDirectory().getOrganizationList()) {
                            for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                                if (locTeam.getUsername().equals(ua.getUsername())) {
                                                                                                    
                                    locRequest.setRequestID();
                                    locRequest.setSender(userAccount);
                                    locRequest.setHost(userAccount);
                                    locRequest.setLocation(locTeam);
                                    locRequest.setStatus("Pending");
                                    if (!comment.isEmpty()) locRequest.setMessage(comment);
                                    locRequest.setAttendance(request.getAttendance());
                                    locRequest.setEventName(request.getEventName());
                                    locRequest.setEvenCat(request.getEvenCat());
                                    locRequest.setPlannedDate(request.getPlannedDate());
                                    locRequest.setOrgType(Organization.Type.Location);
                                    
                                    
                                    e.getWorkQueue().getWorkRequestList().add(locRequest);
                                    System.out.println("Request"+locRequest.toString()+"  >> Added to Enterprise "+e);
                                    JOptionPane.showMessageDialog(null, "Location Request Sent Successfully!");
                                    APIforSMS sms = new APIforSMS(locTeam.getPhone(), "Hello "+locTeam.getName()+",  A Host likes to book your Location package on "+String.valueOf(((HostGovtWorkRequest) request).getPlannedDate() ).substring(0,10)+". Kindly login for more details.");
                                    //system.sendEmailMessage(locTeam.getEmail(), "Hello! You have one new work request! Please login to know more!");
                                }
                            }
                        }
                    }
                }
            }
            disableInfo();
        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");

        }      
    }//GEN-LAST:event_btnHireLocActionPerformed

    private void btnHireInfraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHireInfraActionPerformed
    int selectedRow =tblFood.getSelectedRow();
        int count = tblFood.getSelectedRowCount();

        if (count == 1) {
            if (selectedRow >= 0) {
                UserAccount infraTeam = (UserAccount) tblFood.getValueAt(selectedRow, 1);
                String comment = addInfoInfra.getText();
                
                if (!infraTeam.getStatus().equals("Available")) {
                    JOptionPane.showMessageDialog(null, "Sorry! This Package is already booked!");
                    return;
                }
                for (Network n : system.getNetworkList()) {
                    for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                        for (Organization org : e.getOrganizationDirectory().getOrganizationList()) {
                            for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                                if (infraTeam.getUsername().equals(ua.getUsername())) {
                                    
                                   
                                                                                                    
                                    infraRequest.setRequestID();
                                    infraRequest.setSender(userAccount);
                                    infraRequest.setHost(userAccount);
                                    infraRequest.setInfra(infraTeam);
                                    infraRequest.setStatus("Pending");
                                    if (comment.isEmpty()) locRequest.setLocNote(comment);
                                    infraRequest.setAttendance(request.getAttendance());
                                    infraRequest.setEventName(request.getEventName());
                                    infraRequest.setEvenCat(request.getEvenCat());
                                    infraRequest.setPlannedDate(request.getPlannedDate());
                                    infraRequest.setOrgType(Organization.Type.Infrastructure);
                                    
                                    e.getWorkQueue().getWorkRequestList().add(infraRequest);
                                   System.out.println("Request"+locRequest.toString()+"  >> Added to Enterprise "+e);
                                    JOptionPane.showMessageDialog(null, "Request Sent Successfully!");
                                    APIforSMS sms = new APIforSMS(infraTeam.getPhone(), "Hello "+infraTeam.getName()+",  A Location likes to book your Infra Package. Kindly login for more details.");
                                    //system.sendEmailMessage(locTeam.getEmail(), "Hello! You have one new work request! Please login to know more!");
                                }
                            }
                        }
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");

        }  
    }//GEN-LAST:event_btnHireInfraActionPerformed

    private void tabPaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPaneMousePressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_tabPaneMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addInfoInfra;
    private javax.swing.JTextField addnInfoLoc;
    private javax.swing.JTextField addnInfoMusic;
    private javax.swing.JButton btnHireInfra;
    private javax.swing.JButton btnHireLoc;
    private javax.swing.JButton btnHireMusic;
    private javax.swing.JLabel enterpriseLabel2;
    private javax.swing.JPanel infraPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAddnInfo;
    private javax.swing.JLabel lblEventDate;
    private javax.swing.JLabel lblEventName;
    private javax.swing.JPanel locPanel;
    private javax.swing.JPanel musicPanel;
    private javax.swing.JTabbedPane tabPane;
    private javax.swing.JTable tblFood;
    private javax.swing.JTable tblLocation;
    private javax.swing.JTable tblMusic;
    // End of variables declaration//GEN-END:variables
}
