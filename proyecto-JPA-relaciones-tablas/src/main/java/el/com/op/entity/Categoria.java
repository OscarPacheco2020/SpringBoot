package el.com.op.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categoria {

	@Id
    private int id;

    /**
     * Nombre de la categoria.
     */
    private String nombre;


    /**
     * Libros de la categoría
     */
    @OneToMany(mappedBy="categoria")
    private List<Libro> libros;


	public Categoria() {
		super();
	}


	public Categoria(int id, String nombre, List<Libro> libros) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.libros = libros;
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
		return "Categoria [id=" + id + ", nombre=" + nombre + "]";
	}
    
    
}
