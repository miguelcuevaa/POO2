package semana05ejemplo02;
public class Semana05Ejemplo02 {

    public static void main(String[] args) {
        // TODO code application logic here
        HotelFacade facade = new HotelFacade();
        
        //el cliente elige qué servicios usará:
        facade.pedirComida();
        facade.pedirMasaje();
        System.out.println("***********");
        facade.pedirTodo();
    }
    
}
