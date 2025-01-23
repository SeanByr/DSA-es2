/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package addressbook2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author seanb
 */
public class AddressBookGUI extends javax.swing.JFrame {

    private Contact[] book;
    private File f;
    private int i = 0;
    
    
    
    public AddressBookGUI() {
        initComponents();
        book = new Contact[5];
        f = new File("AddressBook.dat");
    }

   public void loadFile(){
       FileInputStream fStream;
       ObjectInputStream oStream;
       
       try{
           
           fStream = new FileInputStream(f);
           oStream = new ObjectInputStream(fStream);
           
           book = (Contact[])oStream.readObject();
           
           oStream.close();
           
       }catch(IOException | ClassNotFoundException e){
           JOptionPane.showMessageDialog(null, "I/O e " + e);
       }
   }
   
   public void saveFile(){
       FileOutputStream fStream;
       ObjectOutputStream oStream;
       
       try{
           
           fStream = new FileOutputStream(f);
           oStream = new ObjectOutputStream(fStream);
           
           oStream.writeObject(book);
           
           oStream.close();
           
       }catch(IOException e){
            JOptionPane.showMessageDialog(null, "I/O e " + e);
       }   
   }
   
   public void makeFile(){
    if(!f.exists()){
        saveFile();
        System.out.println("File Created Successfully");
    }   else{
        loadFile();
        System.out.println("File Loaded Successfully");
    }
   }
   
