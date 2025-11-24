package tareasemana13v2;

// Importaciones necesarias para manejo de archivos y fechas
import java.io.FileWriter;
import java.time.LocalDateTime;

// Observador concreto encargado de la auditoría (Logging)
public class ObserverLog implements Observador
{
    // Definimos la ruta del archivo de log como una variable de clase
    private String rutaLog = "temperaturas.log";

    @Override
    public void update(float temperatura)
    {
        // Bloque try-with-resources para abrir el archivo en modo append (true)
        try (FileWriter fw = new FileWriter(rutaLog, true))
        {
            // Escribimos la fecha/hora actual (LocalDateTime.now()) seguido del mensaje
            fw.write(LocalDateTime.now() + " [Temperatura registrada en log]\n"); // Agregué \n para legibilidad
        } catch (Exception e)
        {
            // Manejo de errores de entrada/salida
            System.out.println("Error al escribir en el archivo log: " + e.getMessage());
        }
    }   
}