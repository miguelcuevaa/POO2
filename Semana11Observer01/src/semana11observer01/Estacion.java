/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana11observer01;

//sujeto del patrón Observer

import java.util.ArrayList;
import java.util.List;

public class Estacion {
    private List<Observador> observadores = new ArrayList<>();
    private float temperatura;
    
    public void addObserver(Observador observador){
        this.observadores.add(observador);
    }
    
    public void removeObserver(Observador observador){
        this.observadores.remove(observador);
    }
    
    public void notifyObservadores(){ //NotifyAll()
        for(Observador observador : observadores){
            //para cada objeto observador de la lista de observadores,
            //ejecuta el método update
            observador.update(temperatura);
        }
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float nuevaTemperatura) {
        //este método indica un cambio en el atributo temperatura
        System.out.println("La estación ha registrado una nueva temperatura: "
                + nuevaTemperatura+"°C");
        this.temperatura = nuevaTemperatura;
        this.notifyObservadores();
        
    }
    
    
}
