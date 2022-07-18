package ec.edu.ista.borisgenu.evalucaciondocente.service;

import ec.edu.ista.borisgenu.evalucaciondocente.modelo.Persona;

import java.util.List;

public interface PersonaService {

    Persona save(Persona persona);
    Persona findById(Integer id);
    List<Persona> findAll();
    void delete(Integer id);

}
