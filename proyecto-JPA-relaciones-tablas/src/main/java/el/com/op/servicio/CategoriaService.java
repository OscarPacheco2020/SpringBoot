package el.com.op.servicio;

import java.util.List;

import el.com.op.entity.Categoria;

public interface CategoriaService {

	public List<Categoria> findAll();

    public Categoria findById(Integer id);

    public void deleteById(Integer id);

    public Categoria nuevaCategoria(Categoria categoria);
    
}
