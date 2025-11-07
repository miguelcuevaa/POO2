package caso1;

/**
 *
 * @author Miguel Angel Cueva Añanca
 */

//  1er roducto
public class Noticiero extends Programa
{
    //  El constructor llama al constructor padre
    public Noticiero(ProgramaBuilder builder)
    {
        super(builder); //  del builder pasa a clase Programa
    }

    @Override
    public String getTipoPrograma()
    {
        return "Noticiero"; //  retorna el tipo especifico
    }
}
