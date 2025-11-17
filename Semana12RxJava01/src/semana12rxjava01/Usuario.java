package semana12rxjava01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author C2A504
 */
public class Usuario {
    private final String nombre; //los atributos no cambiarán
    private final  int edad; //son valores que permanecerán inmutables

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.edad = -1;
    }

    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    //no aplica setters, porque los atributos no se modificarán
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    
    public String mayorEdad(){
        if(this.edad>=18) return "Tiene " + this.edad + "años. Es mayor"
                + "de edad";
        else return "NO es mayor de edad";
    }
    
    
    
}
