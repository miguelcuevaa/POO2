/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana13rxjava01;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

public class Semana13RxJava01 {

    public static void main(String[] args) {
        //Seguimiento de usuarios activos en un sistema
        UsuarioObservable.getUsuarios().subscribe(new Observer<Usuario>() {
            @Override
            public void onSubscribe(Disposable d) {
                System.out.println("Observador 1: Seguimiento de usuarios activo!");
            }

            @Override
            public void onNext(Usuario usuario) {
                if(usuario.isConectado()){
                    System.out.println("[Conectado]" + usuario.getNombreUsuario());
                }
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("Error en el flujo de datos...");
            }

            @Override
            public void onComplete() {
                System.out.println("Fin del monitoreo del observador 1");
            }
        }); //fin del monitoreo de observador 1
        
        UsuarioObservable.getUsuarios().subscribe(new Observer<Usuario>(){
            @Override
            public void onSubscribe(Disposable d) {
                System.out.println("Observador 2: Seguimiento de cuentas!");
            }

            @Override
            public void onNext(Usuario usuario) {
                System.out.println("Usuario monitoreado: "+usuario.toString());
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("Error en el flujo de datos...");
            }

            @Override
            public void onComplete() {
                System.out.println("Fin del monitoreo del observador 2");
            }
        
        });//fin de monitoreo de observador 2
        
        try{
            Thread.sleep(Long.MAX_VALUE);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
