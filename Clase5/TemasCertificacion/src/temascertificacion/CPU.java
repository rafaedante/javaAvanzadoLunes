/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temascertificacion;

/**
 *
 * @author rafaeli
 */
public class CPU {
    
    double price;
    
    class Proccesador{
    
        double cores;
        String manufacturer;
        
        double getCache(){
            return 4.3;
        }
    }
    
    protected class RAM{
    
        double memory;
        String manufacturer;

        double getClockSpeed(){
            return 5.5;
        }
    }
    
}
