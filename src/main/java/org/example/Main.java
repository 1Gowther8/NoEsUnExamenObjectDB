package org.example;



import DataService.DataService;
import modelos.Comentario;
import modelos.Usuario;

public class Main {
    public static void main(String[] args) {

        DataService dataService = new DataService();
        Usuario usuario1 = new Usuario(1L, "jorgecorreo@gmail.com", "Jorge", null);
        Usuario usuario2 = new Usuario(2L, "lucascorreo2@gmail.com","Lucas", null);

        Comentario comentario1 = new Comentario(1L, "Muy buen libro", 5, usuario1);
        Comentario comentario2 = new Comentario(2L, "Muy mal libro", 1, usuario2);
        Comentario comentario3 = new Comentario(3L, "Muy buen libro", 5, usuario1);
        Comentario comentario4 = new Comentario(4L, "Muy buen libro", 10, usuario2);


        /*Historia de usuario 1
        dataService.añadirUsuario(usuario1);
        dataService.añadirUsuario(usuario2);
        */


        /*Historia de usuario 2
        dataService.listarMisComentarios("jorgecorreo@gmail.com");
        */



        /*Historia de usuario 3
        dataService.añadirComentario(comentario1);
        dataService.añadirComentario(comentario3);
        dataService.añadirComentario(comentario2);
        dataService.añadirComentario(comentario4);
        */

        /*Historia de usuario 4
        dataService.ListarUsuariosConComentarioConValoracionMaxima();
        */



    }
}
