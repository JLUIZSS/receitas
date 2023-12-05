package br.com.ReceitasCaseiras.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


import br.com.ReceitasCaseiras.Repository.BolosRepository;

@Controller
public class BolosController {
	
	@Autowired
	private BolosRepository bolosRepository;
		@GetMapping({"/Bolos"})
	public String home(ModelMap model) {
			model.addAttribute("bolos",bolosRepository.findAll());
	        return "html/salgados";
}
}