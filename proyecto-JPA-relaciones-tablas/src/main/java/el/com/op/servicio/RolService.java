package el.com.op.servicio;

import java.util.List;

import el.com.op.entity.Rol;

public interface RolService {

    List<Rol> listar();
	
    Rol listarPorId(Integer id);
	
    Rol registar(Rol co);
	
    Rol actualizar(Rol co);
	
	void eliminar(Integer id);
}
