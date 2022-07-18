package ec.edu.ista.borisgenu.evalucaciondocente.service;

import ec.edu.ista.borisgenu.evalucaciondocente.modelo.Materia;

import java.util.List;

public interface MateriaService {

    Materia save(Materia materia);
    Materia findById(Integer id);
    List<Materia> findAll();
    void delete(Integer id);

}
