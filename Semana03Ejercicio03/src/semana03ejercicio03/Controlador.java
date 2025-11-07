package semana03ejercicio03;

public class Controlador {
    private Vista vista;
    private Inventario modelo;

    public Controlador(Vista vista, Inventario modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }
    
    //agregar producto
    public void agregarProducto(String nombre, float precio){
        modelo.agregarProducto(new Producto(nombre,precio));
    }
    
    //eliminar producto
    public void eliminarProducto(String nombre){
        modelo.eliminarProducto(nombre);
    }
    //mostrar inventario
    public void mostrarInventario(){
        vista.mostrarProductos(modelo.getProductos());
    }
}
