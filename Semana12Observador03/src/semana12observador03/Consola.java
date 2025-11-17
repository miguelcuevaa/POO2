/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana12observador03;

/**
 *
 * @author PC-DOCENTE-C2A503
 */
public class Consola extends ObservadorArchivo{
    public Consola(ArchivoMonitoreado archivo){ //constructor de la clase hija
        super(archivo);//método constructor que viene de la clase padre
    }

    @Override
    public void actualizar(String nuevoContenido) {
        //implementación para consola del método abstracto actualizar
        System.out.println("[CONSOLA]: Nuevo contenido actualizado...");
        System.out.println(nuevoContenido);
    }
}
