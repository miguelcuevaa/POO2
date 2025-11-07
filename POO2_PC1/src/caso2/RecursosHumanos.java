package caso2;

/**
 *
 * @author Miguel Angel Cueva Añanca
 */

public class RecursosHumanos
{
    //  El metodo ahora devuelve un String
    public String asignarComision(String empleado, double montoVenta)
    {
        double comision = montoVenta * 0.05; // se calcula una comision del 5%
        return "Comision para " + empleado + ": S/ " + String.format("%.2f", comision); //  devuelve el resultado formateado
    }
}
