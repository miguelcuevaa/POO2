/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana09stratey03;

/**
 *
 * @author luisromerou
 */
public class CifradoInverso implements AlgoritmoCifrado{
    //invierte el orden de los caracteres de una cadena
    //"Carlos" => "solraC"
    @Override
    public String cifrar(String mensaje) {
      return new StringBuilder(mensaje).reverse().toString();
    }

    
}
