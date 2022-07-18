package ec.edu.ista.borisgenu.evalucaciondocente.service.impl;

import ec.edu.ista.borisgenu.evalucaciondocente.modelo.Estudiante;
import ec.edu.ista.borisgenu.evalucaciondocente.repository.EstudianteRepository;
import ec.edu.ista.borisgenu.evalucaciondocente.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServiceImpl implements  EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    @Override
    public Estudiante save(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    @Override
    public Estudiante findById(Integer idEstudiante) {
        return estudianteRepository.findById(idEstudiante).orElse(new Estudiante());
    }

    @Override
    public List<Estudiante> findAll() {
        return estudianteRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        estudianteRepository.deleteById(id);
    }
}



