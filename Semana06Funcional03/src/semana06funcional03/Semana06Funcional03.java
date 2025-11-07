/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana06funcional03;

import java.util.function.Function;
import java.util.*;

/**
 *
 * @author C2A504
 */
public class Semana06Funcional03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //función lambda que cuente únicamente las letras de una
        //cadena de texto
        Function<String,Integer> contarLetras = s -> (int)s.chars()
                                            .filter(Character::isLetter)
                                            .count();
        
        String cadena = "Hola mundo123ABC";
        int cantidad = contarLetras.apply(cadena);
        System.out.println(cantidad);
    }
}
