package pc2.pregunta2.servicio;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import pc2.pregunta2.modelo.Producto;

/**
 *
 * @author Miguel Angel Cueva Añanca
 */

/**
 * Tenemos aca la clase central que gestionara el inventario y actuara como
 * la FUENTE DE EVENTOS (Observable)
 *
 * Utilizara un PublishSubject de RxJava
 * Un Subject es un Observable "caliente" al que podemos empujar valores
 * (onNext) manualmente
 *
 * Tambien se usara un ConcurrentHashMap para la lista de productos, asegurando
 * que incluso agregar nuevos productos sea seguro en la concurrencia
 */

public class InventarioManager
{

    //  Un mapa thread-safe para almacenar el inventario
    private Map<String, Producto> inventario = new ConcurrentHashMap<>();

    //  Aqui el "Subject" de RxJava actuara como el bus de eventos del stock
    //  Se emitira el objeto Producto cada vez que su stock cambie
    private PublishSubject<Producto> streamDeStock = PublishSubject.create();

    public void agregarProducto(Producto p)
    {
        inventario.put(p.getSku(), p);
    }

    public Producto getProducto(String sku)
    {
        return inventario.get(sku);
    }

    /**
     * Se simulara una venta
     * Se reduce el stock de forma atomica
     * PUEDE ser llamado por multiples hilos a la vez
     *
     * El parametro "sku" es el SKU del producto a vender
     * El parametro "cantidad" La cantidad a vender
     */
    public void procesarVenta(String sku, int cantidad)
    {
        Producto p = inventario.get(sku);
        if (p != null) {
            //  addAndGet es una operación atomica
            int stockRestante = p.getStock().addAndGet(-cantidad);

            System.out.println("[Venta  - Hilo: " + Thread.currentThread().getName() + "] Vendido: " + cantidad + " de " + p.getNombre() + ". Stock restante: " + stockRestante);

            //  Emitiremos el producto actualizado al stream para que los observadores reaccionen
            streamDeStock.onNext(p);
        }
    }

    /**
     * Simula una reposición. Aumenta el stock de forma atómica.
     *
     * Tenemos al parametro "SKU" del producto a reponer
     * Y al parametro "cantidad" La cantidad a reponer
     */
    public void procesarReposicion(String sku, int cantidad)
    {
        Producto p = inventario.get(sku);
        if (p != null) {
            int stockNuevo = p.getStock().addAndGet(cantidad);

            System.out.println("[Repo   - Hilo: " + Thread.currentThread().getName() + "] Repuesto: " + cantidad + " de " + p.getNombre() + ". Stock nuevo: " + stockNuevo);

            //  Emitiremos el producto actualizado al stream
            streamDeStock.onNext(p);
        }
    }

    /**
     * Aqui es donde se expone el Subject como un Observable simple,
     * esto evitara que clases externas puedan hacer .onNext() en nuestro
     * stream y solo podran suscribirse
     */
    public Observable<Producto> getStreamDeStock()
    {
        return streamDeStock;
    }
}
