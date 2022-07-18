package ec.edu.ista.borisgenu.evalucaciondocente.service;

import ec.edu.ista.borisgenu.evalucaciondocente.modelo.Rol;

import java.util.List;

public interface RolService {

    Rol save(Rol rol);
    Rol findById(Integer id);
    List<Rol> findAll();
    void delete(Integer id);

}
