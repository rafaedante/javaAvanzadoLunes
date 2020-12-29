/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eduit;

import java.io.IOException;

/**
 *
 * @author rafaeli
 */
public class MainServidor {
    
    public static void main(String[] args) throws IOException {
        
        Servidor serv = new Servidor(); // se crea el servidor
        
        System.out.println("Iniciando servidor\n");
        serv.startServer(); // se inicia el servidor
    }
    
}
