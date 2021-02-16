package el.com.op.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import el.com.op.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer>{

}
