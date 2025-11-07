package examen.modelo;

/**
 *
 * @author Grupo 01
 */
import javax.swing.JPanel;

//  Interfaz Pregunta es el Producto en el Patron Factory

//  Define el las reglas que toda pregunta debe cumplir
public interface Pregunta1
{
    //  devuelve el txt de la pregunta que se mostrará en pantalla
    String getTextoPregunta();

    //  valida si la rpta del usuario es correcta
    
    //  @param respuestaUsuario La respuesta que el 
    //  usuario seleccionó o escribió
    
    //  true si rpta es correcta, false si no
    boolean esRespuestaCorrecta(String respuestaUsuario);

    //  devuelve panel Swing con los componentes necesarios para responder
    JPanel getPanelVista();

 
    //  obtiene la rpta ingresado por usuario en el panel de vista
    //  retorna Un String con la rpta del usuario
    String getRespuestaDelUsuario();
}