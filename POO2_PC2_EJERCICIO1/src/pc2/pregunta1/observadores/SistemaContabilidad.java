package pc2.pregunta1.observadores;

import pc2.pregunta1.interfaces.Observador;

/**
 *
 * @author Miguel Angel Cueva Añanca
 */

/**
 * Aca tendremos al segundo observador el cual sera el "sistema de contabilidad"
 * Aca el sistema sera el notificado
 */

public class SistemaContabilidad implements Observador
{
    @Override
    public void actualizar(String mensaje)
    {
        //  Simulara el registro en el sistema contable
        System.out.println("[Contabilidad] Registrando nuevo asiento: " + mensaje);
    }
}
