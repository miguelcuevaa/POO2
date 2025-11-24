package tareasemana13v2;

// Importamos la clase FileWriter para manejar la escritura en archivos
import java.io.FileWriter;

// Implementación concreta de estrategia: Guardar en archivo físico
public class AlertaArchivo implements AlertaStrategy
{
    @Override
    public void ejecutarAlerta(float temperatura)
    {
        // Usamos un bloque try-with-resources para asegurar que el archivo se cierre automáticamente.
        // "alertas.txt": nombre del archivo.
        // true: indica modo 'append' (agregar al final sin borrar el contenido previo).
        try(FileWriter fw = new FileWriter("alertas.txt", true))
        {
            // Escribimos la alerta seguida de un salto de línea (\n)
            fw.write("Alerta de temperatura: "+ temperatura + "\n");
        }catch(Exception e)
        {
            // En caso de error (ej. disco lleno, sin permisos), imprimimos la traza del error.
            e.printStackTrace();
        }
    }   
}