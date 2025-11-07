/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana09strategy01;

/**
 *
 * @author PC-DOCENTE-C2A503
 */
public class Semana09Strategy01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] datos = {5,8,7,1,2,10,-1};
        //instanciamos el contexto
        OrdenadorLista ordenador = new OrdenadorLista();
        
        //ordenamos de forma ascendente
        ordenador.setEstrategia(new OrdenAscendente());
        ordenador.ordenarDatos(datos);
        //ordenamos de forma descendente
        ordenador.setEstrategia(new OrdenDescendente());
        ordenador.ordenarDatos(datos);
    }
    
}
