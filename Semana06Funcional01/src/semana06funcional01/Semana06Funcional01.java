package semana06funcional01;

//import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Semana06Funcional01
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Filtra una lista de números (solo deja a los impares)
        Function<List<Integer>,List<Integer>> filtrarImpares = lista ->
                                                            lista.stream()
                                                            .filter(n->n%2!=0)
                                                            .collect(Collectors.toList());
        
        //creamos una lista
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //invocamos a la función
        List<Integer> impares = filtrarImpares.apply(numeros);
        
        System.out.println("Números impares: " + impares);
    }
    
}
