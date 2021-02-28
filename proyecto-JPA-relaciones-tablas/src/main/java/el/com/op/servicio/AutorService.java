package el.com.op.servicio;

import java.util.List;

import el.com.op.entity.Autor;

public interface AutorService {
	
	public List<Autor> findAll();

    public Autor findById(Integer id);

    public void deleteById(Integer id);

    public Autor nuevoAutor(Autor autor);
}
