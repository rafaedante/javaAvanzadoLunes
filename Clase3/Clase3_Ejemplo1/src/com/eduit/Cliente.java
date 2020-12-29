/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eduit;

import java.io.DataOutputStream;
import java.io.IOException;

/**
 *
 * @author rafaeli
 */
public class Cliente extends Conexion{

    public Cliente() throws IOException {
        super("cliente");
    }
    
    public void startClient(){
        
        try{
            
            //Flujo de salida hacia el servidor
            salidaServidor = new DataOutputStream(cs.getOutputStream());
            
            //se enviaran dos mensajes
            for (int i=0; i<2; i++){
                
                //se escribe en el servidor usando su flujo de datos
                salidaServidor.writeUTF("Este es el mensaje numero " + (i+1) + "\n");
            }
            
            cs.close();
        
        }catch(Exception e){
        
            System.out.println(e.getMessage());
        }
    
    }
    
    
}
