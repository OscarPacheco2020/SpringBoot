package el.com.op.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import el.com.op.model.Persona;

public interface IpersonaRepo extends JpaRepository<Persona, Integer>{

}
