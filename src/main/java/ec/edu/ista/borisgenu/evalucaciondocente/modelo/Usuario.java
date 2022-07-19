package ec.edu.ista.borisgenu.evalucaciondocente.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
@Data
@AllArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario", nullable = false)
    private Integer id_usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_persona")
    private Persona idPersona;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_rol")
    private Rol idRol;

    @Lob
    @Column(name = "usuario")
    private String usuario;

    @Lob
    @Column(name = "contrasenia")
    private String contrasenia;

    @Lob
    @Column(name = "fecha_hora_registro")
    private String fechaHoraRegistro;

    public Usuario() {
    }

}