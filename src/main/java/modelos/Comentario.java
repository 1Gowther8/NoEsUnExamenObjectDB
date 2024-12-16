package modelos;

import javax.persistence.*;


@Entity
public class Comentario {
    @Id
    private Long id;

    private String contenido;
    private int valoracion;

    @ManyToOne
    private Usuario usuario;

    public Comentario(Long id, String contenido, int valoracion, Usuario usuario) {
        this.id = id;
        this.contenido = contenido;
        this.valoracion = valoracion;
        this.usuario = usuario;
    }

    public Comentario() {
    }

    @Override
    public String toString() {
        return "Comentario{" +
                "id=" + id +
                ", contenido='" + contenido + '\'' +
                ", valoracion=" + valoracion +
                ", usuario=" + usuario.getCorreo() +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
