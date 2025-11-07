
package semana02patronfactory;

public class Semana02PatronFactory {

    public static void main(String[] args) {
        // TODO code application logic here
        EnemigoFactory enemigoFactory = new EnemigoFactory();
        Enemigo enemigo = enemigoFactory.generarEnemigo(2);
        enemigo.mostrarEnemigo();
    }
    
}
