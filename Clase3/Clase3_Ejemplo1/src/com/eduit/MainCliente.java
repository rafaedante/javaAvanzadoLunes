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
public class MainCliente {
    
    public static void main(String[] args) throws IOException {
        
        Cliente cli = new Cliente(); // se crea el cliente
        
        System.out.println("Iniciando cliente\n");
        
        cli.startClient(); // se inicia el cliente
    }
    
}
