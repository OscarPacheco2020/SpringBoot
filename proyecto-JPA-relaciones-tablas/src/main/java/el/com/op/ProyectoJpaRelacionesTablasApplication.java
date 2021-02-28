package el.com.op;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoJpaRelacionesTablasApplication implements CommandLineRunner {

	private static Logger LOG = LoggerFactory.getLogger(ProyectoJpaRelacionesTablasApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoJpaRelacionesTablasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		LOG.info("Prueba de losger");
	}

}
