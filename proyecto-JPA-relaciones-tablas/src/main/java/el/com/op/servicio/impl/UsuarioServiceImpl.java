package el.com.op.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import el.com.op.entity.Usuario;
import el.com.op.repository.UsuarioRepository;
import el.com.op.servicio.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	UsuarioRepository ur;
	
	@Override
	public List<Usuario> listar() {
		// TODO Auto-generated method stub
		return ur.findAll();
	}

	@Override
	public Usuario listarPorId(Integer id) {
		// TODO Auto-generated method stub
		return ur.findById(id).orElse(null);
	}

	@Override
	public Usuario registar(Usuario co) {
		// TODO Auto-generated method stub
		return ur.save(co);
	}

	@Override
	public Usuario actualizar(Usuario co) {
		// TODO Auto-generated method stub
		return ur.save(co);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		ur.deleteById(id);
	}

	
}
