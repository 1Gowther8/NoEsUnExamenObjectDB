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
}
