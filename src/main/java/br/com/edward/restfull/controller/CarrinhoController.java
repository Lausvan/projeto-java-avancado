package br.com.edward.restfull.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.edward.restfull.Service.CarrinhoService;
import br.com.edward.restfull.model.CarrinhoModel;

@RestController
@RequestMapping("/carrinho")
public class CarrinhoController {

	@Autowired
	private CarrinhoService carrinhoService;

	@PostMapping("/adicionar-ao-carrinho")
	public CarrinhoModel cadastrar(@RequestParam Long id, Integer quantidade) {
		return carrinhoService.adicionar(quantidade, id);
	}

	@DeleteMapping("/remove")
	public CarrinhoModel remove(@RequestParam Long id, Integer quantidade) {
		return carrinhoService.remover(id);
	}

	@GetMapping("/listar-produtos")
	public CarrinhoModel listarProdutos() {
		return carrinhoService.mostrarTudo();
	}

}
