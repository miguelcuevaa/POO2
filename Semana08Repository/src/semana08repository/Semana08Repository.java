/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana08repository;

import java.util.List;

/**
 *
 * @author luisromerou
 */
public class Semana08Repository {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario u1 = new Usuario("1","Karen");
        Usuario u2 = new Usuario("2","Luis");
        Usuario u3 = new Usuario("3","Angela");
        Usuario u4 = new Usuario("4","Rosa");
        
        UsuarioRepository repoMemoria = new UsuarioMemoriaRepository();
        repoMemoria.agregar(u1);
        repoMemoria.agregar(u2);
        repoMemoria.agregar(u3);
        repoMemoria.agregar(u4);
        
        System.out.println("Mostrando usuarios en memoria: ");
        imprimir(repoMemoria.imprimir());
        
        UsuarioRepository repoArchivo = new UsuarioArchivoRepository("datos.txt");
        repoArchivo.agregar(u1);
        repoArchivo.agregar(u2);
        repoArchivo.agregar(u3);
        
        System.out.println("Mostrando usuarios en archivo: ");
        imprimir(repoArchivo.imprimir());
        
    }

    private static void imprimir(List<Usuario> lista) {
        for(Usuario u : lista){
            System.out.println(u.getId() + " - " + u.getNombre());
        }
    }
    
}
