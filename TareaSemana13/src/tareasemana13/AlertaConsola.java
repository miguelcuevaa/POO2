package tareasemana13;

public class AlertaConsola implements AlertaStrategy
{

    @Override
    public void ejecutarAlerta(float temperatura)
    {
        System.out.println("[Consola] Temperatura es "+ temperatura);
    }
}
