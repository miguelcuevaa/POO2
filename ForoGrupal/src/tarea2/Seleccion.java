package tarea2;

public class Seleccion extends Pregunta{

    String[] opciones;

    public Seleccion(String enunciado, String[] opciones , String clave) {
        super(enunciado, clave);
        this.opciones = opciones;
        
    }
    
   
      
    @Override
    public void mostrarPregunta() {
        
        System.out.println(enunciado);
        
        char letra = 'a';
        
        for (String op : opciones){
            System.out.println(letra+") " + op);
            letra++;
        }
        
    }
    
    

}

