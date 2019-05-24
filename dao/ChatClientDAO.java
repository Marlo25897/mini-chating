/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package networking.net.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import networking.net.dbutil.DBConnection;
import networking.net.pojo.ChatClient;


public class ChatClientDAO 

{  
    public  static boolean findClient(String username) throws SQLException
    { 
        String qry="Select * from chatclients where username=?";
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement(qry);
    ps.setString(1,username);
    ResultSet rs= ps.executeQuery();
    return rs.next();   
    }


public static boolean addClient(ChatClient chatClient )  throws SQLException
{
boolean status=false;
String qry="Insert into ChatClients values(?,?)";
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement(qry);
    ps.setString(1,chatClient.getUsername());
    ps.setString(2,chatClient.getPwd());
int ans=ps.executeUpdate();
if(ans!=0)
    status = true;

return status;
}}

