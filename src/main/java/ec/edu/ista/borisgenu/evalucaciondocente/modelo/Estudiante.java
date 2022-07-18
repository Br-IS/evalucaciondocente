/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ista.borisgenu.evalucaciondocente.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Boris
 */
@Entity
@Table(name = "estudiante")
@XmlRootElement
@Data
@AllArgsConstructor

public class Estudiante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_estudiante")
    private Integer id_estudiante;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 45)
    @Column(name = "apellido")
    private String apellido;
    @Size(max = 45)
    @Column(name = "cedula")
    private String cedula;


    public Estudiante() {
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_estudiante != null ? id_estudiante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estudiante)) {
            return false;
        }
        Estudiante other = (Estudiante) object;
        if ((this.id_estudiante == null && other.id_estudiante != null) || (this.id_estudiante != null && !this.id_estudiante.equals(other.id_estudiante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ista.borisgenu.evalucaciondocente.modelo.Estudiante[ idEstudiante=" + id_estudiante + " ]";
    }
    
}
