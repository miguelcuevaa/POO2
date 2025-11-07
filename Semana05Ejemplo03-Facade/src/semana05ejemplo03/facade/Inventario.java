package semana05ejemplo03.facade;

public class Inventario {
    public void actualizarInventario(String producto, int cantidad){
        System.out.println("Stock actualizado: " + producto + " - " + cantidad
        + " unidades.");
    }
}
