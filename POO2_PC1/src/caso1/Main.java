package caso1;

import java.util.ArrayList;         // para la lista de programas
import java.util.Comparator;        // para la logica de ordenamiento
import java.util.List;              // la interfaz de la lista
import java.util.Scanner;           // para leer la entrada del usuario
import java.util.stream.Collectors; // para recolectar los resultados del stream

/**
 *
 * @author Miguel Angel Cueva Añanca
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);           // inicializa scanner
        List<Programa> programacion = new ArrayList<>();    // crea la lista para guardar programas
        
        System.out.println("<|> <|> Sistema de Gestion de Programacion de TV <|> <|>"); // titulo visible

        //  Entrada de datos
        //  Bucle para ingresar multiples programas
        while (true)
        {
            System.out.print("\nIngrese tipo de programa (Noticiero, Serie, Pelicula) o 'salir' para terminar: ");
            String tipo = teclado.nextLine();   // lee el tipo
            
            if (tipo.equalsIgnoreCase("salir")) // condicion para salir del bucle
            {
                break;                          // rompe bucle
            }

            System.out.print("Ingrese nombre del programa (obligatorio): ");
            String nombre = teclado.nextLine(); // lee el nombre

            System.out.print("Ingrese horario de inicio (hh:mm) (obligatorio): ");
            String horario = teclado.nextLine(); // lee el horario

            //  Creacion del Builder con los datos obligatorios
            ProgramaBuilder builder = new ProgramaBuilder(nombre, horario).deTipo(tipo);

            // Seccion de atributos opcionales
            System.out.print("Ingrese protagonista (opcional) (presione Enter para omitir): ");
            String protagonista = teclado.nextLine();   // lee el protagonista
            if (!protagonista.isEmpty())                // si el usuario escribio algo
            {
                builder.conProtagonista(protagonista);  // entonces lo añade al builder
            }

            System.out.print("Ingrese año de produccion (opcional) (presione Enter para omitir): ");
            String anioStr = teclado.nextLine();                        // lee el año como texto
            if (!anioStr.isEmpty())                                     // si el usuario escribio algo
            {
                builder.conAnioProduccion(Integer.parseInt(anioStr));   // lo convierte a numero y lo añade
            }

            System.out.print("Ingrese censura (opcional) (presione Enter para omitir): ");
            String censura = teclado.nextLine();    // lee la censura
            if (!censura.isEmpty())                 // si el usuario escribio algo
            {
                builder.conCensura(censura);        // lo añade al builder
            }

            //  Construccion del objeto y la inserccion a la lista
            programacion.add(builder.build()); // construye el objeto y lo guarda
            System.out.println("<|> Programa agregado exitosamente <|>");
        }
        
        System.out.println("\n<|> Programacion del Dia Final <|>");

        //  Seccion para Programacion Funcional
        //  Se usa un stream para procesar la coleccion "programacion"
        
        //  1. Ordenar la lista por horario de inicio
        List<Programa> programacionOrdenada = programacion.stream()         // convierte la lista en un stream
                .sorted(Comparator.comparing(Programa::getHorarioInicio))   // ordena usando el horario como clave
                .collect(Collectors.toList());                              // recolecta los elementos ordenados en una nueva lista

        //  2. Contar la cantidad de programas
        long cantidadProgramas = programacion.stream().count();             // cuenta los elementos del stream
        
        // Seccion de visualizacion de resultados
        System.out.println("Total de programas ingresados: " + cantidadProgramas); // muestra el conteo
        System.out.println("------------------------------------");
        
        //  Itera sobre la lista ya ordenada para mostrar cada programa
        for (Programa p : programacionOrdenada)
        {
            System.out.println(p);  // imprime el programa usando su metodo toString()
            System.out.println();   // añade un enter xd
        }
    }
}
