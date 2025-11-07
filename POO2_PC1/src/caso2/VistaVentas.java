package caso2;

import java.awt.BorderLayout; // para organizar la ventana
import java.awt.GridLayout; // para organizar formularios
import java.awt.event.ActionListener; // para escuchar eventos
import javax.swing.JButton; // el boton
import javax.swing.JFrame; // la ventana
import javax.swing.JLabel; // etiquetas de texto
import javax.swing.JPanel; // paneles para agrupar
import javax.swing.JTextField; // campos de texto
import javax.swing.border.EmptyBorder; // para añadir margenes

/**
 *
 * @author Miguel Angel Cueva Añanca
 */

//  La Vista del Patron MVC
//  Es la ventana. Solo muestra componentes y capta interaccion
public class VistaVentas extends JFrame
{
    //  Componentes para la entrada de datos
    private JTextField txtProducto;
    private JTextField txtCantidad;
    private JTextField txtPrecioUnitario;
    private JTextField txtVendedor;
    private JButton btnRegistrar;
    
    //  Componentes para mostrar los resultados
    private JTextField txtResultadoInventario;
    private JTextField txtResultadoContabilidad;
    private JTextField txtResultadoComision;

    public VistaVentas()
    {
        //  Setup de la ventana
        setTitle("Registro de Ventas (MVC + Facade)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 350);
        setLocationRelativeTo(null);

        //  Panel principal con margenes
        JPanel panelPrincipal = new JPanel(new BorderLayout(10, 10));
        panelPrincipal.setBorder(new EmptyBorder(10, 10, 10, 10));

        //  Panel para el formulario de entrada
        JPanel panelFormulario = new JPanel(new GridLayout(0, 2, 10, 10));
        txtProducto = new JTextField();
        txtCantidad = new JTextField();
        txtPrecioUnitario = new JTextField();
        txtVendedor = new JTextField();
        
        panelFormulario.add(new JLabel("Nombre Producto:"));
        panelFormulario.add(txtProducto);
        panelFormulario.add(new JLabel("Cantidad Vendida:"));
        panelFormulario.add(txtCantidad);
        panelFormulario.add(new JLabel("Precio Unitario:"));
        panelFormulario.add(txtPrecioUnitario);
        panelFormulario.add(new JLabel("Nombre Vendedor:"));
        panelFormulario.add(txtVendedor);

        //  Boton para registrar la venta
        btnRegistrar = new JButton("Registrar Venta");

        //  Panel para mostrar los resultados
        JPanel panelResultados = new JPanel(new GridLayout(0, 1, 5, 5));
        txtResultadoInventario = new JTextField("Inventario: (esperando venta)");
        txtResultadoContabilidad = new JTextField("Contabilidad: (esperando venta)");
        txtResultadoComision = new JTextField("RRHH: (esperando venta)");
        txtResultadoInventario.setEditable(false);      // el usuario no puede editar
        txtResultadoContabilidad.setEditable(false);    // el usuario no puede editar
        txtResultadoComision.setEditable(false);        // el usuario no puede editar
        
        panelResultados.add(new JLabel("<|> Resultados de la Operacion <|>"));
        panelResultados.add(txtResultadoInventario);
        panelResultados.add(txtResultadoContabilidad);
        panelResultados.add(txtResultadoComision);

        //  Se añade todos los paneles a la ventana
        panelPrincipal.add(panelFormulario, BorderLayout.NORTH);
        panelPrincipal.add(btnRegistrar, BorderLayout.CENTER);
        panelPrincipal.add(panelResultados, BorderLayout.SOUTH);
        
        this.add(panelPrincipal);
    }
    
    //  Metodos para que el Controlador interactue con la Vista
    public String getProducto() { return txtProducto.getText(); }
    public String getCantidad() { return txtCantidad.getText(); }
    public String getPrecioUnitario() { return txtPrecioUnitario.getText(); }
    public String getVendedor() { return txtVendedor.getText(); }

    public void setResultadoInventario(String texto) { txtResultadoInventario.setText(texto); }
    public void setResultadoContabilidad(String texto) { txtResultadoContabilidad.setText(texto); }
    public void setResultadoComision(String texto) { txtResultadoComision.setText(texto); }

    public void addRegistrarListener(ActionListener listener)
    {
        btnRegistrar.addActionListener(listener);
    }
}