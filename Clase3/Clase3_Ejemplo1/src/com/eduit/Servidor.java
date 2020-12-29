/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eduit;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author rafaeli
 */
public class Servidor extends Conexion{

    public Servidor() throws IOException {
        super("servidor");
    }
    
    //Metodo para inicializar el servidor
    public void startServer(){
        
        try{
            System.out.println("Esperando...."); // esperando conexion
            cs = ss.accept(); // accept comienza el socket y espera una conexion desde un cliente
            
            System.out.println("Cliente en linea");
            
            //se obtiene el flujo de saida del cliente para enviarle msj
            salidaCliente = new DataOutputStream(cs.getOutputStream());
            
            //se le envia al cliente un mensaje usando su flujo de salida
            salidaCliente.writeUTF("Peticion recibida y aceptada");
            
            //se obtiene el flujo entrante desde el cliente
            BufferedReader entrada = new BufferedReader(new InputStreamReader(cs.getInputStream()));
            
            while((mensajeServidor = entrada.readLine()) != null){
                
                //se muestra x pantalla el mensaje recibido
                System.out.println(mensajeServidor);
            }
            
            System.out.println("Fin de la conexion");
            ss.close(); // finaliza la conexion con el cliente
            
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        
        
    }
    
    
}
