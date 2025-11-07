package caso1;

import java.util.Comparator; // Permite usar los comparadores para la programacion lineal

/**
 *
 * @author Miguel Angel Cueva Añanca
 */

//  Clase padre abstracta, es el producto del Factory
//  Define atributos y metodos comunes a todos los programas
public abstract class Programa
{
    //  Atributos
    protected String nombre;            //  obligatorio
    protected String horarioInicio;     //  obligatorio
    protected String protagonista;      //  opcional
    protected int anioProduccion;       //  opcional
    protected String censura;           //  opcional
    
    //  Constructor protegido y usado solo para las clases hijas
    //  Hacemos un Builder para la construccion
    
    protected Programa(ProgramaBuilder builder)
    {
        this.nombre = builder.nombre;                   //  Asigna nombre
        this.horarioInicio = builder.horarioInicio;     //  Asigna horario
        this.protagonista = builder.protagonista;       //  Asigna protagonista
        this.anioProduccion = builder.anioProduccion;   //  Asigna el año
        this.censura = builder.censura;                 //  Asigna censura
    }
    
    //  Metodo getter para tener acceso a los atributos
    public String getHorarioInicio()
    {
        return horarioInicio;   //  Retorna el horario
    }
    
    //  Metodo abstracto
    //  Obliga a las clases hijas a definir su tipo
    public abstract String getTipoPrograma();
    
    //  Metodo para mostrar la info
    @Override
    public String toString()
    {
        //  Construir el string de salida
        //  Se usa StringBuilder por ser mas eficiente que concatenar strings
        StringBuilder sb = new StringBuilder();
        sb.append(horarioInicio).append(" - ").append(getTipoPrograma()).append(": ").append(nombre);   // info basica

        //  Validacion para algunos atributos
        //  Se muestra solo si se coloca info al valor
        if (protagonista != null)                                           //  si existe protagonista
        {
            sb.append("\n  Protagonista: ").append(protagonista);           //    lo agrega
        }
        if (anioProduccion > 0)                                             //  si el año es valido
        {
            sb.append("\n  Año de produccion: ").append(anioProduccion);    // lo agrega
        }
        if (censura != null)                                                // si hay alguna censura
        {
            sb.append("\n  Censura: ").append(censura);                     // lo agrega
        }

        return sb.toString();                                               // devuelve el texto juntado todo
    }
}
