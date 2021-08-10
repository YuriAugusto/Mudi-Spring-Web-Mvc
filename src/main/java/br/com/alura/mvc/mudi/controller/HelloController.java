package br.com.alura.mvc.mudi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller//métodos de classes controller são actions, e são invocados sempre que uma requisição com aquele path é feita
public class HelloController {
	
	
	//quando esse método for invocado ele retornará a página html que deve ser carregada "hello"
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("nome", "Mundo");//arg1 atributo arg2 informação
		return "hello";
	}
	
}
