package ec.edu.ista.borisgenu.evalucaciondocente.service.impl;

import ec.edu.ista.borisgenu.evalucaciondocente.modelo.Materia;
import ec.edu.ista.borisgenu.evalucaciondocente.repository.MateriaRepository;
import ec.edu.ista.borisgenu.evalucaciondocente.service.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MateriaServiceImpl implements MateriaService {

    @Autowired
    private MateriaRepository materiaRepository;

    @Override
    public Materia save(Materia materia) {
        return materiaRepository.save(materia);
    }

    @Override
    public Materia findById(Integer id) {
        return materiaRepository.findById(id).orElse(new Materia());
    }

    @Override
    public List<Materia> findAll() {
        return materiaRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        materiaRepository.deleteById(id);
    }
}

