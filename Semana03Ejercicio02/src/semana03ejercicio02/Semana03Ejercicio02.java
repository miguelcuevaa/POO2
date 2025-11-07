package semana03ejercicio02;


public class Semana03Ejercicio02 {

    public static void main(String[] args) {
        //sistema para la gestión de estudiantes
        Estudiante modelo = new Estudiante("Gonzalo",21);
        
        //Creamos la vista que mostrará la información
        Vista vista = new Vista();
        
        Controlador controlador = new Controlador(vista,modelo);
        
        controlador.actualizarVista();
        
        controlador.actualizarNombre("José");
        controlador.actualizarEdad(22);
        
        controlador.actualizarVista();
    }
    
}
