/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana11observer02;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author C2A504
 */
public class Sujeto {
    private int resultado; //el resultado del examen médico se mide en
                            //cantidad de ciclos
    private List<Observador> observadores = new ArrayList<>();
    
    public void agregarObservador(Observador observador){
        observadores.add(observador);
    }
    public void eliminarObservador(Observador observador){
        observadores.remove(observador);
    }
    
    public void notificarObservadores(){
        
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado; //actualiza el resultado
        this.notificarObservadores();
    }
    
    
}
