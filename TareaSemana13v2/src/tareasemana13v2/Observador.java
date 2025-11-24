package tareasemana13v2;

// Definición de la interfaz para el Patrón Observer (Implementación Manual/Tradicional)
public interface Observador
{
    // Método que será invocado por el Sujeto cuando ocurra un cambio.
    // Recibe el nuevo valor de temperatura para que el observador reaccione.
    void update(float temperatura);
}