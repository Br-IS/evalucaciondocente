package ec.edu.ista.borisgenu.evalucaciondocente.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "materia")
@Data
@AllArgsConstructor
public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_materia", nullable = false)
    private Integer id_materia;

    @Column(name = "nombre_Materia", length = 45)
    private String nombreMateria;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_ciclo")
    private Ciclo idCiclo;

    public Materia() {
    }


}