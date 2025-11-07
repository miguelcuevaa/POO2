package semana04ejemplo02.builder;

public class PersonajeBuilder {
    private String nombre;
    private String arma;
    private String armadura;
    private String habilidadEspecial;
    
    public PersonajeBuilder setNombre(String nombre){
        this.nombre = nombre;
        return this;
    }
    
    public PersonajeBuilder setArma(String nombre){
        this.arma = arma;
        return this;
    }
    
    public PersonajeBuilder setArmadura(String armadura){
        this.armadura = armadura;
        return this;
    }
    
    public PersonajeBuilder setHabilidadEspecial(String habilidad){
        this.habilidadEspecial = habilidad;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public String getArma() {
        return arma;
    }

    public String getArmadura() {
        return armadura;
    }

    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }
    
    public Personaje build(){
        return Personaje.crearDesdeBuilder(this);
    }
}
