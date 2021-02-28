package el.com.op.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class InfoAdicional {
	 @Id
	    private int id;

	    /**
	     * ISBN del libro.
	     */
	    private String isbn;

	    /**
	     * Fecha publicación del libro.
	     */
	    private Integer fechaPublicacion;

	    /**
	     * Idioma del libro.
	     */
	    private String idioma;

	    /**
	     * Objeto libro.
	     */
	    @OneToOne
	    @JoinColumn(name = "libro", referencedColumnName = "id")
	    private Libro libro;

		public InfoAdicional(int id, String isbn, Integer fechaPublicacion, String idioma, Libro libro) {
			super();
			this.id = id;
			this.isbn = isbn;
			this.fechaPublicacion = fechaPublicacion;
			this.idioma = idioma;
			this.libro = libro;
		}

		public InfoAdicional() {
			
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getIsbn() {
			return isbn;
		}

		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}

		public Integer getFechaPublicacion() {
			return fechaPublicacion;
		}

		public void setFechaPublicacion(Integer fechaPublicacion) {
			this.fechaPublicacion = fechaPublicacion;
		}

		public String getIdioma() {
			return idioma;
		}

		public void setIdioma(String idioma) {
			this.idioma = idioma;
		}

		public Libro getLibro() {
			return libro;
		}

		public void setLibro(Libro libro) {
			this.libro = libro;
		}

		@Override
		public String toString() {
			return "InfoAdicional [id=" + id + ", isbn=" + isbn + ", fechaPublicacion=" + fechaPublicacion + ", idioma="
					+ idioma + ", libro=" + libro + "]";
		}
	    
	    
}
