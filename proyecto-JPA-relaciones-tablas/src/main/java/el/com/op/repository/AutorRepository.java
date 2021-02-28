package el.com.op.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import el.com.op.entity.Autor;

public interface AutorRepository extends JpaRepository<Autor, Integer>, JpaSpecificationExecutor<Autor> {

}
