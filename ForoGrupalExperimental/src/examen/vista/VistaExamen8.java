package examen.vista;

/**
 *
 * @author Grupo 01
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import examen.modelo.Pregunta1;

//  La Vista: El GUI
//  Muestra los componentes y la informacion
//  No contiene la logica del pograma
public class VistaExamen8 extends JFrame
{

    //  Componentes de Swing usados
    private JLabel lblProgreso;
    private JLabel lblPregunta;
    private JPanel panelOpciones; // Este panel es clave, cambiara con cada pregunta
    private JButton btnSiguiente;

    public VistaExamen8()
    {
        //  Configuracion inicial de la ventana
        setTitle("Sistema de Examen - POO II");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Para centrar la ventana en la pantalla

        //  Creacion de los componentes
        lblProgreso = new JLabel("Progreso", SwingConstants.CENTER);
        lblPregunta = new JLabel("Texto de la pregunta", SwingConstants.CENTER);
        btnSiguiente = new JButton("Siguiente");

        // Usamos un BorderLayout para organizar las secciones de la ventana
        setLayout(new BorderLayout(10, 10));

        // Añadimos los componentes a sus respectivas areas
        add(lblProgreso, BorderLayout.NORTH);
        add(lblPregunta, BorderLayout.CENTER);

        // Creamos un panel inferior para el boton, para que se vea mejor
        JPanel panelBoton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelBoton.add(btnSiguiente);
        add(panelBoton, BorderLayout.SOUTH);
    }

    /**
     * Permite que el Controlador "enganche" un listener al boton
     * La Vista no sabe que hara el boton, solo le ofrece a alguien externo
     * la posibilidad de escuchar sus clics
     */
    public void addSiguienteListener(ActionListener listener)
    {
        btnSiguiente.addActionListener(listener);
    }

    /**
     * Metodo mas importante de la Vista
     * Se encarga de actualizar la pantalla para mostrar una nueva pregunta
     *
     * @param pregunta El objeto Pregunta1 que se debe mostrar
     */
    public void mostrarPregunta(Pregunta1 pregunta)
    {
        // Actualizamos el texto de la pregunta (Usamos HTML para centrarlo)
        lblPregunta.setText("<html><div style='text-align: center;'>" + pregunta.getTextoPregunta() + "</div></html>");

        // La magia del diseño: La Vista no sabe como dibujar las opciones
        // Simplemente le pide al objeto Pregunta1 que le de su panel ya construido
        JPanel nuevoPanelOpciones = pregunta.getPanelVista();

        // --- Logica para reemplazar el panel de opciones anterior por el nuevo ---
        BorderLayout layout = (BorderLayout) getContentPane().getLayout();
        // Buscamos si ya hay un panel de opciones viejo en la ventana
        Component oldPanel = layout.getLayoutComponent(BorderLayout.CENTER);

        // Limpiamos los componentes viejos antes de añadir los nuevos
        if (this.panelOpciones != null)
        {
            remove(this.panelOpciones);
        }
        remove(lblPregunta); // Tambien quitamos la etiqueta de pregunta anterior

        // Guardamos la referencia al nuevo panel
        this.panelOpciones = nuevoPanelOpciones;

        // Añadimos los componentes actualizados
        add(lblPregunta, BorderLayout.NORTH); // El texto de la pregunta va arriba
        add(this.panelOpciones, BorderLayout.CENTER); // Las opciones van en el centro

        revalidate(); // Re-calcula el layout de la ventana
        repaint();    // Vuelve a dibujar la ventana con los cambios
    }

    public void actualizarProgreso(String progreso)
    {
        lblProgreso.setText(progreso);
    }

    /**
     * Muestra el resultado final usando una ventana de dialogo emergente
     *
     * @param nota La nota final calculada por el Modelo
     */
    public void mostrarResultadoFinal(int nota)
    {
        JOptionPane.showMessageDialog(this,
                "¡Examen finalizado!\nTu nota es: " + nota + " / 20",
                "Resultado Final",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0); // Cierra la aplicacion
    }
}