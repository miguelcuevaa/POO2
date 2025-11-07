package semana06funcional02;

import java.util.ArrayList;
import java.util.List;

public class Semana06Funcional02
{

    public static void main(String[] args)
    {
        //crear una lista de objetos de la clase Producto, cuyo
        //precio sea mayor a S/50
        List<Producto> listaProductos = new ArrayList<Producto>();
        
        listaProductos.add(new Producto("Producto 1",30.0));
        listaProductos.add(new Producto("Producto 2",60.0));
        listaProductos.add(new Producto("Producto 3",10.0));
        listaProductos.add(new Producto("Producto 4",70.0));
        listaProductos.add(new Producto("Producto 5",55.0));
        listaProductos.add(new Producto("Producto 6",5.0));
        listaProductos.add(new Producto("Producto 7",25.0));
        listaProductos.add(new Producto("Producto 8",51.0));
        listaProductos.add(new Producto("Producto 9",96.0));
        listaProductos.add(new Producto("Producto 10",1.0));
        listaProductos.add(new Producto("Producto 11",90.0));
        listaProductos.add(new Producto("Producto 12",59.0));
        
        listaProductos.stream()
                    .filter(producto->producto.getPrecio()>50.0)
                    .map(Producto::toString)
                    .forEach(System.out::println);
    }
}
