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
public class ThreadImplementRunnable implements Runnable{
    
    String descripcion;
    String name;

    public ThreadImplementRunnable(String descripcion, String name) {
        this.descripcion = descripcion;
        this.name = name;
    }
    
    

    @Override
    public void run() {
         for (int i=0; i<10; i++){
            System.out.println(descripcion + ": esto es un thread " + this.name);
        }
    }
    
}
