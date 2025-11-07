package semana04ejemplo02.builder;

public class Personaje {
    private String nombre;
    private String arma;
    private String armadura;
    private String habilidadEspecial;

    private Personaje(PersonajeBuilder builder) {
        this.nombre = builder.getNombre();
        this.arma = builder.getArma();
        this.armadura = builder.getArmadura();
        this.habilidadEspecial = builder.getHabilidadEspecial();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public String getArmadura() {
        return armadura;
    }

    public void setArmadura(String armadura) {
        this.armadura = armadura;
    }

    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public void setHabilidadEspecial(String habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }
    
    public void mostrarInfo(){
        //imprime la información del objeto
        System.out.println("Nombre: "+nombre);
        System.out.println("Arma: "+(arma!=null ? arma : "Sin arma"));
        System.out.println("Armadura: "+(armadura!=null? armadura : "Sin armadura"));
        System.out.println("Habilidad especial: "+(habilidadEspecial!=null?
                habilidadEspecial:"Sin habilidad especial"));
    }
    
    public static Personaje crearDesdeBuilder(PersonajeBuilder builder){
        return new Personaje(builder);
    }
}
