package br.com.alura.mvc.mudi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import br.com.alura.mvc.mudi.model.Pedido;
import br.com.alura.mvc.mudi.repository.PedidoRepository;

@Controller
public class HomeController {
	
	//injeção de dependência, para funcionar a classe injetada deve possuir a anotação @Controller 
	//ou @Repository, pois essas anotações permitem o spring gerenciar a classe 
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@GetMapping("/home")
	public String home(Model model) {	
		List<Pedido> pedidos = pedidoRepository.recuperaTodosOsPedidos();
		model.addAttribute("pedidos", pedidos);//aqui eu passo o array
		return "home";
	}
	
}
