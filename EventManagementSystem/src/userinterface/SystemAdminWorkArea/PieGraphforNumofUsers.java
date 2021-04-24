/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.BeveragesRole;
import Business.Role.FoodRole;
import Business.Role.HostRole;
import Business.Role.InfraRole;
import Business.Role.LocationRole;
import Business.Role.MusicianRole;
import Business.Role.PhotographerRole;
import Business.Role.DeliveryRole;
import Business.Role.SecurityERRole;
import Business.UserAccount.UserAccount;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

/**
 *
 * @author gowtham
 */
public class PieGraphforNumofUsers extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    EcoSystem system;
    JFreeChart pieChart;
    /**
     * Creates new form ViewScenesGraph
     * @param userProcessContainer
     * @param system
     */
    public PieGraphforNumofUsers(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateBarGraph();
    }
    
    public void populateBarGraph() {
        pieChart = ChartFactory.createPieChart(
         "Number of Roles Created across Networks",                     
         createDataset(),          
         true, true, false);
        ChartPanel chartPanel = new ChartPanel( pieChart );   
        jPanel1.removeAll();
        jPanel1.add(chartPanel, BorderLayout.CENTER);
        jPanel1.validate();
    }
    
    private PieDataset createDataset() {
       
        int HostCount = 0, InfraCount = 0, LocationCount = 0, FoodCount = 0, BeveragesCount = 0,
                MusicianCount = 0, SecurityERCount = 0, PhotographerCount = 0;
        DefaultPieDataset result = new DefaultPieDataset();

        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                        if (ua.getRole() instanceof HostRole) {
                            HostCount++;
                        } else if (ua.getRole() instanceof InfraRole) {
                            InfraCount++;
                        } else if (ua.getRole() instanceof LocationRole) {
                            LocationCount++;
                        } else if (ua.getRole() instanceof FoodRole) {
                            FoodCount++;
                        } else if (ua.getRole() instanceof BeveragesRole) {
                            BeveragesCount++;
                        } else if (ua.getRole() instanceof MusicianRole) {
                            MusicianCount++;
                        } else if (ua.getRole() instanceof PhotographerRole) {
                            PhotographerCount++;
                        } else if (ua.getRole() instanceof SecurityERRole) {
                            SecurityERCount++;
                        
                        }
                    }
                }
            }
        }
        result.setValue("Host", HostCount);
        result.setValue("Infra", InfraCount);
        result.setValue("Location", LocationCount);
        result.setValue("Food", FoodCount);
        result.setValue("Beverages", BeveragesCount);
        result.setValue("Musician", MusicianCount);
        result.setValue("Photographer", PhotographerCount);
        result.setValue("SecuritySR", SecurityERCount);

        return result;
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

        setBackground(new java.awt.Color(241, 241, 242));
        setPreferredSize(new java.awt.Dimension(1058, 840));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new java.awt.BorderLayout());
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 620, 390));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}