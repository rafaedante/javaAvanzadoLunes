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
public class Generico<T> {
    
    T ob;

    public Generico(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }
    
    void mostrarTipo(){
        System.out.println("El tipo de T es: " + ob.getClass().getName());
    }
    
}
