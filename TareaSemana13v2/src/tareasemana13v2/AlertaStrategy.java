package tareasemana13v2;

// Definición de la interfaz para el Patrón Strategy
public interface AlertaStrategy
{
    // Método abstracto que define el contrato para todas las estrategias de alerta.
    // Recibe la temperatura como parámetro para procesarla según la implementación.
    void ejecutarAlerta(float temperatura);
}