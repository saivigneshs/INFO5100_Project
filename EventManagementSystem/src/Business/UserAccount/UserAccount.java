/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author Saivignesh Sridhar
 */
public class UserAccount {
    
    private String username;
    private String password;
    private String name;
    private String status;
    public Employee employee;
    private Role role;
    private WorkQueue workQueue;
    private String Phone;
    private String Street;
    private String Zipcode;
    private String Email;
    private String City;
    private String State;
    private String Charge;
    private String NationId;
    private String IdDoc;
    private boolean isApproved;
    private Enterprise userEnterpriseList;
    private Organization userOrganizationList;

    public UserAccount() {
        workQueue = new WorkQueue();
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public Enterprise getUserEnterpriseList() {
        return userEnterpriseList;
    }

    public void setUserEnterpriseList(Enterprise userEnterpriseList) {
        this.userEnterpriseList = userEnterpriseList;
    }

    public Organization getUserOrganizationList() {
        return userOrganizationList;
    }

    public void setUserOrganizationList(Organization userOrganizationList) {
        this.userOrganizationList = userOrganizationList;
    }

    @Override
    public String toString() {
        return name;
    }

    public Object getUserAccountDirectory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public String getZipcode() {
        return Zipcode;
    }

    public void setZipcode(String Zipcode) {
        this.Zipcode = Zipcode;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getCharge() {
        return Charge;
    }

    public void setCharge(String Charge) {
        this.Charge = Charge;
    }

    public boolean isIsApproved() {
        return isApproved;
    }

    public void setIsApproved(boolean isApproved) {
        this.isApproved = isApproved;
    }

    public String getNationId() {
        return NationId;
    }

    public void setNationId(String NationId) {
        this.NationId = NationId;
    }

    public String getIdDoc() {
        return IdDoc;
    }

    public void setIdDoc(String IdDoc) {
        this.IdDoc = IdDoc;
    }
}
