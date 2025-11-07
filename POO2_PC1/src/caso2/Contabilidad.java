package caso2;

/**
 *
 * @author Miguel Angel Cueva Añanca 
 */

public class Contabilidad
{
    //  El metodo ahora devuelve un String
    public String registrarTransaccion(String producto, double monto)
    {
        return "Transaccion registrada: " + producto + " - S/ " + monto; // retorna el resultado
    }
}
