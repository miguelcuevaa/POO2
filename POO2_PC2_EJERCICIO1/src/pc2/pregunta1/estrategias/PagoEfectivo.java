package pc2.pregunta1.estrategias;

import pc2.pregunta1.interfaces.MetodoPago;

/**
 *
 * @author Miguel Angel Cueva Añanca
 */

/**
 * La tercera estrategia es el "Pago en Efectivo" el cual implementa
 * la logica de negocio para que no se cobre comision
 */

public class PagoEfectivo implements MetodoPago
{
    @Override
    public double procesarPago(double monto)
    {
        double montoFinal = monto; //   No se cobra comision

        System.out.println("... (Cálculo Efectivo: Monto S/" + monto + " + Comisión S/0.00)");
        return montoFinal;
    }
}
