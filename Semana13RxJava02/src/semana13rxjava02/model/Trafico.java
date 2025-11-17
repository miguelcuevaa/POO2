/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana13rxjava02.model;

import java.time.Instant;
import java.util.Objects;

/**
 *
 * @author C2A504
 */
public class Trafico {
    //Clase inmutable que representa una lectura de tráfico vehicular en
    //una vía. Cada instancia contiene:
    //velocidad promedio (km/h), flujo vehicular (vehículos por hora), nivel
    //de ocupación (0 a 1) y una marca de tiempo (timestamp)
    private final String via; //nombre de la vía monitoreada
    private final float velocidad; //velocidad promedio
    private final int flujo; //vehículos por hora
    private final float ocupacion; //ocupación de la vía (0 a 1)
    private final Instant ts;

    public Trafico(String via, float velocidad, int flujo, float ocupacion,
            Instant ts) {
        this.via = via;
        this.velocidad = velocidad;
        this.flujo = flujo;
        this.ocupacion = ocupacion;
        this.ts = ts;
    }

    public String getVia() {
        return via;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public int getFlujo() {
        return flujo;
    }

    public float getOcupacion() {
        return ocupacion;
    }

    public Instant getTs() {
        return ts;
    }
    
    //Determinamos un nivel para la medición, según la velocidad promedio
    //A-B fluido
    //C-D moderado
    //E-F congestionado
    
    public String nivelServicio(){
        if(velocidad >= 45) return "A-B fluido";
        if(velocidad >= 25) return "C-D moderado";
        return "E-F congestionado";
    }
    
    @Override
    public String toString(){
        return String.format("Trafico{via='%s', vel=%.1f km/h, flujo=%d veh/h, "
                + "ocup=%.2f, ts=%s, LoS=%s}", via,velocidad,flujo,ocupacion,
                ts,nivelServicio());
    }
    
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Trafico)) return false;
        Trafico t = (Trafico)o;
        return Float.compare(t.velocidad, velocidad) == 0 &&
                flujo == t.flujo &&
                Float.compare(t.ocupacion, ocupacion) == 0 &&
                Objects.equals(via,t.via) &&
                Objects.equals(ts,t.ts);
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(via,velocidad,flujo,ocupacion,ts);
    }
}
