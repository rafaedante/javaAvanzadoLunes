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
public class Persona extends Thread{
    
    private final String nombre;
    private final Saludo saludo;
    private final boolean esJefe;

    public Persona(String nombre, Saludo saludo, boolean esJefe) {
        this.nombre = nombre;
        this.saludo = saludo;
        this.esJefe = esJefe;
    }
    
    @Override
    public void run(){
        System.out.println("LLego: " + this.nombre);
        
        if(esJefe){
            saludo.saludoJefe();
        }else {
            saludo.esperarJefe(this.nombre);
        }
        
    }
    
    
}
