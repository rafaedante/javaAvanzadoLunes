/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eduit;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author rafaeli
 */
public class Conexion {
    
    private final int PUERTO = 1234; // puerto para la conexion
    private final String HOST = "localhost"; // host para la conexion
    protected String mensajeServidor; // mensajes entrantes (recibidos) en el servidor
    protected ServerSocket ss;  // socket del servidor
    protected Socket cs; // socket del cliente
    protected DataOutputStream salidaServidor, salidaCliente; // flujo de datos de salida

    public Conexion(String tipo) throws IOException {
        
        if (tipo.equalsIgnoreCase("servidor")){
            ss = new ServerSocket(PUERTO); // se crea el socket para el servidor en el puerto 1234
            cs = new Socket(); // socket para el cliente
        }else {
            cs = new Socket(HOST, PUERTO); // socket para el cliente en localhost en puerto 1234
        }        
    }   
    
}
