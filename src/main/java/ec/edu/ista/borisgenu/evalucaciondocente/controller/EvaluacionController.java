package ec.edu.ista.borisgenu.evalucaciondocente.controller;


import ec.edu.ista.borisgenu.evalucaciondocente.modelo.Evaluacion;
import ec.edu.ista.borisgenu.evalucaciondocente.service.impl.EvaluacionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/evaluacion")
public class EvaluacionController {
    @Autowired
   private EvaluacionServiceImpl evaluacionService;
    @GetMapping("/list")
    public ResponseEntity<List<Evaluacion>> listar() {
        return new ResponseEntity<>(evaluacionService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Evaluacion> crear(@RequestBody Evaluacion c) {
        return new ResponseEntity<>(evaluacionService.save(c), HttpStatus.CREATED);

    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Evaluacion> update(@PathVariable Integer id,@RequestBody Evaluacion evaluacion ){
        Evaluacion evaluacionActual= evaluacionService.findById(id);
        if (evaluacionActual != null){
            
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return null;
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Evaluacion> eliminar(@PathVariable Integer id) {
        evaluacionService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<Evaluacion> buscar(@PathVariable Integer id) {
        return new ResponseEntity<>(evaluacionService.findById(id), HttpStatus.OK);
    }
}
