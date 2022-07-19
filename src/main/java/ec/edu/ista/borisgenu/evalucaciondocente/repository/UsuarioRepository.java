package ec.edu.ista.borisgenu.evalucaciondocente.repository;

import ec.edu.ista.borisgenu.evalucaciondocente.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}