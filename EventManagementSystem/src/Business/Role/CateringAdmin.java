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
import userinterface.EnterAdminRole.CateringAdminWorkAreaJPanel;
import userinterface.EnterAdminRole.GeoInfraAdminWorkAreaJPanel;

/**
 *
 * @author Saivignesh Sridhar
 */
public class CateringAdmin extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, EcoSystem business) {
        return new CateringAdminWorkAreaJPanel(userProcessContainer, account,organization, enterprise, network, business);
    }

    
    
}
