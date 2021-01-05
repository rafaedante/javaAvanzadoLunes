/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleudp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author rafaeli
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        final int PUERTO_SERVIDOR = 5000;
        
        byte[] buffer = new byte[1024];
        
        try{
            
            InetAddress direccionServidor = InetAddress.getByName("localhost");
            
            DatagramSocket socketUDP = new DatagramSocket();
            
            String mensaje = "Hola mundo desde el cliente!!!!";
            
            buffer = mensaje.getBytes();
            
            DatagramPacket dp = new DatagramPacket(buffer, buffer.length, direccionServidor, PUERTO_SERVIDOR );
            
            System.out.println("Envio el datagrama");
            
            socketUDP.send(dp);
            
            //Preparo la respuesta
            DatagramPacket peticion = new DatagramPacket(buffer, buffer.length);
            
            //recibir la respuesta
            socketUDP.receive(peticion);
            System.out.println("Recibo la peticion");
            
            //tomar los datos y mostrarlo
            mensaje = new String(peticion.getData());
            System.out.println(mensaje);
            
            //cerramos el socket
            socketUDP.close();
        }catch(Exception ex) {
             System.out.println(ex.getMessage());
        }
    }
    
}
