/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana09strategy02;

/**
 *
 * @author PC-DOCENTE-C2A503
 */
public class Semana09Strategy02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Navegador navegador = new Navegador(); //instanciamos a la clase Contexto
        String origen = "USIL Campus 2";
        String destino = "USIL Campus Magdalena";
        
        //usando la ruta en auto
        navegador.setEstrategia(new RutaEnAuto());
        navegador.mostrarRuta(origen, destino);
        
        //usando la ruta caminando
        navegador.setEstrategia(new RutaCaminando());
        navegador.mostrarRuta(origen, destino);
        
    }
    
}
