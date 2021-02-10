package el.com.op.service;

import java.util.List;

import el.com.op.model.Pais;

public interface IPaisService {
	
	List<Pais> listar();
	
	Pais listarPorId(Integer id);
	
	Pais registar(Pais p);
	
	Pais actualizar(Pais p);
	
	void eliminar(Integer id);
	
}
