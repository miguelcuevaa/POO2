package semana06ejemplo01_adapter;

public class Semana06Ejemplo01_Adapter
{

    public static void main(String[] args)
    {
        //Cliente conectando un lector SD a un puerto USB 
        //a través del adaptador
        USB dispositivo = new AdaptadorSDaUSB(new LectorTarjetasSD());
        dispositivo.conectarConUSB(); //se traduce la conexión de SD a USB
    }
    
}
