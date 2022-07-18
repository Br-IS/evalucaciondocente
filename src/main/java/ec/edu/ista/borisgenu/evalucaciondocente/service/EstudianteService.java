package ec.edu.ista.borisgenu.evalucaciondocente.service;

import ec.edu.ista.borisgenu.evalucaciondocente.modelo.Estudiante;

import java.util.List;

public interface EstudianteService {

    Estudiante save(Estudiante estudiante);
    Estudiante findById(Integer idEstudiante);
    List<Estudiante> findAll();
    void delete(Integer id);

}
