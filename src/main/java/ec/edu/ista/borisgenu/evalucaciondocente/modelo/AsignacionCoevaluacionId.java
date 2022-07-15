package ec.edu.ista.borisgenu.evalucaciondocente.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Data
@AllArgsConstructor

public class AsignacionCoevaluacionId implements Serializable {
    private static final long serialVersionUID = 5834637622738121059L;
    @Column(name = "id_asignacion", nullable = false)
    private Integer idAsignacion;

    @Column(name = "id_docente_evaluador", nullable = false)
    private Integer idDocenteEvaluador;

    @Column(name = "id_docente_evaluado", nullable = false)
    private Integer idDocenteEvaluado;

    public AsignacionCoevaluacionId() {

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        AsignacionCoevaluacionId entity = (AsignacionCoevaluacionId) o;
        return Objects.equals(this.idDocenteEvaluador, entity.idDocenteEvaluador) &&
                Objects.equals(this.idDocenteEvaluado, entity.idDocenteEvaluado) &&
                Objects.equals(this.idAsignacion, entity.idAsignacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDocenteEvaluador, idDocenteEvaluado, idAsignacion);
    }

}