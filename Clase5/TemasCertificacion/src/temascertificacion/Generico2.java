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
public class Generico2<T, V> {
    
    T ob1;
    V ob2;

    public Generico2(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    public T getOb1() {
        return ob1;
    }

    public V getOb2() {
        return ob2;
    }
    
    void mostrarTipo(){
        System.out.println("El tipo de T es: " + ob1.getClass().getName());
        System.out.println("El tipo de V es: " + ob2.getClass().getName());
    }
    
}
