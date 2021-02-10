package el.com.op.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import el.com.op.model.Persona;
import el.com.op.service.IPersonaService;

@RestController
@RequestMapping("/personas")
public class PersonaController {

	@Autowired
	IPersonaService service;
	
	@GetMapping
	public ResponseEntity<List<Persona>> listar() {
		List<Persona> obj = service.listar();
		return new ResponseEntity<List<Persona>>(obj,HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Void> registrar(@RequestBody Persona p){
		
		Persona obj = service.registar(p);
		
		URI uri =ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getIdPersona()).toUri();
		
		return ResponseEntity.created(uri).build();
	}
	
	@PutMapping
	public ResponseEntity<Persona> actualizar(@RequestBody Persona p){
		Persona obj = service.actualizar(p);
		return new ResponseEntity<Persona>(obj,HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable("id") Integer id) throws Exception{
		Persona obj = service.listarPorId(id);
		if(obj == null) {
			throw new Exception("No se encontro ID");
		}
		service.eliminar(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Persona> listarPorId(@PathVariable("id") Integer id) throws Exception{
		Persona obj = service.listarPorId(id);
		if(obj == null) {
			throw new Exception("No se encontro ID");
		}
		return new ResponseEntity<Persona>(obj,HttpStatus.OK);
	}
	
	
}
