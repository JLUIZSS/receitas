package br.com.ReceitasCaseiras.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


import br.com.ReceitasCaseiras.Repository.SalgadosRepository;

@Controller
public class SalgadosController {
	
	@Autowired
	private SalgadosRepository salgadosRepository;
		@GetMapping({"/salgados"})
	public String home(ModelMap model) {
			model.addAttribute("receitas",salgadosRepository.findAll());
	        return "html/salgados";
}
}