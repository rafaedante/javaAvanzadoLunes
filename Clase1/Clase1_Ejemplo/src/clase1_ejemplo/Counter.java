/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1_ejemplo;

import java.awt.TextField;

/**
 *
 * @author rafaeli
 */
public class Counter implements Runnable{
    
    TextField texto;
    String s;

    public Counter(TextField texto) {
        this.texto = texto;
    }  
    

    @Override
    public void run() {
        for (int i=0; i<1000; i++){
            texto.setText(s.valueOf(i));
        }
    }
    
}
