package pc2.pregunta2.modelo;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Miguel Angel Cueva Añanca
 */

/**
 * Este Modelo representara un producto en el inventario
 *
 * Esta clase esta diseñada para ser segura en la concurrencia
 * Se utiliza el AtomicInteger para el stock, permitiendo que multiples hilos
 * (ventas, reposiciones) modifiquen el stock de forma segura sin riesgo de
 * condiciones de carrera
 */

public class Producto
{
    private String sku;
    private String nombre;
    //  Usar el AtomicInteger es una solucion optima para contadores concurrentes
    private AtomicInteger stock;

    public Producto(String sku, String nombre, int stockInicial)
    {
        this.sku = sku;
        this.nombre = nombre;
        this.stock = new AtomicInteger(stockInicial);
    }

    //  Getters
    public String getSku()
    {
        return sku;
    }

    public String getNombre()
    {
        return nombre;
    }

    /**
     * Aca se devuelve el objeto AtomicInteger completo para
     * operaciones avanzadas o se puede usar el getStockValue() para el valor
     * simple
     */
    public AtomicInteger getStock()
    {
        return stock;
    }

    /**
     * Aca se devolvera el valor entero actual del stock
     */
    public int getStockValue()
    {
        return stock.get();
    }

    @Override
    public String toString()
    {
        return "Producto{" + "sku='" + sku + '\'' + ", nombre='" + nombre + '\'' + ", stock=" + stock.get() + '}';
    }
}
