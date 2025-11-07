/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana10concurrencia02;

/**
 *
 * @author C2A504
 */
public class ContadorUno extends Thread{
    @Override
    public void run(){
        for(int i=0; i<1000; i++){
            System.out.println("1");
        }
    }
}
