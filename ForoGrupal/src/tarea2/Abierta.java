
package tarea2;


public class Abierta extends Pregunta {

    public Abierta(String enunciado, String clave) {
        super(enunciado, clave);
    }

    @Override
    public void mostrarPregunta() {
       
        System.out.println(enunciado);
    }
    
    
    
}
