package pc2.pregunta1.estrategias;

import pc2.pregunta1.interfaces.MetodoPago;

/**
 *
 * @author Miguel Angel Cueva Añanca
 */

/**
 * La segunda estrategia es el "Pago con Yape" el cual implementa
 * la logica de negocio para cobrar una comision fija de S/ 1
 */

public class PagoYape implements MetodoPago
{
    @Override
    public double procesarPago(double monto)
    {
        double comision = 1.00; // Comisión fija
        double montoFinal = monto + comision;

        System.out.println("... (Cálculo Yape: Monto S/" + monto + " + Comisión S/" + comision + ")");
        return montoFinal;
    }
}
