package com.bolsadeideas.spring.boot.web.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.spring.boot.web.model.Usuario;

@Controller
@RequestMapping("/app")
public class Controlador {
	
	@Value("${text.indexController.index.titulo}")
	private String textIndex;
	@Value("${text.indexController.index.titulo}")
	private String textPerfil;
	@Value("${text.indexController.index.titulo}")
	private String textListar;
	
	@GetMapping({"/","/home","/index"})
	public String index(Model modelo){
		modelo.addAttribute("titulo",textIndex);
		return "index";
	}
	
	@RequestMapping("/perfil")
	public String perfil(Model model) {
		Usuario usr = new Usuario();
		usr.setNombre("Agustín");
		usr.setApellido("Galarza");
		usr.setEmail("agustin.galarza96@gmail.com");
		model.addAttribute("usuario", usr);
		model.addAttribute("titulo",textPerfil.concat(usr.getNombre())+"]");
		return "perfil";
	}
	@RequestMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("titulo",textListar);
		return "listar";
	}
	
	@ModelAttribute("usuarios")
	public List<Usuario> poblarUsuarios(){
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("Agustin","Galarza","agustin.galarza96@gmail.com"));
		usuarios.add(new Usuario("Lautaro","Galarza","lautaro.galarza00@gmail.com"));
		usuarios.add(new Usuario("Ariel","Galarza","Ariel.galarza86@gmail.com"));
		
		return usuarios;
		
	}
}