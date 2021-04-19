/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

/**
 *
 * @author VIGNESH
 */
public class DeliveryMan {
    private String deliveryID;

    public String getDeliveryID() {
        return deliveryID;
    }

    public void setDeliveryID(String deliveryID) {
        this.deliveryID = deliveryID;
    }

    public String getDeliName() {
        return deliName;
    }

    public void setDeliName(String deliName) {
        this.deliName = deliName;
    }

    public String getDeliPhoneNo() {
        return deliPhoneNo;
    }

    public void setDeliPhoneNo(String deliPhoneNo) {
        this.deliPhoneNo = deliPhoneNo;
    }

    public String getDeliEmail() {
        return deliEmail;
    }

    public void setDeliEmail(String deliEmail) {
        this.deliEmail = deliEmail;
    }
    private String deliName;
    private String deliPhoneNo;
    private String deliEmail;
}
