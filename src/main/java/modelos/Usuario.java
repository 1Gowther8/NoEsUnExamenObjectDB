package modelos;

import DataService.DataService;

import javax.persistence.*;
import java.util.List;


@Entity
public class Usuario {

    @Id
    private Long id;

    private String correo;
    private String nombre;

    public Usuario() {
    }

    public Usuario(Long id, String correo, String nombre, List<Comentario> comentarios) {
        this.id = id;
        this.correo = correo;
        this.nombre = nombre;
        this.comentarios = comentarios;
    }

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Comentario> comentarios;






    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", correo='" + correo + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}


