/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatdecero;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author rafaeli
 */
public class FileSender implements Runnable{
    
    private Contact contact;
    private File file;

    public FileSender(Contact contact, File file) {
        this.contact = contact;
        this.file = file;
    }

    @Override
    public void run() {
        send(contact.getInetAddress().getHostName(), contact.getPort() + 1, file);
    }
    
     public void send(String host, int port, File file){
    
        try {
            
           Socket server = new Socket(host, port);
           OutputStream os = server.getOutputStream();
           FileInputStream fis = new FileInputStream(file);
           
           int bait;
           while((bait = fis.read()) != -1){
              os.write(bait);
           }
           
           os.flush();
           os.close();
           server.close();
        
        }catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    
    
}
