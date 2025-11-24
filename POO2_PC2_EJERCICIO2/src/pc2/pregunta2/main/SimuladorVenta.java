package pc2.pregunta2.main;

import pc2.pregunta2.servicio.*;

/**
 *
 * @author Miguel Angel Cueva Añanca
 */

/**
 * Tenemos aca el hilo de simulacion en donde se Simulara multiples
 * ventas concurrentes
 */

public class SimuladorVenta extends Thread {

    private InventarioManager manager;
    private String sku;
    private int ventasARealizar;

    public SimuladorVenta(String nombreHilo, InventarioManager manager, String sku, int ventasARealizar)
    {
        super(nombreHilo); //   Asignamos un nombre al hilo
        this.manager = manager;
        this.sku = sku;
        this.ventasARealizar = ventasARealizar;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < ventasARealizar; i++) {
            manager.procesarVenta(sku, 1); //   Se vende de 1 en 1
            try
            {
                //  Dormimos un tiempo aleatorio para simular concurrencia real
                Thread.sleep((long) (Math.random() * 100));
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
