/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana08repository;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luisromerou
 */
public class UsuarioArchivoRepository implements UsuarioRepository{
    private File archivo; //entidad donde se almacenará la información
    
    public UsuarioArchivoRepository(String nombreArchivo){
        //constructor de la clase que recibe como parámetro el nombre del
        //archivo que almacena la información
        this.archivo = new File(nombreArchivo);
        try{
            archivo.createNewFile(); //"intentamos" crear un nuevo archivo
        }catch(Exception e){
            e.printStackTrace();//en caso falle, imprime el error
        }
    }
    
    @Override
    public void agregar(Usuario usuario) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo,true))){
            bw.write(usuario.toString()); //coloca en el archivo la información de cada usuario
            bw.newLine(); //una vez que coloca la información del usuario, agrega una nueva línea
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public Usuario buscar(String id) {
        //abrimos el archivo para lectura
        try(BufferedReader br = new BufferedReader(new FileReader(archivo))){
            String linea; //variable que almacena el contenido de cada línea del archivo
            while((linea = br.readLine())!=null){ //leemos el archivo de texto hasta que termine
                Usuario u = Usuario.fromString(linea); //con fromString la línea genera un objeto
                                                        //de la clase Usuario
                if(u.getId().equals(id)){ //si el id del objeto usuario creado es igual al
                                        //id que es parámetro del método buscar
                    return u; //termina el método devolviendo el objeto u
                }
            }
            //return null; //si termina el while, quiere decir que no se encontró el id buscado
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return null; //retorna null si no se encontró el id buscado
    }

    @Override
    public List<Usuario> imprimir() {
        //genera una lista de objetos de la clase Usuario con los usuarios que
        //se encuentran en el archivo
        List<Usuario> usuarios = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))){
            String linea;
            while((linea = br.readLine())!=null){
                usuarios.add(Usuario.fromString(linea));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return usuarios; //usuarios es la lista que se genera con la impresión
    }
    
}
