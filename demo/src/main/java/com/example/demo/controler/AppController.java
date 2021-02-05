package com.example.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Persona;
import com.example.demo.servicio.PersonaService;

@Controller
public class AppController {

	 @Autowired
	 private PersonaService service;
	 
	 @RequestMapping("/")
	 public String viewHomePage(Model model) {
	     List<Persona> listProducts = service.listAll();
	     model.addAttribute("listProducts", listProducts);
	      
	     return "index";
	 }
	 
	 @RequestMapping("/new")
	 public String showNewProductPage(Model model) {
	     Persona product = new Persona();
	     model.addAttribute("product", product);
	      
	     return "new_product";
	 }
	 
	 @RequestMapping(value = "/save", method = RequestMethod.POST)
	 public String saveProduct(@ModelAttribute("product") Persona product) {
	     service.sava(product);
	      
	     return "redirect:/";
	 }
	 
	 @RequestMapping("/edit/{idPersona}")
	 public ModelAndView showEditProductPage(@PathVariable(name = "idPersona") int id) {
	     ModelAndView mav = new ModelAndView("edit_product");
	     Persona product = service.get(id);
	     mav.addObject("product", product);
	      
	     return mav;
	 }
	 
	 @RequestMapping("/delete/{idPersona}")
	 public String deleteProduct(@PathVariable(name = "idPersona") int id) {
	     service.delete(id);
	     return "redirect:/";       
	 }
}
