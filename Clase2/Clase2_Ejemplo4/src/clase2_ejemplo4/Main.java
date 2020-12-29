/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2_ejemplo4;

/**
 *
 * @author rafaeli
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Data data = new Data();
        
        new Producer(data, "P1");
        new Producer(data, "P2");
        
        new Consumer(data, "C1");
        new Consumer(data, "C2");
    }
    
}
