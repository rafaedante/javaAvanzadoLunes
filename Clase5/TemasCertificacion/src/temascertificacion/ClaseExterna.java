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
public class ClaseExterna {
    
    private String nombreExterno = "Juan";
    
    class ClaseInterna{
    
        private String nombreInterno = "Pepe";
        
        public void mostrarNombre() {
            System.out.println("El nombre interno: " + nombreInterno);
            System.out.println("El nombre externo: " + nombreExterno);
        }       
    }
    
    public void mostrarNombre() {
        System.out.println("Juan");
    }
    
    public static void main(String[] args){
        ClaseExterna claseExterna = new ClaseExterna();
        ClaseInterna claseInterna = claseExterna.new ClaseInterna();
        
        claseInterna.mostrarNombre();
    }
    
}
