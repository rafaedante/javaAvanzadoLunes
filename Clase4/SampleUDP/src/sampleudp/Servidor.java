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
public class Servidor {
    
    
    public static void main(String[] args) {
        
        final int PUERTO = 5000;
        byte[] buffer = new byte[1024];
        
        try {
            
            System.out.println("Iniciando servidor UDP");
            
            DatagramSocket socketUDP = new DatagramSocket(PUERTO);
            //siempre atendera peticiones
            while(true) {
                
                 //Preparo la respuesta
                DatagramPacket peticion = new DatagramPacket(buffer, buffer.length);

                //recibir el datagram
                socketUDP.receive(peticion);
                System.out.println("Recibo la informacion del cliente");
                
                //convierto lo recibido y mostramos el mensaje
                String mensaje = new String(peticion.getData());
                System.out.println(mensaje);
                
                //obtener host y puerto del cliente
                int puertoCliente = peticion.getPort();
                InetAddress direccion = peticion.getAddress();
                
                mensaje = "Hola mundo desde el servidor!!!!";
                buffer = mensaje.getBytes();
                
                //creo el datagram
                DatagramPacket respuesta = new DatagramPacket(buffer, buffer.length, direccion, puertoCliente);
                
                //Envio la informacion
                System.out.println("Envio la informacion del cliente");
                socketUDP.send(respuesta);
            }
        }catch(Exception ex){
           System.out.println("Error: " + ex.getMessage());
        }  
    }   
   
}
