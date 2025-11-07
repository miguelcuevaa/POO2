
package tarea2;

import java.util.List;
import java.util.Scanner;


public class Tarea2 {

  
    public static void main(String[] args) {
        
        List<Pregunta> examen = PreguntaFactory.crearExamen(10);
        Scanner teclado = new Scanner(System.in);
        
        Calificacion calificacion = new Calificacion();
        int numero = 1;
        
        for (Pregunta p : examen){
            
            System.out.println("Pregunta "+ numero +":");
            p.mostrarPregunta();
            
            System.out.println("Tu respuesta: ");
            String respuesta = teclado.nextLine().trim().toLowerCase();
            
            if(respuesta.equals(p.getClave().toLowerCase())){
                System.out.println("Correcto");
                calificacion.respuestaCorrecta();
            }else{
                System.out.println("Incorrecta. La respuesta es: " + p.getClave());
            }
            
            numero++; 
       }
        
        calificacion.mostrarResultado();
    }
    
}
