package el.com.op.servicio;

import java.util.List;

import el.com.op.entity.Editorial;

public interface EditorialService {

	public List<Editorial> findAll();

    public Editorial findById(Integer id);

    public void deleteById(Integer id);

    public Editorial nuevaEditorial(Editorial editorial);
}
