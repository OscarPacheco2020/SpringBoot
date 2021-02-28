package el.com.op.servicio;

import java.util.List;

import el.com.op.entity.Libro;

public interface LibroService {

	public List<Libro> findByFavoriteTrue();

    public List<Libro> findAll();

    public List<Libro> findByExample(Libro libro);

    public Libro findById(Integer id);
    
}
