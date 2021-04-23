package userinterface.MusicianRole;


import userinterface.LocationRole.*;
import userinterface.LocationRole.LocationOrgInfoJPanel;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author  Saivignesh Sridhar
 */
public class MusicWorkAreaJPanel extends javax.swing.JPanel {
    
    private final JPanel userProcessContainer;
    private final EcoSystem system;
    private final UserAccount userAccount;
    private final Organization organization;
    private final Network network;
    private final Enterprise enterprise;
    
    /** Creates new form AdminWorkAreaJPanel */
    public MusicWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization org, Enterprise ent, Network net, EcoSystem system) {
        initComponents();
//        admin.setText(account.getUsername());
        title2.setText(account.getEmployee().getName()+"'s Admin Page");
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = account;
        this.organization = org;
        this.enterprise = ent;
        this.network = net;
        manageRequests();
        //valueLabel.setText();
    }
    private void viewDetails(){
        MusicOrgInfoJPanel MusicOrgInfoJPanel = new MusicOrgInfoJPanel(rightPanel,userAccount,system,network);
        rightPanel.add("MusicOrgInfoJPanel",MusicOrgInfoJPanel);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);
    }
    
    private void manageRequests(){
        MusicRequestJPanel MusicRequestJPanel = new MusicRequestJPanel(rightPanel,userAccount,system);
        rightPanel.add("MusicRequestJPanel",MusicRequestJPanel);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LocPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        TeamDetailsPanel = new javax.swing.JPanel();
        lbl_TeamDetails = new javax.swing.JLabel();
        admin = new javax.swing.JLabel();
        ManageRequestPanel = new javax.swing.JPanel();
        lblManageRequest = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        rightPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(204, 204, 255));
        setForeground(new java.awt.Color(0, 51, 51));
        setToolTipText("");
        setLayout(new java.awt.BorderLayout());

        LocPanel.setBackground(new java.awt.Color(241, 241, 242));
        LocPanel.setMinimumSize(new java.awt.Dimension(1338, 840));

        menuPanel.setBackground(new java.awt.Color(204, 204, 255));
        menuPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuPanel.setMinimumSize(new java.awt.Dimension(280, 840));
        menuPanel.setPreferredSize(new java.awt.Dimension(280, 840));

        TeamDetailsPanel.setBackground(new java.awt.Color(204, 204, 255));
        TeamDetailsPanel.setToolTipText("");
        TeamDetailsPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TeamDetailsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TeamDetailsPanelMousePressed(evt);
            }
        });

        lbl_TeamDetails.setBackground(new java.awt.Color(204, 204, 255));
        lbl_TeamDetails.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        lbl_TeamDetails.setText("Music Details");
        lbl_TeamDetails.setAutoscrolls(true);
        lbl_TeamDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_TeamDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_TeamDetailsMousePressed(evt);
            }
        });

        javax.swing.GroupLayout TeamDetailsPanelLayout = new javax.swing.GroupLayout(TeamDetailsPanel);
        TeamDetailsPanel.setLayout(TeamDetailsPanelLayout);
        TeamDetailsPanelLayout.setHorizontalGroup(
            TeamDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TeamDetailsPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbl_TeamDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        TeamDetailsPanelLayout.setVerticalGroup(
            TeamDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_TeamDetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        admin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        admin.setText("Admin Page");

        ManageRequestPanel.setBackground(new java.awt.Color(204, 204, 255));
        ManageRequestPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ManageRequestPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ManageRequestPanelMousePressed(evt);
            }
        });

        lblManageRequest.setBackground(new java.awt.Color(255, 213, 90));
        lblManageRequest.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        lblManageRequest.setText("Manage User Requests");
        lblManageRequest.setPreferredSize(new java.awt.Dimension(115, 16));
        lblManageRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblManageRequestMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ManageRequestPanelLayout = new javax.swing.GroupLayout(ManageRequestPanel);
        ManageRequestPanel.setLayout(ManageRequestPanelLayout);
        ManageRequestPanelLayout.setHorizontalGroup(
            ManageRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageRequestPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblManageRequest, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addContainerGap())
        );
        ManageRequestPanelLayout.setVerticalGroup(
            ManageRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManageRequestPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblManageRequest, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        title2.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        title2.setText("Music Team Details");

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator3)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TeamDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ManageRequestPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 68, Short.MAX_VALUE))
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(admin))
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(title2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(title2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(admin)
                .addGap(14, 14, 14)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TeamDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(ManageRequestPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        rightPanel.setBackground(new java.awt.Color(204, 204, 255));
        rightPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rightPanel.setPreferredSize(new java.awt.Dimension(1058, 840));
        rightPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout LocPanelLayout = new javax.swing.GroupLayout(LocPanel);
        LocPanel.setLayout(LocPanelLayout);
        LocPanelLayout.setHorizontalGroup(
            LocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LocPanelLayout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
                .addContainerGap())
        );
        LocPanelLayout.setVerticalGroup(
            LocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LocPanelLayout.createSequentialGroup()
                .addGroup(LocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        add(LocPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_TeamDetailsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_TeamDetailsMousePressed

        viewDetails();
    }//GEN-LAST:event_lbl_TeamDetailsMousePressed

    private void TeamDetailsPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TeamDetailsPanelMousePressed
        // TODO add your handling code here:
       viewDetails();
    }//GEN-LAST:event_TeamDetailsPanelMousePressed

    private void lblManageRequestMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManageRequestMousePressed
        // TODO add your handling code here:
       manageRequests();
    }//GEN-LAST:event_lblManageRequestMousePressed

    private void ManageRequestPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageRequestPanelMousePressed
        // TODO add your handling code here:
        manageRequests();
    }//GEN-LAST:event_ManageRequestPanelMousePressed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LocPanel;
    private javax.swing.JPanel ManageRequestPanel;
    private javax.swing.JPanel TeamDetailsPanel;
    private javax.swing.JLabel admin;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblManageRequest;
    private javax.swing.JLabel lbl_TeamDetails;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JLabel title2;
    // End of variables declaration//GEN-END:variables
    
}
