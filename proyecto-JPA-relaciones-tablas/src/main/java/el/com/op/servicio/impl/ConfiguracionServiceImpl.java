package el.com.op.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import el.com.op.entity.Configuracion;
import el.com.op.repository.ConfiguracionRepository;
import el.com.op.servicio.ConfiguracionService;

@Service
public class ConfiguracionServiceImpl implements ConfiguracionService{

	@Autowired
	ConfiguracionRepository cr;
	
	@Override
	public List<Configuracion> listar() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}

	@Override
	public Configuracion listarPorId(Integer id) {
		// TODO Auto-generated method stub
		return cr.findById(id).orElse(null);
	}

	@Override
	public Configuracion registar(Configuracion co) {
		// TODO Auto-generated method stub
		return cr.save(co);
	}

	@Override
	public Configuracion actualizar(Configuracion co) {
		// TODO Auto-generated method stub
		return cr.save(co);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		cr.deleteById(id);
	}

}
