package userinterface.HostRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Saivignesh Sridhar
 */
public class HostWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem system;
    Network network;
    UserAccount account;
    Organization organization;

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    public HostWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = business;
        this.network = network;
        this.enterprise = enterprise;
        this.organization = organization;
        viewEvents();

    }

    private void viewEvents() {
        ViewEventsJPanel viewEventsPanel = new ViewEventsJPanel(rightHostPanel, account, enterprise, system, network, organization);
        rightHostPanel.add("viewEventsPanel", viewEventsPanel);
        CardLayout layout = (CardLayout) rightHostPanel.getLayout();
        layout.next(rightHostPanel);
    }

    private void addEvent() {
        AddEventJPanel addEventJPanel = new AddEventJPanel(rightHostPanel, account, enterprise, system, network, organization);
        rightHostPanel.add("addEventJPanel", addEventJPanel);
        CardLayout layout = (CardLayout) rightHostPanel.getLayout();
        layout.next(rightHostPanel);
    }
    
    private void viewHostProfile() {
        ViewHostProfileJPanel viewHostProfileJPanel = new ViewHostProfileJPanel(rightHostPanel,system, account);
        rightHostPanel.add("viewHostProfileJPanel", viewHostProfileJPanel);
        CardLayout layout = (CardLayout) rightHostPanel.getLayout();
        layout.next(rightHostPanel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HostPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        ViewEventsPanel = new javax.swing.JPanel();
        lbl_ViewEvents = new javax.swing.JLabel();
        addEventPanel = new javax.swing.JPanel();
        lbl_addEvent = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        HostProfilePanel = new javax.swing.JPanel();
        lbl_hostProfile = new javax.swing.JLabel();
        rightHostPanel = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1338, 840));
        setLayout(new java.awt.BorderLayout());

        HostPanel.setBackground(new java.awt.Color(241, 241, 242));
        HostPanel.setMinimumSize(new java.awt.Dimension(1338, 840));
        HostPanel.setPreferredSize(new java.awt.Dimension(1338, 840));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(280, 840));
        jPanel3.setPreferredSize(new java.awt.Dimension(280, 840));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ViewEventsPanel.setBackground(new java.awt.Color(204, 204, 255));
        ViewEventsPanel.setToolTipText("");
        ViewEventsPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViewEventsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ViewEventsPanelMousePressed(evt);
            }
        });

        lbl_ViewEvents.setBackground(new java.awt.Color(204, 204, 255));
        lbl_ViewEvents.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lbl_ViewEvents.setText("View Events");
        lbl_ViewEvents.setAutoscrolls(true);
        lbl_ViewEvents.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_ViewEvents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_ViewEventsMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ViewEventsPanelLayout = new javax.swing.GroupLayout(ViewEventsPanel);
        ViewEventsPanel.setLayout(ViewEventsPanelLayout);
        ViewEventsPanelLayout.setHorizontalGroup(
            ViewEventsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewEventsPanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(lbl_ViewEvents, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );
        ViewEventsPanelLayout.setVerticalGroup(
            ViewEventsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewEventsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_ViewEvents, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(ViewEventsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 280, -1));

        addEventPanel.setBackground(new java.awt.Color(204, 204, 255));
        addEventPanel.setToolTipText("");
        addEventPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addEventPanel.setPreferredSize(new java.awt.Dimension(264, 48));
        addEventPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addEventPanelMousePressed(evt);
            }
        });

        lbl_addEvent.setBackground(new java.awt.Color(204, 204, 255));
        lbl_addEvent.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbl_addEvent.setText("Add an Event");
        lbl_addEvent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_addEvent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_addEventMousePressed(evt);
            }
        });

        javax.swing.GroupLayout addEventPanelLayout = new javax.swing.GroupLayout(addEventPanel);
        addEventPanel.setLayout(addEventPanelLayout);
        addEventPanelLayout.setHorizontalGroup(
            addEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEventPanelLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(lbl_addEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        addEventPanelLayout.setVerticalGroup(
            addEventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEventPanelLayout.createSequentialGroup()
                .addComponent(lbl_addEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        jPanel3.add(addEventPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 280, 40));

        title.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        title.setText("Event Management Area");
        jPanel3.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        HostProfilePanel.setBackground(new java.awt.Color(204, 204, 255));
        HostProfilePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HostProfilePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HostProfilePanelMousePressed(evt);
            }
        });

        lbl_hostProfile.setBackground(new java.awt.Color(255, 213, 90));
        lbl_hostProfile.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lbl_hostProfile.setText("Host Profile");
        lbl_hostProfile.setPreferredSize(new java.awt.Dimension(115, 16));
        lbl_hostProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_hostProfileMousePressed(evt);
            }
        });

        javax.swing.GroupLayout HostProfilePanelLayout = new javax.swing.GroupLayout(HostProfilePanel);
        HostProfilePanel.setLayout(HostProfilePanelLayout);
        HostProfilePanelLayout.setHorizontalGroup(
            HostProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HostProfilePanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lbl_hostProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        HostProfilePanelLayout.setVerticalGroup(
            HostProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HostProfilePanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lbl_hostProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.add(HostProfilePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 250, 60));

        rightHostPanel.setBackground(new java.awt.Color(241, 241, 242));
        rightHostPanel.setPreferredSize(new java.awt.Dimension(1058, 840));
        rightHostPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout HostPanelLayout = new javax.swing.GroupLayout(HostPanel);
        HostPanel.setLayout(HostPanelLayout);
        HostPanelLayout.setHorizontalGroup(
            HostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HostPanelLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightHostPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        HostPanelLayout.setVerticalGroup(
            HostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HostPanelLayout.createSequentialGroup()
                .addGroup(HostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(HostPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rightHostPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        add(HostPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_addEventMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_addEventMousePressed
        addEvent();

    }//GEN-LAST:event_lbl_addEventMousePressed

    private void ViewEventsPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewEventsPanelMousePressed
        // TODO add your handling code here:
        viewEvents();
    }//GEN-LAST:event_ViewEventsPanelMousePressed

    private void lbl_ViewEventsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ViewEventsMousePressed
        viewEvents();;
    }//GEN-LAST:event_lbl_ViewEventsMousePressed

    private void addEventPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addEventPanelMousePressed
        // TODO add your handling code here:
        addEvent();
    }//GEN-LAST:event_addEventPanelMousePressed

    private void lbl_hostProfileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_hostProfileMousePressed
        // TODO add your handling code here:
                viewHostProfile();

    }//GEN-LAST:event_lbl_hostProfileMousePressed

    private void HostProfilePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HostProfilePanelMousePressed
        // TODO add your handling code here:
                viewHostProfile();

    }//GEN-LAST:event_HostProfilePanelMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HostPanel;
    private javax.swing.JPanel HostProfilePanel;
    private javax.swing.JPanel ViewEventsPanel;
    private javax.swing.JPanel addEventPanel;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_ViewEvents;
    private javax.swing.JLabel lbl_addEvent;
    private javax.swing.JLabel lbl_hostProfile;
    private javax.swing.JPanel rightHostPanel;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

}
