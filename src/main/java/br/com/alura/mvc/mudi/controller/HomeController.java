package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Echo Dot");
		pedido.setUrlImagem("https://m.media-amazon.com/images/I/61PA+bxUlPL._AC_SL1000_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/dp/B07PDHSJ1H?pf_rd_r=V482W7QAWB156N6JCHN5&pf"
		+ "_rd_p=2d96f270-1851-456c-82d1-d1087ada2035&pd_rd_r=cdc4399a-5b28-4e22-854d-62b45ce0484a&pd"
		+ "_rd_w=g2eHl&pd_rd_wg=RZqGs&ref_=pd_gw_unk");
		pedido.setDescricao("Smart box");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedido);
		
		return "home";
	}

}
