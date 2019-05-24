/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package networking.net.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class DBConnection {
private static Connection conn;
    static
    {
        {try
         {Class.forName("oracle.jdbc.OracleDriver");
             conn=DriverManager.getConnection("jdbc:oracle:thin:@//DESKTOP-INVLS7L:1521/xe","network","anand");
           JOptionPane.showMessageDialog(null,"connected");
        }
           
    catch(Exception e)
    {e.printStackTrace();
     JOptionPane.showMessageDialog(null," not connected");
    }}
    }
    public static Connection getConnection()
    {
        return conn;
    }
   public static void closeConnection()
   {
       try{
   
       conn.close();
        JOptionPane.showMessageDialog(null,"disconnected");
   }
catch(Exception e)
    {e.printStackTrace();
     JOptionPane.showMessageDialog(null," not connected");
    }
   }
}
    