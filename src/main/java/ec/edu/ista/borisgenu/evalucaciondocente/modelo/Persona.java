package ec.edu.ista.borisgenu.evalucaciondocente.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "persona")
@Data
@AllArgsConstructor
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona", nullable = false)
    private Integer id_persona;

    @Column(name = "nombre", length = 45)
    private String nombre;

    @Column(name = "apellido", length = 45)
    private String apellido;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    @Column(name = "cedula", length = 45)
    private String cedula;

    @Column(name = "celular", length = 45)
    private String celular;

    @Column(name = "correo", length = 45)
    private String correo;

    @Column(name = "genero")
    private Integer genero;

    @Column(name = "direccion", length = 120)
    private String direccion;

    @Column(name = "foto", length = 50)
    private String foto;

    @Column(name = "intruccion")
    private Integer intruccion;

    @Column(name = "estado_evaluacion")
    private Integer estadoEvaluacion;

    @Column(name = "estado_comision")
    private Integer estadoComision;

    public Persona() {
    }
}