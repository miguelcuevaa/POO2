package pc2.pregunta1.contexto;

import pc2.pregunta1.estrategias.PagoEfectivo;
import pc2.pregunta1.interfaces.MetodoPago;
import pc2.pregunta1.observadores.Sujeto;

/**
 *
 * @author Miguel Angel Cueva Añanca
 */

/**
 * Aca tenemos la clase Contexto que usa el patron Strategy y Sujeto que usa el
 * patron Observer.
 * Se usa una estrategia de pago que establecimos
 * Se extiende de Sujeto para notificar a los observadores
 */

public class ProcesadorPagos extends Sujeto
{
    //  Almacena la estrategia de pago actual
    private MetodoPago metodoPago;

    public ProcesadorPagos() {
        // Por defecto, la estrategia sera Efectivo (sin comision)
        this.metodoPago = new PagoEfectivo();
    }

    /**
     * Permitira al cliente (la tienda) cambiar la estrategia en tiempo de
     * ejecucion.
     *
     * En el marametro "metodoPago" se usara una de las estrategias
     * (Tarjeta, Yape, Efectivo)
     */
    public void setMetodoPago(MetodoPago metodoPago)
    {
        this.metodoPago = metodoPago;
    }

    /**
     * Este sera el metodo principal de negocio. Aca es donde se procesa el pago
     * usando la estrategia actual y notificara a los observadores
     *
     * Aca el parametro "monto" es el monto original de la venta
     */
    public void realizarPago(double monto)
    {
        System.out.println("Procesando un pago de S/" + monto);

        //  Primero se delega el calculo a la estrategia actual (STRATEGY)
        double montoFinal = this.metodoPago.procesarPago(monto);

        System.out.println("Monto final cobrado: S/" + montoFinal);

        // Y segundo, se notificara a los observadores suscritos (OBSERVER)
        String metodoUsado = this.metodoPago.getClass().getSimpleName();
        String mensaje = "Pago exitoso de S/" + montoFinal + " (usando " + metodoUsado + ")";
        this.notificar(mensaje);
    }
}
