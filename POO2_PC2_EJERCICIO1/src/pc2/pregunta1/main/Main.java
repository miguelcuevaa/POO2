package pc2.pregunta1.main;

import pc2.pregunta1.contexto.ProcesadorPagos;
import pc2.pregunta1.estrategias.*;
import pc2.pregunta1.interfaces.*;
import pc2.pregunta1.observadores.*;

/**
 *
 * @author Miguel Angel Cueva Añanca
 */

/**
 * Esta es la clase principal para ejecutar el sistema de pagos.
 * Aqui es donde se configuran los patrones y se ejecuta lo pedido en el ejercicio
 */

public class Main
{
    public static void main(String[] args) {
        //  Primero creara el Sujeto (ProcesadorPagos)
        ProcesadorPagos tienda = new ProcesadorPagos();

        //  Segundo creara los Observadores (Modulos del sistema)
        Observador appCliente = new AppUsuario();
        Observador contabilidad = new SistemaContabilidad();

        //  Tercero se suscribira los Observadores al Sujeto
        tienda.agregar(appCliente);
        tienda.agregar(contabilidad);

        //  Cuarto se creara las Estrategias de pago
        MetodoPago tarjeta = new PagoTarjeta();
        MetodoPago yape = new PagoYape();
        MetodoPago efectivo = new PagoEfectivo();

        //  Ejecucion del ejercicio 1
        System.out.println("======= CASO 1: Venta de S/ 200 con Tarjeta =======");
        tienda.setMetodoPago(tarjeta); //   Cambiando estrategia
        tienda.realizarPago(200);

        System.out.println("\n======= CASO 2: Venta de S/ 50 con Yape =======");
        tienda.setMetodoPago(yape); //  Cambiando estrategia
        tienda.realizarPago(50);

        System.out.println("\n======= CASO 3: Venta de S/ 120 con Efectivo =======");
        tienda.setMetodoPago(efectivo); //  Cambiando estrategia
        tienda.realizarPago(120);
    }
}
