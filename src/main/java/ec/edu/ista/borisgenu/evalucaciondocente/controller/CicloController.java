package ec.edu.ista.borisgenu.evalucaciondocente.controller;

import ec.edu.ista.borisgenu.evalucaciondocente.modelo.Ciclo;
import ec.edu.ista.borisgenu.evalucaciondocente.service.CarreraService;
import ec.edu.ista.borisgenu.evalucaciondocente.service.CicloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ciclo")
public class CicloController {

    @Autowired

    CicloService cicloService;

    @GetMapping("/listar")
    public ResponseEntity<List<Ciclo>> read() {
        List<Ciclo> lista= cicloService.findAll();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Ciclo> create(@RequestBody Ciclo u) {
        return new ResponseEntity<>(cicloService.save(u), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Ciclo> delete(@PathVariable Integer id) {
        cicloService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


    @PutMapping("/update/{id}")
    public ResponseEntity<Ciclo> update(@PathVariable Integer id, @RequestBody Ciclo c) {

        Ciclo listaActual= cicloService.findById(id);

        cicloService.save(listaActual);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);


    }
}
