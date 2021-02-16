package el.com.op.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import el.com.op.entity.Rol;
import el.com.op.repository.RolRepository;
import el.com.op.servicio.RolService;

@Service
public class RolServiceImpl implements RolService{

	@Autowired
	RolRepository rr;
	
	@Override
	public List<Rol> listar() {
		// TODO Auto-generated method stub
		return rr.findAll();
	}

	@Override
	public Rol listarPorId(Integer id) {
		// TODO Auto-generated method stub
		return rr.findById(id).orElse(null);
	}

	@Override
	public Rol registar(Rol co) {
		// TODO Auto-generated method stub
		return rr.save(co);
	}

	@Override
	public Rol actualizar(Rol co) {
		// TODO Auto-generated method stub
		return rr.save(co);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		rr.deleteById(id);
	}

}
