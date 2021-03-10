package el.com.op.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.commons.lang3.StringUtils;

import el.com.op.dto.Mensaje;
import el.com.op.dto.ProductoDto;
import el.com.op.model.Producto;
import el.com.op.service.ProductoService;

@RestController
@RequestMapping("/producto")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductoController {

	@Autowired
	ProductoService productoService;
	
	@GetMapping
	public ResponseEntity<List<Producto>> list(){
		List<Producto> list =  productoService.list();
		return new ResponseEntity<List<Producto>>(list, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Producto> getById(@PathVariable("id") Integer id){
		if(!productoService.existeById(id)) 
			return new ResponseEntity(new Mensaje("No existe"), HttpStatus.NOT_FOUND);
		Producto producto = productoService.getOne(id);
		return new ResponseEntity<Producto>(producto, HttpStatus.OK);
	}
	
	@GetMapping("/name/{nombre}")
	public ResponseEntity<Producto> getByNombre(@PathVariable("nombre") String nombre){
		if(!productoService.existeByNombre(nombre)) 
			return new ResponseEntity(new Mensaje("No existe"), HttpStatus.NOT_FOUND);
		Producto producto = productoService.getByNombre(nombre).get();
		return new ResponseEntity<Producto>(producto, HttpStatus.OK);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping
	public ResponseEntity<?> create(@RequestBody ProductoDto productoDto){
		if(StringUtils.isBlank(productoDto.getNombre()))
			return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
		if(productoDto.getPrecio()<0 )
            return new ResponseEntity(new Mensaje("El precio debe ser mayor que 0"), HttpStatus.BAD_REQUEST);
		if(productoService.existeByNombre(productoDto.getNombre()))
            return new ResponseEntity(new Mensaje("ese nombre ya existe"), HttpStatus.BAD_REQUEST);
		 Producto producto = new Producto(productoDto.getNombre(), productoDto.getPrecio());
	        productoService.save(producto);
	        return new ResponseEntity(new Mensaje("producto creado"), HttpStatus.OK);
	}
	
	 @PreAuthorize("hasRole('ADMIN')")
	 @PutMapping("/{id}")
	    public ResponseEntity<?> update(@PathVariable("id")int id, @RequestBody ProductoDto productoDto){
	        if(!productoService.existeById(id))
	            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
	        if(productoService.existeByNombre(productoDto.getNombre()) && productoService.getByNombre(productoDto.getNombre()).get().getIdProducto()!= id)
	            return new ResponseEntity(new Mensaje("ese nombre ya existe"), HttpStatus.BAD_REQUEST);
	        if(StringUtils.isBlank(productoDto.getNombre()))
	            return new ResponseEntity(new Mensaje("el nombre es obligatorio"), HttpStatus.BAD_REQUEST);
	        if(productoDto.getPrecio()<0 )
	            return new ResponseEntity(new Mensaje("el precio debe ser mayor que 0"), HttpStatus.BAD_REQUEST);

	        Producto producto = productoService.getOne(id);
	        producto.setNombre(productoDto.getNombre());
	        producto.setPrecio(productoDto.getPrecio());
	        productoService.save(producto);
	        return new ResponseEntity(new Mensaje("producto actualizado"), HttpStatus.OK);
	    }
	 
	 @PreAuthorize("hasRole('ADMIN')")
	 @DeleteMapping("/{id}")
	    public ResponseEntity<?> delete(@PathVariable("id")int id){
	        if(!productoService.existeById(id))
	            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
	        productoService.delete(id);
	        return new ResponseEntity(new Mensaje("producto eliminado"), HttpStatus.OK);
	    }
}
