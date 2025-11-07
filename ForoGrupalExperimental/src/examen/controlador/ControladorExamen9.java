package examen.controlador;

/**
 *
 * @author Grupo 01
 */
import examen.modelo.Examen7;
import examen.vista.VistaExamen8;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;
import examen.modelo.Pregunta1;

//  El Controlador: El intermediario que conecta el Modelo y la Vista
public class ControladorExamen9
{

    private Examen7 modelo;
    private VistaExamen8 vista;

    public ControladorExamen9(Examen7 modelo, VistaExamen8 vista)
    {
        this.modelo = modelo;
        this.vista = vista;

        // La conexion clave
        // El Controlador le dice a la Vista: "Voy a poner un 'espia' (Listener)
        // en tu boton 'Siguiente'. Avisale cuando alguien haga clic"
        this.vista.addSiguienteListener(new SiguienteListener());
    }

    /**
     * Este metodo inicia la aplicacion
     * Muestra la primera pregunta y hace visible la ventana
     */
    public void iniciar()
    {
        // SwingUtilities.invokeLater es una buena practica para asegurar que
        // la interfaz grafica se inicie de forma segura
        SwingUtilities.invokeLater(() ->
        {
            mostrarSiguientePregunta();
            vista.setVisible(true);
        });
    }

    /**
     * Logica central para mostrar la pregunta actual o el resultado final
     */
    private void mostrarSiguientePregunta()
    {
        if (!modelo.haTerminado())
        {
            vista.actualizarProgreso(modelo.getProgreso());
            Pregunta1 preguntaActual = modelo.getPreguntaActual();
            vista.mostrarPregunta(preguntaActual);
        } else
        {
            vista.mostrarResultadoFinal(modelo.getNotaFinal());
        }
    }

    //  Esta clase interna es el "espia" o Listener
    //  Su unico trabajo es esperar el clic del boton
    class SiguienteListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            // Este codigo solo se ejecuta CUANDO el usuario hace clic en "Siguiente"

            // 1. El Controlador le pide a la pregunta actual
            //    la respuesta que el usuario ingreso
            Pregunta1 preguntaActual = modelo.getPreguntaActual();
            String respuestaUsuario = preguntaActual.getRespuestaDelUsuario();

            // 2. El Controlador le pasa la respuesta al Modelo para que la procese
            //    y actualice el puntaje
            modelo.responder(respuestaUsuario);

            // 3. El Controlador le pide a la Vista que se actualice para mostrar
            //    la siguiente pregunta o el resultado final
            mostrarSiguientePregunta();
        }
    }
}