package el.com.op;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import el.com.op.model.Pais;
import el.com.op.model.Persona;
import el.com.op.service.IPaisService;
import el.com.op.service.IPersonaService;

@SpringBootApplication
public class ProyectoBackendConsiApplication implements CommandLineRunner{

	@Autowired
	IPaisService paisService;
	
	@Autowired
	IPersonaService personaService;
	
	private static Logger LOG = LoggerFactory.getLogger(ProyectoBackendConsiApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(ProyectoBackendConsiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		LOG.info("Prueba de losger");
		
		Pais p = new Pais();
		p.setNombre("El Salvador");
		paisService.registar(p);
		
		Pais p1 = new Pais();
		p1.setNombre("Peru");
		paisService.registar(p1);
		
		Pais p2 = new Pais();
		p2.setNombre("Colombia");
		paisService.registar(p2);
		
		Pais p3 = new Pais();
		p3.setNombre("Chile");
		paisService.registar(p3);
		
		Pais p4 = new Pais();
		p4.setNombre("Brasil");
		paisService.registar(p4);
		
		
		Persona per = new Persona();
		per.setNombre("Carlos");
		per.setApellido("Suares");
		per.setEdad(20);
		Pais pp = paisService.listarPorId(1);
		per.setPais(pp);
		personaService.registar(per);
		
		Persona per1 = new Persona();
		per1.setNombre("Pedro");
		per1.setApellido("Martin");
		per1.setEdad(25);
		Pais pp2 = paisService.listarPorId(3);
		per1.setPais(pp2);
		personaService.registar(per1);
		
		Persona per2 = new Persona();
		per2.setNombre("Diego");
		per2.setApellido("Centuro");
		per2.setEdad(50);
		Pais pp3 = paisService.listarPorId(4);
		per2.setPais(pp3);
		personaService.registar(per2);
		
		Persona per3 = new Persona();
		per3.setNombre("Diego");
		per3.setApellido("Centuro");
		per3.setEdad(50);
		per3.setPais(pp3);
		personaService.registar(per3);
		
	}

}
