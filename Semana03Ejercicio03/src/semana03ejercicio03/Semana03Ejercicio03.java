package semana03ejercicio03;

public class Semana03Ejercicio03 {

    public static void main(String[] args) {
        //Creamos la vista y el modelo
        Inventario modelo = new Inventario();
        Vista vista = new Vista();
        
        //Creamos el controlador
        Controlador controlador = new Controlador(vista,modelo);
        
        //Agregamos algunos productos al inventario:
        controlador.agregarProducto("Laptop", 2500);
        controlador.agregarProducto("Mouse", 50);
        controlador.agregarProducto("Impresora", 1000);
        controlador.agregarProducto("Case", 200);
        
        //mostramos el inventario actual
        controlador.mostrarInventario();
        
        //eliminamos un elemento del inventario
        controlador.eliminarProducto("Mouse");
        
        controlador.mostrarInventario();
       
    }
    
}
