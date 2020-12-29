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
public class MiHilo implements Runnable{
    
    String nombreHilo;

    public MiHilo(String nombreHilo) {
        this.nombreHilo = nombreHilo;
    }   
    

    @Override
    public void run() {
        System.out.println("Comenzando " + nombreHilo);            
        try {
            for(int contar=0; contar <10; contar++){
                Thread.sleep(400);
                System.out.println("En "+ nombreHilo + ", el recuento " + contar);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(MiHilo.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        System.out.println("Terminando " + nombreHilo);   
       
    }
    
}
