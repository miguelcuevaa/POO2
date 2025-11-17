/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana13rxjava02.observable;

import io.reactivex.rxjava3.core.Observable;
import java.time.Instant;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import semana13rxjava02.model.Trafico;

/**
 *
 * @author C2A504
 */
public class TraficoObservable {
    //Clase generadora de flujos RxJava que simulan la lectura
    //de sensores de tráfico en tiempo real. Se usan dos
    //fuentes:
    //1. tráfico normal
    //2. tráfico con picos o incidentes
    
    public static final String[] VIAS = {
      "Panamericana Norte","Av. Universitaria","Av. La Fontana",
        "Av. Javier Prado","Av. Circunvalación"
    };
    
    //Genera lecturas periódicas cada 2 segundos con valores promedio
    public static Observable<Trafico> normal(){
        return Observable.interval(0,2, TimeUnit.SECONDS)
                .map(tick->{
                    String via = VIAS[(int)(tick%VIAS.length)];
                    float velocidad = ruido(38,8,10,70);
                    int flujo = (int)ruido(1200,300,300,3500);
                    float ocupacion = clamp(ruido(0.45f,0.15f,0.05f,0.95f),0,1);
                    return new Trafico(via,velocidad,flujo,ocupacion,Instant.now());
                });
    }
    
    //Genera lecturas periódicas cada 5 segundos con valores promedio
    //simulando incidentes o picos de tráfico. La velocidad se ve afectada y la 
    //ocupación aumenta
    public static Observable<Trafico> picos(){
        return Observable.interval(3,5, TimeUnit.SECONDS)
                .map(tick->{
                    String via = VIAS[(int)(tick%VIAS.length)];
                    float velocidad = ruido(18,7,3,35);
                    int flujo = (int)ruido(1600,500,400,4200);
                    float ocupacion = clamp(ruido(0.80f,0.12f,0.40f,0.99f),0,1);
                    return new Trafico(via,velocidad,flujo,ocupacion,Instant.now());
                });
    }

    private static float ruido(float base, float amp, float min, float max) {
        float valor = (float)(base + ThreadLocalRandom.current().nextGaussian()*amp);
        return Math.max(min, Math.min(max, valor));
    }

    private static float clamp(float val, float min, float max) {
        return Math.max(min, Math.min(max,val));
    }
    
}
