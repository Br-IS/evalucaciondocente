package ec.edu.ista.borisgenu.evalucaciondocente.service.impl;

import ec.edu.ista.borisgenu.evalucaciondocente.modelo.Formulario;
import ec.edu.ista.borisgenu.evalucaciondocente.repository.FormularioRepository;
import ec.edu.ista.borisgenu.evalucaciondocente.service.FormularioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormularioServiceImpl implements FormularioService {

    @Autowired
    private FormularioRepository formularioRepository;

    @Override
    public Formulario save(Formulario formulario) {
        return formularioRepository.save(formulario);
    }

    @Override
    public Formulario findById(Integer id) {
        return formularioRepository.findById(id).orElse(new Formulario());
    }

    @Override
    public List<Formulario> findAll() {
        return formularioRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        formularioRepository.deleteById(id);
    }
}
