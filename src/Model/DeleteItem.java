/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Statement;

/**
 *
 * @author user
 */
public class DeleteItem {
    
    static Statement st;
    
    
    public void deleteitemstore(int itemNo){
        
        try {
            st = DBConnection.getConnStatement();
            st.executeUpdate("DELETE FROM itemstore WHERE ItamID = '"+ itemNo +"'");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public void deleteorders(int itemNo){
        
        try {
            st = DBConnection.getConnStatement();
            st.executeUpdate("DELETE FROM orders WHERE orderId ='"+ itemNo +"'");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public void deletesuppliers(int itemNo){
        
        try {
            st = DBConnection.getConnStatement();
            st.executeUpdate("DELETE FROM suppliers WHERE supplierId ='"+ itemNo +"'");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
