/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatdecero;

import java.io.DataOutputStream;
import java.net.Socket;

/**
 *
 * @author rafaeli
 */
public class MessageSender implements Runnable{
    
    private Contact contact;
    private String msg;

    public MessageSender(Contact contact, String msg) {
        this.contact = contact;
        this.msg = msg;
    }
    
    

    @Override
    public void run() {
        send(contact.getInetAddress().getHostName(), contact.getPort(), msg );
    }
    
    
    public void send(String host, int port, String msg){
    
        try {
            
            Socket server = new Socket(host, port);
            DataOutputStream ps = new DataOutputStream(server.getOutputStream());
            ps.writeUTF(msg);
            ps.flush();
            ps.close();
            server.close();
        
        }catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
}
