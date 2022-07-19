package ec.edu.ista.borisgenu.evalucaciondocente.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "ciclo")
@Data
@AllArgsConstructor
public class Ciclo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ciclo", nullable = false)
    private Integer id_ciclo;

    @Column(name = "ciclo", length = 45)
    private String ciclo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_carrera")
    private Carrera idCarrera;

    @Column(name = "observaciones", length = 45)
    private String observaciones;

    public Ciclo() {
    }
}