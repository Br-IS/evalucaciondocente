package ec.edu.ista.borisgenu.evalucaciondocente.repository;

import ec.edu.ista.borisgenu.evalucaciondocente.modelo.Evaluacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EvaluacionRepository extends JpaRepository<Evaluacion, Integer> {
}