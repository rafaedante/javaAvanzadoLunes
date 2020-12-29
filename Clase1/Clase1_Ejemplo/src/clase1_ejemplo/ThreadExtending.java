/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1_ejemplo;

/**
 *
 * @author rafaeli
 */
public class ThreadExtending extends Thread{
    
    private final String descripcion;

    public ThreadExtending(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Override
    public void run(){
        for (int i=0; i<10; i++){
            System.out.println(descripcion + ": esto es un thread " + getName());
        }
    }
            
            
    
}
