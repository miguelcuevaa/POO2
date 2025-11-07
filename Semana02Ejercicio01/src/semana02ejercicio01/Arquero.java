package semana02ejercicio01;

import java.util.Random;

public class Arquero {
    //el arquero tratará de tapar el penal, dirigiéndose a una de las
    //9 posibles posiciones del arco [1..9]
    
    private String nombre;

    public Arquero(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int taparPenal(){
        Random random = new Random();
        int aux = random.nextInt(9)+1;
        //random.nextInt(9) => genera aleatorios entre 0 y 8
        //al sumarle 1, generará aleatorios entre 1 y 9
        System.out.println("El arquero fue a la posición: "+aux);
        return aux;
    }
    }

