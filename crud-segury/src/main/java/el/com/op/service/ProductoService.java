package el.com.op.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import el.com.op.model.Producto;
import el.com.op.repository.ProductoRepository;

@Service
@Transactional
public class ProductoService {

	@Autowired
	ProductoRepository productoRepository;
	
	public List<Producto> list(){
		return productoRepository.findAll();
	}
	
	public Producto getOne(Integer id){
		return productoRepository.findById(id).orElse(null);
	}
	
	public Optional<Producto> getByNombre(String nombre){
		return productoRepository.findByNombre(nombre);
	}
	
	public void save(Producto producto) {
		productoRepository.save(producto);
	}
	
	public void update(Producto producto) {
		productoRepository.save(producto);
	}
	
	public void delete(Integer id) {
		productoRepository.deleteById(id);
	}
	
	public boolean existeById(Integer id) {
		return productoRepository.existsById(id);
	}
	
	public boolean existeByNombre(String nombre) {
		return productoRepository.existsByNombre(nombre);
	}
}
