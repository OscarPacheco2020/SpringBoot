package el.com.op.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import el.com.op.security.model.Usuario;
import el.com.op.security.model.UsuarioPrincipal;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
    UsuarioService usuarioService;
	
	@Override
	public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Usuario usuario = usuarioService.getByNombreUsuario(nombreUsuario).get();
        return UsuarioPrincipal.build(usuario);
	}

}
