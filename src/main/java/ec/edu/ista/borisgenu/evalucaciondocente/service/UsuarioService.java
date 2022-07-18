package ec.edu.ista.borisgenu.evalucaciondocente.service;

import ec.edu.ista.borisgenu.evalucaciondocente.modelo.Usuario;

import java.util.List;

public interface UsuarioService {

    Usuario save(Usuario usuario);
    Usuario findById(Integer id);
    List<Usuario> findAll();
    void delete(Integer id);
}
