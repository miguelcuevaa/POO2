/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana12rxjava01;

import io.reactivex.rxjava3.core.Observable;

/**
 *
 * @author C2A504
 */
public class Semana12RxJava01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Observable<Usuario> usuariosObservable = Observable.just(
            new Usuario("José"),
            new Usuario("Luis",25),
            new Usuario("Carla",40),
            new Usuario("Miguel"),
            new Usuario("Javier",10),
            new Usuario("Pedro",56),
            new Usuario("Gonzalo")
        );
        usuariosObservable.subscribe(usuario->{
            System.out.println("Nombre del usuario"+usuario.getNombre()+" "+
                    usuario.mayorEdad());
            pausa(2000);
        });
        
    }

    private static void pausa(int t) {
        try{
            Thread.sleep(t);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
