package el.com.op.util;

import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import el.com.op.security.enums.RolNombre;
import el.com.op.security.model.Rol;
import el.com.op.security.model.Usuario;
import el.com.op.security.service.RolService;
import el.com.op.security.service.UsuarioService;

@Component
public class CreateRoles implements CommandLineRunner{

	@Autowired
    RolService rolService;
	
	@Autowired
	UsuarioService usuarioService;
	
	@Autowired
    PasswordEncoder passwordEncoder;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Rol rolAdmin = new Rol(RolNombre.ROLE_ADMIN);
        Rol rolUser = new Rol(RolNombre.ROLE_USER);
        rolService.save(rolAdmin);
        rolService.save(rolUser);
        
        
        Usuario UsuarioAdmin = new Usuario("admin", "admin", "admin@correo.com", passwordEncoder.encode("admin"));
        Set<Rol> roles = new HashSet<>();
        roles.add(rolAdmin);
        roles.add(rolUser);
        UsuarioAdmin.setRoles(roles);
		usuarioService.save(UsuarioAdmin );
		
		Usuario UsuarioUsuario = new Usuario("user", "user", "usur@correo.com", passwordEncoder.encode("user"));
        Set<Rol> rolesUsuario = new HashSet<>();
        rolesUsuario.add(rolUser);
        UsuarioUsuario.setRoles(rolesUsuario);
		usuarioService.save(UsuarioUsuario);
        
	}

}
