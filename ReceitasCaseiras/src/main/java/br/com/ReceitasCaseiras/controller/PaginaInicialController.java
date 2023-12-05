package br.com.ReceitasCaseiras.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.ReceitasCaseiras.Repository.PaginaInicialRepository;

@Controller
public class PaginaInicialController {
	
	@Autowired
	private PaginaInicialRepository paginainicialRepository;
		@GetMapping({"/home"})
	public String home(ModelMap model) {
			model.addAttribute("home", paginainicialRepository.findAll());
	        return "html/home";
}
		@GetMapping({"/"})
		public String principal(ModelMap model) {
				model.addAttribute("home",paginainicialRepository.findAll());
		         return "html/home";



		}
}