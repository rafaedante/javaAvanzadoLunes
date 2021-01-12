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
public class SinLamda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       ArrayList<Gasto> lista = new ArrayList<Gasto>();
       lista.add(new Gasto("A", 80));
       lista.add(new Gasto("B", 50));
       lista.add(new Gasto("C", 70));
       lista.add(new Gasto("D", 95));
       
       double totalPago = 0;
       
       for(Gasto g: lista){
           if(g.getImporte() * 1.21 < 100){
               totalPago = totalPago + g.getImporte() * 1.21;
           } 
       }
       
        System.out.println("Total gastos: " + totalPago);
        
    }
    
}
