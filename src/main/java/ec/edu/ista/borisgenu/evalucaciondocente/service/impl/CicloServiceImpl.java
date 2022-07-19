package ec.edu.ista.borisgenu.evalucaciondocente.service.impl;


import ec.edu.ista.borisgenu.evalucaciondocente.modelo.Ciclo;
import ec.edu.ista.borisgenu.evalucaciondocente.repository.CicloRepository;
import ec.edu.ista.borisgenu.evalucaciondocente.service.CicloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CicloServiceImpl implements CicloService {

    @Autowired
    private CicloRepository cicloRepository;

    @Override
    public Ciclo save(Ciclo ciclo) {
        return cicloRepository.save(ciclo);
    }

    @Override
    public Ciclo findById(Integer id) {
        return cicloRepository.findById(id).orElse(new Ciclo());
    }

    @Override
    public List<Ciclo> findAll() {
        return cicloRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        cicloRepository.deleteById(id);
    }
}


