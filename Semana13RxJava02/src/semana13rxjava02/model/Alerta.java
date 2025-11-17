/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana13rxjava02.model;

import java.time.Instant;

/**
 *
 * @author C2A504
 */
public class Alerta {
    //Representa una alerta programada cuando
    //se detectan condiciones de congestión vehicular
    
    private final String via; //vía donde ocurre la alerta
    private final String tipo; //tipo de evento
    private final String nivel; //severidad
    private final Instant ts; //momento de la alerta
    private final String detalle; //texto informativo de la alerta

    public Alerta(String via, String tipo, String nivel, Instant ts, String detalle) {
        this.via = via;
        this.tipo = tipo;
        this.nivel = nivel;
        this.ts = ts;
        this.detalle = detalle;
    }
    
    @Override
    public String toString(){
        return String.format("[ALERTA %s] %s @ %s [%s] -> %s", 
                nivel,tipo,via,ts,detalle);
    }
}
