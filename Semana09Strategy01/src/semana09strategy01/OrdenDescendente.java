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
public class OrdenDescendente implements EstrategiaOrden{

    @Override
    public void ordenar(int[] datos) {
        Arrays.sort(datos); //ordenamos los datos de manera
                            //ascendente
        //posteriormente intercambiamos/invertimos los datos
        for(int i=0; i<datos.length/2; i++){
            int temp = datos[i];
            datos[i] = datos[datos.length-1-i];
            datos[datos.length-1-i] = temp;
        }
        System.out.println("Datos ordenados de forma descendente");
    }   
}
