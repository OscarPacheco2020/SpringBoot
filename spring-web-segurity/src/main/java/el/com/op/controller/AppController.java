package el.com.op.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import el.com.op.model.Persona;
import el.com.op.repo.IpersonaRepo;

@Controller
public class AppController {

	@Autowired
	private IpersonaRepo repo;
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="Mundo") String name, Model model) {
		Persona p = new Persona();
		//p.setIdPersona(0);
		p.setNombre("Oscar");
		p.setApellido("Gomez");
		p.setEmail("ogomez@mail.com");
		p.setTelefono("0000000");
		repo.save(p);
		model.addAttribute("name", name);
		return "greeting";
	}
	
	@GetMapping("/listar")
	public String greeting(Model model) {
		
		model.addAttribute("personas", repo.findAll());
		return "greeting";
	}
}
