package ec.edu.ista.borisgenu.evalucaciondocente.service;

import ec.edu.ista.borisgenu.evalucaciondocente.modelo.Evaluacion;

import java.util.List;

public interface EvaluacionService {

    Evaluacion save(Evaluacion evaluacion);
    Evaluacion findById(Integer id);
    List<Evaluacion> findAll();
    void delete(Integer id);
}
