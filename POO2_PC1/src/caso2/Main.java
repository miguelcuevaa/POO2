package caso2;

import javax.swing.SwingUtilities; //   import de swing para la UI

/**
 *
 * @author Miguel Angel Cueva Añanca
 */

//  Ejecicion de la aplicacion
public class Main
{
    public static void main(String[] args)
    {
        // --- Metodo seguro para iniciar aplicaciones Swing ---
        SwingUtilities.invokeLater(() ->
        {
            // 1. Crear el Modelo (el Facade)
            SistemaDeGestionEmpresarial modelo = new SistemaDeGestionEmpresarial();
            
            // 2. Crear la Vista
            VistaVentas vista = new VistaVentas();
            
            // 3. Crear el Controlador y conectarlo con el Modelo y la Vista
            new ControladorVentas(vista, modelo);
            
            // 4. Hacer visible la ventana
            vista.setVisible(true);
        });
    }
}
