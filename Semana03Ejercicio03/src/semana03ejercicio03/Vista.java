package semana03ejercicio03;

import java.util.List;

public class Vista {
    public void mostrarProductos(List<Producto> productos){
        System.out.println("Reporte de inventario");
        if(productos.isEmpty()){
            System.out.println("No hay productos en el inventarios");
        }else{
            for(Producto p : productos){
                System.out.print(" - " + p.getNombre());
                System.out.println(" | S/."+p.getPrecio());
            }
        }
    }
}
