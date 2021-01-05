/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatdecero;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.Socket;
import javax.swing.JFileChooser;

/**
 *
 * @author rafaeli
 */
public class FileHandler extends Thread{
    
    private Socket client;
    private ChatGUI gui;

    public FileHandler(Socket client, ChatGUI gui) {
        this.client = client;
        this.gui = gui;
    }
    
    @Override
    public void run(){
        
        try{
            
            System.out.println("Atendiendo conexiones desde: " + client.getInetAddress());
            InputStream is = client.getInputStream();
            
            JFileChooser fc = new JFileChooser();
            
            int returnVal = fc.showOpenDialog(gui);
            
            if(returnVal == JFileChooser.APPROVE_OPTION) {
            
                File file = fc.getSelectedFile();
                FileOutputStream fos = new FileOutputStream(file);
                
                int bait;
                
                while((bait = is.read()) != -1){
                    fos.write(bait);
                }
                
                fos.flush();
                fos.close();
                gui.getTxtIncommingMessages().append("File " + file.getName() + " received" + "\n");
            }
            
            is.close();
            client.close();
        
        }catch(Exception ex){
             System.out.println(ex.getMessage());
        }
    
    }
    
}
