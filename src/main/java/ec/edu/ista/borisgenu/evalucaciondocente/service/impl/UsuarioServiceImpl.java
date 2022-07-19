package ec.edu.ista.borisgenu.evalucaciondocente.service.impl;

import ec.edu.ista.borisgenu.evalucaciondocente.modelo.Usuario;
import ec.edu.ista.borisgenu.evalucaciondocente.repository.UsuarioRepository;
import ec.edu.ista.borisgenu.evalucaciondocente.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;


    @Override
    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario findById(Integer id) {
        return usuarioRepository.findById(id).orElse(new Usuario());
    }

    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        usuarioRepository.deleteById(id);
    }
}


