package tareasemana13;

import java.io.FileWriter;
import java.time.LocalDateTime;


public class ObserverLog implements Observador
{

    
         private String rutaLog = "temperaturas.log";

    @Override
    public void update(float temperatura)
    {
        try (FileWriter fw = new FileWriter(rutaLog, true))
        {
            fw.write(LocalDateTime.now() + " [Temperatura registrada en log]" );
        } catch (Exception e)
        {
            System.out.println("Error al escribir en el archivo log: " + e.getMessage());
        }
    }
    
}
