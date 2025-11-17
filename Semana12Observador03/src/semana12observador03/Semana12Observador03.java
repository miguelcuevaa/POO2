/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana12observador03;

/**
 *
 * @author PC-DOCENTE-C2A503
 */
public class Semana12Observador03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creamos una instancia del archivo que será monitoreado
        ArchivoMonitoreado archivo = new ArchivoMonitoreado("datos.txt");
        
        //agregamos los observadores:
        //observador tipo consola
        new Consola(archivo);
        //observador tipo archivo backup
        new Backup(archivo);
        
        try{
            archivo.iniciarMonitoreo();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
