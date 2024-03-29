/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.EnterAdminRole;

import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Organization.OrganizationDirectory;
import static Business.SendMailUsingAuthentication.SMTP_AUTH_USER;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
 
import java.io.FileOutputStream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Font;
import java.io.IOException;
import java.util.*;  
import javax.mail.*;  
import javax.mail.internet.*;  
import javax.activation.*;  

/**
 *
 * @author gowth
 */
public class SecurityERManageOrgJPanel extends javax.swing.JPanel {

    
    private final OrganizationDirectory directory;
    /**
     * Creates new form EntertainmentManageOrgJPanel
     */
    public SecurityERManageOrgJPanel(OrganizationDirectory orgdir) {
        initComponents();
        this.directory = orgdir;
        volPopulate();
        populateOrganizationTypeComboBox();
    }

    
       private void populateOrganizationTypeComboBox() {
        orgtypecombobox.removeAllItems();
        orgtypecombobox.addItem(Organization.Type.SecurityER);
        
    }
       
       public void volPopulate() {
        DefaultTableModel model = (DefaultTableModel) ManageSecurityERtbl.getModel();

        model.setRowCount(0);

        for (Organization organization : directory.getOrganizationList()) {
            {
                Object[] row = new Object[2];
                row[0] = organization.getType().getValue();
                row[1] = organization.getName();
                model.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ManageSecurityERtbl = new javax.swing.JTable();
        orgtype_lbl = new javax.swing.JLabel();
        txt_entorgname = new javax.swing.JTextField();
        manageentorg = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        orgtypecombobox = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Manage Entertainment Organisation");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 290, 38));

        ManageSecurityERtbl.setBackground(new java.awt.Color(204, 204, 255));
        ManageSecurityERtbl.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ManageSecurityERtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Organisation Type", "Organisation Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ManageSecurityERtbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 523, 168));

        orgtype_lbl.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        orgtype_lbl.setText("Organisation Type:");
        add(orgtype_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 140, 27));
        add(txt_entorgname, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 150, 20));

        manageentorg.setBackground(new java.awt.Color(204, 204, 204));
        manageentorg.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        manageentorg.setText("  Add  Organisation");
        manageentorg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        manageentorg.setOpaque(true);
        manageentorg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageentorgMousePressed(evt);
            }
        });
        add(manageentorg, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, 127, 27));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel4.setText("Organisation Name:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 140, 27));

        orgtypecombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(orgtypecombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 150, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void manageentorgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageentorgMousePressed
                                              

        Type type = (Type) orgtypecombobox.getSelectedItem();

        if ("".equals(txt_entorgname.getText())) {
            JOptionPane.showMessageDialog(null, "Enter organization name!");
        } else {
            Organization organization = directory.createOrganization(type, txt_entorgname.getText());
            JOptionPane.showMessageDialog(null, "Organization Successfully Created");
            txt_entorgname.setText("");
            volPopulate();
        }

    
    }//GEN-LAST:event_manageentorgMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ManageSecurityERtbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel manageentorg;
    private javax.swing.JLabel orgtype_lbl;
    private javax.swing.JComboBox orgtypecombobox;
    private javax.swing.JTextField txt_entorgname;
    // End of variables declaration//GEN-END:variables

    public void sendemail(String filepath) {
       String host = "smtp.gmail.com";
        String port = "587";
        String mailFrom = "eventura.usa@gmail.com";
        String password = "eventura@123";
 
        // message info
        String mailTo = "saivignesh96@gmail.com";
        String subject = "New email with attachments";
        String message = "I have some attachments for you.";
 
        // attachments
        String[] attachFiles = new String[1];
        attachFiles[0] = filepath;
//        attachFiles[1] = "e:/Test/Music.mp3";
//        attachFiles[2] = "e:/Test/Video.mp4";
 
        try {
            sendEmailWithAttachments(host, port, mailFrom, password, mailTo,
                subject, message, attachFiles);
            System.out.println("Email sent.");
        } catch (Exception ex) {
            System.out.println("Could not send email.");
            ex.printStackTrace();
        }
    }
    
    public void sendEmailWithAttachments (String host, String port,
            final String userName, final String password, String toAddress,
            String subject, String message, String[] attachFiles) throws AddressException, MessagingException{
        // sets SMTP server properties
        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", port);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.user", userName);
        properties.put("mail.password", password);
 
        // creates a new session with an authenticator
        Authenticator auth = new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(userName, password);
            }
        };
        Session session = Session.getInstance(properties, auth);
 
        // creates a new e-mail message
        Message msg = new MimeMessage(session);
 
        msg.setFrom(new InternetAddress(userName));
        InternetAddress[] toAddresses = { new InternetAddress(toAddress) };
        msg.setRecipients(Message.RecipientType.TO, toAddresses);
        msg.setSubject(subject);
        msg.setSentDate(new Date());
 
        // creates message part
        MimeBodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setContent(message, "text/html");
 
        // creates multi-part
        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);
 
        // adds attachments
        if (attachFiles != null && attachFiles.length > 0) {
            for (String filePath : attachFiles) {
                MimeBodyPart attachPart = new MimeBodyPart();
 
                try {
                    attachPart.attachFile(filePath);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
 
                multipart.addBodyPart(attachPart);
            }
        }
 
        // sets the multi-part as e-mail's content
        msg.setContent(multipart);
 
        // sends the e-mail
        Transport.send(msg);
    }
}

