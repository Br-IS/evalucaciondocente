package ec.edu.ista.borisgenu.evalucaciondocente.controller;
import ec.edu.ista.borisgenu.evalucaciondocente.modelo.Materia;
import ec.edu.ista.borisgenu.evalucaciondocente.service.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/materia")
public class MateriaController {
    @Autowired
    MateriaService materiaService;

    @GetMapping("/listar")
    public ResponseEntity<List<Materia>> listar() {
        List<Materia> lista=materiaService.findAll();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Materia> crearLista(@RequestBody Materia u) {

        return new ResponseEntity<>(materiaService.save(u), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Materia> elimi(@PathVariable Integer id) {
        materiaService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Materia> actualizarLista(@PathVariable Integer id, @RequestBody Materia c) {

        Materia listaActual=materiaService.findById(id);

        listaActual.setNombreMateria(c.getNombreMateria());
        materiaService.save(listaActual);

        return null;
    }
}
