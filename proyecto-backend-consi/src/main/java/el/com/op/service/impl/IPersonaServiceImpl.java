package el.com.op.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import el.com.op.model.Persona;
import el.com.op.repository.IPersonaRepository;
import el.com.op.service.IPersonaService;

@Service
public class IPersonaServiceImpl implements IPersonaService{

	@Autowired
	IPersonaRepository repo;
	
	@Override
	public List<Persona> listar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Persona listarPorId(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public Persona registar(Persona p) {
		// TODO Auto-generated method stub
		return repo.save(p);
	}

	@Override
	public Persona actualizar(Persona p) {
		// TODO Auto-generated method stub
		return repo.save(p);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

}
