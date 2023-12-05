package br.com.ReceitasCaseiras.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.ReceitasCaseiras.Repository.ReceitasRepository;

@Controller
public class ReceitasController {
	
	@Autowired
	private ReceitasRepository receitasRepository;
		@GetMapping({"/receitas"})
	public String home(ModelMap model) {
			model.addAttribute("receitas",receitasRepository.findAll());
	        return "html/receitas";
}
}