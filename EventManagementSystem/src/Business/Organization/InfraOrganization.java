/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;
<<<<<<< HEAD
=======

import Business.Role.HostRole;
>>>>>>> 4c5219ce56b0298642e92707f357e51b9c6285a7
import Business.Role.InfraRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Saivignesh Sridhar
 */
public class InfraOrganization extends Organization{

    public InfraOrganization(String name) {
        super(name);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new InfraRole());
        return roles;
    }
       @Override
    public Organization.Type getType() {
        return Organization.Type.Infrastructure;
    } 
     
}