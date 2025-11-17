/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana12rcjava02;

/**
 *
 * @author C2A504
 */
public class Clima {//simula el sensor de clima
    private final float temperatura;
    private final float humedad;
    private final float presion;

    public Clima(float temperatura, float humedad, float presion) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.presion = presion;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public float getHumedad() {
        return humedad;
    }

    public float getPresion() {
        return presion;
    }

    @Override
    public String toString() {
        return "Clima{" + "temperatura=" + temperatura + 
                ", humedad=" + humedad + ", presion=" + presion + '}';
    }
    
    
}
