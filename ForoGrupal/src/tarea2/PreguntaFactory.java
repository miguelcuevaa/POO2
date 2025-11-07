
package tarea2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class PreguntaFactory {
    
    public static List<Pregunta> crearPreguntas(){
        
        List<Pregunta> banco = new ArrayList<>();
        
        //Preguntas de Selección
        
        banco.add(new Seleccion("De que se encarga la clase modelo?", 
                new String[]{"Consultar datos","Controlar reglas de negocio", "Interactuar con el usuario"},
                "b"));
        
        banco.add(new Seleccion("Derivada de una constante?", 
                new String[]{"0","1", "Misma constante"},
                "a"));
        
        banco.add(new Seleccion("Que significa POO?", 
                new String[]{"Programacion Orienta a Objetos","Programacion y Estructura de Datos", "Informacion"},
                "a"));
        
        banco.add(new Seleccion("1 + 1 =", 
                new String[]{"123","5", "2"},
                "c"));
        
        //Preguntas Tipo Cerradas
        
        banco.add(new Cerrada ("Java es un lenguaje compilado e interpretado", "V"));
        banco.add(new Cerrada ("Nietzsche dijo: || ¡Dios esta Muerto! ¡Dios queda muerto! ¡Y nosotros lo hemos matado!", "V"));
        banco.add(new Cerrada ("Una Interfaz es un punto de interaccion entre humano y computador", "V"));
        banco.add(new Cerrada ("Es 2050", "F"));
        
        //Pregunta Tipo Abiertas
        
        banco.add(new Abierta("¿Capital de Perú?", "Lima"));
        banco.add(new Abierta("¿Capital de Colombia?", "Bogota"));
        banco.add(new Abierta("¿Cuantos estados tiene la materia?", "4"));
        banco.add(new Abierta("¿En que semana se entrega el Avance 1 de POO?", "Semana 6"));
        
        return banco;
    }
    
    public static List<Pregunta> crearExamen(int cantidad){
        
        List<Pregunta> banco = crearPreguntas();
        Collections.shuffle(banco);
        
        return banco.subList(0, Math.min(cantidad, banco.size()));
        
        
    }
}
