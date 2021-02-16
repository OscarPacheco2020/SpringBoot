package el.com.op.servicio;

import java.util.List;

import el.com.op.entity.Usuario;

public interface UsuarioService {

    List<Usuario> listar();
	
    Usuario listarPorId(Integer id);
	
    Usuario registar(Usuario co);
	
    Usuario actualizar(Usuario co);
	
	void eliminar(Integer id);
}
