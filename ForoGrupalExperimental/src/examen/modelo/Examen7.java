package examen.modelo;

/**
 *
 * @author Grupo 01
 */
import java.util.Collections;
import java.util.List;

//  El Modelo Principal de la aplicacion
//  Gestiona el estado y la logica del examen
//  No sabe nada de la interfaz grafica, solo maneja datos y reglas
public class Examen7 {

    // Atributos para gestionar el estado del examen
    private List<Pregunta1> preguntasDelExamen;
    private int preguntaActualIndex = 0;
    private int puntaje = 0;

    public Examen7()
    {
        BancoDePreguntas6 banco = new BancoDePreguntas6();

        // 1. Cargamos todas las preguntas disponibles desde el archivo
        List<Pregunta1> todasLasPreguntas = banco.cargarPreguntasDesdeArchivo("preguntas.txt");

        // 2. Barajamos la lista para que el orden sea aleatorio cada vez
        Collections.shuffle(todasLasPreguntas);

        // 3. Tomamos solo las primeras 10 preguntas para este examen
        //    (Se necesita al menos 10 preguntas en el archivo txt)
        this.preguntasDelExamen = todasLasPreguntas.subList(0, 10);
    }


    //  Devuelve el objeto de la pregunta actual
    //  Valor retorno: La pregunta actual, o null si el examen ha terminado
    public Pregunta1 getPreguntaActual() {
        if (haTerminado()) {
            return null;
        }
        return preguntasDelExamen.get(preguntaActualIndex);
    }

    //  Procesa la rpta del usuario, actualiza el puntaje y avanza a la
    //  siguiente pregunta

    //  1er param: La rpta enviada por el usuario
    public void responder(String respuestaUsuario)
    {
        if (getPreguntaActual().esRespuestaCorrecta(respuestaUsuario))
        {
            puntaje++;
        }
        preguntaActualIndex++;
    }


    //  Verifica si ya se han respondido todas las preguntas
    //  Valor retorno: true si el examen termino, false si no
    public boolean haTerminado()
    {
        return preguntaActualIndex >= preguntasDelExamen.size();
    }

    //  Calcula la nota final sobre 20
    //  Valor retorno: La nota final
    public int getNotaFinal()
    {
        // Multiplica por 2 para que la nota sea de 0 a 20
        return puntaje * 2;
    }

    //  Devuelve un texto que indica el progreso actual del examen
    //  Valor retorno Un String como "Pregunta 1 de 10"
    public String getProgreso()
    {
        return "Pregunta " + (preguntaActualIndex + 1) + " de " + preguntasDelExamen.size();
    }
}