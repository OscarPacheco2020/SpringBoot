package el.com.op.controller;

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

import el.com.op.entity.Rol;
import el.com.op.servicio.RolService;

@RestController
@RequestMapping("/rol")
public class RolController {

	@Autowired
	RolService service;

	@PostMapping
	public ResponseEntity<Rol> registrar(@RequestBody Rol co) {
		Rol obj = service.registar(co);
		return new ResponseEntity<Rol>(obj, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Rol> listarPorId(@PathVariable("id") Integer id) throws Exception {
		Rol obj = service.listarPorId(id);
		if (obj == null) {
			throw new Exception("No se encontro ID");
		}
		return new ResponseEntity<Rol>(obj, HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<Rol>> listar() {
		List<Rol> obj = service.listar();
		return new ResponseEntity<List<Rol>>(obj, HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<Rol> actualizar(@RequestBody Rol p) throws Exception {
		Rol objBuscado = service.listarPorId(p.getIdRol());
		if (objBuscado == null) {
			throw new Exception("No se encontro ID");
		} else {
			Rol obj = service.actualizar(p);
			return new ResponseEntity<Rol>(obj, HttpStatus.OK);
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable("id") Integer id) throws Exception {
		Rol obj = service.listarPorId(id);
		if (obj == null) {
			throw new Exception("No se encontro ID");
		} else {
			service.eliminar(id);
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
	}
}
