package el.com.op.cochesbackend.repositpory;

import el.com.op.cochesbackend.model.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Long>{
}
