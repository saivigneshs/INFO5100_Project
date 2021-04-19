/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.DeliveryMan.DeliverManDirectory;
import Business.EcoSystem;
import Business.Host.HostDirectory;
import Business.Order.Menu;
import Business.Order.OrderDirectory;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.RestaurantAdminRole.AdminWorkAreaJPanel;

/**
 *
 * @author VIGNESH
 */
public abstract class AdminRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business, HostDirectory hostDirectory,RestaurantDirectory restaurantDirectory, DeliverManDirectory deliveryManDirectory, Menu menu, OrderDirectory orderDirectory) {
        return new AdminWorkAreaJPanel(userProcessContainer,account,business,restaurantDirectory,deliveryManDirectory,menu,orderDirectory);
    }
}
