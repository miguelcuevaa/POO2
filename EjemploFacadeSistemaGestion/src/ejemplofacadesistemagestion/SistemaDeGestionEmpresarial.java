package ejemplofacadesistemagestion;

public class SistemaDeGestionEmpresarial
{
    private Inventario inventario;
    private Contabilidad contabilidad;
    private RecursosHumanos recursosHumanos;

    public SistemaDeGestionEmpresarial()
    {
        this.inventario = new Inventario();
        this.contabilidad = new Contabilidad();
        this.recursosHumanos = new RecursosHumanos();
    }

    public void registrarVenta(String producto, int cantidad, double precioUnitario, String empleado)
    {
        double total = cantidad * precioUnitario;
        double comision = total * 0.05; // 5% de comisión

        System.out.println("=== Procesando venta ===");
        inventario.actualizarStock(producto, cantidad);
        contabilidad.registrarTransaccion(producto, total);
        recursosHumanos.asignarComision(empleado, comision);
        System.out.println("=== Venta procesada correctamente ===\n");
    }
}
