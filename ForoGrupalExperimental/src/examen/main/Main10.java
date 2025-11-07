package examen.main;

/**
 *
 * @author Grupo 01
 */
import examen.controlador.ControladorExamen9;
import examen.modelo.Examen7;
import examen.vista.VistaExamen8;

//  Clase principal que inicia la aplicacion
//  Ejecuta todo del MVC y el Factory
public class Main10
{

    public static void main(String[] args)
    {
        // 1. Crear el Modelo: contiene toda la logica y los datos
        Examen7 modelo = new Examen7();

        // 2. Crear la Vista: la ventana que vera el usuario
        VistaExamen8 vista = new VistaExamen8();

        // 3. Crear el Controlador: conecta el Modelo y la Vista
        ControladorExamen9 controlador = new ControladorExamen9(modelo, vista);

        // 4. Iniciar la aplicacion
        controlador.iniciar();
    }
}