package tareasemana13v2;

// Observador concreto que simplemente muestra una notificación en pantalla
public class ObserverMostrar implements Observador
{
    // Implementación del método update requerido por la interfaz Observador
    @Override
    public void update(float temperatura)
    {
        // Imprime un aviso genérico indicando que se detectó un cambio
        System.out.println("[Mostrar] Nueva temperatura detectada ");
    }
}