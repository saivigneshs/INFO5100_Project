/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Saivignesh Sridhar
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        GovtAuth("GovtAuth"),
        Host("Host"),
        Infra("Infra"),
        Location("Location"),
        Music("Music"),
        Photo("Photo"),
        Food("Food"),
        Beverages("Beverages"),
        Delivery("Delivery"),
        SecurityERRole("SecurityERRole");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
   public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise,
            Network network,
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}
