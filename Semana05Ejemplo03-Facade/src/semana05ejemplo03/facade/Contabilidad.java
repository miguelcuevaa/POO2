package semana05ejemplo03.facade;

public class Contabilidad {
    public void registrarTransaccion(String producto, float monto){
        System.out.println("Transacción registrada: " + producto + " S/"+monto);
    }
}
