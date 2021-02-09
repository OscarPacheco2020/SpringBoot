package el.com.op.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import el.com.op.model.Persona;
import el.com.op.repo.IpersonaRepo;

@RestController
@RequestMapping("/personas")
public class RestControllerApp {

	@Autowired
	private IpersonaRepo repo;
	
	@GetMapping
	public List<Persona> listar(){
		return repo.findAll();
	}
	
	@PostMapping
	public void insetar(@RequestBody Persona p) {
		repo.save(p);
	}
	
	@PutMapping
	public void modificacion(@RequestBody Persona p) {
		repo.save(p);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		repo.deleteById(id);
	}
}
