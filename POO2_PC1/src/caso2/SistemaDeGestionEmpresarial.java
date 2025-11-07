package caso2;

import java.util.ArrayList; // para crear la lista
import java.util.List; // para usar la interfaz de lista

/**
 *
 * @author Miguel Angel Cueva Añanca
 */

//  Facade simplifica el acceso a los subsistemas
//  Actua como el Modelo principal en nuestro patron MVC
public class SistemaDeGestionEmpresarial
{
    //  Atributos para java class
    private Inventario inventario;
    private Contabilidad contabilidad;
    private RecursosHumanos recursosHumanos;

    // Seccion del constructor de Facade
    public SistemaDeGestionEmpresarial()
    {
        this.inventario = new Inventario();             //  crea instancia de Inventario
        this.contabilidad = new Contabilidad();         //  crea instancia de Contabilidad
        this.recursosHumanos = new RecursosHumanos();   //  crea instancia de RRHH
    }

    //  Metodo principal que coordina los subsistemas
    //  Ahora devuelve una lista de strings con los resultados
    public List<String> registrarVenta(String producto, int cantidad, double precioUnitario, String empleado)
    {
        List<String> resultados = new ArrayList<>();    // crea la lista para los resultados
        double montoTotal = cantidad * precioUnitario;  // calcula el monto total

        // Llama a cada subsistema y guarda el resultado
        String resultadoInventario = inventario.actualizarStock(producto, cantidad);        // actualiza inventario
        String resultadoContable = contabilidad.registrarTransaccion(producto, montoTotal); // registra transaccion
        String resultadoComision = recursosHumanos.asignarComision(empleado, montoTotal);   // asigna comision
        
        //  Añade cada resultado a la lista
        resultados.add(resultadoInventario);
        resultados.add(resultadoContable);
        resultados.add(resultadoComision);
        
        return resultados; // devuelve la lista de resultados
    }
}
