package semana04ejemplo01;

public class Semana04Ejemplo01 {

    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        
        Controlador controlador = new Controlador(modelo,vista);
        
        vista.setVisible(true);
    }
    
}
