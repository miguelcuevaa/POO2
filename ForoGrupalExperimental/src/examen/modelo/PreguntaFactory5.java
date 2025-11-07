package examen.modelo;

/**
 *
 * @author Grupo 01
 */
import java.util.Arrays;
import java.util.List;

//   Patron Factory: Crea los objetos Pregunta
//   Realiza la producción de los tres tipos de pregunta
public class PreguntaFactory5
{


    //  Crea y devuelve un objeto que implementa la interfaz Pregunta1
    //  1er param: Tipo de pregunta
    //  2do param: El txt de la pregunta
    //  3er param: Un String con las opciones. Separado por comas
    //  4to param: La rpta correcta
    //  Valor retorno: Un objeto del tipo de pregunta seleccionado

    public Pregunta1 crearPregunta(String tipo, String texto, String opcionesStr, String respuesta)
    {
        // Para decidir qué objeto concreto crear
        switch (tipo.toUpperCase())
        {
            case "MARCAR":
                // Si es marcar, convierte el string de opciones en una lista
                List<String> opciones = Arrays.asList(opcionesStr.split(","));
                return new PreguntaMarcar2(texto, opciones, respuesta);
            case "VF":
                return new PreguntaVF3(texto, respuesta);
            case "COMPLETAR":
                return new PreguntaCompletar4(texto, respuesta);
            default:
                // Para evitar que el programa falle
                throw new IllegalArgumentException("Tipo de pregunta desconocido: " + tipo);
        }
    }
}
