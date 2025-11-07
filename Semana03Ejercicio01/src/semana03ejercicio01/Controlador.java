package semana03ejercicio01;

import java.util.Scanner;

public class Controlador {
    //el controlador recibe las solicitudes del usuario
    //y coordina entre el modelo y la vista
    private Modelo modelo;
    private Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        //constructor que conecta el modelo y la vista
        this.modelo = modelo;
        this.vista = vista;
    }
    
    //método que ejecuta una operación
    public void ejecutar(int a, int b, int operacion){
        //el controlador pide al modelo que realice la operación
        int resultado = 0;
        switch(operacion){
            case 1:
                resultado = modelo.sumar(a, b);
                break;
            case 2:
                resultado = modelo.restar(a, b);
                break;
        }
        
        //una vez obtenido el resultado, el controlador pasa el
        //resultado a la vista
        vista.mostrarResultado(resultado);   
    }   
}
