/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samplemulticast;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author rafaeli
 */
public class MulticastClient {
    
     public static void main(String[] args) {
    
        try {
            
            DatagramSocket socket = new DatagramSocket();
            byte[] b = "Hola desde cliente".getBytes();
            
            DatagramPacket dgram = new DatagramPacket(b, b.length, InetAddress.getByName("235.1.1.1"), 4000);
            
            System.out.println("Enviando paquete " + new String(dgram.getData()));
            
            while(true){
                System.out.println(".");
                socket.send(dgram);
                Thread.sleep(2000);
            }

        }catch(Exception ex){
                System.out.println("Error: " + ex.getMessage());
            }
    }  
    
}
