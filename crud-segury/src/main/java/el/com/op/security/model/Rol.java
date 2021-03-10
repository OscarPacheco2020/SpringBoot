package el.com.op.security.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import el.com.op.security.enums.RolNombre;

@Entity
public class Rol {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRol;
	
    @NotNull
    @Enumerated(EnumType.STRING)
    private RolNombre rolNombre;

	public Rol() {
		
	}

	public Rol(@NotNull RolNombre rolNombre) {
		super();
		this.rolNombre = rolNombre;
	}

	public int getIdRol() {
		return idRol;
	}

	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}

	public RolNombre getRolNombre() {
		return rolNombre;
	}

	public void setRolNombre(RolNombre rolNombre) {
		this.rolNombre = rolNombre;
	}
    
}
