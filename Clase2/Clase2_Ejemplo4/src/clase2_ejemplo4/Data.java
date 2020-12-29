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
public class Data {
    
    private Integer number;
    private boolean transfer;
    
    public Data() {
        this.transfer = true;
        this.number = 0;
    }
    
    public synchronized int get(String threadName){
        while(transfer){
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        System.out.println("Got:" + number + " From: " + threadName);
        transfer = true;
        notifyAll();
        return number;
    }
    
    public synchronized void put(String threadName){
        while(!transfer){
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.number += 1;
        transfer = false;
        System.out.println("Put " + this.number + " From " + threadName);
        notifyAll();
    }
    
}
