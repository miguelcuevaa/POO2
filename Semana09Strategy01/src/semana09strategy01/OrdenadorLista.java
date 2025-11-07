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
public class OrdenadorLista {
    //Corresponde al contexto del patrón Strategy
    private EstrategiaOrden estrategia;
    
    public void setEstrategia(EstrategiaOrden estrategia){
        this.estrategia = estrategia;
    }
    
    public void ordenarDatos(int[] datos){
        this.estrategia.ordenar(datos);
        System.out.println(Arrays.toString(datos));
    }
}
