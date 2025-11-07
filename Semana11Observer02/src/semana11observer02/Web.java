/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana11observer02;

/**
 *
 * @author C2A504
 */
public class Web extends Observador{

    public Web(Sujeto sujeto){
        this.setSujeto(sujeto);
        this.getSujeto().agregarObservador(this);
    }
    
    @Override
    public void update() {
        
    }
    
}
