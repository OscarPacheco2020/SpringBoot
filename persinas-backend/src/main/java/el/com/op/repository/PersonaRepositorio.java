package el.com.op.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import el.com.op.model.Persona;

public interface PersonaRepositorio extends Repository<Persona, Integer>{

	List<Persona> findAll();
	
	Persona findById(int id);
	
	Persona save(Persona p);
	
	void delete(Persona p);
	
}
