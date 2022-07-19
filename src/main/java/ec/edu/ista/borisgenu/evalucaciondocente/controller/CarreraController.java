package ec.edu.ista.borisgenu.evalucaciondocente.controller;


import ec.edu.ista.borisgenu.evalucaciondocente.modelo.Carrera;
import ec.edu.ista.borisgenu.evalucaciondocente.service.impl.CarreraServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carrera")
public class CarreraController {

    @Autowired
    private CarreraServiceImpl carreraService;

    @GetMapping("/read")
    public ResponseEntity<List<Carrera>> read() {
        return new ResponseEntity<>(carreraService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Carrera> save(@RequestBody Carrera carrera) {
        return new ResponseEntity<>(carreraService.save(carrera), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        carreraService.delete(id);
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Carrera> update(@PathVariable Integer id, @RequestBody Carrera carrera) {
        Carrera carreraActual = carreraService.findById(id);
        if (carreraActual != null) {
            carreraActual.setNombreCarrera(carrera.getNombreCarrera());
            carreraActual.setDescripcion(carrera.getDescripcion());
            carreraActual.setIdPeriodoAcademico(carrera.getIdPeriodoAcademico());
            return new ResponseEntity<>(carreraService.save(carrera), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping("/search/{id}")
    public ResponseEntity<Carrera> search(@PathVariable Integer id) {
        return new ResponseEntity<>(carreraService.findById(id), HttpStatus.OK);
    }


}
