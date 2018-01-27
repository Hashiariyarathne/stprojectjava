/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycode;

import com.mysql.jdbc.Connection;

/**
 *
 * @author Hashi
 */
public class DBconnect {
    
    public static Connection connect ()
    {
        Connection conn = null;
        
        try{
            
            
            class .forName("com.mysql.jdbc.Driver");
            
        }
        catch (Exception ex)
        {
            
        }
        
        return conn;
    }
    
}
