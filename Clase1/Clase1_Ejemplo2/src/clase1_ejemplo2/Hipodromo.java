/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1_ejemplo2;

/**
 *
 * @author rafaeli
 */
public class Hipodromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
              
        Meta meta = new Meta(500);
        
        Caballo caballo1 = new Caballo("Caballo loco", meta);
        Caballo caballo2 = new Caballo("El negrito", meta);
        Caballo caballo3 = new Caballo("El blanquito", meta);
        Caballo caballo4 = new Caballo("El loquito", meta);
        Caballo caballo5 = new Caballo("El pony", meta);
        Caballo caballo6 = new Caballo("El chiqui", meta);
        
        caballo1.start();
        caballo2.start();
        caballo3.start();
        caballo4.start();
        caballo5.start();
        caballo6.start();
        
        caballo1.join();
        caballo2.join();
        caballo3.join();
        caballo4.join();
        caballo5.join();
        caballo6.join();
        
        System.out.println("Posiciones finales");
        meta.posiciones();
    }
    
}
