package el.com.op.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import el.com.op.model.Producto;

import java.util.Optional;

public interface ProductoRepository extends JpaRepository<Producto, Integer>{

	Optional<Producto> findByNombre(String nombre);
	
	boolean existsByNombre(String nombre);
}
