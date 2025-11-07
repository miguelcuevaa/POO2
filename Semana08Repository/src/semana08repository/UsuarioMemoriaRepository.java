/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana08repository;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author luisromerou
 */
public class UsuarioMemoriaRepository implements UsuarioRepository{
    //creamos una estructura dinámica donde se almacenarán los datos en memoria
    private LinkedList<Usuario> usuarios = new LinkedList<>();
    

    @Override
    public void agregar(Usuario usuario) {
        this.usuarios.add(usuario);//agregamos el objeto que llega como parámetro
    }

    @Override
    public Usuario buscar(String id) {
        //recorre la lista y cuando encuentre al objeto usuario que le pertenece el id
        //pasado como parámetro, devuelve ese objeto, caso contrario, devuelve null
        for(Usuario u : usuarios){
            if(u.getId().equals(id)){
                return u;
            }
        }
        //si termina el for y no se ha encontrado
        return null;
    }

    @Override
    public List<Usuario> imprimir() {
        return new LinkedList<>(this.usuarios);
    }
    
}
