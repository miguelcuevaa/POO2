package semana05ejemplo03.facade;

public class SistemaDeGestion {
    //Facade
    //Los atributos de la fachada, serán objetos de las clases
    //que representan a cada uno de los subsistemas
    private Inventario inventario;
    private Contabilidad contabilidad;
    private RecursosHumanos recursosHumanos;
    private Marketing marketing;
    
    //creamos un constructor que instancia a cada una de estas clases
    public SistemaDeGestion(){
        this.inventario = new Inventario();
        this.contabilidad = new Contabilidad();
        this.recursosHumanos = new RecursosHumanos();
        this.marketing = new Marketing();
    }
    
    public void registrarVenta(String producto, float monto, int 
            cantidad, String empleado){
        contabilidad.registrarTransaccion(producto, monto);
        inventario.actualizarInventario(producto, cantidad);
        recursosHumanos.asignarComision(empleado, monto);
        marketing.promocionarProducto(producto, monto);
    }
}
