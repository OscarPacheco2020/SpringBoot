package el.com.op;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import el.com.op.model.Usuario;
import el.com.op.repo.IusuarioRepo;

@SpringBootTest
class SpringWebSegurityApplicationTests {
	
	@Autowired
	private IusuarioRepo repo;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
/*
	@Test
	void contextLoads() {
	}
*/
	@Test
	public void crearUsuario() {
		
		Usuario u = new Usuario();
		u.setId(2);
		u.setNombre("rpacheco");
		u.setClave(encoder.encode("123"));
		Usuario retornado = repo.save(u);
		assertTrue(retornado.getClave().equalsIgnoreCase(u.getClave()) );
	}
}
