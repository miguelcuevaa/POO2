package semana02ejercicio01;

public class Semana02Ejercicio01 {

    public static void main(String[] args) {
        Jugador jugador = new Jugador("Ruiz",10);
        Arquero arquero = new Arquero ("Perez");
        Arbitro arbitro = new Arbitro ("Fuentes");
        
        int posJ = jugador.patearPenal();
        int posA = arquero.taparPenal();
        arbitro.evaluarGol(posJ, posA);
    }
    
}
