package semana04ejemplo02.builder;

public class Semana04Ejemplo02Builder {

    public static void main(String[] args) {
        //Creamos un mago
        Personaje mago = new PersonajeBuilder()
                            .setNombre("Merlin")
                            .setHabilidadEspecial("Hechizos mágicos")
                            .build();
        mago.mostrarInfo();
    }
}
