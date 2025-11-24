package tareasemana13;

public class ObserverMostrar implements Observador
{
    @Override
    public void update(float temperatura)
    {
        System.out.println("[Mostrar] Nueva temperatura detectada ");
    }
}
