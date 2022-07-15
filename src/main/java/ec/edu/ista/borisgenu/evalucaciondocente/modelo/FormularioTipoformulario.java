package ec.edu.ista.borisgenu.evalucaciondocente.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "formulario_tipoformulario")
@Data
@AllArgsConstructor

public class FormularioTipoformulario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_formulariotipoformulario", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_formulario")
    private Formulario idFormulario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idtipo_formulario")
    private TipoFormulario idtipoFormulario;

    public FormularioTipoformulario() {
    }


}