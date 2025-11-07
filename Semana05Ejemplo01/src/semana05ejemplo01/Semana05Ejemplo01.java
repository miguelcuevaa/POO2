package semana05ejemplo01;

public class Semana05Ejemplo01 {
    public static void main(String[] args) {
        
        Computadora basica = new ComputadoraBuilder()
                                .setMarca("Lenovo")
                                .setModelo("Ideapad 3")
                                .build();
        basica.mostrarDatos();
        System.out.println("=========================");
        Computadora oficina = new ComputadoraBuilder()
                                .setMarca("HP")
                                .setModelo("Elite Desk 800")
                                .setProcesador("Intel Core i5")
                                .setSistemaOperativo("Windows 11")
                                .setAlmacenamiento(1024)
                                .build();
        oficina.mostrarDatos(); 
    }
}
