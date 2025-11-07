/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana09strategy01;

import java.util.Arrays;

/**
 *
 * @author PC-DOCENTE-C2A503
 */
public class OrdenAscendente implements EstrategiaOrden{

    @Override
    public void ordenar(int[] datos) {
        //implementamos la lógica específica para ordenar de 
        //manera ascendente
        Arrays.sort(datos);
        System.out.println("Datos ordenados de manera ascendente");
    }
    
}
