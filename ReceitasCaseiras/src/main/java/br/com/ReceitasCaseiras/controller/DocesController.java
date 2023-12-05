package br.com.ReceitasCaseiras.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


import br.com.ReceitasCaseiras.Repository.DocesRepository;

@Controller
public class DocesController {
	
	@Autowired
	private DocesRepository docesRepository;
		@GetMapping({"/doces"})
	public String home(ModelMap model) {
			model.addAttribute("doces", docesRepository.findAll());
	        return "html/doces";
}
}