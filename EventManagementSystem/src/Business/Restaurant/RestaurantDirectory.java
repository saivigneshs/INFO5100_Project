/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.EcoSystem;
import java.util.ArrayList;

/**
 *
 * @author VIGNESH
 */
public class RestaurantDirectory {
    private ArrayList<Restaurant> restDirectory;

    public ArrayList<Restaurant> getRestDirectory() {
        return restDirectory;
    }

    public void setRestDirectory(ArrayList<Restaurant> restDirectory) {
        this.restDirectory = restDirectory;
    }

    public RestaurantDirectory(){
        restDirectory = new ArrayList<Restaurant>();
    }
    
    
    public void addRestaurant(Restaurant restaurant) {
       restaurant.setRestNo("Restaurant "+(restDirectory.size()+1));
       restDirectory.add(restaurant);
    }
    
    public void deleteRestaurant(int index,EcoSystem system){
        String id = restDirectory.get(index).getRestNo();
        for(int i =0; i <system.getUserAccountDirectory().getUserAccountList().size();i++){
            if(system.getUserAccountDirectory().getUserAccountList().get(i).getEmployee().getName().equalsIgnoreCase(id)){
                system.getUserAccountDirectory().getUserAccountList().remove(i);
            }
        }
        restDirectory.remove(index);
    }
    
    public Restaurant getRestaurantNo(int index){
        return restDirectory.get(index);
    }

    public String getRestName(String restaurantId) {
        for(Restaurant restaurant: restDirectory){
            if(restaurant.getRestNo().equalsIgnoreCase(restaurantId)){
                return restaurant.getRestName();
            }
        }
        return "";
    }
    
    public Restaurant getRestaurant(String id){
        for(Restaurant restaurant: restDirectory){
            if(restaurant.getRestNo().equalsIgnoreCase(id)){
                return restaurant;
            }
        }
        return null;
    }
    
    public boolean isContactNoUnique(String phone){
        for(Restaurant restaurant: restDirectory){
            if(restaurant.getRestContact().equalsIgnoreCase(phone)){
                return false;
            }
        }
        return true;
    }
    public boolean isEmailUnique(String email){
        for(Restaurant restaurant: restDirectory){
            if(restaurant.getRestEmail().equalsIgnoreCase(email)){
                return false;
            }
        }
        return true;
    }
}
