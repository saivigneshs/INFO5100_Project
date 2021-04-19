/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Network.Network;
import java.awt.CardLayout;
import java.io.FileReader;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Saivignesh Sridhar
 */
public class ManageNetworkJPanel extends javax.swing.JPanel {

    private final EcoSystem system;
    JPanel userProcessContainer;
    /**
     *
     * Creates new form ManageNetworkJPanel
     * @param system
     */
    public ManageNetworkJPanel(JPanel container, EcoSystem system) {
        initComponents();
        this.system = system;
        this.userProcessContainer=container; 
        populateNetworkTable();
    }

    private void populateNetworkTable() {
        DefaultTableModel model = (DefaultTableModel) networkJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            Object[] row = new Object[1];
            if(network.getCode()!=null){
            row[0] = network.getCode();
            }
            else row[0] = network.getName();
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        networkJTable = new javax.swing.JTable();
        lbl_StateView = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblView = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        txtnetworkState = new javax.swing.JTextField();
        lblAdd = new javax.swing.JLabel();
        lblDelete = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setPreferredSize(new java.awt.Dimension(1058, 840));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        networkJTable.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        networkJTable.setForeground(new java.awt.Color(25, 56, 82));
        networkJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        networkJTable.setSelectionBackground(new java.awt.Color(56, 90, 174));
        jScrollPane1.setViewportView(networkJTable);
        if (networkJTable.getColumnModel().getColumnCount() > 0) {
            networkJTable.getColumnModel().getColumn(0).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 480, 240));

        lbl_StateView.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lbl_StateView.setForeground(new java.awt.Color(25, 56, 82));
        lbl_StateView.setText("Kindly select a State and Hit View");
        add(lbl_StateView, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 310, 20));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(25, 56, 82));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("VIEW STATE DETAILS AND NORMS");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 586, -1));

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
        add(lblView, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, 80, 30));

        lblState.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblState.setForeground(new java.awt.Color(25, 56, 82));
        lblState.setText("Kindly Enter the State Code");
        add(lblState, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 260, 20));

        txtnetworkState.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        txtnetworkState.setForeground(new java.awt.Color(25, 56, 82));
        add(txtnetworkState, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 80, -1));

        lblAdd.setBackground(new java.awt.Color(255, 255, 255));
        lblAdd.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblAdd.setForeground(new java.awt.Color(25, 56, 82));
        lblAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdd.setText("Add");
        lblAdd.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(25, 56, 82)));
        lblAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblAddMousePressed(evt);
            }
        });
        add(lblAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, 80, 30));

        lblDelete.setBackground(new java.awt.Color(255, 255, 255));
        lblDelete.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblDelete.setForeground(new java.awt.Color(25, 56, 82));
        lblDelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDelete.setText("Delete");
        lblDelete.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(25, 56, 82)));
        lblDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblDeleteMousePressed(evt);
            }
        });
        add(lblDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 500, 80, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void lblAddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddMousePressed
        // TODO add your handling code here:
               addNetwork();
    }//GEN-LAST:event_lblAddMousePressed

    private void lblViewMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewMousePressed
        // TODO add your handling code here:

         int selectedRow = networkJTable.getSelectedRow();
        int count = networkJTable.getSelectedRowCount();
        if (count == 1) {
            if (selectedRow >= 0) {
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                String networkCode = (String) networkJTable.getValueAt(selectedRow,0);
               Network net =  system.fetchNetwork(networkCode);    
               
                ViewStateNormsJPanel viewUpdateStateNormsJPanel = new ViewStateNormsJPanel(userProcessContainer, net);
                    userProcessContainer.add(viewUpdateStateNormsJPanel);
                layout.next(userProcessContainer);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Select a Row to continue.");
        }
    }//GEN-LAST:event_lblViewMousePressed

    private void lblDeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeleteMousePressed
        // TODO add your handling code here:
        int selectedRow = networkJTable.getSelectedRow();
        int count = networkJTable.getSelectedRowCount();
        if (count == 1) {
            if (selectedRow >= 0) {
                String networkCode = (String) networkJTable.getValueAt(selectedRow,0);
                int selectionButton = JOptionPane.YES_NO_OPTION;
                int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??", "Warning", selectionButton);
                if (selectionResult == JOptionPane.YES_OPTION) {
                    system.DeleteNetwork(networkCode,selectedRow);
                    populateNetworkTable();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Select a Row to continue.");
        }
    }//GEN-LAST:event_lblDeleteMousePressed

    private void addNetwork() {
        String stateCode = txtnetworkState.getText().trim();
        if (stateCode.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Kindly Enter a State Code!");
            return;
        }
        if (system.checkIfNetworkIsUnique(stateCode)) {
            Network network = system.createAndAddNetwork();

            network.setCode(stateCode);
             try{
            Properties prop = new Properties();
            FileReader  reader = new FileReader("src\\StateNorms.properties");
            prop.load(reader);
            String stateDets = prop.getProperty(stateCode);
            System.out.println("`` "+stateDets);
            String[] res = stateDets.split(",");
            network.setName(res[0]);
            network.setIgLimit(Integer.parseInt(res[1]));
            network.setOgLimit(Integer.parseInt(res[2]));
            network.setMaskMandatory(res[3]);
            network.setImgPath(res[4]);
            }
            catch(Exception e){
             Logger.getLogger(ManageNetworkJPanel.class.getName()).log(Level.SEVERE, null, e);
            }
            JOptionPane.showMessageDialog(null, "Network Created Successfully");
            txtnetworkState.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Network Already Exists");
        }
        populateNetworkTable();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAdd;
    private javax.swing.JLabel lblDelete;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblView;
    private javax.swing.JLabel lbl_StateView;
    private javax.swing.JTable networkJTable;
    private javax.swing.JTextField txtnetworkState;
    // End of variables declaration//GEN-END:variables
}
