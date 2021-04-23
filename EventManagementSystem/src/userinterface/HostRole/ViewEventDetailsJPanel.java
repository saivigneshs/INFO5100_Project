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
import Business.Role.PhotographerRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HostBeverageWorkRequest;
import Business.WorkQueue.HostFoodWorkRequest;
import Business.WorkQueue.HostGovtWorkRequest;
import Business.WorkQueue.LocInfraWorkRequest;
import Business.WorkQueue.HostLocWorkRequest;
import Business.WorkQueue.HostMusicWorkRequest;
import Business.WorkQueue.HostPhotoWorkRequest;
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
     HostMusicWorkRequest musicRequest = new HostMusicWorkRequest();
     HostPhotoWorkRequest photoRequest = new HostPhotoWorkRequest();
     HostFoodWorkRequest  foodRequest = new  HostFoodWorkRequest();
     HostBeverageWorkRequest beverageRequest = new HostBeverageWorkRequest();
     
     
    
     
  
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
         populatePhotoTable();
                
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
                        if (ua.getRole() instanceof FoodRole) {
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
    
    public void populateBeverageTable() {
    DefaultTableModel model = (DefaultTableModel) tblBeverage.getModel();
    model.setRowCount(0);
        
        for (Network n : system.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization org : e.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                        if (ua.getRole() instanceof PhotographerRole) {
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
                            row[0] = ua;
                            row[1] = ua;
                            row[2] = ua.getCity();
                            row[3] = ua.getState();
                            row[4] = ua.getStatus();
                            row[5] = ua.getPhone();
                            row[6] = ua.getName();
                            row[7] = ua.getMessage();
                            model.addRow(row);
                        }
                    }
                }
            }
        }
    }
    
    public void populatePhotoTable() {
    DefaultTableModel model = (DefaultTableModel) tblPhoto.getModel();
    model.setRowCount(0);
        
        for (Network n : system.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization org : e.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                        if (ua.getRole() instanceof PhotographerRole) {
                            Object[] row = new Object[8];
                            row[0] = ua.getEmployee().getId();
                            row[1] = ua;
                            row[2] = ua.getCity();
                            row[3] = ua.getState();
                            row[4] = ua.getStatus();
                            row[5] = ua.getPhone();
                            row[6] = ua.getName();
                            row[7] = ua.getMessage();
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
        addInfoFood = new javax.swing.JTextField();
        btnOrderFood = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblBeverage = new javax.swing.JTable();
        addnInfoBeverages = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnOrderBeverage = new javax.swing.JButton();
        musicPanel = new javax.swing.JPanel();
        btnHireMusic = new javax.swing.JButton();
        addnInfoMusic = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMusic = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        photopanel = new javax.swing.JPanel();
        addnInfoPhoto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblPhoto = new javax.swing.JTable();
        btnHirephoto = new javax.swing.JButton();
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
        lblAddnInfo.setText("Additional Information:");

        addnInfoLoc.setForeground(new java.awt.Color(41, 50, 80));

        btnHireLoc.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnHireLoc.setForeground(new java.awt.Color(41, 50, 80));
        btnHireLoc.setText("Book Location");
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
                "Name", "Specialities 1", "Specialities 2", "Specialities 3", "Price in $", "Contact No", "Status", "Vendor Message"
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
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(locPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(locPanelLayout.createSequentialGroup()
                        .addComponent(lblAddnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addnInfoLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHireLoc))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );
        locPanelLayout.setVerticalGroup(
            locPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(locPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addnInfoLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddnInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHireLoc))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        tabPane.addTab("Location", locPanel);

        infraPanel.setPreferredSize(new java.awt.Dimension(785, 391));

        jScrollPane2.setForeground(new java.awt.Color(41, 50, 80));

        tblFood.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Specialities 1", "Specialities 2", "Specialities 3", "Price in $", "Contact No", "Status", "Vendor Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblFood);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(41, 50, 80));
        jLabel2.setText("Additional Information:");

        addInfoFood.setForeground(new java.awt.Color(41, 50, 80));

        btnOrderFood.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnOrderFood.setForeground(new java.awt.Color(41, 50, 80));
        btnOrderFood.setText("Order Food");
        btnOrderFood.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOrderFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderFoodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout infraPanelLayout = new javax.swing.GroupLayout(infraPanel);
        infraPanel.setLayout(infraPanelLayout);
        infraPanelLayout.setHorizontalGroup(
            infraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infraPanelLayout.createSequentialGroup()
                .addGroup(infraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(infraPanelLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addInfoFood, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOrderFood))
                    .addGroup(infraPanelLayout.createSequentialGroup()
                        .addContainerGap(26, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        infraPanelLayout.setVerticalGroup(
            infraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infraPanelLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(infraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOrderFood)
                    .addComponent(jLabel2)
                    .addComponent(addInfoFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
        );

        tabPane.addTab("Food", infraPanel);

        jScrollPane5.setForeground(new java.awt.Color(41, 50, 80));

        tblBeverage.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Specialities 1", "Specialities 2", "Specialities 3", "Price in $", "Contact No", "Status", "Vendor Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblBeverage);

        addnInfoBeverages.setForeground(new java.awt.Color(41, 50, 80));
        addnInfoBeverages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addnInfoBeveragesActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(41, 50, 80));
        jLabel5.setText("Additional Information:");

        btnOrderBeverage.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnOrderBeverage.setForeground(new java.awt.Color(41, 50, 80));
        btnOrderBeverage.setText("Order Beverages");
        btnOrderBeverage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOrderBeverage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderBeverageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addnInfoBeverages, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 344, Short.MAX_VALUE)
                        .addComponent(btnOrderBeverage)))
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addnInfoBeverages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrderBeverage)
                    .addComponent(jLabel5))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        tabPane.addTab("Beverage", jPanel2);

        musicPanel.setPreferredSize(new java.awt.Dimension(728, 450));

        btnHireMusic.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnHireMusic.setForeground(new java.awt.Color(41, 50, 80));
        btnHireMusic.setText("Book Musician");
        btnHireMusic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHireMusic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHireMusicActionPerformed(evt);
            }
        });

        addnInfoMusic.setForeground(new java.awt.Color(41, 50, 80));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(41, 50, 80));
        jLabel3.setText("Additional Information:");

        jScrollPane3.setForeground(new java.awt.Color(41, 50, 80));

        tblMusic.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Specialities 1", "Specialities 2", "Specialities 3", "Price in $", "Contact No", "Status", "Vendor Message"
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
                .addGap(43, 43, 43)
                .addGroup(musicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(musicPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addnInfoMusic, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHireMusic))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 826, Short.MAX_VALUE))
                .addContainerGap())
        );
        musicPanelLayout.setVerticalGroup(
            musicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, musicPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(musicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addnInfoMusic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHireMusic)
                    .addComponent(jLabel3))
                .addGap(87, 87, 87))
        );

        tabPane.addTab("Music", musicPanel);

        addnInfoPhoto.setForeground(new java.awt.Color(41, 50, 80));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(41, 50, 80));
        jLabel4.setText("Additional Information:");

        jScrollPane4.setForeground(new java.awt.Color(41, 50, 80));

        tblPhoto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Specialities 1", "Specialities 2", "Specialities 3", "Price in $", "Contact No", "Status", "Vendor Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblPhoto);

        javax.swing.GroupLayout photopanelLayout = new javax.swing.GroupLayout(photopanel);
        photopanel.setLayout(photopanelLayout);
        photopanelLayout.setHorizontalGroup(
            photopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(photopanelLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(addnInfoPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, photopanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        photopanelLayout.setVerticalGroup(
            photopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, photopanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(photopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(addnInfoPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        btnHirephoto.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnHirephoto.setForeground(new java.awt.Color(41, 50, 80));
        btnHirephoto.setText("Book Photographer");
        btnHirephoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHirephoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHirephotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(687, Short.MAX_VALUE)
                .addComponent(btnHirephoto, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(29, Short.MAX_VALUE)
                    .addComponent(photopanel, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(293, Short.MAX_VALUE)
                .addComponent(btnHirephoto)
                .addGap(81, 81, 81))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(photopanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(18, Short.MAX_VALUE)))
        );

        tabPane.addTab("Photo", jPanel1);

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
                        .addGap(415, 415, 415)
                        .addComponent(enterpriseLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(tabPane, javax.swing.GroupLayout.PREFERRED_SIZE, 952, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(enterpriseLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEventName)
                    .addComponent(lblEventDate))
                .addGap(18, 18, 18)
                .addComponent(tabPane, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
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

    private void btnOrderFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderFoodActionPerformed
    int selectedRow =tblFood.getSelectedRow();
        int count = tblFood.getSelectedRowCount();

        if (count == 1) {
            if (selectedRow >= 0) {
                UserAccount foodTeam = (UserAccount) tblFood.getValueAt(selectedRow, 1);
                String comment = addInfoFood.getText();
                
                if (!foodTeam.getStatus().equals("Available")) {
                    JOptionPane.showMessageDialog(null, "Sorry! This Order is Out of Stock!");
                    return;
                }
                for (Network n : system.getNetworkList()) {
                    for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                        for (Organization org : e.getOrganizationDirectory().getOrganizationList()) {
                            for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {

                                if (foodTeam.getUsername().equals(ua.getUsername())) {
                                    
                                   
                                                                                                    
                                    foodRequest.setRequestID();
                                    foodRequest.setSender(userAccount);
                                    foodRequest.setHost(userAccount);
                                    foodRequest.setInfra(foodTeam);
                                    foodRequest.setStatus("Pending");
                                    if (comment.isEmpty()) foodRequest.setFoodNote(comment);
                                    foodRequest.setAttendance(request.getAttendance());
                                    foodRequest.setEventName(request.getEventName());
                                    foodRequest.setEvenCat(request.getEvenCat());
                                    foodRequest.setPlannedDate(request.getPlannedDate());
                                    foodRequest.setOrgType(Organization.Type.Infrastructure);

                                    
                                    e.getWorkQueue().getWorkRequestList().add(foodRequest);
//                                   System.out.println("Request"+locRequest.toString()+"  >> Added to Enterprise "+e);
                                    JOptionPane.showMessageDialog(null, "Order Sent Successfully!");
                                    APIforSMS sms = new APIforSMS(foodTeam.getPhone(), "Hello "+foodTeam.getName()+",  A Location likes to book your Infra Package. Kindly login for more details.");
                                    //system.sendEmailMessage(locTeam.getEmail(), "Hello! You have one new work request! Please login to know more!");
                                break;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");

        }  
    }//GEN-LAST:event_btnOrderFoodActionPerformed

    private void tabPaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPaneMousePressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_tabPaneMousePressed

    private void btnHireMusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHireMusicActionPerformed
       int selectedRow =tblMusic.getSelectedRow();
        int count = tblMusic.getSelectedRowCount();

        if (count == 1) {
            if (selectedRow >= 0) {
                UserAccount musicTeam = (UserAccount) tblMusic.getValueAt(selectedRow, 1);
                String comment = addnInfoMusic.getText();
                
                if (!musicTeam.getStatus().equals("Available")) {
                    JOptionPane.showMessageDialog(null, "Sorry! This Band is already Booked!");
                    return;
                }
                for (Network n : system.getNetworkList()) {
                    for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                        for (Organization org : e.getOrganizationDirectory().getOrganizationList()) {
                            for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                                if (musicTeam.getUsername().equals(ua.getUsername())) {
                                                                                                    
                                    musicRequest.setRequestID();
                                    musicRequest.setSender(userAccount);
                                    musicRequest.setHost(userAccount);
                                    musicRequest.setLocation(musicTeam);
                                    musicRequest.setStatus("Pending");
                                    if (comment.isEmpty()) musicRequest.setMusicNote(comment);
                                    musicRequest.setAttendance(request.getAttendance());
                                    musicRequest.setEventName(request.getEventName());
                                    musicRequest.setEvenCat(request.getEvenCat());
                                    musicRequest.setPlannedDate(request.getPlannedDate());
                                    musicRequest.setOrgType(Organization.Type.Musician);
                                    
                                    
                                    e.getWorkQueue().getWorkRequestList().add(musicRequest);
                                    System.out.println("Request"+musicRequest.toString()+"  >> Added to Enterprise "+e);
                                    JOptionPane.showMessageDialog(null, "Music Request Sent Successfully!");
                                    APIforSMS sms = new APIforSMS(musicTeam.getPhone(), "Hello "+musicTeam.getName()+",  A Host likes to book your Location package on "+String.valueOf(((HostGovtWorkRequest) request).getPlannedDate() ).substring(0,10)+". Kindly login for more details.");
                                    //system.sendEmailMessage(musicTeam.getEmail(), "Hello! You have one new work request! Please login to know more!");
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
    }//GEN-LAST:event_btnHireMusicActionPerformed

    private void btnHirephotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHirephotoActionPerformed
        int selectedRow =tblPhoto.getSelectedRow();
        int count = tblPhoto.getSelectedRowCount();

        if (count == 1) {
            if (selectedRow >= 0) {
                UserAccount photoTeam = (UserAccount) tblPhoto.getValueAt(selectedRow, 1);
                String comment = addnInfoPhoto.getText();
                
                if (!photoTeam.getStatus().equals("Available")) {
                    JOptionPane.showMessageDialog(null, "Sorry! This Photographer is already Booked!");
                    return;
                }
                for (Network n : system.getNetworkList()) {
                    for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                        for (Organization org : e.getOrganizationDirectory().getOrganizationList()) {
                            for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                                if (photoTeam.getUsername().equals(ua.getUsername())) {
                                                                                                    
                                    photoRequest.setRequestID();
                                    photoRequest.setSender(userAccount);
                                    photoRequest.setHost(userAccount);
                                    photoRequest.setLocation(photoTeam);
                                    photoRequest.setStatus("Pending");
                                    if (comment.isEmpty()) photoRequest.setMessage(comment);
                                    photoRequest.setAttendance(request.getAttendance());
                                    photoRequest.setEventName(request.getEventName());
                                    photoRequest.setEvenCat(request.getEvenCat());
                                    photoRequest.setPlannedDate(request.getPlannedDate());
                                    photoRequest.setOrgType(Organization.Type.Photographer);
                                    
                                    
                                    e.getWorkQueue().getWorkRequestList().add(photoRequest);
                                    System.out.println("Request"+photoRequest.toString()+"  >> Added to Enterprise "+e);
                                    JOptionPane.showMessageDialog(null, "Photo Request Sent Successfully!");
                                    APIforSMS sms = new APIforSMS(photoTeam.getPhone(), "Hello "+photoTeam.getName()+",  A Host likes to book your Location package on "+String.valueOf(((HostGovtWorkRequest) request).getPlannedDate() ).substring(0,10)+". Kindly login for more details.");
                                    //system.sendEmailMessage(photoTeam.getEmail(), "Hello! You have one new work request! Please login to know more!");
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
    }//GEN-LAST:event_btnHirephotoActionPerformed

    private void btnOrderBeverageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderBeverageActionPerformed
    int selectedRow =tblBeverage.getSelectedRow();
        int count = tblBeverage.getSelectedRowCount();

        if (count == 1) {
            if (selectedRow >= 0) {
                UserAccount beverageTeam = (UserAccount) tblBeverage.getValueAt(selectedRow, 1);
                String comment = addnInfoBeverages.getText();
                
                if (!beverageTeam.getStatus().equals("Available")) {
                    JOptionPane.showMessageDialog(null, "Sorry! This Beverage is out of stock!");
                    return;
                }
                for (Network n : system.getNetworkList()) {
                    for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                        for (Organization org : e.getOrganizationDirectory().getOrganizationList()) {
                            for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                                if (beverageTeam.getUsername().equals(ua.getUsername())) {
                                                                                                    
                                    beverageRequest.setRequestID();
                                    beverageRequest.setSender(userAccount);
                                    beverageRequest.setHost(userAccount);
                                    beverageRequest.setLocation(beverageTeam);
                                    beverageRequest.setStatus("Pending");
                                    if (comment.isEmpty()) beverageRequest.setMessage(comment);
                                    beverageRequest.setAttendance(request.getAttendance());
                                    beverageRequest.setEventName(request.getEventName());
                                    beverageRequest.setEvenCat(request.getEvenCat());
                                    beverageRequest.setPlannedDate(request.getPlannedDate());
                                    beverageRequest.setOrgType(Organization.Type.Beverages);
                                    
                                    
                                    e.getWorkQueue().getWorkRequestList().add(beverageRequest);
                                    System.out.println("Request"+beverageRequest.toString()+"  >> Added to Enterprise "+e);
                                    JOptionPane.showMessageDialog(null, "Photo Request Sent Successfully!");
                                    APIforSMS sms = new APIforSMS(beverageTeam.getPhone(), "Hello "+beverageTeam.getName()+",  A Host likes to book your Location package on "+String.valueOf(((HostGovtWorkRequest) request).getPlannedDate() ).substring(0,10)+". Kindly login for more details.");
                                    //system.sendEmailMessage(beverageTeam.getEmail(), "Hello! You have one new work request! Please login to know more!");
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
    }//GEN-LAST:event_btnOrderBeverageActionPerformed

    private void addnInfoBeveragesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addnInfoBeveragesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addnInfoBeveragesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addInfoFood;
    private javax.swing.JTextField addnInfoBeverages;
    private javax.swing.JTextField addnInfoLoc;
    private javax.swing.JTextField addnInfoMusic;
    private javax.swing.JTextField addnInfoPhoto;
    private javax.swing.JButton btnHireLoc;
    private javax.swing.JButton btnHireMusic;
    private javax.swing.JButton btnHirephoto;
    private javax.swing.JButton btnOrderBeverage;
    private javax.swing.JButton btnOrderFood;
    private javax.swing.JLabel enterpriseLabel2;
    private javax.swing.JPanel infraPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblAddnInfo;
    private javax.swing.JLabel lblEventDate;
    private javax.swing.JLabel lblEventName;
    private javax.swing.JPanel locPanel;
    private javax.swing.JPanel musicPanel;
    private javax.swing.JPanel photopanel;
    private javax.swing.JTabbedPane tabPane;
    private javax.swing.JTable tblBeverage;
    private javax.swing.JTable tblFood;
    private javax.swing.JTable tblLocation;
    private javax.swing.JTable tblMusic;
    private javax.swing.JTable tblPhoto;
    // End of variables declaration//GEN-END:variables
}
