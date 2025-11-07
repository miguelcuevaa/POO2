package examen.modelo;

/**
 *
 * @author Grupo 01
 */
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//  Esta clase se encarga de leer el archivo txt
//  Es el puente de datos para el modelo hacia el txt
public class BancoDePreguntas6
{

    // El Banco de Preguntas necesita del Factory para construir las preguntas
    // una vez que lee los datos
    private PreguntaFactory5 factory = new PreguntaFactory5();


    //  Lee el archivo txt línea por línea y devuelve una lista de objetos Pregunta1

    //  1er param: El nombre del archivo en la carpeta 'recursos'
    //  Valor retorno: Una lista con todas las preguntas encontradas en el archivo
    public List<Pregunta1> cargarPreguntasDesdeArchivo(String rutaArchivo)
    {
        List<Pregunta1> preguntas = new ArrayList<>();

        // try-with-resources: forma moderna y segura de leer archivos
        // Se asegura que el archivo se cierre automaticamente
        try (InputStream is = getClass().getClassLoader().getResourceAsStream(rutaArchivo);
             BufferedReader reader = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8)))
        {

            // Leemos todas las lineas del archivo de una sola vez
            List<String> lineas = reader.lines().collect(Collectors.toList());

            for (String linea : lineas)
            {
                // Separamos cada línea por el punto y coma (;) para obtener sus partes
                String[] partes = linea.split(";", 4);

                if (partes.length >= 3) {
                    String tipo = partes[0];
                    String texto = partes[1];

                    // Manejamos el caso especial de "COMPLETAR", que no tiene opciones
                    String opciones = (tipo.equals("COMPLETAR")) ? "" : partes[2];
                    String respuesta = (tipo.equals("COMPLETAR")) ? partes[2] : partes[3];

                    // Usamos el Factory para crear el objeto Pregunta1 y lo añadimos a la lista
                    preguntas.add(factory.crearPregunta(tipo, texto, opciones, respuesta));
                }
            }
        } catch (Exception e)
        {
            System.err.println("Error al leer el archivo de preguntas: " + e.getMessage());
            // En una aplicacion real, se podria mostrar una ventana de error
        }
        return preguntas;
    }
}