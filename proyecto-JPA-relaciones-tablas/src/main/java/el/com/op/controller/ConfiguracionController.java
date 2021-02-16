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

import el.com.op.entity.Configuracion;
import el.com.op.servicio.ConfiguracionService;

@RestController
@RequestMapping("/configuracion")
public class ConfiguracionController {

	@Autowired
	ConfiguracionService service;

	@PostMapping
	public ResponseEntity<Configuracion> registrar(@RequestBody Configuracion co) {
		Configuracion obj = service.registar(co);
		return new ResponseEntity<Configuracion>(obj, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Configuracion> listarPorId(@PathVariable("id") Integer id) throws Exception {
		Configuracion obj = service.listarPorId(id);
		if (obj == null) {
			throw new Exception("No se encontro ID");
		}
		return new ResponseEntity<Configuracion>(obj, HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<Configuracion>> listar() {
		List<Configuracion> obj = service.listar();
		return new ResponseEntity<List<Configuracion>>(obj, HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<Configuracion> actualizar(@RequestBody Configuracion p) throws Exception {
		Configuracion objBuscado = service.listarPorId(p.getIdConfiguracion());
		if (objBuscado == null) {
			throw new Exception("No se encontro ID");
		} else {
			Configuracion obj = service.actualizar(p);
			return new ResponseEntity<Configuracion>(obj, HttpStatus.OK);
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable("id") Integer id) throws Exception {
		Configuracion obj = service.listarPorId(id);
		if (obj == null) {
			throw new Exception("No se encontro ID");
		} else {
			service.eliminar(id);
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
	}
}
