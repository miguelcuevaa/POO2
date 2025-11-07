package semana05ejemplo03.facade;

public class RecursosHumanos {
    public void asignarComision(String empleado, float monto){
        float comision = (float) (monto * 0.10);
        System.out.println("Comisión asiganada a: "+empleado+" S/."+
                comision);
    }
}
