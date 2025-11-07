package caso1;

/**
 *
 * @author Miguel Angel Cueva Añanca
 */

//  Este Builder construye los objetos Programa
//  Aca tambien se combinara la logica del Factory en su metodo build()
public class ProgramaBuilder
{
    //  Atributos
    protected final String nombre;          //  obligatorio
    protected final String horarioInicio;   //  obligatorio
    protected String protagonista;
    protected int anioProduccion;
    protected String censura;
    private String tipo;                    //  para el tipo de objeto Programa

    //  Builder pide los campos obligatorios
    public ProgramaBuilder(String nombre, String horarioInicio)
    {
        this.nombre = nombre;               //  asigna nombre
        this.horarioInicio = horarioInicio; //  asigna horario
    }

    //  Metodos para los atributos opcionales
    public ProgramaBuilder conProtagonista(String protagonista)
    {
        this.protagonista = protagonista;   //  asigna protagonista
        return this;                        //  retorna el mismo builder para encadenar metodos
    }

    public ProgramaBuilder conAnioProduccion(int anio)
    {
        this.anioProduccion = anio;         //  asigna año
        return this;                        //  retorna el propio builder
    }

    public ProgramaBuilder conCensura(String censura)
    {
        this.censura = censura;             //  asigna censura
        return this;                        //  retorna el propio builder
    }

    public ProgramaBuilder deTipo(String tipo)
    {
        this.tipo = tipo;   // asigna tipo
        return this;        // retorna el propio builder
    }

    //  Metodo para construir los objetos Programa
    //  Aplicamos la logica del Factory
    public Programa build()
    {
        //  Switch para decidir que objeto construir
        switch (tipo.toUpperCase())
        {
            case "NOTICIERO":
                return new Noticiero(this); // crea y retorna un Noticiero
            case "SERIE":
                return new Serie(this);     // crea y retorna una Serie
            case "PELICULA":
                return new Pelicula(this);  // crea y retorna una Pelicula
            default:
                //  Si el tipo no es valido, lanza un error
                throw new IllegalArgumentException("ERROR: Tipo de programa desconocido");
        }
    }
}
