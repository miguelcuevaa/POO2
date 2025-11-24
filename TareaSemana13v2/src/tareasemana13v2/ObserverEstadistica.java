package tareasemana13v2;

// Observador concreto que realiza cálculos matemáticos sobre los datos recibidos
public class ObserverEstadistica implements Observador
{
    // Variables de estado para mantener el histórico de máximos y mínimos
    // Se inicializan con valores opuestos para asegurar que la primera lectura los actualice.
    private float maximo = -1;
    private float minimo = 99999;
    
    @Override
    public void update(float temperatura)
    {
        // Filtramos la lectura -1 porque representa un error, no un dato estadístico válido
        if(temperatura != -1){
            // Math.max compara el máximo actual con la nueva temperatura y se queda con el mayor
            maximo = Math.max(maximo, temperatura);
            // Math.min hace lo mismo para el valor menor
            minimo = Math.min(minimo, temperatura);
        }
        // Imprimimos el reporte estadístico actualizado
        System.out.println("[Estadistica) Minimo =" + minimo + " max=" + maximo);
    }
}