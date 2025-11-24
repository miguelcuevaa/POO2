package pc2.pregunta2.servicio;

import io.reactivex.rxjava3.core.Observable;
import pc2.pregunta2.modelo.Producto;

/**
 *
 * @author Miguel Angel Cueva Añanca
 */

/**
 * Aca tenemos al Observador donde implementaremos el RxJava. Este servicio se
 * suscribira stream de eventos del InventarioManager
 */

public class ServicioNotificaciones
{
    private static final int UMBRAL_BAJO_STOCK = 10;

    public ServicioNotificaciones(InventarioManager manager) {
        //  Obtenemos el Observable del manager
        Observable<Producto> streamDeStock = manager.getStreamDeStock();

        //  ACA ES DONDE RXJAVA SE USA
        streamDeStock
                //  Primero, filtramos el stream donde solo nos interesan productos cuyo stock
                //  haya caido POR DEBAJO del umbral
                .filter(producto -> producto.getStockValue() < UMBRAL_BAJO_STOCK)
                //  Segundo, nos suscribimos a ese stream filtrado
                //  El codigo dentro del subscribe() solo se ejecutara si el filtro pasa
                .subscribe
                (
                        //  onNext. Es el que hacer cuando llega un producto con bajo stock
                        this::enviarAlertaGerente,
                        //  onError Es el que hacer si el stream falla (evita problemas)
                        Throwable::printStackTrace
                );
    }

    /**
     * Como accion final, haremos que que se dispare solo cuando un producto cumple la condicion
     * Aca el parametro es el producto con bajo stock
     */
    private void enviarAlertaGerente(Producto p)
    {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("!!! ALERTA DE BAJO STOCK (Gerencia) !!!");
        System.out.println("!!! Producto: " + p.getNombre() + " (SKU: " + p.getSku() + ")");
        System.out.println("!!! Stock actual: " + p.getStockValue());
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
}
