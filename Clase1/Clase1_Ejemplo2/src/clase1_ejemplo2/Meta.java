/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1_ejemplo2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafaeli
 */
public class Meta {
    
    private int metros;
    private List<Caballo> llegados = new ArrayList<Caballo>();

    public Meta(int metros) {
        this.metros = metros;
    }

    public int getMetros() {
        return metros;
    }
    
    public boolean cruza(Caballo c){
        boolean finalizo = false;
        
        if(c.getPosicion() >=metros) {
            System.out.println("Caballo: " + c.getNombre() + " cruzo la meta");
            finalizo = true;
            llegados.add(c);
        }
        
        return finalizo;
    }
    
    public void posiciones() {
        for (Caballo c : llegados) {
            System.out.println(c.getNombre());
        }
    }
    
}
