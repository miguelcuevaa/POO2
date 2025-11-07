/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana01ejercicio02;

/**
 *
 * @author C2A504
 */
public class Ciudad {
    private String nombre;
    private int aFundacion;
    private int cantidadHabitantes;
    private int cantidadContagiados;
    private float ratioContagios;

    public Ciudad(String nombre, int aFundacion, int cantidadHabitantes, 
            int cantidadContagiados) {
        this.nombre = nombre;
        this.aFundacion = aFundacion;
        this.cantidadHabitantes = cantidadHabitantes;
        this.cantidadContagiados = cantidadContagiados;
        this.ratioContagios = this.cantidadContagiados/this.cantidadHabitantes;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getaFundacion() {
        return aFundacion;
    }

    public void setaFundacion(int aFundacion) {
        this.aFundacion = aFundacion;
    }

    public int getCantidadHabitantes() {
        return cantidadHabitantes;
    }

    public void setCantidadHabitantes(int cantidadHabitantes) {
        this.cantidadHabitantes = cantidadHabitantes;
    }

    public int getCantidadContagiados() {
        return cantidadContagiados;
    }

    public void setCantidadContagiados(int cantidadContagiados) {
        this.cantidadContagiados = cantidadContagiados;
    }

    public float getRatioContagios() {
        return ratioContagios;
    }

    public void setRatioContagios(float ratioContagios) {
        this.ratioContagios = ratioContagios;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("ratio contagios: " + 
                this.ratioContagios);
    }
}
