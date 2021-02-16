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

import el.com.op.entity.Usuario;
import el.com.op.servicio.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	UsuarioService service;

	@PostMapping
	public ResponseEntity<Usuario> registrar(@RequestBody Usuario co) {
		Usuario obj = service.registar(co);
		return new ResponseEntity<Usuario>(obj, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Usuario> listarPorId(@PathVariable("id") Integer id) throws Exception {
		Usuario obj = service.listarPorId(id);
		if (obj == null) {
			throw new Exception("No se encontro ID");
		}
		return new ResponseEntity<Usuario>(obj, HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<Usuario>> listar() {
		List<Usuario> obj = service.listar();
		return new ResponseEntity<List<Usuario>>(obj, HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<Usuario> actualizar(@RequestBody Usuario p) throws Exception {
		Usuario objBuscado = service.listarPorId(p.getIdUsuario());
		if (objBuscado == null) {
			throw new Exception("No se encontro ID");
		} else {
			Usuario obj = service.actualizar(p);
			return new ResponseEntity<Usuario>(obj, HttpStatus.OK);
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable("id") Integer id) throws Exception {
		Usuario obj = service.listarPorId(id);
		if (obj == null) {
			throw new Exception("No se encontro ID");
		} else {
			service.eliminar(id);
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
	}
}
