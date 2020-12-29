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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Saludo hola = new Saludo();
        
        Persona pablo = new Persona("Pablo", hola, false);
        Persona luis = new Persona("Luis", hola, false);
        Persona andrea = new Persona("Andrea", hola, false);
        Persona pedro = new Persona("Pedro", hola, false);
        
        Persona jefe = new Persona("JEFE", hola, true);
        
        pablo.start();
        luis.start();
        andrea.start();
        pedro.start();
        jefe.start();
        
        try{
           pablo.join();
           luis.join();
           andrea.join();
           pedro.join();
           jefe.join();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }       
    }
}
