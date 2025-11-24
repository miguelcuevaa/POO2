package tareasemana13;

import java.io.FileWriter;

public class AlertaArchivo implements AlertaStrategy
{

    @Override
    public void ejecutarAlerta(float temperatura)
    {
        try(FileWriter fw = new FileWriter("alertas.txt", true))
        {
            fw.write("Alerta de temperatura: "+ temperatura + "\n");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
