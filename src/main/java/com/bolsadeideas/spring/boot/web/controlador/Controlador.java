package com.bolsadeideas.spring.boot.web.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.spring.boot.web.model.Usuario;
import com.bolsadeideas.spring.boot.web.model.*;

@Controller
@RequestMapping("/app")
public class Controlador {
	
	@GetMapping({"/","/home","/index"})
	public String index(Model modelo){
		modelo.addAttribute("titulo","[Curso de Spring boot con Model]");
		return "index";
	}
	
	@RequestMapping("/perfil")
	public String perfil(Model model) {
		Usuario usr = new Usuario();
		usr.setNombre("Agustín");
		usr.setApellido("Galarza");
		model.addAttribute("usuario", usr);
		model.addAttribute("titulo","[Perfil del usuario ".concat(usr.getNombre())+"]");
		return "perfil";
	}
}	