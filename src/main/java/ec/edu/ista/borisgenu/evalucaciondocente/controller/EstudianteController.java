package ec.edu.ista.borisgenu.evalucaciondocente.controller;

import ec.edu.ista.borisgenu.evalucaciondocente.modelo.Estudiante;
import ec.edu.ista.borisgenu.evalucaciondocente.service.impl.EstudianteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiante")
public class EstudianteController {

    @Autowired
  private  EstudianteServiceImpl estudianteService;

    //C
    @PostMapping("/save")
    public ResponseEntity<Estudiante> save(Estudiante estudiante) {
        return new ResponseEntity<>(estudianteService.save(estudiante), HttpStatus.CREATED);
    }

    //R
    @GetMapping("/read")
    public ResponseEntity<List<Estudiante>> read(){
        return new ResponseEntity<>(estudianteService.findAll(), HttpStatus.OK);
    }

    //U
    @PutMapping("/update/{id}")
    public ResponseEntity<Estudiante> update(@PathVariable Integer id, @RequestBody Estudiante estudiante) {
        Estudiante estudiante1 = estudianteService.findById(id);
        if (estudiante1 == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            estudiante1.setNombre(estudiante.getNombre());
            estudiante1.setApellido(estudiante.getApellido());
            return new ResponseEntity<>(estudianteService.save(estudiante1), HttpStatus.OK);
        }
    }

    //D
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        estudianteService.delete(id);
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    //SEARCH
    @GetMapping("/search/{id}")
    public ResponseEntity<Estudiante> search(@PathVariable Integer id){
        return new ResponseEntity<>(estudianteService.findById(id), HttpStatus.OK);
    }


    //Buscar por nombre
    @GetMapping("/{nombre}")
    public Estudiante searchBynombre(@PathVariable String nombre){
        return estudianteService.findByNombre(nombre);
    }









}
