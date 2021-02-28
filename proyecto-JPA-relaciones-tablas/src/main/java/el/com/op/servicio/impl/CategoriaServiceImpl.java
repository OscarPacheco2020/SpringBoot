package el.com.op.servicio.impl;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import el.com.op.entity.Categoria;
import el.com.op.repository.CategoriaRepository;
import el.com.op.servicio.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService{
	
	@Autowired
	private CategoriaRepository categoriaRepository;


	@Override
	public List<Categoria> findAll() {
		
		return categoriaRepository.findAll();
	}


	@Override
	@Cacheable(value = "categoria", key = "#id")
	public Categoria findById(Integer id) {
		
		return categoriaRepository.getOne(id);
	}


	@Override
	public Categoria nuevaCategoria(Categoria categoria) {
		
		return categoriaRepository.save(categoria);

	}


	@Override
	public void deleteById(Integer id) {
		
		categoriaRepository.deleteById(id);

	}
}
