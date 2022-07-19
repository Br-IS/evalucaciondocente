package ec.edu.ista.borisgenu.evalucaciondocente.repository;

import ec.edu.ista.borisgenu.evalucaciondocente.modelo.Carrera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarreraRepository extends JpaRepository<Carrera, Integer> {
}