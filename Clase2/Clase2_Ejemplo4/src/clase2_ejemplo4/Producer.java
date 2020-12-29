/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2_ejemplo4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafaeli
 */
public class Producer implements Runnable{
    
    private final Data data;
    private final String name;

    public Producer(Data data, String name) {
        this.data = data;
        this.name = name;
        new Thread(this, "Producer-" + name).start();
    }
    
    

    @Override
    public void run() {
        while(true) {
            try {
                 Thread.sleep(1000);                 
             } catch (InterruptedException ex) {
                 Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
             }
            data.put(this.name);
        }
    }
     
    
}
