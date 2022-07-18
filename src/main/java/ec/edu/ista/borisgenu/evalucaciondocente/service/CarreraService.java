package ec.edu.ista.borisgenu.evalucaciondocente.service;

import ec.edu.ista.borisgenu.evalucaciondocente.modelo.Carrera;

import java.util.List;

public interface CarreraService {

    Carrera save(Carrera carrera);
    Carrera findById(Integer id);
    List<Carrera> findAll();
    void delete(Integer id);

}
