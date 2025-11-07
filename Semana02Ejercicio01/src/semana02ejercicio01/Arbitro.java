package semana02ejercicio01;

public class Arbitro {
    //es el encargado de determinar si fue gol o no
    private String nombre;

    public Arbitro(String nombre) {
        this.nombre = nombre;
    }
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void evaluarGol(int posJugador, int posArquero){
        if(posJugador == posArquero){
            System.out.println("NO fue gol, el arquero tapó el penal!!!");
        }else{
            System.out.println("GOOOOOOOLLLL!!!");
        }
    }
    
}
