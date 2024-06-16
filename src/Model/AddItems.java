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
public class AddItems {
    
    static Statement stmt;
    static ResultSet rs;
    
    
    public void addItem(String name, String qty, String price){
    try{
            stmt = DBConnection.getConnStatement();
            stmt.executeUpdate("INSERT INTO itemstore (ItamName, qty, onePrice) VALUES ('"+ name +"','"+ qty +"','"+ price +"')");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    
    public void addOrders(String cusName, String cusNumber, String Address){
    try{
            stmt = DBConnection.getConnStatement();
            //rs = stmt.executeUpdate("INSERT INTO medicaleq VALUES '"+ name +"', '"+ qty +"', '"+ status +"', '"+ price +"'");
            stmt.executeUpdate("INSERT INTO orders (cusName, cusNumber, Address) VALUES ('"+ cusName +"','"+ cusNumber +"', '"+ Address +"')");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    //medicalhp
    public void addsuppliers(String supName, String supNumber, String qty){
    try{
            stmt = DBConnection.getConnStatement();
            stmt.executeUpdate("INSERT INTO suppliers (supName, supNumber, qty) VALUES ('"+ supName +"', '"+ supNumber +"', '"+ qty +"')");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
   
    
    
}
