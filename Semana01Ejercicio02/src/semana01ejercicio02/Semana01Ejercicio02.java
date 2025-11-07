/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana01ejercicio02;

import java.util.Scanner;

public class Semana01Ejercicio02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la ciudad: ");
        String nombre = teclado.nextLine();
        
        System.out.print("Ingrese el año de fundación: ");
        int aFundacion = teclado.nextInt();
        
        System.out.print("Ingrese la cantidad de habitantes: ");
        int habitantes = teclado.nextInt();
        
        System.out.print("Ingrese la cantidad de contagiados: ");
        int contagiados = teclado.nextInt();

        // Creamos el objeto Ciudad con los datos ingresados
        Ciudad miCiudad = new Ciudad(nombre, aFundacion, habitantes, contagiados);

        // Imprimimos los datos usando el método toString() optimizado
        System.out.println("\n" + miCiudad.toString());
    }
}
