package ec.edu.ista.borisgenu.evalucaciondocente.controller;

import ec.edu.ista.borisgenu.evalucaciondocente.modelo.Formulario;
import ec.edu.ista.borisgenu.evalucaciondocente.service.impl.FormularioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/formulario")
public class FormularioController {

    @Autowired
    private FormularioServiceImpl formularioService;

    @PostMapping("/save")
    public ResponseEntity<Formulario> save(@RequestBody Formulario formulario) {
        return new ResponseEntity<>(formularioService.save(formulario), HttpStatus.CREATED);
    }

    @GetMapping("/read")
    public ResponseEntity<List<Formulario>> read(){
        return new ResponseEntity<>(formularioService.findAll(), HttpStatus.OK);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        formularioService.delete(id);
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/search/{id}")
    public  ResponseEntity<Formulario> search(@PathVariable Integer id){
        return new ResponseEntity<>(formularioService.findById(id), HttpStatus.OK);
    }

}
