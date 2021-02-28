package el.com.op.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;

@Entity
public class Libro {
	@Id
    private Integer id;

    /**
     * Titulo del libro.
     */
    private String titulo;

    /**
     * Descripcion.
     */
    private String descripcion;

    /**
     * Categoria ID.
     */
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Categoria categoria;

    /**
     * Autores.
     */
    @ManyToMany
    @JoinTable(name = "autor_libro",
    		   joinColumns = @JoinColumn(name = "libro_id"),
    		   inverseJoinColumns = @JoinColumn(name = "autor_id")
    		  )
    private List<Autor> autores;

    /**
     * Editorial.
     */
    @ManyToOne
    @JoinColumn(name = "editorial")
    private Editorial editorial;

    /**
     * Favorite
     */
    private Boolean favorite;

    @OneToOne(mappedBy="libro")
    private InfoAdicional informacion;

	public Libro(Integer id, String titulo, String descripcion, Categoria categoria, List<Autor> autores,
			Editorial editorial, Boolean favorite, InfoAdicional informacion) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.autores = autores;
		this.editorial = editorial;
		this.favorite = favorite;
		this.informacion = informacion;
	}

	public Libro() {
	
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<Autor> getAutores() {
		return autores;
	}

	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}

	public Editorial getEditorial() {
		return editorial;
	}

	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}

	public Boolean getFavorite() {
		return favorite;
	}

	public void setFavorite(Boolean favorite) {
		this.favorite = favorite;
	}

	public InfoAdicional getInformacion() {
		return informacion;
	}

	public void setInformacion(InfoAdicional informacion) {
		this.informacion = informacion;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + ", descripcion=" + descripcion + ", categoria=" + categoria
				+ ", autores=" + autores + ", editorial=" + editorial + ", favorite=" + favorite + ", informacion="
				+ informacion + "]";
	}
    
    
}
