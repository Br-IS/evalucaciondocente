package ec.edu.ista.borisgenu.evalucaciondocente.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tipo_formulario")
@Data
@AllArgsConstructor
public class TipoFormulario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtipo_formulario", nullable = false)
    private Integer id;

    @Column(name = "observacion")
    private String observacion;

    @Column(name = "porcentaje")
    private Integer porcentaje;

    @Column(name = "tipo_formulario")
    private String tipoFormulario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoFormulario() {
    }
}