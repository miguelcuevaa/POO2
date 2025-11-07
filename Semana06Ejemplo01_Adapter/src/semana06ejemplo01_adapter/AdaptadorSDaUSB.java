package semana06ejemplo01_adapter;

//Clase Adaptador
//Esta clase implementa la interfaz USB (requerida por el cliente)
//Internamente traduce las llamadas USB a llamadas compatibles con la clase
//LectorSD
public class AdaptadorSDaUSB implements USB
{
    private LectorTarjetasSD lector; //referencia al objeto incompatible
    
    //constructor que recibe el objeto a adaptar
    public AdaptadorSDaUSB(LectorTarjetasSD lector)
    {
        this.lector = lector;
    }
    
    @Override
    public void conectarConUSB()
    {
        //El cliente logra conectar por USB
        //realmente el adaptador es que lo hace utilizando el método conectarSD de
        //su atributo lector
        System.out.println("Adaptador: convirtiendo SD a USB...");
        lector.conectarConSD();
    }
    
}
