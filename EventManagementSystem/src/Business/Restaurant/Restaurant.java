/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author VIGNESH
 */
public class Restaurant {
    private String restNo;
    private String restName;
    private String restContact;
    private String restAddress;
    private String restZipCode;
    private String restManager;
    private String restEmail;

    public String getRestNo() {
        return restNo;
    }

    public void setRestNo(String restNo) {
        this.restNo = restNo;
    }

    public String getRestName() {
        return restName;
    }

    public void setRestName(String restName) {
        this.restName = restName;
    }

    public String getRestContact() {
        return restContact;
    }

    public void setRestContact(String restContact) {
        this.restContact = restContact;
    }

    public String getRestAddress() {
        return restAddress;
    }

    public void setRestAddress(String restAddress) {
        this.restAddress = restAddress;
    }

    public String getRestZipCode() {
        return restZipCode;
    }

    public void setRestZipCode(String restZipCode) {
        this.restZipCode = restZipCode;
    }

    public String getRestManager() {
        return restManager;
    }

    public void setRestManager(String restManager) {
        this.restManager = restManager;
    }

    public String getRestEmail() {
        return restEmail;
    }

    public void setRestEmail(String restEmail) {
        this.restEmail = restEmail;
    }
}
