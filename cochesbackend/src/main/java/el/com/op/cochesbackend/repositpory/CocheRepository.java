package el.com.op.cochesbackend.repositpory;

import el.com.op.cochesbackend.model.Coche;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CocheRepository extends JpaRepository<Coche, Long>,
        JpaSpecificationExecutor<Coche> {
}
