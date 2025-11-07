package semana03ejercicio01;

import java.util.Scanner;

public class Semana03Ejercicio01 {

    public static void main(String[] args) {
        //creamos cada componente del MVC
        Modelo modelo = new Modelo(); //modelo
        Vista vista = new Vista(); //vista
        Controlador controlador = new Controlador(modelo,vista);
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la operación (1 suma, 2 resta): ");
        int operacion = teclado.nextInt();
        controlador.ejecutar(14, 2,operacion);
    }
    
}
