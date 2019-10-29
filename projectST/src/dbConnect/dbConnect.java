/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbConnect;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Pramesh
 */
public class dbConnect {
    
    public static Connection connectprj()
        {
           Connection con = null;
           
            try {
                
                Class.forName("com.mysql.jdbc.Driver");
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/stpdb","root","");
                
            } 
            catch (Exception e) 
            { 
                System.err.println(e);
                
            }
                
           return con;
        }
    
}
