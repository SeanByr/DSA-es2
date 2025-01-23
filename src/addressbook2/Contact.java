/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package addressbook2;

import java.io.Serializable;

/**
 *
 * @author seanb
 */
public class Contact implements Serializable{
    
    protected String firstName;
    protected String surname;
    protected String email;
    protected String phoneNumber;
    protected String address;

    public Contact(String firstName, String surname, String email, String phoneNumber, String address) {
        this.firstName = firstName;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Contact() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Contact Information:" + 
                "\nFirst Name: " + firstName + 
                "\nSurname: " + surname + 
                "\nEmail: " + email + 
                "\nPhone Number: " + phoneNumber + 
                "\nAddress: " + address;
    }
    
    
}
