/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.ERRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Saivignesh Sridhar
 */
public class SecurityEREnterprise extends Enterprise {

    public SecurityEREnterprise(String name) {
        super(name, EnterpriseType.SecurityER);
    }

    @Override

    public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<Role>();
        roles.add(new ERRole());
        return roles;
    }

}
