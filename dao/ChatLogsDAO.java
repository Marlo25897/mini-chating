/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package networking.net.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import networking.net.dbutil.DBConnection;
import networking.net.pojo.ChatLog;


public class ChatLogsDAO 

{
    public static boolean addChatLog(ChatLog chatLog )  throws SQLException
    {
    
    boolean status=false;
String qry="Insert into ChatLogs values(?,?,?)";
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement(qry);
    ps.setString(1,chatLog.getMsg());
    ps.setString(2,chatLog.getUsername());
    ps.setString(3,chatLog.getMsgtime());
int ans=ps.executeUpdate();
if(ans!=0)
    status = true;

return status;
}
    
    }
    

