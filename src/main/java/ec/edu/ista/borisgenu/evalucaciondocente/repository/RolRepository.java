package ec.edu.ista.borisgenu.evalucaciondocente.repository;

import ec.edu.ista.borisgenu.evalucaciondocente.modelo.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
}