/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author user
 */
public class LoginControllerChoco {
     public boolean login(String Username, String Pass){
    if(Username.equals("dew") && Pass.equals("1234"))
        {
        
        return true;
        }
        else{
            
            return false;
        }
    }
}
