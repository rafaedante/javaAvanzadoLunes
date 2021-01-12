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
public enum Operation {
    
    PLUS,
    MINUS,
    TIMES,
    DIVIDE;
    
    double calculate(double x, double y){
    
        switch(this){
        
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case TIMES:
                return x * y;
            case DIVIDE:
                return x / y;
            default:
                throw new AssertionError("Unknown operations " + this);
                
        }
    }
    
}
