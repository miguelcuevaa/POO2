/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package semana11observer02;

/**
 *
 * @author C2A504
 */
public abstract class Observador {
    private Sujeto sujeto; //sujeto al que se observa
    public abstract void update();

    public Sujeto getSujeto() {
        return sujeto;
    }

    public void setSujeto(Sujeto sujeto) {
        this.sujeto = sujeto;
    }
    
    
}
