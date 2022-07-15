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
public class PersonaMateriaId implements Serializable {
    private static final long serialVersionUID = -4468741757883775181L;
    @Column(name = "id_persona", nullable = false)
    private Integer idPersona;

    @Column(name = "id_materia", nullable = false)
    private Integer idMateria;

    public PersonaMateriaId() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PersonaMateriaId entity = (PersonaMateriaId) o;
        return Objects.equals(this.idMateria, entity.idMateria) &&
                Objects.equals(this.idPersona, entity.idPersona);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMateria, idPersona);
    }

}