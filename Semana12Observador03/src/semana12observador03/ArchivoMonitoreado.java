/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana12observador03;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC-DOCENTE-C2A503
 */
public class ArchivoMonitoreado {
    private Path ruta; //ubicación del archivo
    private String contenidoAnterior = ""; //contenido que se respaldará del archivo
    private List<ObservadorArchivo> observadores = new ArrayList<>();
    
    public ArchivoMonitoreado(String ruta){
        this.ruta = Paths.get(ruta); //convierte una ruta String a una ruta tipo Path
    }
    
    public void agregar(ObservadorArchivo observador){
        this.observadores.add(observador);
    }
    
    public void iniciarMonitoreo() throws IOException, InterruptedException{
        System.out.println("Iniciando monitoreo...");
        while(true){
            if(Files.exists(ruta)){
                String contenidoActual = Files.readString(ruta);
                if(!contenidoActual.equals(contenidoAnterior)){
                    System.out.println("Se ha detectado un cambio en el archivo");
                    notificar(contenidoActual);
                    this.contenidoAnterior = contenidoActual;
                }
            }
            Thread.sleep(3000); //se hace una pausa de 3 segundos entre cada
                                //revisión de cambios
        }
    }

    private void notificar(String nuevoContenido) {
        //recorre la lista de observadores y ejecuta el método notificar en cada uno
        for(ObservadorArchivo obs : observadores){
            obs.actualizar(nuevoContenido);
        }
    }
}
