package el.com.op.cochesbackend.repositpory;

import el.com.op.cochesbackend.model.Modelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModeloRepository extends JpaRepository<Modelo, Long>{
}
