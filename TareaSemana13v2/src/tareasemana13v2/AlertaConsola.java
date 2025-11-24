package tareasemana13v2;

// Implementación concreta de una estrategia de alerta (Strategy Pattern)
public class AlertaConsola implements AlertaStrategy
{
    // Sobrescribimos el método definido en la interfaz
    @Override
    public void ejecutarAlerta(float temperatura)
    {
        // Lógica simple: Imprimir el mensaje en la consola estándar (System.out)
        System.out.println("[Consola] Temperatura es "+ temperatura);
    }
}