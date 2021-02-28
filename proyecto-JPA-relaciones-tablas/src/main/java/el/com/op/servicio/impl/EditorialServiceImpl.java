package el.com.op.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import el.com.op.entity.Editorial;
import el.com.op.repository.EditorialRepository;
import el.com.op.servicio.EditorialService;

@Service
public class EditorialServiceImpl implements EditorialService{

	@Autowired
	private EditorialRepository editorialRepository;


	@Override
	public List<Editorial> findAll() {
		
		return editorialRepository.findAll();
	}


	@Override
	public Editorial findById(Integer id) {
		
		return editorialRepository.getOne(id);
	}


	@Override
	public void deleteById(Integer id) {
		
		editorialRepository.deleteById(id);

	}


	@Override
	public Editorial nuevaEditorial(Editorial editorial) {
		
		return editorialRepository.save(editorial);
	}
}
