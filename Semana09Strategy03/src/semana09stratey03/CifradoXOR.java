/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana09stratey03;

/**
 *
 * @author luisromerou
 */
public class CifradoXOR implements AlgoritmoCifrado{
    private char clave = 'K'; //clave base del XOR
    
    @Override
    public String cifrar(String mensaje) {
        StringBuilder resultado = new StringBuilder();
        for(char c : mensaje.toCharArray()){ //mensaje se convierte de
                                //cadena a arreglo de caracteres para
                                //facilitar el recorrido
            resultado.append((char)(c^clave)); //^ => XOR
        }
        return resultado.toString();
    }
    
}
