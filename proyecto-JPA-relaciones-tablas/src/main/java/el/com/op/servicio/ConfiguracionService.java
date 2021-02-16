package el.com.op.servicio;

import java.util.List;

import el.com.op.entity.Configuracion;

public interface ConfiguracionService {

	List<Configuracion> listar();
	
	Configuracion listarPorId(Integer id);
	
	Configuracion registar(Configuracion co);
	
	Configuracion actualizar(Configuracion co);
	
	void eliminar(Integer id);
	
}
