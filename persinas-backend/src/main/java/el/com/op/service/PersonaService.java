package el.com.op.service;

import java.util.List;

import el.com.op.model.Persona;

public interface PersonaService {
	
	List<Persona> listar();
	
	Persona listarId(int id);
	
	Persona add(Persona p);
	
	Persona edit(Persona p);
	
	Persona delete(int id);
}
