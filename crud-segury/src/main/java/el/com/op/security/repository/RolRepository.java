package el.com.op.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import el.com.op.security.enums.RolNombre;
import el.com.op.security.model.Rol;

import java.util.Optional;

public interface RolRepository extends JpaRepository<Rol, Integer>{

	Optional<Rol> findByRolNombre(RolNombre rolNombre);
	
}
