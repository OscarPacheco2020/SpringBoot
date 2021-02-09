package el.com.op.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import el.com.op.model.Persona;
import el.com.op.service.PersonaService;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/personas"})
public class Controlador {

	@Autowired
	private PersonaService service;
	
	@GetMapping
	public List<Persona> listar(){
		return service.listar();
	}
	
	@PostMapping
	public Persona agregar(@RequestBody Persona p) {
		return service.add(p);
	}
	
	@GetMapping(path = {"/{id}"} )
	public Persona listaId(@PathVariable("id") int id) {
		return service.listarId(id);
	}
	
	@PutMapping(path = {"/{id}"})
	public Persona editar(@RequestBody Persona p, @PathVariable("id") int id) {
		p.setIdPersona(id);
		return service.edit(p);
	}
	
	@DeleteMapping(path = {"/{id}"})
	public Persona delete( @PathVariable("id") int id) {
		return service.delete(id);
	}
}
