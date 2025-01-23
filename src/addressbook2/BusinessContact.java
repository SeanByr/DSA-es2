/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package addressbook2;

/**
 *
 * @author seanb
 */
public class BusinessContact extends Contact{
    
    private String company;

    public BusinessContact(String company, String firstName, String surname, String email, String phoneNumber, String address) {
        super(firstName, surname, email, phoneNumber, address);
        this.company = company;
    }

    public BusinessContact() {
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return super.toString() +  "\nCompany Name: " + company;
    }
    
    
}
