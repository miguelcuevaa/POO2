package tareasemana13v2;

// Implementación concreta de estrategia: Simulación de Interfaz Gráfica (UI)
public class AlertaUI implements AlertaStrategy
{
    @Override
    public void ejecutarAlerta(float temperatura)
    {
        // Simulamos un mensaje visual crítico para el usuario final
        System.out.println("UI Mostrando alerta visual: " + temperatura);
    }
}