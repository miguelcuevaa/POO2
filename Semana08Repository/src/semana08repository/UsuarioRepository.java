/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package semana08repository;

import java.util.List;

/**
 *
 * @author luisromerou
 */
public interface UsuarioRepository {
    //generamos los métodos abstractos que corresponden a la lógica general
    void agregar(Usuario usuario);
    Usuario buscar(String id);
    List<Usuario> imprimir();
}
