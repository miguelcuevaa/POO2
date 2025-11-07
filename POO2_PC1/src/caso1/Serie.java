package caso1;

/**
 *
 * @author Miguel Angel Cueva Añanca
 */

//  2do producto
public class Serie extends Programa
{
    public Serie(ProgramaBuilder builder)
    {
        super(builder); // del builder pasa a clase Programa
    }

    @Override
    public String getTipoPrograma()
    {
        return "Serie"; // retorna el tipo especifico
    }
}
