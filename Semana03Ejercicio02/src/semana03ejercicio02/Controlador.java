package semana03ejercicio02;

public class Controlador {
    private Vista vista; //instancia de la mista
    private Estudiante modelo; //instancia del modelo

    public Controlador(Vista vista, Estudiante modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }
    //métodos para modificar los datos del estudiante
    public void actualizarNombre(String nombre){
        modelo.setNombre(nombre);
    }
    public void actualizarEdad(int edad){
        modelo.setEdad(edad);
    }
    
    public void actualizarVista(){
        vista.mostrarEstudiante(modelo.getNombre(), modelo.getEdad());
    }
    
}
