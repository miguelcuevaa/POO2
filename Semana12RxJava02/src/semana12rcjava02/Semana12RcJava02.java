/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana12rcjava02;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

/**
 *
 * @author C2A504
 */
public class Semana12RcJava02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClimaObservable.getClima().subscribe(new Observer<Clima>(){
            @Override
            public void onSubscribe(Disposable d) {
                System.out.println("Suscrito a las actualizaciones del sensor clima.");
            }

            @Override
            public void onNext(Clima clima) {
                System.out.println("Nuevo actualización del clima: "+clima);
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("Error en el sensor...");
            }

            @Override
            public void onComplete() {
                System.out.println("Reporte completado, no hay más actualizaciones...");
            }
        }
        ); //fin del monitoreo correspondiente al primer sensor
        
        ClimaObservable.getClimaExtremo().subscribe(new Observer<Clima>() {
            @Override
            public void onSubscribe(Disposable d) {
                System.out.println("Suscrito a las actualizaciones del sensor CLIMA EXTREMO");
            }

            @Override
            public void onNext(Clima clima) {
                System.out.println("Nueva actualización del sensor CLIMA EXTREMO: "+clima);
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("Error en el sensor de clima extremo!!");
            }

            @Override
            public void onComplete() {
                System.out.println("No hay más actualizaciones del sensor CLIMA EXTREMO");
            }
        }); //fin del monitoreo correspondiente al segundo sensor
        
        try{
            Thread.sleep(Long.MAX_VALUE); //duración / vigencia del hilo
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
