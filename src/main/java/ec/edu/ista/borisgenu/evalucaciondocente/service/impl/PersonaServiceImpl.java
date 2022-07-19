package ec.edu.ista.borisgenu.evalucaciondocente.service.impl;

import ec.edu.ista.borisgenu.evalucaciondocente.modelo.Persona;
import ec.edu.ista.borisgenu.evalucaciondocente.repository.PersonaRepository;
import ec.edu.ista.borisgenu.evalucaciondocente.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public Persona save(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Persona findById(Integer id) {
        return personaRepository.findById(id).orElse(new Persona());
    }

    @Override
    public List<Persona> findAll() {
        return personaRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        personaRepository.deleteById(id);
    }

}
