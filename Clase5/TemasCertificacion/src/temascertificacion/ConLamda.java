/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temascertificacion;

import java.util.ArrayList;

/**
 *
 * @author rafaeli
 */
public class ConLamda {
    
    public static void main(String[] args) {
        
       ArrayList<Gasto> lista = new ArrayList<Gasto>();
       lista.add(new Gasto("A", 80));
       lista.add(new Gasto("B", 50));
       lista.add(new Gasto("C", 70));
       lista.add(new Gasto("D", 95));
       
       double resultado = lista.stream()
               .mapToDouble(gasto->gasto.getImporte()*1.21)
               .filter(gasto->gasto<100)
               .sum();      
       
        System.out.println("Resultado: " + resultado);
        
    }
    
}
