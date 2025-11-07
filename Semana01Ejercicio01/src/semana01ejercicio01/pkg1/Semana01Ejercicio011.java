/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana01ejercicio01.pkg1;

import java.util.Scanner;

public class Semana01Ejercicio011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //programa que recibe datos de una persona por teclado
        //y los imprime en pantalla
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Ingrese su apellido: ");
        String apellido = teclado.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = teclado.nextInt();
        //ya tenemos almacenados en las variables nombre, apellido y edad
        //los valores ingresados por el usuario vía teclado
        
        Persona persona = new Persona(nombre,apellido,edad);
        
        persona.mostrarDatos();
        
    }
    
}
