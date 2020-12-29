/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1_ejemplo;

/**
 *
 * @author rafaeli
 */
public class Threads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
       // System.out.println("Hilo principal");
        //probarExtendiendoThread();
        //probarImpmentandoRunnable();
        System.out.println("Hilo principal");
        probarJoin();
    }
    
    public static void probarExtendiendoThread() {
        ThreadExtending t1 = new ThreadExtending("T1-extends");
        ThreadExtending t2 = new ThreadExtending("T2-extends");
        
        t1.start();
        t2.start();
        
    }
    
    public static void probarImpmentandoRunnable(){
        ThreadImplementRunnable r1 = new ThreadImplementRunnable("T1-implements", "T1I");
        ThreadImplementRunnable r2 = new ThreadImplementRunnable("T2-implements", "T2I");
        
        Thread thread1 = new Thread(r1);
        Thread thread2 = new Thread(r2);
        
        thread1.start();
        thread2.start();
    }
    
    public static void probarJoin() throws InterruptedException {
        
        ThreadImplementRunnable r1 = new ThreadImplementRunnable("T1-implements", "T1I");
        ThreadImplementRunnable r2 = new ThreadImplementRunnable("T2-implements", "T2I");
        
        Thread thread1 = new Thread(r1);
        Thread thread2 = new Thread(r2);
        
        thread1.start();
        thread1.join();
        
        thread2.start();
        thread2.join();
        
        System.out.println("Esto se ejecuta despues de los 2 threads si o si");
    
    }
    
}