   public int nextIndex(){
        for(int i=0;i<book.length;i++){
            if(book[i] == null){
                return i;
            }
        }
        return -1;
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addressBookPanel = new javax.swing.JPanel();
        addressBookTitleLBL = new javax.swing.JLabel();
        firstNameLBL = new javax.swing.JLabel();
        firstNameTF = new javax.swing.JTextField();
        surnameLBL = new javax.swing.JLabel();
        surnameTF = new javax.swing.JTextField();
        emailLBL = new javax.swing.JLabel();
        emailTF = new javax.swing.JTextField();
        phoneNumberLBL = new javax.swing.JLabel();
        phoneNumberTF = new javax.swing.JTextField();
        addressLBL = new javax.swing.JLabel();
        addressTF = new javax.swing.JTextField();
        companyLBL = new javax.swing.JLabel();
        companyTF = new javax.swing.JTextField();
        addBTN = new javax.swing.JButton();
        displayBTN = new javax.swing.JButton();
        searchBTN = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addressBookTitleLBL.setText("Address Books");

        firstNameLBL.setText("First Name:");

        surnameLBL.setText("Surname:");

        emailLBL.setText("Email Address:");

        phoneNumberLBL.setText("Phone Number:");

        addressLBL.setText("Address:");

        companyLBL.setText("Company Name:");

        addBTN.setText("Add");
        addBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTNActionPerformed(evt);
            }
        });

        displayBTN.setText("Display");
        displayBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBTNActionPerformed(evt);
            }
        });

        searchBTN.setText("Search");
        searchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTNActionPerformed(evt);
            }
        });

        deleteBTN.setText("Delete");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addressBookPanelLayout = new javax.swing.GroupLayout(addressBookPanel);
        addressBookPanel.setLayout(addressBookPanelLayout);
        addressBookPanelLayout.setHorizontalGroup(
            addressBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addressBookPanelLayout.createSequentialGroup()
                .addGroup(addressBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addressBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addressBookPanelLayout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addComponent(firstNameLBL)
                            .addGap(102, 102, 102)
                            .addComponent(surnameLBL))
                        .addGroup(addressBookPanelLayout.createSequentialGroup()
                            .addGap(150, 150, 150)
                            .addComponent(addressBookTitleLBL)))
                    .addGroup(addressBookPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(addressBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addressBookPanelLayout.createSequentialGroup()
                                .addGroup(addressBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(addressBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(addressTF, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(addressBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(addressBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(emailTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                                .addComponent(firstNameTF, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addComponent(emailLBL)))
                                    .addComponent(addressLBL))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(addressBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(surnameTF)
                                    .addComponent(phoneNumberLBL)
                                    .addComponent(phoneNumberTF)
                                    .addComponent(companyLBL)
                                    .addComponent(companyTF, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))
                            .addGroup(addressBookPanelLayout.createSequentialGroup()
                                .addComponent(addBTN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(displayBTN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchBTN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteBTN)))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        addressBookPanelLayout.setVerticalGroup(
            addressBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addressBookPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addressBookTitleLBL)
                .addGap(37, 37, 37)
                .addGroup(addressBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLBL)
                    .addComponent(surnameLBL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addressBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(surnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addressBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLBL)
                    .addComponent(phoneNumberLBL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addressBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addressBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLBL)
                    .addComponent(companyLBL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addressBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(companyTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addressBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBTN)
                    .addComponent(displayBTN)
                    .addComponent(searchBTN)
                    .addComponent(deleteBTN))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addressBookPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addressBookPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTNActionPerformed
        String fName = firstNameTF.getText();
        String surname = surnameTF.getText();
        String email = emailTF.getText();
        String phoneNumber = phoneNumberTF.getText();
        String address = addressTF.getText();
        String company = companyTF.getText();
        System.out.println(book.length);
        int i = nextIndex();
        
        if(i > 4){
            JOptionPane.showMessageDialog(null, "Address Book Full\nMaximum 5");
            return;
        }else{
               book[i] = new BusinessContact(company, fName, surname, email, phoneNumber, address);
        }
        saveFile();
        
        firstNameTF.setText("");
        surnameTF.setText("");
        emailTF.setText("");
        phoneNumberTF.setText("");
        addressTF.setText("");
        companyTF.setText("");
    }//GEN-LAST:event_addBTNActionPerformed

    private void displayBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBTNActionPerformed
        for(Contact temp:book){
            if(temp == null){
                System.out.println("No other objs");
            }else{
            JOptionPane.showMessageDialog(null, temp.toString());
                System.out.println(temp.toString());
        }
        }
    }//GEN-LAST:event_displayBTNActionPerformed

    private void searchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTNActionPerformed
        String searchTerm = JOptionPane.showInputDialog(null, "Enter Contact Name to Find");
        for(int i = 0; i < book.length; i++){
        if(book[i].getFirstName().equalsIgnoreCase(searchTerm)){
            JOptionPane.showMessageDialog(null, "Contact: " + book[i].toString());
            break;
        }
        }
        
    }//GEN-LAST:event_searchBTNActionPerformed

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
        int le = book.length;
        String searchTerm = JOptionPane.showInputDialog(null, "Enter Contact Name to Delete");
        for(int i = 0; i < book.length; i++){
        if(book[i].getFirstName().equalsIgnoreCase(searchTerm)){
            book[i] = book[book.length - 1];
            le--;
            
            break;
        }
        }
        saveFile();
    }//GEN-LAST:event_deleteBTNActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddressBookGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddressBookGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddressBookGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddressBookGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddressBookGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBTN;
    private javax.swing.JPanel addressBookPanel;
    private javax.swing.JLabel addressBookTitleLBL;
    private javax.swing.JLabel addressLBL;
    private javax.swing.JTextField addressTF;
    private javax.swing.JLabel companyLBL;
    private javax.swing.JTextField companyTF;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JButton displayBTN;
    private javax.swing.JLabel emailLBL;
    private javax.swing.JTextField emailTF;
    private javax.swing.JLabel firstNameLBL;
    private javax.swing.JTextField firstNameTF;
    private javax.swing.JLabel phoneNumberLBL;
    private javax.swing.JTextField phoneNumberTF;
    private javax.swing.JButton searchBTN;
    private javax.swing.JLabel surnameLBL;
    private javax.swing.JTextField surnameTF;
    // End of variables declaration//GEN-END:variables
}
