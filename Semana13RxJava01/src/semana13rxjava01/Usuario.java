/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana13rxjava01;

/**
 *
 * @author PC-DOCENTE-C2A503
 */
public class Usuario {
    private final String nombreUsuario;
    private final int id;
    private final String rol;
    private final boolean conectado;
    
    public Usuario(String nombreUsuario, int id, String rol, boolean conectado){
        this.nombreUsuario = nombreUsuario;
        this.id = id;
        this.rol = rol;
        this.conectado = conectado;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public int getId() {
        return id;
    }

    public String getRol() {
        return rol;
    }

    public boolean isConectado() {
        return conectado;
    }

    @Override //toString es un método que convierte la información de un objeto en una
                //cadena de texto. System.out.println(usuario.toString())
    public String toString() {
        return "Usuario{" + "nombreUsuario=" + nombreUsuario + ", id=" + id + 
                ", rol=" + rol + ", conectado=" + conectado + '}';
    }
    
    
    
}
