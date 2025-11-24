package tareasemana13;

public class ObserverEstadistica implements Observador
{
    private float maximo = -1;
    private float minimo = 99999;
    
    @Override
    public void update(float temperatura)
    {
          if(temperatura != -1){
            maximo = Math.max(maximo, temperatura);
            minimo = Math.min(minimo, temperatura);
        }
        System.out.println("[Estadistica) Minimo =" + minimo + " max=" + maximo);
    }
}
