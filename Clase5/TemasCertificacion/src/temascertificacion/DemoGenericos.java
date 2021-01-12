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
public class DemoGenericos {
    
    
    public static void main(String[] args){
        Generico<Integer> iOb;
    
        iOb = new Generico<Integer>(28);
        iOb.mostrarTipo();
        
        int v = iOb.getOb();
        System.out.println("Valor Integer: " + v);
        System.out.println("--------------------------");
        
        Generico<String> strOb = new Generico<String>("Prueba de genericos");
        strOb.mostrarTipo();
        
        String str = strOb.getOb();
        System.out.println("Valor string: " + str);
        
        System.out.println("--------Generico dos------------------");
        
        Generico2<Integer,String> dosGen = new Generico2<Integer,String>(30, "Mas generico");
        
        dosGen.mostrarTipo();
        
        int v1 = dosGen.getOb1();
        System.out.println("Valor Integer: " + v1);
        
        String str1 = dosGen.getOb2();
        System.out.println("Valor string: " + str1);
    }
    
}
