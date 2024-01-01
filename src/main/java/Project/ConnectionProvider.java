/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;
/**
 *
 * @author Nilesh
 */
public class ConnectionProvider {
    
    public static Connection getConn()
    {
        try {
          
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_dbms","root","Newton@009");
            
            return con;
        }
        catch(Exception e)
        {
            System.out.print("Error in connection");
            return null;
        }
    }
    
}
