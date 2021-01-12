/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samplemulticast;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/**
 *
 * @author rafaeli
 */
public class MulticastServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            byte[] b = new byte[100];
            DatagramPacket dgram = new DatagramPacket(b, b.length);
            MulticastSocket socket = new MulticastSocket(4000);
            
            socket.joinGroup(InetAddress.getByName("235.1.1.1"));
            
            while(true){
                socket.receive(dgram);
                System.out.println("Recibido de la direccion " + dgram.getAddress().toString() + " " + 
                        new String(dgram.getData()));
            }
            
            
        }catch(Exception ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
}
