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
public class Main {
    public static void main(String[] args){
        
        System.out.println("EJEMPLO CLASE INTERNA NO ESTATICA");
        
        CPU cpu = new CPU();
        
        CPU.Proccesador proccesador = cpu.new Proccesador();
        
        CPU.RAM ram = cpu.new RAM();
        
        System.out.println("Procesador cache = " + proccesador.getCache());
        System.out.println("Ram Clock Speed = " + ram.getClockSpeed() );
        
        
        System.out.println("EJEMPLO CLASE INTERNA ESTATICA");
        
        MotherBoard.USB usb = new MotherBoard.USB();
        System.out.println("Total Ports = " + usb.getTotalPorts());
        
    }
}
