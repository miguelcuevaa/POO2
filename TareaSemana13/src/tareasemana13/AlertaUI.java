package tareasemana13;

public class AlertaUI implements AlertaStrategy
{
    @Override
    public void ejecutarAlerta(float temperatura)
    {
        System.out.println("UI Mostrando alerta visual: " + temperatura);
    }
}
