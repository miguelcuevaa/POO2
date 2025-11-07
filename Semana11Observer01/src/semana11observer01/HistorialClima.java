/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana11observer01;

/**
 *
 * @author C2A504
 */
public class HistorialClima implements Observador{

    @Override
    public void update(float temperatura) {
        System.out.println("[LOG]: Temperatura registrada => "+
                temperatura+"°C");
    }
    
}
