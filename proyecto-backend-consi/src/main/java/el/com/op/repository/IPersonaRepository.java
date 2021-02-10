package el.com.op.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import el.com.op.model.Persona;

public interface IPersonaRepository extends JpaRepository<Persona, Integer>{

}
