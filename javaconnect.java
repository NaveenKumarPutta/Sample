

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Bhavana
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class javaconnect {
    Connection con;
    public static Connection ConnecrDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\welcome\\Documents\\NetBeansProjects\\ImageEncryption\\ImageStorage.db");
                    return con;
                    
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}
