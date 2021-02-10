package el.com.op.service;

import java.util.List;

import el.com.op.model.Persona;

public interface IPersonaService {
	
	List<Persona> listar();
	
	Persona listarPorId(Integer id);
	
	Persona registar(Persona p);
	
	Persona actualizar(Persona p);
	
	void eliminar(Integer id);
	
}
