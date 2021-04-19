/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.ArrayList;

/**
 *
 * @author VIGNESH
 */
public class Menu {
    private ArrayList<OrderItem> menuList;

       public Menu(){
        menuList = new ArrayList<OrderItem>();
    }
     
    public ArrayList<OrderItem> getMenuList() {
        return menuList;
    }

    public void setMenuList(ArrayList<OrderItem> menuList) {
        this.menuList = menuList;
    }
    
    
    
    public void addOrderItem(String restaurantId, String name, double price, String contents, String category) {     
        OrderItem item = new OrderItem();
        item.setItemNo("Order Item "+(menuList.size()+1));
        item.setItemName(name);
        item.setPrice(price);
        item.setCategory(category);
        item.setRestaurantNo(restaurantId);
        item.setIngredients(contents);
        System.out.println("Order Item "+name+" added to Menu");
        menuList.add(item);
    }
    
    
    public OrderItem getOrderItemByKey(int key){
        return menuList.get(key);
    }
    
    public OrderItem fetchOrderItem(String itemId){
        for(OrderItem item: menuList){
            if(item.getItemNo().equalsIgnoreCase(itemId)){
                return item;
            }
        }
        return null;
    }

    public void updateOrderItem(String itemNo, String itemName, String contents, Double price, String category) {
        for(OrderItem item: menuList){
            if(item.getItemNo().equalsIgnoreCase(itemNo)){
                item.setItemName(itemName);
                item.setIngredients(contents);
                item.setPrice(price);
                item.setCategory(category);
            }
        }
    }
    
    public void deleteOrderItem(String id){
        for(int i =0; i< menuList.size();i++){
            if(menuList.get(i).getItemNo().equalsIgnoreCase(id)){
                menuList.remove(i);
            }
        }
    }
}
