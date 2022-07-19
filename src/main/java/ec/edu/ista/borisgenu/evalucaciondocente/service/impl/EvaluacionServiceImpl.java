package ec.edu.ista.borisgenu.evalucaciondocente.service.impl;

import ec.edu.ista.borisgenu.evalucaciondocente.modelo.Evaluacion;
import ec.edu.ista.borisgenu.evalucaciondocente.repository.EvaluacionRepository;
import ec.edu.ista.borisgenu.evalucaciondocente.service.EvaluacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvaluacionServiceImpl implements EvaluacionService {

    @Autowired
    private EvaluacionRepository evaluacionRepository;

    @Override
    public Evaluacion save(Evaluacion evaluacion) {
        return evaluacionRepository.save(evaluacion);
    }

    @Override
    public Evaluacion findById(Integer id) {
        return evaluacionRepository.findById(id).orElse(new Evaluacion());
    }

    @Override
    public List<Evaluacion> findAll() {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}

