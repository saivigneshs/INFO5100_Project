/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;


import Business.EcoSystem;
import Business.Network.Network;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Saivignesh Sridhar
 */
public class ViewStateNormsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewCustomerJPanel
     */
    
    public JPanel container;
    Network network;
    
    public ViewStateNormsJPanel(JPanel container, Network network) {
        
        initComponents();
        this.container = container;
        this.network = network;
       
        disableEdit();
    }
private void disableEdit(){
    txtStateName.setEditable(false);
    txtOutdoorLimit.setEditable(false);
    txtMaskNeeded.setEditable(false);
    txtIndoorLimit.setEditable(false);
    
    BufferedImage bfImage = null;
        try {
            
            bfImage = ImageIO.read(new File(network.getImgPath()));
        } catch (IOException ex) {
            Logger.getLogger(ViewStateNormsJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    //    Image imPhoto = bfImage.getScaledInstance(lblStateFlag.getWidth(), lblStateFlag.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon imIcon = new ImageIcon(bfImage);
        
        lblStateFlag.setIcon(imIcon);
        txtStateName.setText(network.getName());
        txtIndoorLimit.setText(network.getIgLimit());
        txtOutdoorLimit.setText(network.getOgLimit());
        txtMaskNeeded.setText(network.getMaskMandatory());
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblStateFlag = new javax.swing.JLabel();
        txtOutdoorLimit = new javax.swing.JTextField();
        lblMaskNeeded = new javax.swing.JLabel();
        txtMaskNeeded = new javax.swing.JTextField();
        lblViewUpdateCust = new javax.swing.JLabel();
        lblIndoorLimit = new javax.swing.JLabel();
        lblOutdoorLimit = new javax.swing.JLabel();
        txtIndoorLimit = new javax.swing.JTextField();
        btnBack1 = new javax.swing.JButton();
        lblStateName = new javax.swing.JLabel();
        txtStateName = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 255, 255));

        lblStateFlag.setBackground(new java.awt.Color(204, 255, 255));
        lblStateFlag.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        lblStateFlag.setForeground(new java.awt.Color(0, 51, 51));
        lblStateFlag.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStateFlag.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtOutdoorLimit.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        txtOutdoorLimit.setForeground(new java.awt.Color(0, 51, 51));

        lblMaskNeeded.setBackground(new java.awt.Color(204, 255, 255));
        lblMaskNeeded.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        lblMaskNeeded.setForeground(new java.awt.Color(0, 51, 51));
        lblMaskNeeded.setText("Masks Mandatory?");

        txtMaskNeeded.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        txtMaskNeeded.setForeground(new java.awt.Color(0, 51, 51));

        lblViewUpdateCust.setBackground(new java.awt.Color(204, 255, 255));
        lblViewUpdateCust.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        lblViewUpdateCust.setForeground(new java.awt.Color(0, 51, 51));
        lblViewUpdateCust.setText("State Norms");

        lblIndoorLimit.setBackground(new java.awt.Color(204, 255, 255));
        lblIndoorLimit.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        lblIndoorLimit.setForeground(new java.awt.Color(0, 51, 51));
        lblIndoorLimit.setText("Indoor Gathering Limit");

        lblOutdoorLimit.setBackground(new java.awt.Color(204, 255, 255));
        lblOutdoorLimit.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        lblOutdoorLimit.setForeground(new java.awt.Color(0, 51, 51));
        lblOutdoorLimit.setText("Outdoor Gathering Limit");

        txtIndoorLimit.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        txtIndoorLimit.setForeground(new java.awt.Color(0, 51, 51));

        btnBack1.setBackground(new java.awt.Color(204, 255, 255));
        btnBack1.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        btnBack1.setForeground(new java.awt.Color(0, 51, 51));
        btnBack1.setText("Back");
        btnBack1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        lblStateName.setBackground(new java.awt.Color(204, 255, 255));
        lblStateName.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        lblStateName.setForeground(new java.awt.Color(0, 51, 51));
        lblStateName.setText("State Name");

        txtStateName.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        txtStateName.setForeground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblViewUpdateCust))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(lblMaskNeeded))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblStateName, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblIndoorLimit, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblOutdoorLimit, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtStateName, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIndoorLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtOutdoorLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaskNeeded, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addComponent(lblStateFlag, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblViewUpdateCust)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(lblOutdoorLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStateName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblStateName))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIndoorLimit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIndoorLimit))
                        .addGap(7, 7, 7)
                        .addComponent(txtOutdoorLimit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaskNeeded, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMaskNeeded)))
                    .addComponent(lblStateFlag, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(btnBack1)
                .addGap(0, 156, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
<<<<<<< HEAD
<<<<<<< HEAD
       
=======
>>>>>>> 4c5219ce56b0298642e92707f357e51b9c6285a7
=======
>>>>>>> 4c5219ce56b0298642e92707f357e51b9c6285a7
    }//GEN-LAST:event_btnBack1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack1;
    private javax.swing.JLabel lblIndoorLimit;
    private javax.swing.JLabel lblMaskNeeded;
    private javax.swing.JLabel lblOutdoorLimit;
    private javax.swing.JLabel lblStateFlag;
    private javax.swing.JLabel lblStateName;
    private javax.swing.JLabel lblViewUpdateCust;
    private javax.swing.JTextField txtIndoorLimit;
    private javax.swing.JTextField txtMaskNeeded;
    private javax.swing.JTextField txtOutdoorLimit;
    private javax.swing.JTextField txtStateName;
    // End of variables declaration//GEN-END:variables
}
