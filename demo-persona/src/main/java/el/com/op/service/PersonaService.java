package el.com.op.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import el.com.op.model.Persona;
import el.com.op.repository.PersonaRepository;


@Service
@Transactional
public class PersonaService {

	@Autowired
	private PersonaRepository pr;
	
	public List<Persona> listAll(){
		return pr.findAll();
	}
	
	public void sava(Persona p) {
		pr.save(p);
	}
	
	public Persona get(int id) {
		return pr.findById(id).get();
	}
	
	public void delete(int id) {
		pr.deleteById(id);
	}
}
