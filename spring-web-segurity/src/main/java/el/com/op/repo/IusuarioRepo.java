package el.com.op.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import el.com.op.model.Usuario;

public interface IusuarioRepo extends JpaRepository<Usuario, Integer>{

	Usuario findByNombre(String nombre);
}
