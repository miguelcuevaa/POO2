
package tarea2;


public abstract class Pregunta {
    
    String enunciado;
    String clave;

    public String getEnunciado() {
        return this.enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getClave() {
        return this.clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Pregunta(String enunciado, String clave) {
        this.enunciado = enunciado;
        this.clave = clave;
    }
    
    public abstract void mostrarPregunta();
    
    public boolean validar(String respuesta){
        return respuesta.equalsIgnoreCase(clave);
    }
    
}
