/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana13rxjava02;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import semana13rxjava02.model.Trafico;
import semana13rxjava02.observable.TraficoObservable;

/**
 *
 * @author C2A504
 */
public class Semana13RxJava02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        //contenedor de todas las suscripciones activas
        CompositeDisposable bag = new CompositeDisposable();
        
        Observable<Trafico> fuente = Observable.merge( //creamos una fuente combinada
                    TraficoObservable.normal(),
                    TraficoObservable.picos()
                )
                .subscribeOn(Schedulers.computation()) //procesamiento por hilos
                .observeOn(Schedulers.io()) //se indica que los hilos son tipo io
                .share(); //comparte las emisiones con múltiples suscriptores
        
        bag.add(
                fuente
                .take(20) //tomará 20 lecturas
                .subscribe(
                        t->System.out.println("[LECTURA] " + t),
                        e->System.err.println("Error en lecturas: "+e),
                        ()->System.out.println("Lecturas completadas")
                )
        );
        Thread.sleep(60000);
        bag.dispose(); //liberamos los observadores
        System.out.println("Simulación finalizada");
    }
    
}
