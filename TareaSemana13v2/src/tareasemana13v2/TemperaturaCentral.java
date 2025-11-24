package tareasemana13v2;

// Importamos librerías de RxJava 3 para programación reactiva
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.PublishSubject;
// Importamos librerías de Java Util para listas
import java.util.ArrayList;
import java.util.List;

// Clase Central que actúa como Sujeto (Observer), Contexto (Strategy) y Fuente Reactiva (RxJava)
public class TemperaturaCentral
{
    // Lista para almacenar los observadores manuales (Patrón Observer tradicional)
    private List<Observador> observadores = new ArrayList<>();
    
    // Variable para almacenar el estado actual
    private float temperatura;
    
    // PublishSubject: Un tipo especial de Observable que permite emitir datos manualmente.
    // Actúa como un "puente" entre el código imperativo y el reactivo.
    private PublishSubject<Float> flujoTemperaturas = PublishSubject.create();
    
    // Variable para almacenar la estrategia de alerta actual (Patrón Strategy)
    private AlertaStrategy strategy;
    
    // Método para registrar un observador manual
    public void addObserver(Observador observador)
    {
        this.observadores.add(observador);
    }
    
    // Método para eliminar un observador manual
    public void removeObserver(Observador observador)
    {
        this.observadores.remove(observador);
    }
    
    // Método para notificar a todos los observadores manuales registrados
    public void notifyObservadores()
    {
        for(Observador observador: observadores)
        {
            // Llamamos al método update de cada observador
            observador.update(temperatura);
        }
    }
    
    // Método principal que recibe la temperatura de los sensores
    public void setTemperatura(float temperatura)
    {
        this.temperatura = temperatura;
        
        // --- 1. APLICACIÓN PATRÓN STRATEGY ---
        // Seleccionamos la estrategia adecuada según el rango de temperatura
        seleccionarStrategy(temperatura);
        // Ejecutamos la estrategia seleccionada (polimorfismo)
        strategy.ejecutarAlerta(temperatura);
        
        // --- 2. APLICACIÓN PATRÓN OBSERVER (MANUAL) ---
        // Notificamos a los módulos tradicionales (Log, Estadística, Mostrar)
        notifyObservadores();
        
        // --- 3. APLICACIÓN RXJAVA (PROGRAMACIÓN REACTIVA) ---
        // [FIX IMPORTANTE]: Verificamos si el flujo sigue activo antes de emitir.
        // Si el flujo ya tuvo un error o se completó, no podemos enviar más datos.
        if (!flujoTemperaturas.hasThrowable() && !flujoTemperaturas.hasComplete()) {
            
            // Si la temperatura es -1, es un error crítico
            if (temperatura == -1)
            {
                // Emitimos un evento onError. Esto terminará el flujo RxJava para el suscriptor.
                flujoTemperaturas.onError(new RuntimeException("Lectura Invalida"));
                return; // Salimos del método para no enviar onNext
            }

            // Si es un dato válido, lo emitimos al flujo reactivo
            flujoTemperaturas.onNext(temperatura);
        }
    }
    
    // Método para exponer el Subject como un Observable (encapsulamiento)
    public Observable<Float> getFlujoTemperatura()
    {
        return flujoTemperaturas;
    }
    
    // Método privado para la lógica de selección de estrategia
    private void seleccionarStrategy(float temp)
    {
        if(temp < 50)
        {
            // Rango bajo: Solo consola
            strategy = new AlertaConsola();
        } else if(temp < 80)
        {
            // Rango medio: Guardar en archivo
            strategy = new AlertaArchivo();
        } else
        {
            // Rango crítico: Alerta UI
            strategy = new AlertaUI();
        }
    }
}