package semana06ejemplo01_adapter;

//1. Interfaz requerida por el cliente
//es aquello que todos los demás dispositivos deben cumplir
//el problema a resolver es que interactúe con los elementos/
//dispositivos que no son USB
public interface USB
{
    void conectarConUSB();
}
