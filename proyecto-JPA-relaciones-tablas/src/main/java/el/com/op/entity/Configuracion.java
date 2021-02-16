package el.com.op.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "configuracion")
public class Configuracion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idConfiguracion;
	
	private String idioma;
	
	private String pais;
	
	private boolean activo;

	public Configuracion() {

	}

	public Configuracion(Integer idConfiguracion, String idioma, String pais, boolean activo) {
		super();
		this.idConfiguracion = idConfiguracion;
		this.idioma = idioma;
		this.pais = pais;
		this.activo = activo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idConfiguracion == null) ? 0 : idConfiguracion.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Configuracion other = (Configuracion) obj;
		if (idConfiguracion == null) {
			if (other.idConfiguracion != null)
				return false;
		} else if (!idConfiguracion.equals(other.idConfiguracion))
			return false;
		return true;
	}

	public Integer getIdConfiguracion() {
		return idConfiguracion;
	}

	public void setIdConfiguracion(Integer idConfiguracion) {
		this.idConfiguracion = idConfiguracion;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Configuracion [idConfiguracion=" + idConfiguracion + ", idioma=" + idioma + ", pais=" + pais
				+ ", activo=" + activo + "]";
	}
	
}
