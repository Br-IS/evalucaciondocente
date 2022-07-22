package ec.edu.ista.borisgenu.evalucaciondocente.modelo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;

@Entity
@Table(name = "rol")
@Data
@AllArgsConstructor
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol", nullable = false)
    private Integer id_rol;

    @Column(name = "rol")
    private String rol;

    @Column(name = "descripcion")
    private String descripcion;


    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @Column(name = "fecha_hora_registro")
    private Date fecha_hora_registro;

    @PrePersist
    protected void onCreate() {
        fecha_hora_registro = new Date();
    }
    public Rol() {
    }
}
/*
@Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    private Date create_at;

    @PrePersist
	public void prePersist() {
		create_at = new Date();
	}
 */