package semana03ejercicio03;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos = new ArrayList<>();
    
    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    public void agregarProducto(Producto p){
        //agrega el objeto p de la clase Producto a la
        //lista de productos
       this.productos.add(p);
    }
    
    public void eliminarProducto(String nombreProducto){
        productos.removeIf(p->p.getNombre().equals(nombreProducto));
        //p->p.getNombre().equals(nombreProducto)
        //Devuelve los objetos p que cumplen con la condición
        //nombre = nombreProducto (parámetro)
    }
    
}
