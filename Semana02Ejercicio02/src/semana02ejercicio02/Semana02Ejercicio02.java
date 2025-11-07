package semana02ejercicio02;

import java.util.Random;
public class Semana02Ejercicio02 {
    public static void main(String[] args) {
        FiguraGeometricaFactory factory = new FiguraGeometricaFactory();
        
        Random random = new Random();
        //posibles tipos de figura:
        String[] tipos = {"CIRCULO","RECTANGULO","CUADRADO"};
        //selecciona un índice del arreglo al azar
        int indice = random.nextInt(tipos.length);
        //obtenemos una figura aleatoria
        FiguraGeometrica figura = factory.generaFigura(tipos[indice]);
        
        System.out.println("Figura generada: "+tipos[indice]);
        figura.dibujar();
        
    }
    
}
