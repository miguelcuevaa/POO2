package tarea2;


public class Calificacion {
    
    private int puntaje;
    
    public Calificacion(){
        this.puntaje = puntaje;
    }
    
    public void respuestaCorrecta(){
        puntaje += 2;
    }
    
    public double getNota(){
        return puntaje;
    }
    
    public void mostrarResultado(){
        System.out.println("Tu nota es: "+ puntaje);
    }
}
