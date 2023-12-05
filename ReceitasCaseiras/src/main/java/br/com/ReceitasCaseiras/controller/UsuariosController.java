package br.com.ReceitasCaseiras.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.ReceitasCaseiras.Repository.UsuariosRepository;

@Controller
public class UsuariosController {
	
	@Autowired
	private UsuariosRepository usuariosRepository;
		@GetMapping({"/usuarios"})
	public String home(ModelMap model) {
			model.addAttribute("usuarios",usuariosRepository.findAll());
	        return "html/usuarios";
}
}