/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1_ejemplo2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafaeli
 */
public class Caballo extends Thread{
    
    static int RETARDO = 100;
    private boolean finalizado = false;
    private long horaini = 0;
    private long horafin = 0;
    private int posicion = 0;
    private String nombre;
    private Meta meta;
    

    public Caballo(String nombre, Meta meta) {
        this.nombre = nombre;
        this.meta = meta;
    }
    
    @Override
    public void run() {
        while(!meta.cruza(this)) {
            horafin = System.currentTimeMillis(); 
            try {                               
                sleep(RETARDO);
            } catch (InterruptedException ex) {
                Logger.getLogger(Caballo.class.getName()).log(Level.SEVERE, null, ex);
            }
            avanza();
            System.out.println(nombre + ": " + posicion + " metros: ");
            this.finalizado = true;
            
        }
    
    }
    
    public synchronized void avanza(){
        
        int incremento = 0;
        
        while(incremento == 0) {
            incremento = (int) ((Math.random() * 10) + (Math.random() * 5));
        }
        
        posicion += incremento;
        
        if (((int ) (Math.random() * 10)) == 3){
            posicion += 10;
        }
    
    }

    public int getPosicion() {
        return posicion;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
    
    
}
