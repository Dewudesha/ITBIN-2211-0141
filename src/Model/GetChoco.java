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
public class GetChoco {
    
    Statement st;
    ResultSet rs;
    
    public ResultSet getitemstore(){
        
        try{
            st = DBConnection.getConnStatement();
            rs = st.executeQuery("select * from itemstore");
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    
    
    public ResultSet getorders(){
        
        try{
            st = DBConnection.getConnStatement();
            rs = st.executeQuery("select * from orders");
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    
    public ResultSet getsuppliers(){
        
        try{
            st = DBConnection.getConnStatement();
            rs = st.executeQuery("select * from suppliers");
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    
}
