package ec.edu.ista.borisgenu.evalucaciondocente.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "asignacion_coevaluacion")
@Data
@AllArgsConstructor

public class AsignacionCoevaluacion {
    @EmbeddedId
    private AsignacionCoevaluacionId id;

    @MapsId("idDocenteEvaluador")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_docente_evaluador", nullable = false)
    private Persona idDocenteEvaluador;

    @MapsId("idDocenteEvaluado")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_docente_evaluado", nullable = false)
    private Persona idDocenteEvaluado;

    @Column(name = "observacion", length = 60)
    private String observacion;

    @Column(name = "fecha_registro")
    private LocalDate fechaRegistro;


    public AsignacionCoevaluacion() {

    }
}