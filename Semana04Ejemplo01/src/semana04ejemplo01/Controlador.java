package semana04ejemplo01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador {
    private Modelo modelo;
    private Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        
        this.vista.addCalcularListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            int num1 = vista.getNumero1();
            int num2 = vista.getNumero2();
            int resultado = modelo.sumar(num1, num2);
            vista.setResultado(resultado);
        }
        });
    }
}
