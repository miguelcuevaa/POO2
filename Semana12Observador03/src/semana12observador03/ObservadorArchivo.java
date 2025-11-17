/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana12observador03;

/**
 *
 * @author PC-DOCENTE-C2A503
 */
public abstract class ObservadorArchivo {
    private ArchivoMonitoreado archivo; //atributo de la clase
    
    public ObservadorArchivo(ArchivoMonitoreado archivo){
        this.archivo = archivo;
        archivo.agregar(this); //agrega a la lista de observadores del archivo
                                //a esta clase
    }
    
    public ArchivoMonitoreado getAarchivo(){
        return archivo;
    }
    
    public abstract void actualizar(String nuevoContenido);
}
