package examen.modelo;

/**
 *
 * @author Grupo 01
 */

//  2do Producto: Pregunta True/False

//  Se aplica reutilizacion de codigo al tener
//  el mismo formato que PreguntaMarcar2

//  HEREDAMOS de PreguntaMarcar2
public class PreguntaVF3 extends PreguntaMarcar2
{

    //  Recibe el texto de la pregunta y la rpta correcta

    //  1er param: texto El texto de la pregunta
    //  2do param respuestaCorrecta (solo V o F)
    public PreguntaVF3(String texto, String respuestaCorrecta)
    {
        // "super" llama al constructor de la clase padre PreguntaMarcar2
        // Se envia el texto, las opciones fijas (V o F) y la rpta
        super(texto, java.util.Arrays.asList("Verdadero", "Falso"), respuestaCorrecta);
    }
}
