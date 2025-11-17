/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana13rxjava01;

import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.TimeUnit;

public class UsuarioObservable {
    //atributo lista de nombres de usuario
    private static final String[] NOMBRES = {"Usuario1",
            "Usuario 2",
            "Usuario 3",
            "Usuario 4",
            "Usuario 5",
            "Usuario 6",
            "Usuario 7"};
    
    //método que permite observar los cambios
    public static Observable<Usuario> getUsuarios(){
        return Observable.interval(5, TimeUnit.SECONDS)
                .map(t->{
                    String nombre = NOMBRES[(int)(Math.random()*NOMBRES.length)];
                    int id = (int)(Math.random()*NOMBRES.length); //id entre 0 y 6
                    String rol = "user"; //valor por defecto del rol
                    boolean conectado = Math.random()>0.3; //70% probabilidad de
                                                    //estar conectado
                    return new Usuario(nombre,id,rol,conectado);
                });
    }
    
}
