package tareasemana13;

import java.util.Random;

public class Sensor extends Thread
{
    
    private String nombre;
    private TemperaturaCentral central;
    private Random random = new Random();

    public Sensor(String nombre, TemperaturaCentral central)
    {
        this.nombre = nombre;
        this.central = central;
    }
    
    @Override
    public void run()
    {
        try {
            while (true)
            {

                float temp;

                if (random.nextInt(10) == 0)
                { 
                    temp = -1;
                } else
                {
                    temp = random.nextInt(101);
                }

                System.out.println(nombre + " genero: " + temp);

                central.setTemperatura(temp);

                Thread.sleep(500);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
