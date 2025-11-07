package examen.modelo;

/**
 *
 * @author Grupo 01
 */
import javax.swing.*;
import java.awt.*;
import java.util.Collections;
import java.util.List;

//  1er Producto: Pregunta de opcion multiple
//  IMPLEMENTA la interfaz Pregunta

//  Esta obligada a proporcionar el codigo
//  para todos los metodos que definimos Pregunta1

public class PreguntaMarcar2 implements Pregunta1
{
    //  Atributos de la pregunta opcion multiple
    private String texto;
    private List<String> opciones;
    private String respuestaCorrecta;

    // Componente Swing que asegura que solo un RadioButton
    // pueda ser seleccionado a la vez
    private ButtonGroup grupoOpciones;

    public PreguntaMarcar2(String texto, List<String> opciones, String respuestaCorrecta)
    {
        this.texto = texto;
        this.opciones = opciones;
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
        // Comparamos la rpta del usuario con la rpta correcta
        // almacenada. Ignora mayusc y minusc
        return respuestaCorrecta.equalsIgnoreCase(respuestaUsuario);
    }

    @Override
    public String getRespuestaDelUsuario()
    {
        // Este método es clave para el Controlador.
        // Recorre todos los botones de opcion que creamos para ver cual
        // de ellos esta seleccionado y devolver su texto
        for (AbstractButton button : Collections.list(grupoOpciones.getElements()))
        {
            if (button.isSelected())
            {
                return button.getText();
            }
        }
        return ""; // Retonar un string vacio si el usuario no selecciono nada
    }

    @Override
    public JPanel getPanelVista()
    {
        // Metodo que construye y devuelve la "parte visual" de la pregunta
        JPanel panel = new JPanel(new GridLayout(0, 1)); // Layout vertical para las opciones
        grupoOpciones = new ButtonGroup();

        // Extra:
        // Las opciones se alternan para variar el orden de las opciones
        Collections.shuffle(opciones);

        for (String opcion : opciones)
        {
            JRadioButton botonOpcion = new JRadioButton(opcion);
            grupoOpciones.add(botonOpcion); // se añade al grupo
            panel.add(botonOpcion);         // se añade al panel visual
        }
        return panel;
    }
}
