/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana10concurrencia02;

/**
 *
 * @author C2A504
 */
public class Semana10Concurrencia02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread hilo1 = new ContadorCero();
        Thread hilo2 = new ContadorUno();
        Thread hilo3 = new ContadorDos();
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
    
}
