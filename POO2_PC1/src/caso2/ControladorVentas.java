package caso2;

/**
 *
 * @author Miguel Angel Cueva Añanca
 */

import java.awt.event.ActionEvent;      // permite evento de clic
import java.awt.event.ActionListener;   // permite escucha las acciones
import java.util.List;                  // permite usar la lista de resultados
import javax.swing.JOptionPane;         // permite mostrar ventanas de error

//  El Controlador del Patron MVC
//  Conecta la Vista y el Modelo (Facade)
//  Contiene solo la logica
public class ControladorVentas
{
    private VistaVentas vista; // referencia a la vista
    private SistemaDeGestionEmpresarial modelo; // referencia al modelo facade

    public ControladorVentas(VistaVentas vista, SistemaDeGestionEmpresarial modelo)
    {
        this.vista = vista;                                         // guarda la referencia a la vista
        this.modelo = modelo;                                       // guarda la referencia al modelo
        this.vista.addRegistrarListener(new RegistrarListener());   // conecta el escuchador al boton
    }
    
    //  Clase que actua como Listener
    class RegistrarListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            //  Seccion de logica que se ejecuta al hacer clic
            try
            {
                // 1. Obtiene los datos de la Vista
                String producto = vista.getProducto();
                int cantidad = Integer.parseInt(vista.getCantidad());
                double precio = Double.parseDouble(vista.getPrecioUnitario());
                String vendedor = vista.getVendedor();

                // 2. Llama al metodo del Modelo Facade
                List<String> resultados = modelo.registrarVenta(producto, cantidad, precio, vendedor);

                // 3. Actualiza la Vista con los resultados
                vista.setResultadoInventario(resultados.get(0));
                vista.setResultadoContabilidad(resultados.get(1));
                vista.setResultadoComision(resultados.get(2));
            }
            catch (NumberFormatException ex)
            {
                //  Manejo de error si la cantidad o precio no son numeros validos
                JOptionPane.showMessageDialog(vista, "Error: Cantidad y Precio deben ser numeros validos", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}