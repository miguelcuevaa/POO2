package semana02patronfactory;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC-DOCENTE-C2A503
 */
public class Enemigo {
    private int codigoEnemigo;
    private String nombreEnemigo;
    private int fuerzaEnemigo;

    public int getCodigoEnemigo() {
        return codigoEnemigo;
    }

    public void setCodigoEnemigo(int codigoEnemigo) {
        this.codigoEnemigo = codigoEnemigo;
    }

    public String getNombreEnemigo() {
        return nombreEnemigo;
    }

    public void setNombreEnemigo(String nombreEnemigo) {
        this.nombreEnemigo = nombreEnemigo;
    }

    public int getFuerzaEnemigo() {
        return fuerzaEnemigo;
    }

    public void setFuerzaEnemigo(int fuerzaEnemigo) {
        this.fuerzaEnemigo = fuerzaEnemigo;
    }
    
    public void mostrarEnemigo(){
        System.out.println("Se ha generado un enemigo "+this.nombreEnemigo);
        System.out.println("Su fuerza es de "+this.fuerzaEnemigo);
    }
}
