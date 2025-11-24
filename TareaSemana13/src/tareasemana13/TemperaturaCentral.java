package tareasemana13;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.List;


public class TemperaturaCentral
{
    private List<Observador> observadores = new ArrayList<>();
    private float temperatura;
    
    private PublishSubject<Float> flujoTemperaturas = PublishSubject.create();
    
    private AlertaStrategy strategy;
    
    public void addObserver(Observador observador)
    {
        this.observadores.add(observador);
    }
    
    public void removeObserver(Observador observador)
    {
        this.observadores.remove(observador);
    }
    
    public void notifyObservadores()
    {
        for(Observador observador: observadores)
        {
            observador.update(temperatura);
        }
    }
    
    public void setTemperatura(float temperatura)
    {
        this.temperatura = temperatura;
        
        seleccionarStrategy(temperatura);
        strategy.ejecutarAlerta(temperatura);
        
        notifyObservadores();
        
        
        if (temperatura == -1)
        {

        flujoTemperaturas.onError(new RuntimeException("Lectura Invalida"));

        return;
        }

        flujoTemperaturas.onNext(temperatura);

    }
    
    public Observable<Float> getFlujoTemperatura()
    {
        return flujoTemperaturas;
    }
    
    private void seleccionarStrategy(float temp)
    {
        if(temp<50)
        {
            strategy = new AlertaConsola();
        }else if(temp<80)
        {
            strategy = new AlertaArchivo();
        }else
        {
            strategy = new AlertaUI();
        }
    }
}
