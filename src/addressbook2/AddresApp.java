/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package addressbook2;

/**
 *
 * @author seanb
 */
public class AddresApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AddressBookGUI gui = new AddressBookGUI();
        gui.setVisible(true);
        
        gui.makeFile();
    }
    
}
