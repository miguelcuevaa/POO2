/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana08repository;

/**
 *
 * @author luisromerou
 */
public class Usuario {
    private String id;
    private String nombre;

    public Usuario(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.id + "," + this.nombre;
    }
    
    static public Usuario fromString(String data){
        //creamos el método como static para generar una única instancia
        
        //si se lee la línea "1,Karen"
        //en este caso, split genera un arreglo de 2 componentes,
        //que se genera con la separación de la cadena data a partir
        //de la ","
        //partes[0]=>"1", partes[1]=>"Karen"
        String[] partes = data.split(",");
        return new Usuario(partes[0],partes[1]);
    }
}
