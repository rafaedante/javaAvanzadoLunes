/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatdecero;

/**
 *
 * @author rafaeli
 */
public class StartChat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ChatGUI gui = new ChatGUI();
        
        MessageListener listener = new MessageListener(gui, 5004);
        
        Thread t = new Thread(listener);
        t.start();
        
        FileListener fileListener = new FileListener(gui, 5005);
        Thread t2 = new Thread(fileListener);
        t2.start();
        
        gui.setVisible(true);
        
    }
    
}
