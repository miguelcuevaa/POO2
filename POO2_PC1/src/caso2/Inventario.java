package caso2;

/**
 *
 * @author Miguel Angel Cueva Añanca
 */

public class Inventario
{
    //  El inventario ahora tendra un estado interno
    private int stockProducto = 100; // el stock se inicializa en 100 unid.

    //  El metodo ahora devuelve un String en lugar de imprimir
    public String actualizarStock(String producto, int cantidad)
    {
        this.stockProducto -= cantidad; // actualiza el stock
        return "Stock actualizado: " + this.stockProducto + " unidades restantes de " + producto; // retorna el resultado
    }
}
