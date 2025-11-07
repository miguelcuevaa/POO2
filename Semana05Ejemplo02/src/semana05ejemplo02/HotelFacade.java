package semana05ejemplo02;

public class HotelFacade {
    //Recepción del hotel
    private Cocina cocina;
    private Lavanderia lavanderia;
    private Spa spa;
    
    public HotelFacade(){
        //creamos instancias de cada una de las clases de servicio:
        this.cocina = new Cocina();
        this.lavanderia = new Lavanderia();
        this.spa = new Spa();
    }
    
    public void pedirComida(){
        cocina.prepararComida();
    }
    
    public void pedirLavanderia(){
        lavanderia.lavarRopa();
    }
    
    public void pedirMasaje(){
        spa.reservarMasaje();
    }
    
    public void pedirTodo(){
        cocina.prepararComida();
        lavanderia.lavarRopa();
        spa.reservarMasaje();
    }
}
