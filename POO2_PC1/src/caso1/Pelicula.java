package caso1;

/**
 *
 * @author Miguel Angel Cueva Añanca
 */

//  3er producto
public class Pelicula extends Programa
{
    public Pelicula(ProgramaBuilder builder)
    {
        super(builder); // del builder pasa a la clase Programa
    }

    @Override
    public String getTipoPrograma()
    {
        return "Pelicula"; // retorna el tipo especifico
    }
}
