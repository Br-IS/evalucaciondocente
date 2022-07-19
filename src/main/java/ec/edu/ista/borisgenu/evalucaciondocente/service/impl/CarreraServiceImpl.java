package ec.edu.ista.borisgenu.evalucaciondocente.service.impl;

import ec.edu.ista.borisgenu.evalucaciondocente.modelo.Carrera;
import ec.edu.ista.borisgenu.evalucaciondocente.repository.CarreraRepository;
import ec.edu.ista.borisgenu.evalucaciondocente.service.CarreraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarreraServiceImpl implements CarreraService {

    @Autowired
    private CarreraRepository carreraRepository;
    @Override
    public Carrera save(Carrera carrera) {
        return carreraRepository.save(carrera);
    }

    @Override
    public Carrera findById(Integer id) {
        return carreraRepository.findById(id).orElse(new Carrera());
    }

    @Override
    public List<Carrera> findAll() {
        return carreraRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        carreraRepository.deleteById(id);
    }
}
