/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Evita Alice Paul
 */
public class SQLconnection {
    Connection con=null;
  PreparedStatement stmt= null;
    public static Connection dbconnector()
    {
        try
        {
            Class.forName("org.sqlite.JDBC");
    Connection con=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Evita Alice Paul\\OneDrive\\Documents\\NetBeansProjects\\StudentHousingApplication.db");
            //System.out("Connection Sucessfull");
            return con;
            
        }
        catch(Exception e)
                {
                    return null;
                }
    
}
}