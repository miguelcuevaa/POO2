package pc2.pregunta1.observadores;

import pc2.pregunta1.interfaces.Observador;

/**
 *
 * @author Miguel Angel Cueva Añanca
 */

/**
 * Aca tenemos al primer observador en concreto el cual es una simulacion de una
 * app del Usuario. Aca el usuario sera notificado
 */

public class AppUsuario implements Observador
{
    @Override
    public void actualizar(String mensaje)
    {
        //  Simulara la notificacinn push en la App
        System.out.println("[App Usuario] Notificacion recibida: " + mensaje);
    }
}
