package examen.modelo;

/**
 *
 * @author Grupo 01
 */
import javax.swing.*;
import java.awt.*;

//  3er Producto: Pregunta para completar

//  Logica y componentes visuales diferentes a los anteriores
public class PreguntaCompletar4 implements Pregunta1
{

    // Atributos de la pregunta para completar
    private String texto;
    private String respuestaCorrecta;

    // Guardamos una referencia del txt para leer la
    // rpta del usuario despues
    private JTextField campoRespuesta;

    public PreguntaCompletar4(String texto, String respuestaCorrecta)
    {
        this.texto = texto;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    //  @Override: Anotacion que ayuda a ver si un metodo
    //             sobreescribe a una clase padre
    
    @Override
    public String getTextoPregunta()
    {
        return texto;
    }

    @Override
    public boolean esRespuestaCorrecta(String respuestaUsuario)
    {
        // Precauciones a tomar en cuenta al grabar el txt del usuario
        
        // - trim() quita los espacios en blanco al inicio y al final
        // - equalsIgnoreCase() ignora mayusc/minusc
        return respuestaCorrecta.equalsIgnoreCase(respuestaUsuario.trim());
    }

    @Override
    public String getRespuestaDelUsuario()
    {
        // Lee el txt que el usuario escribio en el JTextField.
        return campoRespuesta.getText();
    }

    @Override
    public JPanel getPanelVista()
    {
        // Crea un panel con caja de txt para la rpta
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        campoRespuesta = new JTextField(15); // Campo de txt de 15 columnas de ancho
        panel.add(campoRespuesta);
        return panel;
    }
}
