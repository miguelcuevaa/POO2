package pc2.pregunta1.estrategias;

import pc2.pregunta1.interfaces.MetodoPago;

/**
 *
 * @author Miguel Angel Cueva Añanca
 */

/**
 * La primera estrategia es el "Pago con Tarjeta" el cual implementa la idea de
 * negocio para cobrar una comision del 5% 
 */

public class PagoTarjeta implements MetodoPago
{
    @Override
    public double procesarPago(double monto)
    {
        double comision = monto * 0.05; // cobran 5% de comision
        double montoFinal = monto + comision;

        System.out.println("... (Calculo Tarjeta: Monto S/" + monto + " + Comision S/" + comision + ")");
        return montoFinal;
    }
}
