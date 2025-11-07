package semana02ejercicio01;

import java.util.Scanner;

public class Jugador {
    private String nombre;
    private int dorsal;

    public Jugador(String nombre, int dorsal) {
        this.nombre = nombre;
        this.dorsal = dorsal;
    }
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    
    public int patearPenal(){
        //el jugador patea el penal apuntando a 9 posibles posiciones
        //diferentes del arco. Este método devuelve la posición hacia
        //donde se dirige su disparo [1-9].
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el destino del tiro penal: [1..9]");
        int aux = teclado.nextInt();
        
        return aux; //devuelve la posición ingresada
    }
}
