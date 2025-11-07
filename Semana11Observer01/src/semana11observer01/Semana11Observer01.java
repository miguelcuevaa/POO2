/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana11observer01;

/**
 *
 * @author C2A504
 */
public class Semana11Observer01 {
    
    public static void main(String[] args) {
        Estacion estacion = new Estacion();
        Observador o1 = new ReporteClima("Dispositivo 1");
        Observador o2 = new ReporteClima("Dispositivo 2");
        Observador historial = new HistorialClima();
        //agregamos cada observador a la lista de observadores
        //del sujeto (objeto de la clase Estacion)
        estacion.addObserver(o1);
        estacion.addObserver(o2);
        estacion.addObserver(historial);
        
        estacion.setTemperatura(22.0f);
        
    }
    
}
