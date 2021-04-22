/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.UserRegistration;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Saivignesh Sridhar
 */
public class testmail {
    
    public static void main(String[] args){
        
        sendMail("saivignesh96@gmail.com", "Test Test Test");
    }
    public static void sendMail(String emailID, String content) {
        String toAddr = emailID;
        String fromAddr = "donotreplyaedproj@gmail.com";
        String pass = "aedproject@123";

        Properties properties = System.getProperties();
          properties.put("mail.smtp.host", "smtp.gmail.com");    
          properties.put("mail.smtp.socketFactory.port", "465");    
          properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");    
          properties.put("mail.smtp.auth", "true");    
          properties.put("mail.smtp.port", "465");

       Session session = Session.getDefaultInstance(properties,    
           new javax.mail.Authenticator() {    
           protected PasswordAuthentication getPasswordAuthentication() {    
           return new PasswordAuthentication(fromAddr,pass);  
           }    
          });
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromAddr));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(toAddr));
            message.setSubject("New User Registration");
            message.setText(content);
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (MessagingException e) {
            JOptionPane.showMessageDialog(null, "Invalid Email Address");
        }
    }
}
