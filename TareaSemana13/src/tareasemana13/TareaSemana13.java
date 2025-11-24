package tareasemana13;

import io.reactivex.rxjava3.schedulers.Schedulers;


public class TareaSemana13
{
   public static void main(String[] args)
   {

    TemperaturaCentral central = new TemperaturaCentral();


    central.addObserver(new ObserverMostrar());
    central.addObserver(new ObserverLog());
    central.addObserver(new ObserverEstadistica());

    central.getFlujoTemperatura()
            .subscribeOn(Schedulers.computation())
            .observeOn(Schedulers.io())
            .filter(temp -> temp >= 0)
            .map(temp -> temp * 1.0f)
            .flatMap(temp -> io.reactivex.rxjava3.core.Observable.just(temp))
            .subscribe(
                    temp -> {
                        System.out.println("Procesando temperatura: " + temp);
                    },
                    error -> {
                        System.out.println("ERROR recibido: " + error.getMessage());
                    },
                    () -> {
                        System.out.println("Flujo completado.");
                    }
            );


    Sensor s1 = new Sensor("Sensor A", central);
    Sensor s2 = new Sensor("Sensor B", central);
    Sensor s3 = new Sensor("Sensor C", central);

    s1.start();
    s2.start();
    s3.start();

    try
    {
        Thread.sleep(10000);
    } catch (Exception e)
    {
        e.printStackTrace();
    }
}

}
