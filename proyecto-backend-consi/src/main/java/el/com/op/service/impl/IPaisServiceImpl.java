package el.com.op.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import el.com.op.model.Pais;
import el.com.op.repository.IPaisRepository;
import el.com.op.service.IPaisService;

@Service
public class IPaisServiceImpl implements IPaisService{

	@Autowired
	IPaisRepository repo;
	
	@Override
	public List<Pais> listar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Pais listarPorId(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public Pais registar(Pais p) {
		// TODO Auto-generated method stub
		return repo.save(p);
	}

	@Override
	public Pais actualizar(Pais p) {
		// TODO Auto-generated method stub
		return repo.save(p);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

}
