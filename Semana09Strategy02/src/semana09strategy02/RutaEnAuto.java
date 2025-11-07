/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana09strategy02;

/**
 *
 * @author PC-DOCENTE-C2A503
 */
public class RutaEnAuto implements EstrategiaRuta{
    @Override
    public void calcularRuta(String origen, String destino) {
        System.out.println("Calculando ruta en auto desde "
                + origen + " hacia "+destino);
    }
}
