/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class UpdateItem {
    
      static Statement st;
    static ResultSet rs;
    
    
    public void updateitemstore(int itemNo, String name, String qty, String price){
        
        try {
            st = DBConnection.getConnStatement();

            // Validate and sanitize inputs
            int quantity = Integer.parseInt(qty);
            int itemPrice = Integer.parseInt(price);

            // Create the SQL update statement
            String query = "UPDATE itemstore SET ItamName = '" + name + "', qty = " + quantity + ", onePrice = " + itemPrice + " WHERE ItamID = " + itemNo;

            // Execute the update
            int rowsUpdated = st.executeUpdate(query);

            // Optional: Check if the update was successful
            if (rowsUpdated > 0) {
                System.out.println("An existing Itemstore record was updated successfully!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    
    
    public void updateorders(int oderNo, String name, String cusNumber, String address) {
    try {
        st = DBConnection.getConnStatement();

        // Validate and sanitize inputs
        int number = Integer.parseInt(cusNumber);

        // Create the SQL update statement
        String query = "UPDATE orders SET cusName = '" + name + "', cusNumber = " + number + ", Address = '" + address + "' WHERE orderId = " + oderNo;

        // Execute the update
        int rowsUpdated = st.executeUpdate(query);

        // Optional: Check if the update was successful
        if (rowsUpdated > 0) {
            System.out.println("An existing orders record was updated successfully!");
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
}

    
    
    
    
    public void updatesuppliers(int supID, String name, String supnumber, String qty ){
        
        try {
            st = DBConnection.getConnStatement();

            // Validate and sanitize inputs
            int quantity = Integer.parseInt(qty);
            

            // Create the SQL update statement
            String query = "UPDATE suppliers SET supName = '" + name +  "', supNumber = " + supnumber + ", qty = " + quantity + " WHERE supplierId = " + supID;

            // Execute the update
            int rowsUpdated = st.executeUpdate(query);

            // Optional: Check if the update was successful
            if (rowsUpdated > 0) {
                System.out.println("An existing suppliers record was updated successfully!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
