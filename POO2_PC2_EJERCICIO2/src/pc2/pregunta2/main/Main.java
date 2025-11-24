package pc2.pregunta2.main;

import pc2.pregunta2.modelo.*;
import pc2.pregunta2.servicio.*;

/**
 *
 * @author Miguel Angel Cueva Añanca
 */

/**
 * Esta es la clase principal para ejecutar la simulacion de inventario
 * concurrente del ejercicio 2
 */

public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        System.out.println("--- Iniciando Sistema de Monitoreo de Inventario ---");

        //  Primero,  se creara el Manager (Sujeto Observable)
        InventarioManager manager = new InventarioManager();

        //  Segundo, se creara el Servicio de Notificaciones (Observador)
        //  y suscribira al manager
        //  Y a partir de este punto, estara escuchando
        ServicioNotificaciones notificador = new ServicioNotificaciones(manager);

        // Tercero, se cargara el inventario inicial
        Producto laptop = new Producto("LPT-VIC-777", "Laptop HP Victus", 20);
        manager.agregarProducto(laptop);
        System.out.println("Inventario inicial cargado: " + laptop);

        System.out.println("\n--- Iniciando simulacion concurrente de 3 procesos de venta ---");
        System.out.println("El stock bajara de 20. La alerta debe saltar al llegar a 9");

        //  Cuarto, se creara y lanzara los hilos concurrentes
        //  donde cada hilo simulara 5 ventas y saldra un total de 15 ventas
        Thread venta1 = new SimuladorVenta("Venta-HILO-A", manager, "LPT-VIC-777", 5);
        Thread venta2 = new SimuladorVenta("Venta-HILO-B", manager, "LPT-VIC-777", 5);
        Thread venta3 = new SimuladorVenta("Venta-HILO-C", manager, "LPT-VIC-777", 5);

        //  Iniciaremos los hilos concurrentemente
        venta1.start();
        venta2.start();
        venta3.start();

        //  Esperaremos a que todos los hilos terminen para ver el resultado final
        venta1.join();
        venta2.join();
        venta3.join();

        System.out.println("\n--- Simulacion Concurrente Terminada ---");
        System.out.println("Stock final: " + manager.getProducto("LPT-VIC-777").getStockValue());

        // Aca haremos la demostracion de la reposicion
        System.out.println("\n--- Simulando reposicion de stock ---");
        manager.procesarReposicion("LPT-VIC-777", 20);
        System.out.println("Stock final: " + manager.getProducto("LPT-VIC-777").getStockValue());
    }
}
