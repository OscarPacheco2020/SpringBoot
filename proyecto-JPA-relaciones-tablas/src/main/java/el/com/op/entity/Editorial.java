package el.com.op.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Editorial {

	@Id
	private int id;

	/**
	 * Nombre de la editorial.
	 */
	@Column(name = "nombre", nullable = false, length = 150)
	private String nombre;

	public Editorial() {
		
	}

	public Editorial(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
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

	@Override
	public String toString() {
		return "Editorial [id=" + id + ", nombre=" + nombre + "]";
	}

	
}
