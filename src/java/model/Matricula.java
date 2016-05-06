package model;
// Generated 27/04/2016 13:04:06 by Hibernate Tools 3.6.0

import java.sql.SQLException;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import persistence.MatriculaDAO;

/**
 * Matriculas generated by hbm2java
 */
@Entity
@Table(name = "matriculas", catalog = "scc"
)
public class Matricula implements java.io.Serializable {
    
    private int id;
    private Usuario usuario;
    private Curso curso;

    public Matricula() {
    }

    public Matricula(int id, Usuario usuario, Curso curso) {
        this.id = id;
        this.usuario = usuario;
        this.curso = curso;
    }

    public Matricula(Usuario usuario, Curso curso) {
        this.usuario = usuario;
        this.curso = curso;
    }

    public Matricula(int id) {
        this.id = id;
    }

    @Id

    @Column(name = "id", unique = true, nullable = false)
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Usuario_matricula", nullable = false)
    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Curso_codigo", nullable = false)
    public Curso getCurso() {
        return this.curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public static List<Matricula> obterUsuariosMatriculados(String curso) throws ClassNotFoundException, SQLException {
        return MatriculaDAO.getInstance().obterUsuariosMatriculados(curso);
    }
    
}
