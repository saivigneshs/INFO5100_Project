/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LocationRole;

import userinterface.InfraRole.*;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Saivignesh Sridhar
 */
public class AddInfraEquipJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddInfraEquipJPanel
     */
    private final JPanel userProcessContainer;
    private final EcoSystem system;

    private final UserAccount account;
    public AddInfraEquipJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.account = account;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAddItem = new javax.swing.JLabel();
        lblItemName = new javax.swing.JLabel();
        lblIngredients = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        txtItemPrice = new javax.swing.JTextField();
        txtIngredients = new javax.swing.JTextField();
        txtItemName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblCategory = new javax.swing.JLabel();
        txtCategory = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));

        lblAddItem.setBackground(new java.awt.Color(204, 255, 255));
        lblAddItem.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        lblAddItem.setForeground(new java.awt.Color(0, 51, 51));
        lblAddItem.setText("Add Equipment");

        lblItemName.setBackground(new java.awt.Color(204, 255, 255));
        lblItemName.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        lblItemName.setForeground(new java.awt.Color(0, 51, 51));
        lblItemName.setText("Item Name :");

        lblIngredients.setBackground(new java.awt.Color(204, 255, 255));
        lblIngredients.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        lblIngredients.setForeground(new java.awt.Color(0, 51, 51));
        lblIngredients.setText("Ingredients Added :");

        lblPrice.setBackground(new java.awt.Color(204, 255, 255));
        lblPrice.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(0, 51, 51));
        lblPrice.setText("Price :");

        txtItemPrice.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        txtItemPrice.setForeground(new java.awt.Color(0, 51, 51));

        txtIngredients.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        txtIngredients.setForeground(new java.awt.Color(0, 51, 51));

        txtItemName.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        txtItemName.setForeground(new java.awt.Color(0, 51, 51));

        btnSave.setBackground(new java.awt.Color(204, 255, 255));
        btnSave.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        btnSave.setForeground(new java.awt.Color(0, 51, 51));
        btnSave.setText("Save");
        btnSave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(204, 255, 255));
        btnBack.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 51, 51));
        btnBack.setText("Back");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblCategory.setBackground(new java.awt.Color(204, 255, 255));
        lblCategory.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        lblCategory.setForeground(new java.awt.Color(0, 51, 51));
        lblCategory.setText("Category :");

        txtCategory.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        txtCategory.setForeground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblIngredients)
                                    .addComponent(lblItemName))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIngredients, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPrice)
                                    .addComponent(lblCategory))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(lblAddItem)))
                .addGap(0, 91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblAddItem)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItemName)
                    .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIngredients)
                    .addComponent(txtIngredients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategory)
                    .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrice)
                    .addComponent(txtItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnSave))
                .addContainerGap(106, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String itemName = txtItemName.getText();
        String contents = txtIngredients.getText();
        String category = txtCategory.getText();
        double price = 0;
        try {
            price = Double.parseDouble(txtItemPrice.getText());
        } catch (NumberFormatException exception) {
            System.out.println(exception);
            JOptionPane.showMessageDialog(null, "Please enter valid price!");
        }
        if (itemName.isEmpty() || contents.isEmpty() || price == 0 || category.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill all the fields.");
        } else {
            String restaurantNo = account.getEmployee().getName();
            //String restaurantId, String name, double price, String contents, String category
            JOptionPane.showMessageDialog(null, "Item added sucessfully!");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblAddItem;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblIngredients;
    private javax.swing.JLabel lblItemName;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtIngredients;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtItemPrice;
    // End of variables declaration//GEN-END:variables
}
