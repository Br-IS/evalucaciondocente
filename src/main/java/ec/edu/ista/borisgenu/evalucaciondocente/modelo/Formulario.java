package ec.edu.ista.borisgenu.evalucaciondocente.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "formulario")
@Data
@AllArgsConstructor
public class Formulario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_formulario", nullable = false)
    private Integer id_formulario;

    @Column(name = "preguntas", length = 150)
    private String preguntas;

    @Column(name = "observacion", length = 45)
    private String observacion;

    public Formulario() {
    }
}