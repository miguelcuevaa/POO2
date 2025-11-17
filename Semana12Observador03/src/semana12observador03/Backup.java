/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana12observador03;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author PC-DOCENTE-C2A503
 */
public class Backup extends ObservadorArchivo{
    private Path rutaBackup = Paths.get("backup.txt");
    
    public Backup(ArchivoMonitoreado archivo){
        super(archivo);
    }
    
    @Override
    public void actualizar(String nuevoContenido) {
        //el contenido se almacena en el archivo backup
        try{
            //escribimos en el archivo contenido en rutaBackup el nuevoContenido
            Files.writeString(rutaBackup,nuevoContenido);
        }catch(IOException e){
            System.out.println("Error al escribir el archivo backup: "
            +e.getMessage());
        }
    }
    
    
}
