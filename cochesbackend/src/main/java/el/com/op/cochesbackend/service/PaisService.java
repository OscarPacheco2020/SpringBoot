package el.com.op.cochesbackend.service;

import el.com.op.cochesbackend.model.Pais;
import el.com.op.cochesbackend.repositpory.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PaisService {

    @Autowired
    PaisRepository paisRepository;

    public Page<Pais> paginas(Pageable pageable){
        return paisRepository.findAll(pageable);
    }
}
