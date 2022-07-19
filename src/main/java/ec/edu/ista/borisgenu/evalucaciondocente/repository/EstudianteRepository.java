package ec.edu.ista.borisgenu.evalucaciondocente.repository;

import ec.edu.ista.borisgenu.evalucaciondocente.modelo.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {
}