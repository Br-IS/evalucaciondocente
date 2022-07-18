package ec.edu.ista.borisgenu.evalucaciondocente.service;

import ec.edu.ista.borisgenu.evalucaciondocente.modelo.Ciclo;

import java.util.List;

public interface CicloService {

    Ciclo save(Ciclo ciclo);
    Ciclo findById(Integer id);
    List<Ciclo> findAll();
    void delete(Integer id);

}
