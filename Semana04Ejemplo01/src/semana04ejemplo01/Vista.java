package semana04ejemplo01;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Vista extends JFrame{ //Vista es un formulario
    //Interfaz gráfica utilizando la librería Swing
    //Creamos elementos visuales: text box, button, label
    private JTextField txtNumero1 = new JTextField(10);
    private JTextField txtNumero2 = new JTextField(10);
    private JButton btnSumar = new JButton("Sumar");
    private JLabel lblResultado = new JLabel("Resultado: ");
    
    public Vista(){
        //se ejecuta cuando se inicializa el formulario
        //configuración de la ventana/formulario
        this.setTitle("Calculadora"); //título de la ventana
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //tipo de ventana
        this.setSize(300, 150);
        
        //Panel principal
        JPanel panel = new JPanel();
        
        //Agregamos los componentes al panel
        panel.add(new JLabel("Número 1: "));
        panel.add(txtNumero1);
        panel.add(new JLabel("Número 2: "));
        panel.add(txtNumero2);
        panel.add(btnSumar);
        panel.add(lblResultado);
        
        this.add(panel); //agregamos el panel a la ventana/formulario
    }
    //Métodos get para acceder a los valores ingresados en el formulario
    public int getNumero1(){
        return Integer.parseInt(txtNumero1.getText());
    }
    
    public int getNumero2(){
        return Integer.parseInt(txtNumero2.getText());
    }
    //Mostrar el resultado en la etiqueta
    public void setResultado(int resultado){
        lblResultado.setText("Resultado: " + resultado);
    }
    //Permitir que el controlador "escuche" la acción que el botón está desencadenando
    public void addCalcularListener(ActionListener listener){
        btnSumar.addActionListener(listener);
    }
    
}
