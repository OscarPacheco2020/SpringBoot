package el.com.op.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import el.com.op.entity.Autor;
import el.com.op.repository.AutorRepository;
import el.com.op.servicio.AutorService;


@Service
public class AutorServiceImpl implements AutorService{

	@Autowired
	private AutorRepository autorRepository;


	@Override
	public List<Autor> findAll() {
		

		return autorRepository.findAll();
	}


	@Override
	public Autor findById(Integer id) {
		
		return autorRepository.getOne(id);
	}


	@Override
	public void deleteById(Integer id) {
		
		 autorRepository.deleteById(id);

	}


	@Override
	public Autor nuevoAutor(Autor autor) {
		
		return autorRepository.save(autor);
	}
}
