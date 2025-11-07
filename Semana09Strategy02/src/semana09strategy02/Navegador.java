/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana09strategy02;

/**
 *
 * @author PC-DOCENTE-C2A503
 */
public class Navegador {
    private EstrategiaRuta estrategia; //el atributo estrategia es un objeto
                                //de la interface EstrategiaRuta que 
                                //representa a cualquier estrategia concreta
    public void setEstrategia(EstrategiaRuta estrategia){
        this.estrategia = estrategia;
    }
    
    public void mostrarRuta(String origen, String destino){
        //método con el que interactúa el cliente
        if(estrategia == null){
            System.out.println("ERROR!! Debe seleccionar una estrategia");
        }else{
            this.estrategia.calcularRuta(origen, destino); //ejecución de la estrategia
        }
    }
}
