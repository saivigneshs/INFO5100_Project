/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.EcoSystem;
import java.util.ArrayList;

/**
 *
 * @author VIGNESH
 */
public class DeliverManDirectory {
    private ArrayList<DeliveryMan> deliveryManDirectory;

    public DeliverManDirectory(){
        deliveryManDirectory = new ArrayList<DeliveryMan>();
    }

    public ArrayList<DeliveryMan> getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(ArrayList<DeliveryMan> deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }
    public DeliveryMan addDeliveryMan(DeliveryMan deliveryMan){
        deliveryMan.setDeliveryID("DeliveryMan "+(deliveryManDirectory.size()+1));
        deliveryManDirectory.add(deliveryMan);
        return deliveryMan;
    }
    
    public void deleteDeliveryMan(int index,EcoSystem system){
        String id = deliveryManDirectory.get(index).getDeliveryID();
        for(int i =0; i <system.getUserAccountDirectory().getUserAccountList().size();i++){
            if(system.getUserAccountDirectory().getUserAccountList().get(i).getEmployee().getName().equalsIgnoreCase(id)){
                system.getUserAccountDirectory().getUserAccountList().remove(i);
            }
        }
        deliveryManDirectory.remove(index);
    }
    
    public DeliveryMan getDeliveryManById(int index){
        return deliveryManDirectory.get(index);
    }
    
    public boolean isContactNoUnique(String phone){
        for(DeliveryMan deliveryMan: deliveryManDirectory){
            if(deliveryMan.getDeliPhoneNo().equalsIgnoreCase(phone)){
                return false;
            }
        }
        return true;
    }
    
    public boolean isEmailUnique(String email){
        for(DeliveryMan deliveryMan: deliveryManDirectory){
            if(deliveryMan.getDeliEmail().equalsIgnoreCase(email)){
                return false;
            }
        }
        return true;
    }
    
    public void updateDeliveryMan(String id,String name,String phone,String email){
        for(DeliveryMan deliveryMan: deliveryManDirectory){
            if(deliveryMan.getDeliveryID().equalsIgnoreCase(id)){
                deliveryMan.setDeliName(name);
                deliveryMan.setDeliPhoneNo(phone);
                deliveryMan.setDeliEmail(email);
            }
        }
    }
    
    public DeliveryMan getDeliveryMan(String id){
        for(DeliveryMan deliveryMan: deliveryManDirectory){
            if(deliveryMan.getDeliveryID().equalsIgnoreCase(id)){
                return deliveryMan;
            }
        }
        return null;
    }
}
