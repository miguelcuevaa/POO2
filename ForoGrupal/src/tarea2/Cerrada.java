
package tarea2;


public class Cerrada extends Pregunta{

    public Cerrada(String enunciado, String clave) {
        super(enunciado, clave);
    }

    @Override
    public void mostrarPregunta() {
        
        System.out.println(enunciado + "(Elegir V/F)");
        
    }
    
}
