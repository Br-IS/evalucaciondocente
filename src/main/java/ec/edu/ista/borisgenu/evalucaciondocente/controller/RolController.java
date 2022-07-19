package ec.edu.ista.borisgenu.evalucaciondocente.controller;

import ec.edu.ista.borisgenu.evalucaciondocente.modelo.Rol;
import ec.edu.ista.borisgenu.evalucaciondocente.service.impl.RolServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rol")
public class RolController {

    @Autowired
    private RolServiceImpl rolService;

    @PostMapping("/save")
    public ResponseEntity<Rol> save(@RequestBody Rol rol) {
        return new ResponseEntity<>(rolService.save(rol), HttpStatus.CREATED);
    }

    @GetMapping("/read")
    public ResponseEntity<List<Rol>> read(){
        return new ResponseEntity<>(rolService.findAll(), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        rolService.delete(id);
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/search/{id}")
    public  ResponseEntity<Rol> search(@PathVariable Integer id){
        return new ResponseEntity<>(rolService.findById(id), HttpStatus.OK);
    }

}
