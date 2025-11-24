package tareasemana13v2;

// Importamos Schedulers para manejar hilos en RxJava
import io.reactivex.rxjava3.schedulers.Schedulers;

// Clase Principal (Main) para ejecutar la simulación
public class TareaSemana13
{
   public static void main(String[] args)
   {
       System.out.println("--- Iniciando Sistema de Monitoreo Industrial ---");

       // 1. Instanciamos la clase central (el cerebro del sistema)
       TemperaturaCentral central = new TemperaturaCentral();

       // 2. Registramos los observadores manuales al sistema
       central.addObserver(new ObserverMostrar());      // Para mostrar en pantalla
       central.addObserver(new ObserverLog());          // Para guardar logs
       central.addObserver(new ObserverEstadistica());  // Para calcular min/max

       // 3. Configuramos el Pipeline Reactivo con RxJava
       // Obtenemos el flujo observable desde la central
       central.getFlujoTemperatura()
            .subscribeOn(Schedulers.computation()) // Indicamos que el procesamiento se haga en un hilo de cómputo
            .observeOn(Schedulers.io())           // Indicamos que los resultados se manejen en un hilo de IO (Entrada/Salida)
            .filter(temp -> temp >= 0)            // Operador Filter: Ignoramos negativos (aunque el -1 se maneja como error antes)
            .map(temp -> temp * 1.0f)             // Operador Map: Transformamos el dato (ejemplo didáctico)
            .flatMap(temp -> io.reactivex.rxjava3.core.Observable.just(temp)) // Operador FlatMap: Aplanamos el flujo (ejemplo didáctico)
            .subscribe(
                    // onNext (Lambda): Qué hacer con cada temperatura válida recibida
                    temp -> {
                        System.out.println(">> [RxJava] Procesando temperatura en flujo: " + temp);
                    },
                    // onError (Lambda): Qué hacer si ocurre una excepción (el -1 lanzado como RuntimeException)
                    error -> {
                        System.out.println(">> [RxJava] ERROR CRÍTICO recibido: " + error.getMessage());
                        // Aquí el flujo termina, pero el programa sigue corriendo por los otros hilos
                    },
                    // onComplete (Lambda): Qué hacer si el flujo se cierra exitosamente
                    () -> {
                        System.out.println(">> [RxJava] Flujo completado.");
                    }
            );

       // 4. Instanciamos los Sensores (Productores de datos)
       // Cada sensor recibe un nombre y la referencia a la central
       Sensor s1 = new Sensor("Sensor A", central);
       Sensor s2 = new Sensor("Sensor B", central);
       Sensor s3 = new Sensor("Sensor C", central);

       // 5. Iniciamos los Hilos de los sensores
       // Al heredar de Thread, usamos .start() para que corran en paralelo
       s1.start();
       s2.start();
       s3.start();

       // El hilo principal (main) se duerme 10 segundos para dejar que los sensores trabajen
       try
       {
           Thread.sleep(10000);
       } catch (Exception e)
       {
           e.printStackTrace();
       }
       
       // Nota: Al ser hilos independientes, el programa seguirá corriendo hasta que se maten los hilos manualmente
       // o se cierre la aplicación.
   }
}