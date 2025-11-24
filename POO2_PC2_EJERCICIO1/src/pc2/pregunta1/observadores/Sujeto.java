package pc2.pregunta1.observadores;

import java.util.ArrayList;
import java.util.List;
import pc2.pregunta1.interfaces.Observador;

/**
 *
 * @author Miguel Angel Cueva Añanca
 */

/**
 * Esta es la clase abstracta Sujeto para los observadores. Esto
 * mantendra la lista de observadores y se encarga de notificarlos
 */

public abstract class Sujeto
{
    //  Lista de observadores suscritos
    private List<Observador> observadores = new ArrayList<>();

    /**
     * Permitira que un nuevo observador se suscriba
     * El parametro "obs" sera el observador a agregar
     */
    public void agregar(Observador obs)
    {
        observadores.add(obs);
    }

    /**
     * Permitera que un observador se desuscriba
     * Aca el parametro "obs" sera el observador a eliminar
     */
    public void eliminar(Observador obs)
    {
        observadores.remove(obs);
    }

    /**
     * Recorre la lista de observadores y les envia el mensaje
     * Aca el parametro "mensaje" sera el mensaje a notificar
     */
    public void notificar(String mensaje)
    {
        for (Observador obs : observadores)
        {
            obs.actualizar(mensaje);
        }
    }
}
