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
public class TestEnum {
    
    public static void main(String[] args){
        
        // retorna Active
        System.out.println("Activo: " + UserStatus.ACTIVE);
        
        
        //retorna whois.arin.net
        System.out.println("url: " + WhoisRIR.ARIN.url());
        
        //SUMA DE ENUM OPERATION
        double result = Operation.PLUS.calculate(1, 2);
        System.out.println("El resultado es: " + result);
        
        // recorrer enum
        for (UserStatus status : UserStatus.values()){
            System.out.println("Valores enum UserStatus -> " + status);
        }
        
        //Comparar en condiciones
        WhoisRIR rir = WhoisRIR.APNIC;
        
        if(rir == WhoisRIR.APNIC){
            System.out.println("This is APNIC: " + rir.url());
        }
    
    } 
    
}
