package com.bolsadeideas.spring.boot.web.app;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

//------------- formas de pasar atributos a Tymelaef ----------------------
//							th: txet
//			su pricipal caracteristica es remplazar jsp

@Controller
public class Controlador {
	
//La que mas se usa es Model
	
@GetMapping({"/","/home","/index"})
public String index(Model modelo){
	modelo.addAttribute("titulo","[Curso de Spring boot con Model]");
	return "index";
}
}	
	
/*	
---------------- Mas Formas de pasar Atributos ---------------------------

- Esta tambien contiene una relacion con ModelMap
pero la principal diferencia que ModelAndView retorna un objeto del
mismo tipo


public ModelAndView index(ModelAndView mv){
		mv.addObject("titulo","[Curso de Spring boot con ModelAndView]");
		mv.setViewName("index");
		return mv;
}



- Map es la interface Raiz
	
public String index(Map<String, Object> map){
	map.put("titulo","[Curso de Spring boot con map]");
	return "index";
}



- Model es una inteface que viene de una libreria de java.util.map
Entre sus implementaciones estan ModelMap, HashMap y su Raiz es 
justamente Mao

public String index(Model modelo){
	modelo.addAttribute("titulo","[Curso de Spring boot con Model]");
	return "index";
}



- Model y ModelMap hacen lo mismo

public String index(ModelMap modelo){
	modelo.addAttribute("titulo","[Curso de Spring boot ModelMap]");
	return "index";
}

*/