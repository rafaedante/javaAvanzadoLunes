/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2_ejemplo2;

/**
 *
 * @author rafaeli
 */
public class Saludo {
    
    public synchronized void esperarJefe(String nombreEmpleado){
        
        try{
            wait();
            System.out.println(nombreEmpleado + " > Buenos dias Jefe");
        
        }catch(InterruptedException ex){
            System.out.println(ex.getMessage());
        }
    
    }
    
    public synchronized void saludoJefe() {
    
        System.out.println(" JEFE > Buenos dias");
        notifyAll();
    }
    
}
