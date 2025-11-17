/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana12rcjava02;

import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author C2A504
 */
public class ClimaObservable {
    public static Observable<Clima> getClima(){
        return Observable.interval(3, TimeUnit.SECONDS).
                map(c->new Clima((float)Math.random()*30,
                            (float)Math.random()*100,
                            (float)Math.random()*1000));
    }
    //creamos un nuevo sensor
    public static Observable<Clima> getClimaExtremo(){
        return Observable.intervalRange(0,10,2,2,TimeUnit.SECONDS).
                map(c->new Clima((float)Math.random()*10,
                            (float)Math.random()*50,
                            (float)Math.random()*500));
    }
    //intervalRange(0,10,2,2,TimeUnit.SECONDS)
    //genera 10 emisiones después de 2 segundos con una frecuencia
    //de 2 segundos, iniciando desde el segundo 0
}
