/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana11observer01;

/**
 *
 * @author C2A504
 */
public class ReporteClima implements Observador{
    private String nombre;
    
    public ReporteClima(String nombre){
        this.nombre = nombre;
    }
    
    @Override
    public void update(float temperatura) {
        System.out.println(this.nombre + ": Temperatura actualizada =>"
        + temperatura + "°C");
    }
    
}
