package ejemplofacadesistemagestion;

public class EjemploFacadeSistemaGestion
{

    public static void main(String[] args)
    {
        // TODO code application logic here
        SistemaDeGestionEmpresarial sistema = new SistemaDeGestionEmpresarial();

        // Registrar una venta
        sistema.registrarVenta("Laptop Lenovo", 2, 2500.0, "Juan Pérez");
        sistema.registrarVenta("Impresora HP", 1, 1200.0, "Ana García");
    }
    
}
