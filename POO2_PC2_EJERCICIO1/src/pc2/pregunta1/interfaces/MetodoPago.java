package pc2.pregunta1.interfaces;

/**
 *
 * @author Miguel Angel Cueva Añanca
 */

/**
 * Aplicamos el patron Strategy con el cual defineremos el contrato para
 * todos los metodos de pago solicitados donde cada método de pago sabra como
 * calcular el monto final, incluyendo sus propias comisiones
 */

public interface MetodoPago
{
    /**
     * Procesaremos un pago donde calcularemos la comision y se
     * devolvera el monto total a cobrar
     *
     * Tenemos al "monto" original de la transaccion como parametro
     * Esto retornara el monto final, que es el monto + la comision
     */
    double procesarPago(double monto);
}
