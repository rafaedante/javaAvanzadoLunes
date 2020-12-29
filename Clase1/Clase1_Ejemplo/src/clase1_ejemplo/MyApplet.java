/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1_ejemplo;

import java.applet.*;
import java.awt.*;

/**
 *
 * @author rafaeli
 */
public class MyApplet extends Applet{
    
    TextField tfa, tfb, tfc;    
    
    public void init() {
    
        setLayout(new GridLayout(3,2));
        tfa = new TextField("0");
        tfb = new TextField("0");
        tfc = new TextField("0");
        add(new Label("Contador A"));
        add(tfa);
        add(new Label("Contador B"));
        add(tfb);
        add(new Label("Contador C"));
        add(tfc);
    }
    
    public void start() {
    
        Thread A = new Thread(new Counter(tfa));
        Thread B = new Thread(new Counter(tfb));
        Thread C = new Thread(new Counter(tfc));
        
        A.start();
        B.start();
        C.start();
    }
}
