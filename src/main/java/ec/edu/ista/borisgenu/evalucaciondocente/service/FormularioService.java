package ec.edu.ista.borisgenu.evalucaciondocente.service;

import ec.edu.ista.borisgenu.evalucaciondocente.modelo.Formulario;

import java.util.List;

public interface FormularioService {

    Formulario save(Formulario formulario);
    Formulario findById(Integer id);
    List<Formulario> findAll();
    void delete(Integer id);
}
