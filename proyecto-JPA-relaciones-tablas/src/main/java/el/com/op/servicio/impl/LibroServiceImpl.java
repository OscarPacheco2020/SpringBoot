package el.com.op.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import el.com.op.entity.Libro;
import el.com.op.repository.LibroRepository;
import el.com.op.servicio.LibroService;

@Service
public class LibroServiceImpl implements LibroService{

	@Autowired
	private LibroRepository libroRepository;


	@Override
	public List<Libro> findByFavoriteTrue() {
		
		return libroRepository.findByFavoriteTrue();
	}


	@Override
	public List<Libro> findAll() {
		
		return libroRepository.findAll();
	}


	@Override
	public List<Libro> findByExample(Libro libro) {
		
		Example<Libro> exLibro = Example.of(libro);
		return libroRepository.findAll(exLibro);
	}


	@Override
	public Libro findById(Integer id) {
		
		return libroRepository.getOne(id);
	}
}
