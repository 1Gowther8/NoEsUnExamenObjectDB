package DataService;

import modelos.Comentario;
import modelos.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class DataService {
    private EntityManagerFactory emf;
    private EntityManager em;

    public DataService() {
        this.emf = Persistence.createEntityManagerFactory("prueba");
        this.em = emf.createEntityManager();


    }

    public EntityManager getEntityManager() {
        return em;
    }

    public void añadirUsuario(Usuario usuario) {
        DataService dataService = new DataService();
        EntityManager em = dataService.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(usuario);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void añadirComentario(Comentario comentario) {
        DataService dataService = new DataService();
        EntityManager em = dataService.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(comentario);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void listarMisComentarios(String correo) {
        DataService dataService = new DataService();
        EntityManager em = dataService.getEntityManager();
        try {
            List<Comentario> comentarios = em.createQuery("SELECT c FROM Comentario c WHERE c.usuario.correo = :correo", Comentario.class).setParameter("correo", correo).getResultList();
            for (Comentario comentario : comentarios) {
                System.out.println(comentario);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void ListarUsuariosConComentarioConValoracionMaxima() {
        DataService dataService = new DataService();
        EntityManager em = dataService.getEntityManager();
        try {
            em.getTransaction().begin();
            List<Usuario> usuarios = em.createQuery("SELECT u FROM Usuario u JOIN u.comentarios c WHERE c.valoracion = 10").getResultList();
            System.out.println("Usuarios con comentarios con valoracion maxima:");
            for (Usuario usuario : usuarios) {
                System.out.println(usuario);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }



}
