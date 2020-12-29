/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1_ejemplo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafaeli
 */
public class UsoHilos {
    
    public static void main(String[] args) {
        System.out.println("Hilo principal iniciando.");
        
        MiHilo mh = new MiHilo("#1");
        
        Thread nuevoh = new Thread(mh);
        
        nuevoh.start();
        
        for(int i=0; i<50; i++){
            System.out.println(" .");            
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(UsoHilos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Hilo principal finalizado.");
    }
}
