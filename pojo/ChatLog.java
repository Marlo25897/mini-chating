/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package networking.net.pojo;

/**
 *
 * @author shweta
 */
public class ChatLog {
    private String msg;
    private String username;
    private String  msgtime;

    public ChatLog() {
    }

    @Override
    public String toString() {
        return "ChatLog{" + "msg=" + msg + ", username=" + username + ", msgtime=" + msgtime + '}';
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMsgtime() {
        return msgtime;
    }

    public void setMsgtime(String msgtime) {
        this.msgtime = msgtime;
    }

    public ChatLog(String msg, String username, String msgtime) {
        this.msg = msg;
        this.username = username;
        this.msgtime = msgtime;
    }
    
    
            
}
