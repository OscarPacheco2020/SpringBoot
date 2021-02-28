package el.com.op.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Autor {
	@Id
    private int id;

    /**
     * Nombre del autor.
     */
    private String nombre;

    /**
     * Libros.
     */
    @ManyToMany(mappedBy = "autores")
    List<Libro> libros;

	public Autor(int id, String nombre, List<Libro> libros) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.libros = libros;
	}

	public Autor() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}

	@Override
	public String toString() {
		return "Autor [id=" + id + ", nombre=" + nombre + "]";
	}
    
    
}
