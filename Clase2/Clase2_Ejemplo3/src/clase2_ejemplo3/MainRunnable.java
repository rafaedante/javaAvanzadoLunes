/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2_ejemplo3;

/**
 *
 * @author rafaeli
 */
public class MainRunnable implements Runnable{
    
    private Cliente cliente;
    private Cajera cajera;
    private long initialTime;

    public MainRunnable(Cliente cliente, Cajera cajera, long initialTime) {
        this.cliente = cliente;
        this.cajera = cajera;
        this.initialTime = initialTime;
    }           
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cliente cliente1 = new Cliente("Cliente 1", new int[] {2,2,1,5,2,3});
        Cliente cliente2 = new Cliente("Cliente 2", new int[] {1,3,5,1,1});
        
        long initialTime = System.currentTimeMillis();
        
        Cajera cajera1 = new Cajera("Cajera 1");
        Cajera cajera2 = new Cajera("Cajera 2");
        
        Runnable proceso1 = new MainRunnable(cliente1, cajera1, initialTime );
        Runnable proceso2 = new MainRunnable(cliente2, cajera2, initialTime );
        
        new Thread(proceso1).start();
        
        new Thread(proceso2).start();       
    }

    @Override
    public void run() {
        this.cajera.procesarCompra(this.cliente, this.initialTime);
    }
}
