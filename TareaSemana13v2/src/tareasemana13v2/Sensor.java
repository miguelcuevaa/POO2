package tareasemana13v2;

// Importamos Random para generar datos aleatorios
import java.util.Random;

// Clase Sensor que extiende de Thread para permitir ejecución concurrente (multihilo)
public class Sensor extends Thread
{
    // Atributos del sensor
    private String nombre; // Identificador del sensor (ej. "Sensor A")
    private TemperaturaCentral central; // Referencia a la clase central para enviar datos
    private Random random = new Random(); // Generador de números aleatorios

    // Constructor para inyectar el nombre y la dependencia de la Central
    public Sensor(String nombre, TemperaturaCentral central)
    {
        this.nombre = nombre;
        this.central = central;
    }
    
    // Método run() contiene la lógica que se ejecutará en el hilo paralelo
    @Override
    public void run()
    {
        try {
            // Bucle infinito (while true) para simular un monitoreo constante
            while (true)
            {
                float temp;

                // Lógica para simular errores: 1 de cada 10 veces (aprox) genera un -1
                if (random.nextInt(10) == 0)
                { 
                    temp = -1; // Lectura inválida simulada
                } else
                {
                    // Genera una temperatura normal entre 0 y 100 grados
                    temp = random.nextInt(101);
                }

                // Imprimimos qué sensor generó qué dato (útil para depuración)
                System.out.println(nombre + " genero: " + temp);

                // Enviamos el dato a la clase central (Sujeto)
                // Nota: Este método es "Thread-Safe" gracias a cómo lo maneja la central
                central.setTemperatura(temp);

                // Pausamos el hilo por 500ms para cumplir el requisito de frecuencia
                Thread.sleep(500);
            }
        } catch (Exception e)
        {
            // Capturamos cualquier interrupción o error inesperado en el hilo
            e.printStackTrace();
        }
    }   
}