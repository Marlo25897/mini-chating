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
public class ChatClient 
{private String username;
    private String pwd;

    public ChatClient() {
    }

    @Override
    public String toString() {
        return "ChatClient{" + "username=" + username + ", pwd=" + pwd + '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public ChatClient(String username, String pwd) {
        this.username = username;
        this.pwd = pwd;
    }
    
    
}
