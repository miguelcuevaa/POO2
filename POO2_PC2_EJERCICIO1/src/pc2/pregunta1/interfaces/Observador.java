package pc2.pregunta1.interfaces;

/**
 *
 * @author Miguel Angel Cueva Añanca
 */

/**
 * Aplicamos el patron Observer con el cual definiremos el contrato para todos
 * los modulos que necesitan ser notificados.
 * Usamos la implementacion tradicional que se aprendio en clase
 */

public interface Observador
{
    /**
     * Este es el metodo que el Sujeto llamara cuando ocurra algun evento
     *
     * El parametro "mensaje" es el mensaje de notificacion
     */
    void actualizar(String mensaje);
}
